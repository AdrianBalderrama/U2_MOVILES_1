package com.example.practica.eva2_4_bundles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Main extends AppCompatActivity implements View.OnClickListener implements   {

    Button btnIninSec,btnEnviar;
    Intent inLanzarSecun;
    EditText edtTxtNom, edtTxtApellido,edtTxtEdad,edtTxtSal;
    CheckBox ckBxLabora;
    TextView txtVwSal;
    RadioGroup rdGrpGen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnIninSec=findViewById(R.id.btnIninSec);
        btnIninSec.setOnClickListener(Main.this);
        inLanzarSecun= new Intent(Main.this, Secundaria.class);
        edtTxtNom= findViewById(R.id.edtTxtNom);
        ckBxLabora= findViewById(R.id.ckBoxLabora);
        rdGrpGen= findViewById(R.id.rdGrpGen);
        txtVwSal=findViewById(R.id.txtVwSalario);
        edtTxtSal=findViewById(R.id.edtTxtSalario);
        edtTxtApellido=findViewById(R.id.edtTxtApellido);
        edtTxtEdad=findViewById(R.id.edtTxtEdad);
        ckBxLabora.setOnCheckedChangeListener(this);
        btnEnviar.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        /*VAE EN EL ONCLICK ENVIAR*/
        String sNom = edtTxtNom.getText().toString();
        String sApe= edtTxtApellido.getText().toString();
        int iEdad=  Integer.parseInt(edtTxtEdad.getText().toString());
        boolean bLabora= ckBxLabora.isChecked();
        double dSal = Double.parseDouble(edtTxtSal.getText().toString());
        int Isel = rdGrpGen.getCheckedRadioButtonId();
        int iGen;

        if(Isel==R.id.rdBtnMas)
            iGen = 1;
        else if (Isel==R.id.rdBtnFem)
            iGen=2;
        else
            iGen=3;

Bundle bBundle = new Bundle();
        bBundle.putString("NOMBRE",sNom);
        bBundle.putString("APELLIDO",sApe);
        bBundle.putInt("EDAD",iEdad);
        bBundle.putBoolean("NOMBRE",bLabora);
        bBundle.putInt("GENERO",iGen);
        inLanzarSecun.putExtra(bBundle);
        startActivity(inLanzarSecun);
    }
}
