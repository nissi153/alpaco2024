package com.study.springboot;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class PersonServiceTest {
    @InjectMocks
    private PersonService personService;

    @Test
    void reflectionPersonMan() throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //클래스 정보로 리플렉션하기
        // 1. obj.class
        // 2. obj.getClass()
        // 3. Class.forName("패키지.클래스이름")
        personService.reflectionPersonMan( PersonMan.class );
    }

}