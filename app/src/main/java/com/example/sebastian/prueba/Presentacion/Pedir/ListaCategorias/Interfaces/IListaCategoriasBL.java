package com.example.sebastian.prueba.Presentacion.Pedir.ListaCategorias.Interfaces;

import com.example.sebastian.prueba.Base.IBaseBL;
import com.example.sebastian.prueba.Modelos.Categoria;

public interface IListaCategoriasBL extends IBaseBL
{
    void listaCategorias(Categoria categoria);
}
