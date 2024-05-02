package com.study.springboot;

public class PersonMan {
    private String name;
    private int age;

    //기본생성자 : ObjectMapper(jackson,gson)를
    //   리플렉션을 이용한 객체생성을 할 때 사용함. 없으면 에러!
    public PersonMan(){
    }
    //매개변수가 있는 생성자
    public PersonMan(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
