package com.doanburak.listviewreferenceapp.Model;

import java.io.Serializable;

public class User implements Serializable {

   private String name;
   private String surname;
   private String email;
   private int pictureInt;

   public User(String name, String surname, String email, int pictureInt){

       this.setName(name);
       this.setSurname(surname);
       this.setEmail(email);
       this.setPictureInt(pictureInt);

   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPictureInt() {
        return pictureInt;
    }

    public void setPictureInt(int pictureInt) {
        this.pictureInt = pictureInt;
    }
}
