package com.example.usuario.eva2_9_Restaurante;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleAsignatura extends AppCompatActivity {
    ImageView imgVwRest;
    TextView txtVwPlace, txtVwDescr, txtVwDireccion, txtVwTelf;
    String btelf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_clima);
        imgVwRest =  findViewById(R.id.imgVwRest);
        txtVwPlace =findViewById(R.id.txtVwPlace);
        txtVwDescr =   findViewById(R.id.txtVwDescr);
        txtVwDireccion = findViewById(R.id.txtVwDireccion);
        txtVwTelf =     findViewById(R.id.txtVwTelf);
        Intent inDatos = getIntent();
        Bundle bnDatos = inDatos.getExtras();
        txtVwPlace.append(" " + bnDatos.getString("bLugar") + "\n");
        txtVwDescr.append(" " + bnDatos.getString("bDescripcion") + "\n");
        int bimg = bnDatos.getInt("bImagen");
        txtVwDireccion.append("" + bnDatos.getString("bDireccion"));
        btelf = bnDatos.getString("bTelefono");
        txtVwTelf.setText("Tel: " + btelf);
        imgVwRest.setBackgroundResource(bimg);


    }


}