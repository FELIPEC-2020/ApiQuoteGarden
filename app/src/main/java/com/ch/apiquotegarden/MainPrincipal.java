package com.ch.apiquotegarden;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainPrincipal extends AppCompatActivity implements View.OnClickListener {
    private ImageButton btnFrases;
    private ImageButton btnGeneros;
    private ImageButton btnAutores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_principal);

        btnFrases = findViewById(R.id.btnFrases);
        btnGeneros = findViewById(R.id.btnGeneros);
        btnAutores = findViewById(R.id.btnAutores);

        btnFrases.setOnClickListener(this);
        btnGeneros.setOnClickListener(this);
        btnAutores.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnFrases) {
            Intent abrirFrases = new Intent(this, MainActivity.class);
            startActivity(abrirFrases);
        }else if(v.getId() == R.id.btnGeneros){
            Intent abrirGeneros = new Intent(this, Activity_Genero.class);
            startActivity(abrirGeneros);
        }else if(v.getId() == R.id.btnAutores){
            Intent abrirAutores = new Intent(this, Activity_Autor.class);
            startActivity(abrirAutores);
        }

    }
}