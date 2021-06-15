package com.ch.apiquotegarden;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.ch.apiquotegarden.ApiManager.RetrofitClient;
import com.ch.apiquotegarden.Models.Authors;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Activity_Autor extends AppCompatActivity {
    Authors listaAutores;
    ListView myListaAutores;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__autor);
        myListaAutores = findViewById(R.id.lvAutor);
        getAuthors();
    }
    public void getAuthors() {
       Call<Authors> call = RetrofitClient.getInstance().getMyApi().getAuthors();
       call.enqueue(new Callback<Authors>() {
           @Override
           public void onResponse(Call<Authors> call, Response<Authors> response) {
               listaAutores = response.body();
               Authors_Adapter adapter = new Authors_Adapter(Activity_Autor.this, listaAutores.getListaAutores());
               myListaAutores.setAdapter(adapter);
           }

           @Override
           public void onFailure(Call<Authors> call, Throwable t) {

           }
       });
    }
}