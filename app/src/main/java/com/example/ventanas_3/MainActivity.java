package com.example.ventanas_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView texto2;
    private TextView textos;
    private Button aceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textos=(TextView) findViewById(R.id.texto);

    }
    public void cambio(View view){
        Intent i=new Intent(this,Ventana2.class);
        i.putExtra("comenzar",textos.getText().toString());

        startActivity(i);//correr la ventana con 'i' objeto que se construyo
    }
}


