package com.ch.apiquotegarden.Models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Authors {
    @SerializedName("data")
    List<String> listaAutores;

    public List<String> getListaAutores() {
        return listaAutores;
    }

    public void setListaAutores(List<String> listaAutores) {
        this.listaAutores = listaAutores;
    }
}
