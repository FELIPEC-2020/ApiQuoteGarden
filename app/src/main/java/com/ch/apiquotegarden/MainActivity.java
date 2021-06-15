package com.ch.apiquotegarden;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

import com.ch.apiquotegarden.ApiManager.RetrofitClient;
import com.ch.apiquotegarden.Models.Authors;
import com.ch.apiquotegarden.Models.Quotes;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    ListView lvQuote;
    Quotes myQuotes;


    private static final String TAG = "object";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvQuote = findViewById(R.id.lvQuote);
        getQuoteFromApi();

    }

    private void getQuoteFromApi() {
        Call<Quotes> call = RetrofitClient.getInstance().getMyApi().getQuotes();
        call.enqueue(new Callback<Quotes>() {
            @Override
            public void onResponse(Call<Quotes> call, Response<Quotes> response) {
                myQuotes = response.body();
                Quote_Adapter adapter = new Quote_Adapter(MainActivity.this, myQuotes.getListaQuote());
                lvQuote.setAdapter(adapter);
            }


            @Override
            public void onFailure(Call<Quotes> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Ocurrió un error", Toast.LENGTH_SHORT).show();
            }
        });
    }



}