package com.study.springboot;

@MyComponent
@CustomAnnotation(mention = "소풍가자~")
public class PersonWoman {
    private String name;
    private int age;

    //기본생성
    public PersonWoman(){
    }
    //매개변수가 있는 생성자
    public PersonWoman(String name, int age) {
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
