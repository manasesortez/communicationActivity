package net.lrivas.ventanasandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActividadHija extends AppCompatActivity {

    View view;
    Button boton02;
    TextView resultado;
    TextView finalLastName;
    TextView finalAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_hija);

        view = this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.purple_700);

        resultado = findViewById(R.id.lblResultados);
        finalLastName = findViewById(R.id.lblResultados2);
        finalAge = findViewById(R.id.lblResultados3);

        boton02 = findViewById(R.id.btnRegresar);
        boton02.setOnClickListener(v -> {
            //Regresar
            //Intent ventana = new Intent(ActividadHija.this, MainActivity.class);
            //startActivity(ventana);
            finish();
        });
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void onResume() {
        super.onResume();
        Bundle valores = getIntent().getExtras();
        if(valores!=null){
            //Recuperar los datos
            String nombre = valores.getString("nombre");
            String apellido = valores.getString("apellido");
            String edad = valores.getString("edad");

            resultado.setText("Nombre: "+ nombre);
            finalLastName.setText("Apellido: " + apellido);
            finalAge.setText("Edad: " + edad);

        }
    }
}