package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product cucumber = new Product("Огурец",10,1);
        Product pomidor = new Product("Помидор",15,2);
        List<Product> vegetables = new ArrayList<>(Arrays.asList(cucumber,pomidor));

        Product orange = new Product("Апельсин",20,3);
        Product strawberry = new Product("Клубника",5,1);
        List<Product> fruits= new ArrayList<>(Arrays.asList(orange,strawberry));

        Product chiken = new Product("Курица",50,6);
        Product pork = new Product("Свинина",60,8);
        List<Product> meet = new ArrayList<>(Arrays.asList(chiken,pork));


        Category Vegatables = new Category("Овощи",vegetables) {
        };
        Category Fruits= new Category("Фрукты",fruits) {
        };
        Category Meet = new Category("Мясо",meet) {
        };

        User Volodya = new User("Volodya",123);
        User Bagration = new User("Bagrusha", 666);




        System.out.println("Список товаров магазина: \n");
        System.out.println(Vegatables.nameCategory + ": ");
        for (Product product : Vegatables.getProducts()){
            System.out.println( product.getName() + " - Цена: " + product.getPrice() + ",Вес: " + product.getWeight());
        }
        System.out.println(Fruits.nameCategory + ": ");
        for (Product product : Fruits.getProducts()){
            System.out.println( product.getName() + " - Цена: " + product.getPrice() + ",Вес: " + product.getWeight());
        }
        System.out.println(Meet.nameCategory + ": ");
        for (Product product : Meet.getProducts()){
            System.out.println( product.getName() + " - Цена: " + product.getPrice() + ", Вес: " + product.getWeight());
        }
        System.out.println();

        System.out.println("У нас новый покупатель!");
        Volodya.getBasket().addProduct(cucumber);
        Vegatables.removedGoods(cucumber);

        for (Product product : Volodya.getBasket().getProducts())
            System.out.println("В корзине " + Volodya.getLogin() +": " + product.getName() + " - Цена: " + product.getPrice() + ", Вес: " + product.getWeight());

        System.out.println();

        System.out.println("Список товаров магазина: \n");
        System.out.println(Vegatables.nameCategory + ": ");
        for (Product product : Vegatables.getProducts()){
            System.out.println( product.getName() + " - Цена: " + product.getPrice() + ",Вес: " + product.getWeight());
        }
        System.out.println(Fruits.nameCategory + ": ");
        for (Product product : Fruits.getProducts()){
            System.out.println( product.getName() + " - Цена: " + product.getPrice() + ",Вес: " + product.getWeight());
        }
        System.out.println(Meet.nameCategory + ": ");
        for (Product product : Meet.getProducts()){
            System.out.println( product.getName() + " - Цена: " + product.getPrice() + ", Вес: " + product.getWeight());
        }

        System.out.println();
        Volodya.getBasket().addProduct(chiken);
        Meet.removedGoods(chiken);

        for (Product product : Volodya.getBasket().getProducts())
            System.out.println("В корзине " + Volodya.getLogin() +": " + product.getName() + " - Цена: " + product.getPrice() + ", Вес: " + product.getWeight());

        System.out.println();

        System.out.println("Список товаров магазина: \n");
        System.out.println(Vegatables.nameCategory + ": ");
        for (Product product : Vegatables.getProducts()){
            System.out.println( product.getName() + " - Цена: " + product.getPrice() + ",Вес: " + product.getWeight());
        }
        System.out.println(Fruits.nameCategory + ": ");
        for (Product product : Fruits.getProducts()){
            System.out.println( product.getName() + " - Цена: " + product.getPrice() + ",Вес: " + product.getWeight());
        }
        System.out.println(Meet.nameCategory + ": ");
        for (Product product : Meet.getProducts()){
            System.out.println( product.getName() + " - Цена: " + product.getPrice() + ", Вес: " + product.getWeight());
        }
        System.out.println("Всего хорошего " + Volodya.getLogin() + " !" );

        System.out.println("У нас новый покупатель!");

        Bagration.getBasket().addProduct(orange);
        Fruits.removedGoods(orange);

        for (Product product : Bagration.getBasket().getProducts())
            System.out.println("В корзине " + Bagration.getLogin() + ": " + product.getName() + " - Цена: " + product.getPrice() + ", Вес: " + product.getWeight());

        System.out.println();

        System.out.println("Список товаров магазина: \n");
        System.out.println(Vegatables.nameCategory + ": ");
        for (Product product : Vegatables.getProducts()){
            System.out.println( product.getName() + " - Цена: " + product.getPrice() + ",Вес: " + product.getWeight());
        }
        System.out.println(Fruits.nameCategory + ": ");
        for (Product product : Fruits.getProducts()){
            System.out.println( product.getName() + " - Цена: " + product.getPrice() + ",Вес: " + product.getWeight());
        }
        System.out.println(Meet.nameCategory + ": ");
        for (Product product : Meet.getProducts()){
            System.out.println( product.getName() + " - Цена: " + product.getPrice() + ", Вес: " + product.getWeight());
        }

        System.out.println("Всего хорошего " + Bagration.getLogin() + " !" );





    }
}
