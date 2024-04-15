package com.study.springboot.service;

import com.study.springboot.domain.board.Board;
import com.study.springboot.domain.board.BoardRepository;
import com.study.springboot.dto.BoardResponseDto;
import com.study.springboot.dto.BoardSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

// 서블릿(Servlet) : JAVA계열의 HTTP요청과 응답을 처리하는 기능의 모음 또는 사양
//                : JDK에서는 interface Servlet 또는 class HttpSevlet으로 구현한다.
//                : 기본적으로 init,destroy,service(요청/응답처리) 세가지 메소드
// HTTP요청 -> WAS톰캣(서블릿 컨테이너) -> 거대한 하나의 Servlet(SpringMVC)
//    --> 디스패치 서블릿 -> 핸들러 매퍼 -> 컨트롤러 -> 매핑 메소드(서블릿)
//    --> 서비스(Service) -> DTO -> DAO(Repository) -> Entity -> 데이터베이스
// HTTP 응답 <- html(json) <- SpringMVC <- 뷰 리졸버(view resolver)
//  <- 동적html파일 <- 디스패치 서블릿

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public List<BoardResponseDto> findAll(){ //전체 목록 조회
        //정렬기능 추가
        Sort sort = Sort.by(Sort.Direction.DESC, "boardDate", "boardIdx");
        List<Board> list = boardRepository.findAll( sort );

        //List<Board>를 List<BoardResponseDto>로 변환 : stream()메소드 사용
        return list.stream().map(BoardResponseDto::new).collect(Collectors.toList());
    }

    public Long save(final BoardSaveRequestDto dto){
        Board entity = boardRepository.save( dto.toEntity() );
        return entity.getBoardIdx();
    }

    public boolean existsById(Long boardIdx){
        boolean isFound = boardRepository.existsById( boardIdx );
        return isFound;
    }
}
