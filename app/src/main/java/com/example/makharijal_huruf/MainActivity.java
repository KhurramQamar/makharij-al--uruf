package com.example.makharijal_huruf;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Intent intent;
        switch (item.getItemId()) {
            case R.id.action_halqiyah:
                intent = new Intent(MainActivity.this,Practice.class);
                intent.putExtra("button", "Halqiyah");
                startActivity(intent);
                return true;
            case R.id.action_lahatiyah:
                intent = new Intent(MainActivity.this,Practice.class);
                intent.putExtra("button", "Lahatiyah");
                startActivity(intent);
                return true;
            case R.id.action_shajariyah:
                intent = new Intent(MainActivity.this,Practice.class);
                intent.putExtra("button", "Shajariyah");
                startActivity(intent);
                return true;
            case R.id.action_tarfiyah:
                intent = new Intent(MainActivity.this,Practice.class);
                intent.putExtra("button", "Tarfiyah");
                startActivity(intent);
                return true;
            case R.id.action_niteeyah:
                intent = new Intent(MainActivity.this,Practice.class);
                intent.putExtra("button", "Niteeyah");
                startActivity(intent);
                return true;
            case R.id.action_lisaveyah:
                intent = new Intent(MainActivity.this,Practice.class);
                intent.putExtra("button", "Lisaveyah");
                startActivity(intent);
                return true;
            case R.id.action_ghunna:
                intent = new Intent(MainActivity.this,Practice.class);
                intent.putExtra("button", "Ghunna");
                startActivity(intent);
                return true;




            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);


        }
    }

}