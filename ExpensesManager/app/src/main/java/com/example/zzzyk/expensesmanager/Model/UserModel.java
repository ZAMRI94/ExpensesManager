package com.example.zzzyk.expensesmanager.Model;

/**
 * Created by zzzyk on 10/15/2017.
 */

public class UserModel {
    private int id;
    private String username;
    private String password;

    public UserModel(){

    }

    public UserModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public UserModel(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    //setter
    public void setId (int id){
        this.id = id;
    }
    public void setUsername (String username){
        this.username = username;
    }
    public void setPassword (String password){
        this.password = password;
    }

    //getter
    public int getId () {
       return this.id;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }
}
