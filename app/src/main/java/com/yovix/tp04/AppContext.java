package com.yovix.tp04;

import android.app.Application;

public class AppContext extends Application {

    private Application myApp;
    private String used_username;

    public void setUsed_username(String used_username) {
        this.used_username = used_username;
    }

    public String getUsed_username() {
        return used_username;
    }


    public Application getMyApp() {
        return myApp;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        myApp=this;
        this.used_username=null;
    }
}