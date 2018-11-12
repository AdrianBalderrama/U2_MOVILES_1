package com.example.practica.eva2_10_cuadros_dialogo;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        new AlertDialog.Builder(this).setTitle("MI CUADRO DE DIALOGO").setMessage("Cuadro de dialogo general")
                .setPositiveButton("TA GUENO!!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"CLICK POSITIVO!!",Toast.LENGTH_LONG).show();
                    }
                })
                .setNeutralButton("TA GUENO!!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"CLICK Medio!!",Toast.LENGTH_LONG).show();
                    }
                }).setNegativeButton("TA MALO!!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"CLICK NEGATIVO!!",Toast.LENGTH_LONG).show();
            }
        }).show();


    }

/*ESTO NU FUNCA EL CLICK 2*/

        public void onClick2(View view) {
        final Dialog dMiCuadroDialogo = new Dialog (this);
dMiCuadroDialogo.setContentView(R.layout.cuadro_dialogo);
TextView txtVwTitu;
            EditText edtTxtDatos;
            Button btnAccion;

            txtVwTitu= dMiCuadroDialogo.findViewById(R.id.);


        }
}
