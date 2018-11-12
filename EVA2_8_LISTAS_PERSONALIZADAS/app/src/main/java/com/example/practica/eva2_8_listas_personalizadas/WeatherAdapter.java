package com.example.practica.eva2_8_listas_personalizadas;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class WeatherAdapter extends ArrayAdapter<Clima> {
    Context cContexto;
    int iLayout;
    Clima[] aCiudadesClima;

    public WeatherAdapter(@NonNull Context context, int resource, @NonNull Clima[] objects) {
        super(context, resource, objects);
        cContexto = context;
        iLayout= resource;
        aCiudadesClima=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ImageView imgVwClima;
        TextView txtVwCiudad,txtVwTemp,txtVwDesc;

        View vFila;
        vFila= convertView;
        if(vFila==null){//SI es nulo, no existe nuestra fila, hay que crearla.
          //PARA CREAR NUESTRA VISTA USAMOS LAYOUTINFLATER
            LayoutInflater liVista = ((Activity)cContexto).getLayoutInflater();
            vFila = liVista.inflate(iLayout,parent,false);



        } //Vincular Widgets
        imgVwClima = vFila.findViewById(R.id.imgVwClima);
        txtVwCiudad= vFila.findViewById(R.id.txtVwCiudad);
        txtVwTemp= vFila.findViewById(R.id.txtVwTemp);
        txtVwDesc= vFila.findViewById(R.id.txtVwDesc);
        //LLENAR DATOS

        Clima cActual = aCiudadesClima[position];
        imgVwClima.setImageResource(cActual.imagen);
        txtVwCiudad.setText(cActual.nombreCiudad);
        txtVwTemp.setText(cActual.temperatura+"*");
        txtVwDesc.setText(cActual.descripcion);
        return vFila;
    }
}
