package com.example.usuario.eva2_9_Restaurante;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Principal extends AppCompatActivity {

    Intent inEnviarDatos;

    Restaurante[] clases ={
            new Restaurante(R.drawable.barrafina,"Barra Fina", "6141486766","Restaurante Gourmet",  "Karamin 333"),
            new Restaurante(R.drawable.bourkestreetbakery,"Bourkey", "6141347565","Café Gourmet",  "Homero 341"),
            new Restaurante(R.drawable.cafedeadend,"CafeDeadEnd", "6141224321","Cafe de Muerte",  "Homero 333"),
            new Restaurante(R.drawable.cafeloisl,"CafeLoisl", "6142378493","Cafe nice",  "Juan escutia 7883"),
            new Restaurante(R.drawable.cafelore,"CafeLore", "6141207594","Cafe and Toffe",  "Industrias 324"),
            new Restaurante(R.drawable.confessional,"Confessional", "6141234859","Pizzas",  "Americas 444"),
            new Restaurante(R.drawable.donostia,"Donostia", "614659402","Ostias and stuff", "Calle Ostia 404"),
            new Restaurante(R.drawable.fiveleaves,"Fiveleaves", "614532103","Meals",  "Calle Olimpo 314"),
            new Restaurante(R.drawable.forkeerestaurant,"ForkeeRestaurant", "6141729403","Top meals",  "Calle Micale 333"),
            new Restaurante(R.drawable.grahamavenuemeats,"GrahamMeats", "614229930","Meats",  "Jose Ma 303"),
            new Restaurante(R.drawable.haighschocolate,"HaighsChocolate", "627381920","Coffe and Chocolate",  "Calle rip 333"),
            new Restaurante(R.drawable.homei,"Homei", "6147281940","The best place",  "Calle Delfin 404"),
            new Restaurante(R.drawable.palominoespresso,"Palominoespresso", "612849302","Food",  "Calle Ardilla 101"),
            new Restaurante(R.drawable.petiteoyster,"Petiteoyster", "6244545345","Oyster and stuff",  "Calle I hate myself 111"),
            new Restaurante(R.drawable.posatelier,"Posatelier", "6141389405","Food",  "Calle Just end my life 404"),
            new Restaurante(R.drawable.royaloak,"Royaloak", "61482293012","More food",  "Calle cringe 101"),
            new Restaurante(R.drawable.teakha,"Teakha", "6142738193","Tea and stuff",  "Calle boring repetitive stuff 102"),
            new Restaurante(R.drawable.thaicafe,"ThaiCafe", "614273820","Thai and stuff",  "Calle Why I am like this 111"),
            new Restaurante(R.drawable.traif,"Traif", "614122830","Weird food",  "Calle Tetragramaton 111"),
            new Restaurante(R.drawable.upstate,"Upstate", "61411302937","NY Food",  "Calle Just end my mysery 434"),
            new Restaurante(R.drawable.wafflewolf,"WaffleWolf", "630486790","Waffle and stuff",  "Calle siempre viva 134")

    };
    ListView lstClima;
    String iLugar, iDescripcion;
    String iTelf, iDir;
    int iImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        lstClima=findViewById(R.id.lstClima);
        lstClima.setAdapter(new AsignaturaAdaptador(this,R.layout.mi_list, clases));
        lstClima.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                iLugar = clases[i].getLugar().toString();
                iTelf = clases[i].getTelefono();
                iDescripcion = clases[i].getDescripcion();
                iImg = clases[i].getImagen();
                iDir = clases[i].getDireccion();
                Bundle bnDatos = new Bundle();
                bnDatos.putString("bLugar", iLugar);
                bnDatos.putString("bTelefono", iTelf);
                bnDatos.putString("bDescripcion", iDescripcion);
                bnDatos.putInt("bImagen", iImg);
                bnDatos.putString("bDireccion",iDir);
                inEnviarDatos.putExtras(bnDatos);
                startActivity(inEnviarDatos);
            }
        });
        inEnviarDatos=new Intent(this, DetalleAsignatura.class);
    }

}