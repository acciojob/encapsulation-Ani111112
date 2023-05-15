package com.driver;

public class RWOnly {
    //implimenting encapsulation
    private String name;
    private int age;
    public setName(String name){
        this.name = name;
    }
    public setAge(int age){
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}
