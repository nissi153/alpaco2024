package com.study.springboot;

//@Target({ElementType.[적용대상]})
//@Retention(RetentionPolicy.[정보유지되는 대상])
//public @interface [어노테이션명]{
//  public 타입 elementName() [default 값]
//  ...
//}
//어노테이션의 필드 타입은 enum, String이나 기본 자료형, 기본 자료형의 배열만 사용할 수 있다.

//@Target : 어노테이션 적용할 위치 선택
//  ElementType.PACKAGE : 패키지 선언
//  ElementType.TYPE : 타입(class, interface, enum) 선언
//  ElementType.ANNOTATION_TYPE : 어노테이션 타입 선언
//  ElementType.CONSTRUCTOR : 생성자 선언
//  ElementType.FIELD : 멤버 변수(instance variable) 선언
//  ElementType.LOCAL_VARIABLE : 지역 변수 선언
//  ElementType.METHOD : 메서드 선언
//  ElementType.PARAMETER : 전달인자 선언
//  ElementType.TYPE_PARAMETER : 전달인자 타입 선언 - JAVA8부터
//  ElementType.TYPE_USE : 전달인자 타입 선언를 포함해서 모든 타입 선언부에 사용 - JAVA8부터

//@Retention : 컴파일러가 어노테이션을 다루는 방법을 기술, 어느 시점까지 영향을 미치는지를 결정
//  RetentionPolicy.SOURCE : 컴파일 전까지만 유효
//  RetentionPolicy.CLASS : 컴파일러가 클래스를 참조할 때까지 유효
//  RetentionPolicy.RUNTIME : 컴파일 이후 런타임 시기에도 JVM에 의해 참조가 가능(리플렉션)

//@Documented : 해당 어노테이션을 Javadoc에 포함시킴
//@Inherited : 어노테이션의 상속을 가능하게 함
//@Repeatable : Java8 부터 지원하며, 연속적으로 어노테이션을 선언할 수 있게 함
//@AliasFor : 어노테이션된 커스텀 어노테이션의 속성을 자체 속성명으로 (별칭으로) 사용한다.

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE}) //어노테이션이 선언되는 위치
@Retention(RetentionPolicy.RUNTIME) //라이프사이클 - 지속되는 시간
//@interface은 커스텀 어노테이션 정의를 위한 특수한 예약어임.
public @interface CustomAnnotation {
    //속성이 가상함수(추상메소드) 형식으로 정의함.
    String mention() default "안녕하세요~";
}
