package com.example.the_hungry_developer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import com.example.the_hungry_developer.R.id;

public class MainActivity extends AppCompatActivity {

    CardView StartersCard;
    CardView MainsCard;
    CardView SweetsCard;
    TextView EmailTextApp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StartersCard = findViewById(R.id.card_view_starters);
        MainsCard = findViewById(R.id.card_view_Mains);
        SweetsCard = findViewById(R.id.card_view_Sweets);
        EmailTextApp=findViewById(id.text_view_email);

        StartersCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent StartersIntent = new Intent(MainActivity.this, StarterActivity.class);
                startActivity(StartersIntent);
            }
        });

        MainsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainCoursesActivityIntent = new Intent(MainActivity.this, MainCourseActivity.class);
                startActivity(mainCoursesActivityIntent);
            }
        });

        SweetsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sweetIntent = new Intent(MainActivity.this,SweetActivity.class);
                startActivity(sweetIntent);
            }
        });


        EmailTextApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:sushmasivakumar07@gmail.com"));
                startActivity(intent);
            }
        });
    }
}