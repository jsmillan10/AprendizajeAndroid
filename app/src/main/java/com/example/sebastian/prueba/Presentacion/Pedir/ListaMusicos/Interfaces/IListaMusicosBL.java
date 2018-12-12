package com.example.sebastian.prueba.Presentacion.Pedir.ListaMusicos.Interfaces;

import com.example.sebastian.prueba.Base.IBaseBL;
import com.example.sebastian.prueba.Modelos.Musico;

public interface IListaMusicosBL extends IBaseBL
{
    void listaMusicos(Musico musico);
}
