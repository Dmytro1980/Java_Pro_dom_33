package com.example.webapp.web.util;

import com.example.webapp.root.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class Util {
    public static List<Product> generateProductList() {


        List<Product> products = new ArrayList<>();

        List<Product> tempList = List.of(
                new Product(1, "Apple", 2),
                new Product(2, "Orange", 3),
                new Product(2, "Orange", 3),
                new Product(4, "Banana", 4),
                new Product(5, "Lemon", 5));

        // случайное количество продуктов, от 1 до 10, которое попадёт в заказ
        int productsNumInOrder = 1 + (int) (Math.random() * ((10 - 1) + 1));

        //  цикл заполняет список количеством = productsNumInOrder, рандомных продуктов
        for (int i = 0; i < productsNumInOrder; i++) {

            // выбор случайного id  продукта который попадёт в заказ, повторяется productsNumInOrder раз
            int randId = (int) (Math.random() * ((tempList.size() - 1) + 1));
            products.add(tempList.get(randId));
        }
        return products;
    }
}
