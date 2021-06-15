package com.ch.apiquotegarden;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.ch.apiquotegarden.Models.Authors;

import java.util.List;

public class Authors_Adapter extends BaseAdapter {
    protected Activity activityAutor;
    protected List<String> myListaAutores;

    public Authors_Adapter(Activity activityAutor, List<String> myListaAutores) {
        this.activityAutor = activityAutor;
        this.myListaAutores = myListaAutores;
    }

    @Override
    public int getCount() {
        return myListaAutores.size();
    }

    @Override
    public Object getItem(int position) {
        return myListaAutores.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vista = convertView;
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) activityAutor.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            vista = inflater.inflate(R.layout.author_item, null);
        }
        String objAutores = myListaAutores.get(position);
        TextView nombreAutor = vista.findViewById(R.id.txtNombreAutor);
        nombreAutor.setText(objAutores);
        return vista;
    }
}
