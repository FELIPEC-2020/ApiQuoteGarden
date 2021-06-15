package com.ch.apiquotegarden;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.ch.apiquotegarden.Models.Quote;

import java.util.List;
import java.util.zip.Inflater;

public class Quote_Adapter extends BaseAdapter {
    protected Activity activity;
    protected List<Quote> myListaQuote;

    public Quote_Adapter(Activity activity, List<Quote> myListaQuote) {
        this.activity = activity;
        this.myListaQuote = myListaQuote;
    }

    @Override
    public int getCount() {
        return myListaQuote.size();
    }

    @Override
    public Object getItem(int position) {
        return myListaQuote.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vista = convertView;
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            vista = inflater.inflate(R.layout.quote_item, null);
        }
        Quote objQuote = myListaQuote.get(position);
        TextView nombreQuote = vista.findViewById(R.id.tvNombre);
        nombreQuote.setText(objQuote.getQuoteTextQuote());
        return vista;
    }
}
