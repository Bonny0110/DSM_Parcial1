package sv.edu.udb.desafiopractico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Ejercicio1 extends AppCompatActivity {

    private EditText va;
    private EditText vb;
    private EditText vc;
    double da = 0;
    double db = 0;
    double dc = 0;
    double x1 = 0;
    double x2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);
        va = (EditText) findViewById(R.id.etValora);
        vb = (EditText) findViewById(R.id.etValorb);
        vc = (EditText) findViewById(R.id.etValorc);
    }

    public void Raices (View v) {
        String datoa = va.getText().toString();
        String datob = vb.getText().toString();
        String datoc = vc.getText().toString();
        da = Double.valueOf(datoa);
        db = Double.valueOf(datob);
        dc = Double.valueOf(datoc);
        x1 = ((-1) * db + Math.sqrt(Math.pow(db,2) - 4 * (da) * (dc))) / (2 * da);
        x2 = ((-1) * db - Math.sqrt(Math.pow(db,2) - 4 * (da) * (dc))) / (2 * da);
        Toast notif=Toast.makeText(this,"Solución valor X1: " + x1 + ", Solución valor X2: " + x2,Toast.LENGTH_LONG);
        notif.show();
    }
}