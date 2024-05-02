package com.study.springboot;

import java.lang.reflect.Constructor;

public class PersonService {
    //리플렉션이란 객체를 통해 클래스의 정보를 분석해 내는 프로그램 기법을 말한다
    //리플렉션을 사용하면 어노테이션, 생성자, 메소드, 필드 등 클래스에 대한 정보를 아주 자세히 알아낼 수 있다.
    //사용용도 :
    // 1. 동적으로 Class를 사용 해야할 경우
    //    코드 작성 시점에서는 어떠한 Class를 사용해야할지 모르지만 Runtime에 Class를 가져와서 실행해야하는 경우 (Spring Annotation)
    // 2. Jackson, GSON 등의 JSON Serialization Library
    //    Reflection을 사용하여 객체 필드의 변수명/어노테이션명을 Json key와 mapping 해주고 있다.
    public void reflectionPersonMan( Class clazz ) {
        //생성자 목록
        System.out.println("생성자 목록");
        //getConstructors : 자체 + 상속된 생성자 목록
        //getDeclaredConstructors : 자체 생성자 목록
        Constructor[] cons = clazz.getDeclaredConstructors();
        for( Constructor con : cons ){
            System.out.println(con);
        }
    }
}
