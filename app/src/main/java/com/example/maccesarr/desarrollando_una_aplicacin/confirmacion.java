package com.example.maccesarr.desarrollando_una_aplicacin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class confirmacion extends AppCompatActivity {

    TextView tvNombre, tvTel, tvCorreo, tvFechaNacimiento, tvDescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion);

        tvNombre = (TextView)findViewById(R.id.textViewNombre);
        tvTel = (TextView)findViewById(R.id.textViewTel);
        tvCorreo = (TextView)findViewById(R.id.textViewEmail);
        tvFechaNacimiento = (TextView)findViewById(R.id.textViewFechaN);
        tvDescripcion = (TextView)findViewById(R.id.textViewDescripcion);

        Bundle bundle = getIntent().getExtras();
        tvNombre.setText("Nombre: " + bundle.getString("nombre"));
        tvFechaNacimiento.setText("Fecha Nacimiento: "+bundle.getString("fecha"));
        tvTel.setText("Telefono: " + bundle.getString("telefono"));
        tvCorreo.setText("Correo: " + bundle.getString("correo"));
        tvDescripcion.setText("Descripción: " + bundle.getString("descripción"));

    }

    public void regresarVentana(View view){
        finish();

    }
}
