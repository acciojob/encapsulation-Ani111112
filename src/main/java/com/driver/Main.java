package com.driver;

public class Main {
   public static void main(String[] args) {
      RWOnly ro = new RWOnly();
      ro.setName("Aniruddha");
      ro.setAge(24);
      System.out.println(ro.getName());
      System.out.println(ro.getAge());
   }
}
