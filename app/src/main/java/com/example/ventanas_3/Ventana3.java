package com.example.ventanas_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Ventana3 extends AppCompatActivity {

    private TextView regresar;
    private Button button3;
    private Bundle datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana3);
        regresar=(TextView) findViewById(R.id.regresar);
        datos=getIntent().getExtras();//Contruye todos los datos y los pasas de ventana en ventana
        regresar.setText(datos.getString("nom"));

    }
    public void regresar(View view){


    }
}