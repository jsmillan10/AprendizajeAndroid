package com.example.sebastian.prueba.Presentacion.Login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sebastian.prueba.Base.BaseActivity;
import com.example.sebastian.prueba.Presentacion.Login.IniciarSesion.Implementacion.InicioSesionFragment;
import com.example.sebastian.prueba.Presentacion.Pedir.PedirActivity;
import com.example.sebastian.prueba.Presentacion.SplashActivity;
import com.example.sebastian.prueba.R;

public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    private void mostrarIniciarSesionFragment(){
        InicioSesionFragment fragmento = new InicioSesionFragment();
        fragmento.listener = new AccionesIniciarSesionFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fr_contenedor_login, fragmento).commit();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mostrarIniciarSesionFragment();
    }

    private class AccionesIniciarSesionFragment implements InicioSesionFragment.InicioSesionFragmentListener {

        @Override
        public void navegarDash() {
            finish();
            startActivity(new Intent(LoginActivity.this, PedirActivity.class));
        }
    }

}
