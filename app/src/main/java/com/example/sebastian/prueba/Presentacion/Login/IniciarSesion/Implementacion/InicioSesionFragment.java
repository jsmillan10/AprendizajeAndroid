package com.example.sebastian.prueba.Presentacion.Login.IniciarSesion.Implementacion;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.sebastian.prueba.Modelos.Usuario;
import com.example.sebastian.prueba.Presentacion.Login.IniciarSesion.Interfaces.IIniciarSesionPresenter;
import com.example.sebastian.prueba.Presentacion.Login.IniciarSesion.Interfaces.IIniciarSesionView;
import com.example.sebastian.prueba.Presentacion.Login.LoginActivity;
import com.example.sebastian.prueba.R;

public class InicioSesionFragment extends Fragment {

    private IIniciarSesionPresenter iIniciarSesionPresenter;
    public InicioSesionFragmentListener listener;
    private View vista;

    public interface InicioSesionFragmentListener{
        void navegarDash();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        vista = inflater.inflate(R.layout.fragment_iniciar_sesion, null, false);
        return vista;
    }

    @Override
    public void onResume() {
        super.onResume();
        escuchadores();
    }

    private void escuchadores(){
        iIniciarSesionPresenter = new InicioSesionPresenter(getActivity(), new AccionesVista());
        Button btnArriba = (Button) vista.findViewById(R.id.iniciarSesionArriba);
        btnArriba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iniciarSesion();
            }
        });
    }

    public void iniciarSesion(){
        Usuario user = new Usuario();
        user.usuario = "sebas";
        user.contrasenia = "12345";
        iIniciarSesionPresenter.iniciarSesion(user);
    }

    private class AccionesVista implements IIniciarSesionView {

        @Override
        public void usuarioValido() {
//            Toast.makeText(getActivity(),"Todo bien", Toast.LENGTH_SHORT).show();
            listener.navegarDash();
        }
    }
}
