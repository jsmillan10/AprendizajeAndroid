package com.example.sebastian.prueba.Componentes;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.sebastian.prueba.R;

public class DialogoArtista extends DialogFragment
{
    public interface DialogoAlertaListener
    {
     void botonAceptar(String etiqueta);
     void botonCancelar(String etiqueta);

    };

    public String titulo;
    public String mensaje;
    public String etiqueta;
    public DialogoAlertaListener listener;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View v = inflater.inflate(R.layout.dialogo_permisos_grabar_video, null);

        builder.setView(v);
        TextView titulo = (TextView) v.findViewById(R.id.tvTitulo);
        TextView descripcion = (TextView) v.findViewById(R.id.tvDescripcion);
        Button permitir = (Button) v.findViewById(R.id.permitir_Uno);
        Button rechazar = (Button) v.findViewById(R.id.rechazar_uno);

        titulo.setText(this.titulo);
        descripcion.setText(this.mensaje);
        permitir.setOnClickListener(

                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dismiss();
                        if(listener==null)
                        {
                            Log.e("Error dialogo","listener=null");
                            return;
                        }
                        listener.botonAceptar(etiqueta);

                    }
                }
        );

        rechazar.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Loguear...
                        dismiss();
                        if(listener==null)
                        {
                            Log.e("Error dialogo","listener=null");
                            return;
                        }
                        listener.botonCancelar(etiqueta);

                    }
                }

        );

        return builder.create();
    }
}
