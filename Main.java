package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, TreeMap<String, Integer>> customers = new TreeMap<>();

        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();

            String[] arrOfStr = str.split(" ");

            String name = arrOfStr[0];
            String product = arrOfStr[1];
            Integer quantity = Integer.parseInt(arrOfStr[2]);

            TreeMap<String, Integer> products = new TreeMap<>();

            if (customers.containsKey(name)) {

                products = customers.get(name);

                if (products.containsKey(product)) {
                    int p_quantity = products.get(product);
                    p_quantity += quantity;
                    products.put(product, p_quantity);
                } else {
                    // добавление название
                    products.put(product, quantity);
                }
            } else {
                products.put(product, quantity);
            }
            customers.put(name, products);
            System.out.println(customers);
        }

    }
}

