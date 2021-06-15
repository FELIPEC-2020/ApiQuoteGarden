package com.ch.apiquotegarden;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.ch.apiquotegarden.ApiManager.RetrofitClient;
import com.ch.apiquotegarden.Models.Genres;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Activity_Genero extends AppCompatActivity {
    Genres listaGeneros;
    ListView myListaGeneros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__genero);
        myListaGeneros = findViewById(R.id.lvGenero);
        getGenero();
    }

    public  void getGenero(){
        Call<Genres> call = RetrofitClient.getInstance().getMyApi().getGenres();
        call.enqueue(new Callback<Genres>() {
            @Override
            public void onResponse(Call<Genres> call, Response<Genres> response) {
                listaGeneros = response.body();
                Generes_Adapter adapter = new Generes_Adapter(Activity_Genero.this, listaGeneros.getListaGeneros());
                myListaGeneros.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<Genres> call, Throwable t) {

            }
        });
    }
}