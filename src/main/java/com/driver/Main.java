package com.driver;

public class Main {
   RWOnly ro = new RWOnly();
   //setting the name
   ro.setName("Aniruddha");
   //setting the age
   ro.setAge(24);
   //getting the name and print it
   System.out.println(ro.getName());
   System.out.println(ro.getAge());
}
