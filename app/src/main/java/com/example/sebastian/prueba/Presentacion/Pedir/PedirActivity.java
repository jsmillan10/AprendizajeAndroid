package com.example.sebastian.prueba.Presentacion.Pedir;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.sebastian.prueba.Base.BaseActivity;
import com.example.sebastian.prueba.Presentacion.SplashActivity;
import com.example.sebastian.prueba.Presentacion.Pedir.ListaCategorias.Implementacion.ListaCategoriasFragment;
import com.example.sebastian.prueba.Presentacion.Pedir.ListaMusicos.Implementacion.ListaMusicosFragment;
import com.example.sebastian.prueba.R;

public class PedirActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedir);
    }

    private void mostrarListaCategoriasFragment(){
        ListaCategoriasFragment fragmento = new ListaCategoriasFragment();
        fragmento.listener = new AccionesListaCategoriasFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fl_contenedor_pedir, fragmento).commit();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mostrarListaCategoriasFragment();
    }


    private void mostrarListaMusicosFragment(){
        ListaMusicosFragment fragmento = new ListaMusicosFragment();
        fragmento.listener = new AccionesListaMusicosFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fl_contenedor_pedir, fragmento).commit();
    }

    private class AccionesListaCategoriasFragment implements ListaCategoriasFragment.ListaCategoriasFragmentListener {

        @Override
        public void navegarDash() {
            finish();
            startActivity(new Intent(PedirActivity.this, SplashActivity.class));
        }
    }

    private class AccionesListaMusicosFragment implements ListaMusicosFragment.ListaMusicosFragmentListener {

        @Override
        public void navegarDash() {
            finish();
            startActivity(new Intent(PedirActivity.this, SplashActivity.class));
        }
    }


}
