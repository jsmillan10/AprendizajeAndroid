package com.example.sebastian.prueba.Presentacion.Login.IniciarSesion.Implementacion;

import android.content.Context;

import com.example.sebastian.prueba.Modelos.Usuario;
import com.example.sebastian.prueba.Presentacion.Login.IniciarSesion.Interfaces.IIniciarSesionBL;
import com.example.sebastian.prueba.Presentacion.Login.IniciarSesion.Interfaces.IIniciarSesionListener;

public class IniciarSesionBL implements IIniciarSesionBL {

    private Context context;
    private IIniciarSesionListener listener;

    public IniciarSesionBL(Context context, IIniciarSesionListener listener){
        this.context = context;
        this.listener = listener;
    }

    @Override
    public void iniciarSesion(Usuario user) {
        listener.usuarioValido();

    }
}
