package com.example.sebastian.prueba.Presentacion.Pedir.ListaCategorias.Implementacion;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.sebastian.prueba.Base.BaseFragment;
import com.example.sebastian.prueba.Modelos.Categoria;
import com.example.sebastian.prueba.Presentacion.Pedir.ListaCategorias.Interfaces.IListaCategoriasPresenter;
import com.example.sebastian.prueba.Presentacion.Pedir.ListaCategorias.Interfaces.IListaCategoriasView;
import com.example.sebastian.prueba.R;

public class ListaCategoriasFragment extends BaseFragment
{
    private IListaCategoriasPresenter iListaCategoriasPresenter;
    public ListaCategoriasFragmentListener listener;
    private View vista;

    public interface ListaCategoriasFragmentListener{
        void navegarDash();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        vista = inflater.inflate(R.layout.fragment_lista_categorias, null, false);
        return vista;
    }

    @Override
    public void onResume() {
        super.onResume();
        escuchadores();
    }

    private void escuchadores(){
        iListaCategoriasPresenter = new ListaCategoriasPresenter(getActivity(), new AccionesVista());
       // Button btnArriba = (Button) vista.findViewById(R.id.iniciarSesionArriba);
        //btnArriba.setOnClickListener(new View.OnClickListener() {
          //  @Override
           // public void onClick(View v) {
            //    listaCategorias();
            //}
        //});
    }

    //Por ahora este método solo retorna un elemento del tipo categoría
    public void listaCategorias()
    {
        Categoria categoria = new Categoria();
        categoria.nombre="after";
        iListaCategoriasPresenter.listaCategorias(categoria);

    }

    private class AccionesVista implements IListaCategoriasView {

        @Override
        public void categoriaValida() {
           listener.navegarDash();
        }
    }
}

