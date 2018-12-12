package com.example.sebastian.prueba.Presentacion.Pedir.ListaMusicos.Implementacion;

import android.content.Context;

import com.example.sebastian.prueba.Modelos.Musico;
import com.example.sebastian.prueba.Presentacion.Pedir.ListaCategorias.Interfaces.IListaCategoriasView;
import com.example.sebastian.prueba.Presentacion.Pedir.ListaMusicos.Interfaces.IListaMusicosBL;
import com.example.sebastian.prueba.Presentacion.Pedir.ListaMusicos.Interfaces.IListaMusicosListener;
import com.example.sebastian.prueba.Presentacion.Pedir.ListaMusicos.Interfaces.IListaMusicosPresenter;
import com.example.sebastian.prueba.Presentacion.Pedir.ListaMusicos.Interfaces.IListaMusicosView;


public class ListaMusicosPresenter implements IListaMusicosPresenter {

    private Context context;
    private IListaMusicosView listaMusicosView;
    private IListaMusicosBL ilistaMusicosBL;

    public ListaMusicosPresenter(Context context, IListaMusicosView listaMusicosView) {
        this.context = context;
        this.listaMusicosView = listaMusicosView;
        ilistaMusicosBL = new ListaMusicosBL(context, new AccionesListener());
    }

    //Validar información de la vista
    @Override
    public void listaMusicos(Musico musico) {
        ilistaMusicosBL.listaMusicos(musico);
    }

    private class AccionesListener implements IListaMusicosListener {

        @Override
        public void musicoValido() {
            listaMusicosView.musicoValido();
        }
    }
}
