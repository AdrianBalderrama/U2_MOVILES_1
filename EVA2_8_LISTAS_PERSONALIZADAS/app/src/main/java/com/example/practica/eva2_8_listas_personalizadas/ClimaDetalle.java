package com.example.practica.eva2_8_listas_personalizadas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ClimaDetalle extends AppCompatActivity {
   TextView txtVwCiudadDetalle, txtVwTempDetalle, txtVwDescDetalle;
   ImageView imgVwClimaDetalle;
   Intent inDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clima_detalle);

        imgVwClimaDetalle = findViewById(R.id.imgVwClimaDetalle);
        txtVwCiudadDetalle= findViewById(R.id.txtVwCiudadDetalle);
        txtVwTempDetalle=   findViewById(R.id.txtVwTempDetalle);
        txtVwDescDetalle=   findViewById(R.id.txtVwDesc);
    }
}
