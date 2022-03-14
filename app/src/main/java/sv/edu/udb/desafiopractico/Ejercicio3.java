package sv.edu.udb.desafiopractico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio3 extends AppCompatActivity {

    private EditText nombre1;
    private EditText cargo1;
    private EditText horas1;
    private EditText nombre2;
    private EditText cargo2;
    private EditText horas2;
    private EditText nombre3;
    private EditText cargo3;
    private EditText horas3;
    int h1=0;
    int h2=0;
    int h3=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio3);
        nombre1=(EditText)findViewById(R.id.etEmpleado1);
        cargo1=(EditText)findViewById(R.id.etPuesto1);
        horas1=(EditText)findViewById(R.id.etHorasLaboradas1);

        nombre2=(EditText)findViewById(R.id.etEmpleado2);
        cargo2=(EditText)findViewById(R.id.etPuesto2);
        horas2=(EditText)findViewById(R.id.etHorasLaboradas2);

        nombre3=(EditText)findViewById(R.id.etEmpleado3);
        cargo3=(EditText)findViewById(R.id.etPuesto3);
        horas3=(EditText)findViewById(R.id.etHorasLaboradas3);
    }

    public void Salarios (View v) {
        String hora1 = horas1.getText().toString();
        h1=Integer.valueOf(hora1);
        String hora2 = horas2.getText().toString();
        h2=Integer.valueOf(hora2);
        String hora3 = horas3.getText().toString();
        h3=Integer.valueOf(hora3);

        if(h1>0 && h2>0 && h3>0){
            Intent i = new Intent(this, SalariosCalculo.class);
            i.putExtra("etEmpleado1", nombre1.getText().toString());
            i.putExtra("etPuesto1", cargo1.getText().toString());
            i.putExtra("etHorasLaboradas1", horas1.getText().toString());

            i.putExtra("etEmpleado2", nombre2.getText().toString());
            i.putExtra("etPuesto2", cargo2.getText().toString());
            i.putExtra("etHorasLaboradas2", horas2.getText().toString());

            i.putExtra("etEmpleado3", nombre3.getText().toString());
            i.putExtra("etPuesto3", cargo3.getText().toString());
            i.putExtra("etHorasLaboradas3", horas3.getText().toString());
            startActivity(i);

        }
        else{
            Toast notificacion=Toast.makeText(this,"Debe ingresar valores positivos",Toast.LENGTH_LONG);
            notificacion.show();
        }
    }
}