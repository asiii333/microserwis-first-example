package com.micro.application.account;

/**
 * Created by Asia on 2016-05-02.
 */
public class Account {
    private String firstName;
    private String LastName;
    private int age;
    private String favoriteFruit;

    public Account(String firstName, String lastName, int age, String favoriteFruit) {
        this.firstName = firstName;
        LastName = lastName;
        this.age = age;
        this.favoriteFruit = favoriteFruit;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFavoriteFruit() {
        return favoriteFruit;
    }

    public void setFavoriteFruit(String favoriteFruit) {
        this.favoriteFruit = favoriteFruit;
    }
}
