package com.example.sebastian.prueba.Presentacion.Pedir.ListaCategorias.Implementacion;

import android.content.Context;

import com.example.sebastian.prueba.Modelos.Categoria;
import com.example.sebastian.prueba.Presentacion.Pedir.ListaCategorias.Interfaces.IListaCategoriasBL;
import com.example.sebastian.prueba.Presentacion.Pedir.ListaCategorias.Interfaces.IListaCategoriasListener;


public class ListaCategoriasBL implements IListaCategoriasBL {

    private Context context;
    private IListaCategoriasListener listener;

    public ListaCategoriasBL(Context context, IListaCategoriasListener listener){
        this.context = context;
        this.listener = listener;
    }

    @Override
    public void listaCategorias(Categoria categoria) {
        listener.categoriaValida();
    }
}
