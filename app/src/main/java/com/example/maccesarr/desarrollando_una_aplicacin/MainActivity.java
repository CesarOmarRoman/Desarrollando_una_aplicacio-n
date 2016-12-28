package com.example.maccesarr.desarrollando_una_aplicacin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    String dates[];
    NumberPicker dayPicker, monthPicker, yearPicker;
    Calendar rightNow = Calendar.getInstance();
    EditText descripcion, nombre, telefono, correo;
    String fechaDia, fechaMes, fechaAno;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dayPicker = (NumberPicker) findViewById(R.id.custom_picker_day);
        monthPicker = (NumberPicker) findViewById(R.id.custom_picker_month);
        yearPicker = (NumberPicker) findViewById(R.id.custom_picker_year);
        descripcion = (EditText) findViewById(R.id.editText5);
        nombre = (EditText) findViewById(R.id.editText2);
        telefono = (EditText) findViewById(R.id.editText3);
        correo = (EditText) findViewById(R.id.editText4);

        dayPicker.setMinValue(1);
        dayPicker.setMaxValue(rightNow.getActualMaximum(Calendar.DAY_OF_MONTH));
        dayPicker.setValue(rightNow.get(Calendar.DAY_OF_MONTH));

        monthPicker.setMinValue(1);
        monthPicker.setMaxValue(12);
        monthPicker.setValue(rightNow.get(Calendar.MONTH));
        yearPicker.setMinValue(1950);
        yearPicker.setMaxValue(2200);
        yearPicker.setValue(rightNow.get(Calendar.YEAR));



    }

    public void siguiente(View view){
        fechaDia = String.valueOf(dayPicker.getValue());
        fechaMes = String.valueOf(monthPicker.getValue());
        fechaAno = String.valueOf(yearPicker.getValue());
        String fecha = fechaDia+"/"+fechaMes+"/"+fechaAno;

        Intent intent = new Intent(this, confirmacion.class);
        intent.putExtra("nombre", String.valueOf(nombre.getText()));
        intent.putExtra("fecha", fecha);
        intent.putExtra("telefono", String.valueOf(telefono.getText()));
        intent.putExtra("correo", String.valueOf(correo.getText()));
        intent.putExtra("descripción", String.valueOf(descripcion.getText()));
        startActivity(intent);
    }


}
