package com.carlostec.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Numero;
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_Verificar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Numero=findViewById(R.id.txtNumero);
                resultado=findViewById(R.id.txtresultado);
                resultado.setText(Procedimientos(Integer.parseInt((Numero.getText().toString()))));
            }
        });
    }
    public String Procedimientos(int numero){
        try {
            if (numero>0){
                return "El numero es positivo";
            } else if (numero<0) {
                return "El numero es negativo";
            }else{
                return "El numero es nulo";
            }
        } catch (Exception ex){
            return "Error, eso no es un numero";
        }

    }
}