package com.ch.apiquotegarden;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class Generes_Adapter extends BaseAdapter {
    protected Activity activityGenero;
    protected List<String> myListaGeneros;

    public Generes_Adapter(Activity activityGenero, List<String> myListaGeneros) {
        this.activityGenero = activityGenero;
        this.myListaGeneros = myListaGeneros;
    }

    @Override
    public int getCount() {
        return myListaGeneros.size();
    }

    @Override
    public Object getItem(int position) {
        return myListaGeneros.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vista = convertView;
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) activityGenero.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            vista = inflater.inflate(R.layout.genre_item, null);
        }
        String objGeneros = myListaGeneros.get(position);
        TextView nombreGenero = vista.findViewById(R.id.txtNombreGenero);
        nombreGenero.setText(objGeneros);
        return vista;
    }
}
