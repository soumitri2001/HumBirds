package com.appdev_soumitri.humbirds;

public class UserAPI {
    private String email,name;
    private int age;
    private char gender;

    public UserAPI() {}

    public UserAPI(String name, String email, int age, char gender) {
        this.email = email;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


}
