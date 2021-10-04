package net.lrivas.ventanasandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActividadHija extends AppCompatActivity {

    Button boton02;
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_hija);

        resultado = findViewById(R.id.lblResultados);
        boton02 = findViewById(R.id.btnRegresar);
        boton02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Regresar
                //Intent ventana = new Intent(ActividadHija.this, MainActivity.class);
                //startActivity(ventana);
                finish();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        Bundle valores = getIntent().getExtras();
        if(valores!=null){
            //Recuperar los datos
            String dato = valores.getString("manzanas");
            resultado.setText("Valor: "+ dato);
        }
    }
}