package com.example.makharijal_huruf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends AppCompatActivity {

    Button repo;
    Button practice;
    Button exam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        repo=findViewById(R.id.repo);
        practice=findViewById(R.id.learning);
        exam=findViewById(R.id.exam);
        repo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://github.com/KhurramQamar/makharij-al--uruf");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        practice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newintent= new Intent(HomeScreen.this,MainActivity.class);

                startActivity(newintent);
            }
        });
        exam.setOnClickListener(new View.OnClickListener() {
            @Override
            
            }
        });
    }
}