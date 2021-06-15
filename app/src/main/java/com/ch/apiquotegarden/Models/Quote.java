package com.ch.apiquotegarden.Models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Quote implements Serializable {
    @SerializedName("_id")
    private String idQuote;

    @SerializedName("quoteText")
    private String quoteTextQuote;

    @SerializedName("quoteAuthor")
    private String quoteAuthorQuote;

    @SerializedName("quoteGenre")
    private String quoteGenreQuote;

    @SerializedName("__v")
    private String vQuote;

    public Quote(String idQuote, String quoteTextQuote, String quoteAuthorQuote, String quoteGenreQuote, String vQuote) {
        this.idQuote = idQuote;
        this.quoteTextQuote = quoteTextQuote;
        this.quoteAuthorQuote = quoteAuthorQuote;
        this.quoteGenreQuote = quoteGenreQuote;
        this.vQuote = vQuote;
    }

    public String getIdQuote() {
        return idQuote;
    }

    public void setIdQuote(String idQuote) {
        this.idQuote = idQuote;
    }

    public String getQuoteTextQuote() {
        return quoteTextQuote;
    }

    public void setQuoteTextQuote(String quoteTextQuote) {
        this.quoteTextQuote = quoteTextQuote;
    }

    public String getQuoteAuthorQuote() {
        return quoteAuthorQuote;
    }

    public void setQuoteAuthorQuote(String quoteAuthorQuote) {
        this.quoteAuthorQuote = quoteAuthorQuote;
    }

    public String getQuoteGenreQuote() {
        return quoteGenreQuote;
    }

    public void setQuoteGenreQuote(String quoteGenreQuote) {
        this.quoteGenreQuote = quoteGenreQuote;
    }

    public String getvQuote() {
        return vQuote;
    }

    public void setvQuote(String vQuote) {
        this.vQuote = vQuote;
    }
}
