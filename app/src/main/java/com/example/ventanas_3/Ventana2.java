package com.example.ventanas_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ventana2 extends AppCompatActivity {

    private EditText nombre1;
    private EditText nombre2;
    private EditText nombre3;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana2);
        setContentView(R.layout.activity_main);
        nombre1=(EditText)findViewById(R.id.nombre);
        nombre2=(EditText)findViewById(R.id.numero);
        nombre3=(EditText)findViewById(R.id.mesa);

    }
    public void cambio2(View view){
        Intent x=new Intent(this,Ventana3.class);
        x.putExtra("nom",nombre1.getText().toString());
        x.putExtra("nom",nombre2.getText().toString());
        x.putExtra("nom",nombre3.getText().toString());

        startActivity(x);//correr la ventana con 'i' objeto que se construyo
    }
}

