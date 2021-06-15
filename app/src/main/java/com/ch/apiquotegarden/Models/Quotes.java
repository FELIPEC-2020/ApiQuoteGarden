package com.ch.apiquotegarden.Models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Quotes {
    @SerializedName("data")
    List<Quote> listaQuotes;

    public List<Quote> getListaQuote() {
        return listaQuotes;
    }

    public void setListaQuote(List<Quote> listaQuote) {
        this.listaQuotes = listaQuote;
    }
}
