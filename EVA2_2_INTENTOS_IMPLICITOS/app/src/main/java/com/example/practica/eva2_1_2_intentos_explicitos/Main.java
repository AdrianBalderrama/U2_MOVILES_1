package com.example.practica.eva2_1_2_intentos_explicitos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends AppCompatActivity implements View.OnClickListener {

    Button btnIninSec;
    Intent inLanzarSecun;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnIninSec=findViewById(R.id.btnIninSec);
        btnIninSec.setOnClickListener(Main.this);
        inLanzarSecun= new Intent(Main.this, Secundaria.class);

    }


    @Override
    public void onClick(View v) {
        startActivity(inLanzarSecun);
    }
}
