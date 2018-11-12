package com.example.usuario.eva2_9_Restaurante;

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


public class AsignaturaAdaptador extends ArrayAdapter {
    Context cnContexto;
    int iMiLayout;
    Restaurante[] datos = null;

    public AsignaturaAdaptador(@NonNull Context context, int resource, @NonNull Object[] objects) {
        super(context, resource, objects);
        cnContexto=context;
        iMiLayout=resource;
        datos = (Restaurante[]) objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ImageView imVwDra;
        TextView TxtVMat, TxtVDesc;
        View vwMiFila = convertView;
        if (vwMiFila==null){
            LayoutInflater liCrearlayout = ((Activity)cnContexto).getLayoutInflater();
            vwMiFila = liCrearlayout.inflate(iMiLayout, parent,false);
        }else{
        }
        imVwDra = vwMiFila.findViewById(R.id.imVwDra);
        TxtVMat=vwMiFila.findViewById(R.id.TxtVMat);
        TxtVDesc=vwMiFila.findViewById(R.id.TxtVDesc);

        imVwDra.setBackgroundResource(datos[position].getImagen());
        TxtVMat.setText(datos[position].getLugar());
        TxtVDesc.setText(datos[position].getDescripcion());
        return vwMiFila;

    }

}