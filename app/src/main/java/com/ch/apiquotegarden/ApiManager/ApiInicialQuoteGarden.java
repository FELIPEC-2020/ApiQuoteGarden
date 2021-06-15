package com.ch.apiquotegarden.ApiManager;

import com.ch.apiquotegarden.Models.Authors;
import com.ch.apiquotegarden.Models.Genres;
import com.ch.apiquotegarden.Models.Quotes;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInicialQuoteGarden {
    String BASE_URL = "https://quote-garden.herokuapp.com/api/v3/";

    @GET("quotes")
    Call<Quotes> getQuotes();

    @GET("genres")
    Call<Genres> getGenres();

    @GET("authors")
    Call<Authors> getAuthors();
}
