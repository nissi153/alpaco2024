package com.study.springboot;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
public class MainController {
    @GetMapping("/")
    public String main(){
        return "upload"; //upload.html로 응답
    }
    @PostMapping("/upload")
    public String upload(@RequestParam MultipartFile[] uploadfile,
                         Model model, HttpSession session) throws IOException {
        List<FileDto> list = new ArrayList<>();
        for( MultipartFile file : uploadfile ){
            if(!file.isEmpty()){
                //FileDto 정보 생성
                FileDto dto = new FileDto(UUID.randomUUID().toString(),
                        file.getOriginalFilename(), //myImage.png
                        file.getContentType()); //jpg, png
                list.add( dto );

                File newFileName = new File(dto.getUuid() + "_" + dto.getFileName());
                //전달한 내용을 실제 물리적인 파일로 저장한다.
                file.transferTo( newFileName );
            }
        }

        session.setAttribute("files", list);
        model.addAttribute("files", list);
        return "result"; //result.html로 응답
    }
    @GetMapping("/result")
    public String result(HttpSession session, Model model){
        model.addAttribute("files", session.getAttribute("files"));
        return "result"; //result.html로 응답
    }
}
