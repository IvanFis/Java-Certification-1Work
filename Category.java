package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Category {

    public String nameCategory;
    public List<Product>products;



    public String getNameCategory() {
        return nameCategory;
    }

    public List<Product> getProducts() {
       return products;

    }
    public Category(String nameCategory, List<Product> products) {
        this.nameCategory = nameCategory;
        this.products = products;
    }

    public void removedProduct(Product product){
        products.remove(product);
    }


    public void removedGoods(Product product) {
        products.remove(product);
    }
}


