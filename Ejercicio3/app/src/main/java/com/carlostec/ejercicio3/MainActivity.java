package com.carlostec.ejercicio3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
EditText numeron;

ArrayList<Integer> numeros = new ArrayList<Integer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numeron=findViewById(R.id.txtNumero);
        TextView resultante=findViewById(R.id.txtresultado);
        findViewById(R.id.btn_generar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               resultante.setText(procesos(Integer.parseInt(numeron.getText().toString())));
            }
        });

    }
    public String procesos(int Numero){
        numeros.add(Numero);
        if (numeros.size()>5){
            numeros.remove(0);
        }
        int sum = 0;
        for (int i = 0; i < numeros.size(); i++) {
            sum += numeros.get(i);
        }
        return "la suma de los ultimos 5 numeros son:  "+sum;
    }
}