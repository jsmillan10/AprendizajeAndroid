package com.example.sebastian.prueba.Presentacion.Login.IniciarSesion.Implementacion;

import android.content.Context;

import com.example.sebastian.prueba.Modelos.Usuario;
import com.example.sebastian.prueba.Presentacion.Login.IniciarSesion.Interfaces.IIniciarSesionBL;
import com.example.sebastian.prueba.Presentacion.Login.IniciarSesion.Interfaces.IIniciarSesionListener;
import com.example.sebastian.prueba.Presentacion.Login.IniciarSesion.Interfaces.IIniciarSesionPresenter;
import com.example.sebastian.prueba.Presentacion.Login.IniciarSesion.Interfaces.IIniciarSesionView;

public class InicioSesionPresenter implements IIniciarSesionPresenter {

    private Context context;
    private IIniciarSesionView iniciarSesionView;
    private IIniciarSesionBL iIniciarSesionBL;

    public InicioSesionPresenter(Context context, IIniciarSesionView iniciarSesionView) {
        this.context = context;
        this.iniciarSesionView = iniciarSesionView;
        iIniciarSesionBL = new IniciarSesionBL(context, new AccionesListener());
    }

    //Validar información de la vista
    @Override
    public void iniciarSesion(Usuario user) {
        iIniciarSesionBL.iniciarSesion(user);
    }

    private class AccionesListener implements IIniciarSesionListener {

        @Override
        public void usuarioValido() {
            iniciarSesionView.usuarioValido();
        }
    }
}
