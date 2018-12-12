package com.example.sebastian.prueba.Base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sebastian.prueba.Componentes.DialogoArtista;

public class BaseFragment extends Fragment
{
    private BaseActivity activity;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        activity = (BaseActivity) getActivity();

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    public void mostrarDialogo(String titulo, String descripcion, String etiqueta, DialogoArtista.DialogoAlertaListener listener)
    {
        activity.mostrarDialogo(titulo, descripcion, etiqueta, listener);
    }

    public void aparecerProgressBar()
    {
        activity.aparecerProgressBar();
    }

    public void desaparecerProgressBar()
    {
        activity.desaparecerProgressBar();
    }
}
