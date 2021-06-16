package com.ch.apiquotegarden;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.ch.apiquotegarden.Models.Quote;
import com.ch.apiquotegarden.Models.Quotes;

public class QuotesDetalle extends AppCompatActivity {
    TextView tvQuoteText;
    TextView tvQuoteAuthor;
    TextView tvQuoteGenre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes_detalle);

        tvQuoteText = findViewById(R.id.tvQuoteText);
        tvQuoteAuthor = findViewById(R.id.tvQuoteAuthor);
        tvQuoteGenre = findViewById(R.id.tvQuoteGenre);

        Quote objQuotes = (Quote) getIntent().getSerializableExtra("objQuote");
        tvQuoteText.setText("\""+objQuotes.getQuoteTextQuote()+"\"");
        tvQuoteAuthor.setText(objQuotes.getQuoteAuthorQuote());
        tvQuoteGenre.setText(objQuotes.getQuoteGenreQuote());
    }

}