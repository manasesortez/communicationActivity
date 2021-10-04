package net.lrivas.ventanasandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button boton01;
    EditText caja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caja = findViewById(R.id.txtNombre);

        boton01 = findViewById(R.id.btnSiguiente);
        boton01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Invocar la segunda activity
                Intent miVentana = new Intent(MainActivity.this, ActividadHija.class);
                miVentana.putExtra("manzanas",caja.getText().toString());
                startActivity(miVentana);
            }
        });
    }
}