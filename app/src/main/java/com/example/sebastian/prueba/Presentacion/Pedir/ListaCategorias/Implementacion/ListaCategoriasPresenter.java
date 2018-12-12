package com.example.sebastian.prueba.Presentacion.Pedir.ListaCategorias.Implementacion;

import android.content.Context;

import com.example.sebastian.prueba.Modelos.Categoria;
import com.example.sebastian.prueba.Presentacion.Login.IniciarSesion.Interfaces.IIniciarSesionListener;
import com.example.sebastian.prueba.Presentacion.Pedir.ListaCategorias.Interfaces.IListaCategoriasBL;
import com.example.sebastian.prueba.Presentacion.Pedir.ListaCategorias.Interfaces.IListaCategoriasListener;
import com.example.sebastian.prueba.Presentacion.Pedir.ListaCategorias.Interfaces.IListaCategoriasPresenter;
import com.example.sebastian.prueba.Presentacion.Pedir.ListaCategorias.Interfaces.IListaCategoriasView;

public class ListaCategoriasPresenter implements IListaCategoriasPresenter {

    private Context context;
    private IListaCategoriasView listaCategoriasView;
    private IListaCategoriasBL ilistaCategoriasBL;

    public ListaCategoriasPresenter(Context context, IListaCategoriasView listaCategoriasView) {
        this.context = context;
        this.listaCategoriasView = listaCategoriasView;
        ilistaCategoriasBL = new ListaCategoriasBL(context, new AccionesListener());
    }

    //Validar información de la vista
    @Override
    public void listaCategorias(Categoria categoria) {
        ilistaCategoriasBL.listaCategorias(categoria);
    }

    private class AccionesListener implements IListaCategoriasListener {

        @Override
        public void categoriaValida() {
            listaCategoriasView.categoriaValida();
        }
    }
}
