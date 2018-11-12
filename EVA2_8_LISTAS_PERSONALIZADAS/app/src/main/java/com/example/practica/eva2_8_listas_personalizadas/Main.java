package com.example.practica.eva2_8_listas_personalizadas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Main extends AppCompatActivity implements ListView.OnItemClickListener{

    Clima[] aCiudades ={
            new Clima("Chihuahua",10,"Nublado", R.drawable.cloudy),
            new Clima("Juarez",15,"Lluvioso", R.drawable.rainy),
            new Clima("Aldama",21,"Soleado", R.drawable.sunny),
            new Clima("Creel",33,"Soleado", R.drawable.sunny),
            new Clima("Ojinaga",1,"Lluvia ligera", R.drawable.light_rain),
            new Clima("Cuauhtemoc",6,"Lluvia", R.drawable.rainy),
            new Clima("Camargo",12,"Soleado", R.drawable.sunny),
            new Clima("Ciudad x",18,"Nublado", R.drawable.cloudy)
    };

    ListView lstViewClima;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstViewClima=findViewById(R.id.lstVwClima);
        lstViewClima.setAdapter(new WeatherAdapter(this,R.layout.layout_clima,aCiudades));
        inDetalle = new Intent(this,  clima)
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Indetalle.putExtra
    }
}
