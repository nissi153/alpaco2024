package com.study.springboot.AliasFor;

import org.springframework.core.annotation.AliasFor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@RequestMapping
public @interface MyRequestMapping {
    //@AliasFor : 어노테이션된 커스텀 어노테이션의 속성을 자체 속성명으로 (별칭으로) 사용한다.
    //속성이 하나일때는 attribute = "속성명" 생략
    //RequestMapping 어노테이션의 속성 value를 route라는 별칭으로 사용한다.
    @AliasFor(annotation = RequestMapping.class, attribute = "value")
    String route() default "";
    //RequestMapping 어노테이션의 속성 method를 define라는 별칭으로 사용한다.
    @AliasFor(annotation = RequestMapping.class, attribute = "method")
    RequestMethod[] define() default {};

}