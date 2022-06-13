package course;

import entities.Product;

import java.util.*;

public class SetProgram {
    public static void main(String[] args) {

        Set<Product> set = new TreeSet<>();

        set.add(new Product("Tv", 900.0));
        set.add(new Product("Notebook", 1220.0));
        set.add(new Product("Tablet", 400.0));

        for (Product p : set) {
            System.out.println(p);
        }

    }
}
