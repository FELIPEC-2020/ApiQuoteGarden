package com.ch.apiquotegarden.ApiManager;

import com.ch.apiquotegarden.Models.Author;
import com.ch.apiquotegarden.Models.Genre;
import com.ch.apiquotegarden.Models.Quote;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInicialQuoteGarden {
    String BASE_URL = "https://quote-garden.herokuapp.com/api/v3/";

    @GET("quotes")
    Call<List<Quote>> getQuotes();

    @GET("genres")
    Call<List<Genre>> getGenres();

    @GET("authors")
    Call<List<Author>> getAuthors();
}
