package com.example.oanna.test.data.model;

import java.util.Objects;

public class User {
    private String name;
    private String age;
    private String nationality;
    private String registeredDate;
    private String pictureURL;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(String registeredDate) {
        this.registeredDate = registeredDate;
    }

    public String getPictureURL() {
        return pictureURL;
    }

    public void setPictureURL(String pictureUR) {
        this.pictureURL = pictureUR;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(age, user.age) &&
                Objects.equals(nationality, user.nationality) &&
                Objects.equals(registeredDate, user.registeredDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, nationality, registeredDate);
    }

}
