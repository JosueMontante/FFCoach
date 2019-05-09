package com.jnova.windowsffcoach.models;

public class Players {
    private String name;
    private int number;
 /*   private String lastname;
    private int age; */

    public Players(){

    }

    public Players(String name, int number, String lastname, int age) {
        this.name = name;
        this.number = number;
      /*  this.lastname = lastname;
        this.age = age;  */
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

  /*  public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }  */
}
