package org.example;

import java.util.Iterator;
import java.util.List;

public class User  {
    public String login;
    public int password;
    private Basket basket;

    public User(String login, int password){
        this.login = login;
        this.password = password;
        basket = new Basket();

    }


    public String getLogin() {
        return login;
    }

    public int getPassword() {
        return password;
    }

    public Basket getBasket() {
        return basket;
    }
}
