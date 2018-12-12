package com.example.sebastian.prueba.Presentacion.Login.IniciarSesion.Interfaces;

import com.example.sebastian.prueba.Base.IBaseBL;
import com.example.sebastian.prueba.Modelos.Usuario;

public interface IIniciarSesionBL extends IBaseBL {
    void iniciarSesion(Usuario user);
}
