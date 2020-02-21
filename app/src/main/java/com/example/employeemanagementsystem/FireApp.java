package com.example.employeemanagementsystem;

import android.app.Application;

import com.firebase.client.Firebase;
import com.google.firebase.FirebaseApp;

public class FireApp extends Application{

    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);

    }
}
