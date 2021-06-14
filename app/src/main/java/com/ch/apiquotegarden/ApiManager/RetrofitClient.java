package com.ch.apiquotegarden.ApiManager;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static RetrofitClient instance = null;
    private ApiInicialQuoteGarden myApiInicial;

    private RetrofitClient() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(ApiInicialQuoteGarden.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        myApiInicial = retrofit.create(ApiInicialQuoteGarden.class);
    }

    public static synchronized RetrofitClient getInstance() {
        if (instance == null) {
            instance = new RetrofitClient();
        }
        return instance;
    }

    public ApiInicialQuoteGarden getMyApi() {
        return myApiInicial;
    }
}
