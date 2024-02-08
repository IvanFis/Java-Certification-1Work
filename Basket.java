package org.example;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    public List<Product>purchasedGoods;


    public Basket() {
        purchasedGoods = new ArrayList<>();
    }

    public void addProduct(Product product) {
        purchasedGoods.add(product);
    }


    public List<Product> getProducts(){
        return purchasedGoods;
    }

}

