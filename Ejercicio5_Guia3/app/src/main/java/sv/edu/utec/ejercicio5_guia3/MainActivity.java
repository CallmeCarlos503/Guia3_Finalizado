package sv.edu.utec.ejercicio5_guia3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    Button calcular;
    EditText dato1, dato2, dato3;
    ImageView triangulo;
    TextView nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calcular = findViewById(R.id.btnCalcular);
        dato1 = findViewById(R.id.edtDato1);
        dato2 = findViewById(R.id.edtDato2);
        dato3 = findViewById(R.id.edtDato3);
        triangulo = findViewById(R.id.imvTriangulo);
        nombre = findViewById(R.id.tvTriangulo);

    }

    public void entrar(View v)
    {
        double lado1 = Double.parseDouble(dato1.getText().toString());
        double lado2 = Double.parseDouble(dato2.getText().toString());
        double lado3 = Double.parseDouble(dato3.getText().toString());

        if (lado1 == lado2 && lado2 == lado3)
        {
            triangulo.setImageResource(R.drawable.equilatero);
            nombre.setText("Triangulo Equilatero");
        }
        else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3)
        {
            triangulo.setImageResource(R.drawable.iso);
            nombre.setText("Triangulo Isosceles");
        }
        else
        {
            triangulo.setImageResource(R.drawable.escaleno);
            nombre.setText("Triangulo Escaleno");
        }
    }

}