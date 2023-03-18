package com.carlostec.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  TextView resultado;
  EditText numero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_Verificar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado=findViewById(R.id.txtresultado);
                numero=findViewById(R.id.txtNumero);
                resultado.setText(procesos(Integer.parseInt(numero.getText().toString())));
            }
        });

    }
    public String procesos(int N){
        if (N>999){
            return "Error, es mayor de tres cifras";
        }else{
            if (N<10){
                return "El numero es de una cifra";
            } else if (N>=10  && N<100) {
                return  "EL numero es de dos cifras";
            }else {
                return "El numero es de tres cifras";
            }
        }
    }
}