package com.example.sebastian.prueba.Presentacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sebastian.prueba.Base.BaseActivity;
import com.example.sebastian.prueba.Presentacion.Login.LoginActivity;
import com.example.sebastian.prueba.R;

public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mostrarLoginActivity();
    }

    private void mostrarLoginActivity()
    {
        startActivity(new Intent(this, LoginActivity.class));
    }
}
