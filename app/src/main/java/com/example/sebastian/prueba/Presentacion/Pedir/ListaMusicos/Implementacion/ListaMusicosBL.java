package com.example.sebastian.prueba.Presentacion.Pedir.ListaMusicos.Implementacion;

import android.content.Context;

import com.example.sebastian.prueba.Modelos.Musico;
import com.example.sebastian.prueba.Presentacion.Pedir.ListaMusicos.Interfaces.IListaMusicosBL;
import com.example.sebastian.prueba.Presentacion.Pedir.ListaMusicos.Interfaces.IListaMusicosListener;

public class ListaMusicosBL implements IListaMusicosBL {

    private Context context;
    private IListaMusicosListener listener;

    public ListaMusicosBL(Context context, IListaMusicosListener listener){
        this.context = context;
        this.listener = listener;
    }

    @Override
    public void listaMusicos(Musico musico) {
        listener.musicoValido();
    }
}
