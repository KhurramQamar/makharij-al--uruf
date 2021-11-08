package com.example.makharijal_huruf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import java.io.Console;

public class MainActivity extends AppCompatActivity {

    public Button Halqiyah,Lahatiyah,Shajariyah,Tarfiyah,Niteeyah,Lisaveyah,Ghunna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Halqiyah=(Button)findViewById(R.id.Halqiyah);
        Lahatiyah=(Button)findViewById(R.id.Lahatiyah);
        Shajariyah=(Button)findViewById(R.id.Shajariyah);
        Tarfiyah=(Button)findViewById(R.id.Tarfiyah);
        Niteeyah=(Button)findViewById(R.id.Niteeyah);
        Lisaveyah=(Button)findViewById(R.id.Lisaveyah);
        Ghunna=(Button)findViewById(R.id.Ghunna);
        Halqiyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newintent= new Intent(MainActivity.this,Practice.class);
                newintent.putExtra("button", "Halqiyah");
                startActivity(newintent);
            }
        });
        Lahatiyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newintent= new Intent(MainActivity.this,Practice.class);
                newintent.putExtra("button", "Lahatiyah");
                startActivity(newintent);
            }
        });
        Shajariyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newintent= new Intent(MainActivity.this,Practice.class);
                newintent.putExtra("button", "Shajariyah");
                startActivity(newintent);
            }
        });
        Tarfiyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newintent= new Intent(MainActivity.this,Practice.class);
                newintent.putExtra("button", "Tarfiyah");
                startActivity(newintent);
            }
        });
        Niteeyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newintent= new Intent(MainActivity.this,Practice.class);
                newintent.putExtra("button", "Niteeyah");
                startActivity(newintent);
            }
        });
        Lisaveyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newintent= new Intent(MainActivity.this,Practice.class);
                newintent.putExtra("button", "Lisaveyah");
                startActivity(newintent);
            }
        });
        Ghunna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newintent= new Intent(MainActivity.this,Practice.class);
                newintent.putExtra("button", "Ghunna");
                startActivity(newintent);
            }
        });









    }








}