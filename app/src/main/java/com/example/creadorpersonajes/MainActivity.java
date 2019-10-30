package com.example.creadorpersonajes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }

    public void crearPersonaje (View view){
        Intent i = new Intent (this, Activity_Raza.class);
        startActivity(i);
    }
    public void wiki (View view){
        Intent i = new Intent (this, Activity_Wiki.class);
        startActivity(i);
    }
}
