package tech_pro.registration;

import java.util.*;

public class Product {

    private String name;
    private int quantity;

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product(String name) {
        this.name = name;
        this.quantity = 1;

    }
}