package com.example.sebastian.prueba.Presentacion.Pedir.ListaMusicos.Implementacion;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.sebastian.prueba.Base.BaseFragment;
import com.example.sebastian.prueba.Modelos.Musico;
import com.example.sebastian.prueba.Presentacion.Pedir.ListaMusicos.Interfaces.IListaMusicosPresenter;
import com.example.sebastian.prueba.Presentacion.Pedir.ListaMusicos.Interfaces.IListaMusicosView;
import com.example.sebastian.prueba.R;

public class ListaMusicosFragment extends BaseFragment
{
    private IListaMusicosPresenter iListaMusicosPresenter;
    public ListaMusicosFragmentListener listener;
    private View vista;

    public interface ListaMusicosFragmentListener{
        void navegarDash();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        vista = inflater.inflate(R.layout.fragment_lista_musicos, null, false);
        return vista;
    }

    @Override
    public void onResume() {
        super.onResume();
        escuchadores();
    }

    //Acá es necesario hacer referencia a alguna de las categorías proporcionadas en el otro fragment
    private void escuchadores(){
        iListaMusicosPresenter = new ListaMusicosPresenter(getActivity(), new AccionesVista());
        Button btnLista = (Button) vista.findViewById(R.id.btn_lista);
        btnLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listaMusicos();
            }
        });
    }

    //Por ahora este método solo retorna un elemento del tipo categoría
    public void listaMusicos()
    {
        Musico musico = new Musico();
        musico.calificacion=4.5;
        for(int i=0;i<musico.generos.length;i++)
        {
         musico.generos[0]=musico.generos[i];
        }
        musico.nombreArtistico="Emiliano García";
        musico.precioInferior=75.000;
        musico.precioSuperior=310.000;

        iListaMusicosPresenter.listaMusicos(musico);

    }

    private class AccionesVista implements IListaMusicosView {

        @Override
        public void musicoValido() {
            listener.navegarDash();
        }
    }
}
