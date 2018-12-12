package com.example.sebastian.prueba.Base;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.sebastian.prueba.Componentes.DialogoArtista;
import com.example.sebastian.prueba.Componentes.ProgressBar;

public class BaseActivity extends AppCompatActivity
{
    private ProgressBar progressBar;

    public void mostrarDialogo(String etiqueta, String titulo, String desripcion, DialogoArtista.DialogoAlertaListener listener)
    {
        DialogoArtista dialogo = new DialogoArtista();
        dialogo.titulo = titulo;
        dialogo.etiqueta = etiqueta;
        dialogo.mensaje = desripcion;
        dialogo.listener = listener;
        dialogo.show(getSupportFragmentManager(),"Dialogo");
    }

    public void desaparecerProgressBar()
    {
       if(progressBar==null)
       {
           Log.e("Error en progress bar","No hay un Progress Bar que desaparecer");
           return;
       }
        progressBar.dismiss();
    }

    public void aparecerProgressBar()
    {
        progressBar = new ProgressBar();
        progressBar.show(getSupportFragmentManager(), "Progress Bar");
    }


}
