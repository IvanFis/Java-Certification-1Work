package org.example;

import SecondWork.Cat;

import java.util.List;

public class Product  {

    public String name;
    public int price;
    public int weight;


    public Product(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int rate) {
        this.weight = weight;
    }


}



