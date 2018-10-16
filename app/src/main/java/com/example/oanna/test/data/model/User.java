package com.example.oanna.test.data.model;

import android.text.format.DateFormat;

import com.google.gson.annotations.SerializedName;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User {

    @SerializedName("name")
    public Name name;

    @SerializedName("nat")
    public String nationality;

    @SerializedName("picture")
    public UserPicture pictureURL;

    @SerializedName("dob")
    public DateOfBirth dateOfBirth;

    @SerializedName("registered")
    public Registered registered;

    public String getName() {
        return name.getLastName() + " " + name.getFirsName();
    }

    public String getDescription() {
        return dateOfBirth.getAge() + " years from " + nationality;
    }

    public String getTime() {
        String time = "";
        // 2016-12-15T11:54:24Z
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        Date date = null;
        try {
            date = formatter.parse(registered.date);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (registered.date != null || registered.date != "") {
            return (String) DateFormat.format("HH:mm", date.getTime());
        } else return "00:00";
    }

    public String getPictureURL() {

        if (pictureURL.getMedium() != "") {
            return pictureURL.getMedium();
        } else if (pictureURL.getLarge() != "") {
            return pictureURL.getLarge();
        } else if (pictureURL.getThumbnail() != "") {
            return pictureURL.getThumbnail();
        }
        return "";
    }
}
