package com.example.the_hungry_developer;

public class Dish {
    String title,description;
    int price;

    Dish(String title,String description,int price){
        this.title=title;
        this.description=description;
        this.price=price;
    }

    @Override
    public String toString() {
        return title;
    }
}
