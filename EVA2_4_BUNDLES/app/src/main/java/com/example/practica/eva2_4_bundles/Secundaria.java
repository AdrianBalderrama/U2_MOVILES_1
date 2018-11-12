package com.example.practica.eva2_4_bundles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class Secundaria extends AppCompatActivity {
    TextView txtVwMostrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        txtVwMostrar=findViewById(R.id.txtVwDatos);
        intDatos= getIntent();
        Bundle bDatos= inDatos.getExtras();
        txtVwMostrar.append("Nombre"+bDatos.getString("NOMBRE"));
    }
}
