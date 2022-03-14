package sv.edu.udb.desafiopractico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PantallaMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_menu);
    }

    public void abrirEjercicio1(View v){
        Intent ej1 = new Intent(this, Ejercicio1.class);
        startActivity(ej1);
    }

    public void abrirEjercicio2(View v){
        Intent ej2 = new Intent(this, Ejercicio2.class);
        startActivity(ej2);
    }

    public void abrirEjercicio3(View v){
        Intent ej3 = new Intent(this, Ejercicio3.class);
        startActivity(ej3);
    }
}