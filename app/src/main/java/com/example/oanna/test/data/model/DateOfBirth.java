package com.example.oanna.test.data.model;

import com.google.gson.annotations.SerializedName;

public class DateOfBirth {

    @SerializedName("age")
    private Integer age;

    @SerializedName("date")
    private String date;

    public DateOfBirth(Integer age, String date) {
        this.age = age;
        this.date = date;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
