package com.study.Ex14ReadDB.dao;

import com.study.Ex14ReadDB.dto.MemberDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//@Mapper : 인터페이스 DAO와 MyBatis XML와 연결하는 용도
@Mapper
public interface IMemberDao {
    //list (select *)
    public List<MemberDto> list();
    //select count(*)
    //insert
    //select where id=10
    //update
    //delete
}
