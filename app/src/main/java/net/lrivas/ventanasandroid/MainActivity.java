package net.lrivas.ventanasandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button boton01;
    EditText caja;
    EditText apellido;
    EditText edad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apellido = findViewById(R.id.txtApellido);
        edad = findViewById(R.id.txtEdad);
        caja = findViewById(R.id.txtNombre);

        boton01 = findViewById(R.id.btnSiguiente);
        boton01.setOnClickListener(v -> {
            //Invocar la segunda activity
            Intent miVentana = new Intent(MainActivity.this, ActividadHija.class);
            miVentana.putExtra("nombre",caja.getText().toString());
            miVentana.putExtra("edad", edad.getText().toString());
            miVentana.putExtra("apellido", apellido.getText().toString());
            startActivity(miVentana);
        });
    }
}