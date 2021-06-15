package com.ch.apiquotegarden.Models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Genres {

    @SerializedName("data")
    private List<String> listaGeneros;

    public List<String> getListaGeneros() {
        return listaGeneros;
    }

    public void setListaGeneros(List<String> listaGeneros) {
        this.listaGeneros = listaGeneros;
    }
}
