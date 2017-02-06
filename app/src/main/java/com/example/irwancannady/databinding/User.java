package com.example.irwancannady.databinding;
// Created by irwancannady (irwancannady@gmail.com) on 2/6/17 at 10:19 AM.

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class User extends BaseObservable {

    private String username;
    private String email;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(com.example.irwancannady.databinding.BR.email);
    }
}
