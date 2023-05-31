package com.example.the_hungry_developer;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class SweetActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sweet);
        ListView Sweet = findViewById(R.id.list_view_sweets);
        Dish[] sweet = {
                new Dish("Gulab Jamun", "delicious sweet", 149),
                new Dish("Rasagula", "delicious sweet", 149),
                new Dish("Ladoo ", "delicious sweet", 149),
                new Dish("Malai Gujiya ", "delicious sweet", 149),
                new Dish("Gajar Ka Halwa ", "delicious sweet", 149),
                new Dish("Sandesh ", "delicious sweet", 149),
                new Dish("Modak ", "delicious sweet", 149),
                new Dish("Payasam", "delicious sweet", 149),
                new Dish("Kaju ki Barfi", "delicious sweet", 149),
                new Dish("Puran Poli", "delicious sweet", 149),
                new Dish("Kulfi", "delicious sweet", 149),
                new Dish("Phirni", "delicious sweet", 149),
                new Dish("ney Appam", "delicious sweet", 149)
        };

        ArrayAdapter<Dish> MainAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, sweet);

        Sweet.setAdapter(MainAdapter);
    }

}