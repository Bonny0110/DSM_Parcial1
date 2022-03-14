package sv.edu.udb.desafiopractico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Ejercicio2 extends AppCompatActivity {

    private EditText cantvotos;
    int candidato1 = 0;
    int candidato2 = 0;
    int candidato3 = 0;
    int candidato4 = 0;
    int nulos = 0;
    double votoscant1 = 0;
    double votoscant2 = 0;
    double votoscant3 = 0;
    double votoscant4 = 0;
    double votosnulos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);
        cantvotos = (EditText) findViewById(R.id.etVotos);
    }

    public void Votos (View v){
        String voto = cantvotos.getText().toString();
        String[] votosF = voto.split(",");
        int n = (voto.split(",").length);
        for(int i =0; i< n; i++ ){
            switch (Integer.valueOf(votosF[i])){
                case 1:
                    candidato1++;
                    break;
                case 2:
                    candidato2++;
                    break;
                case 3:
                    candidato3++;
                    break;
                case 4:
                    candidato4++;
                    break;
                default:
                    nulos++;
                    break;
            }
        }
        votoscant1 = (candidato1 * 100) / n;
        votoscant2 = (candidato2 * 100) / n;
        votoscant3 = (candidato3 * 100) / n;
        votoscant4 = (candidato4 * 100) / n;
        votosnulos = (nulos * 100) / n;
        Toast notif=Toast.makeText(this,"Candidato 1: " + votoscant1 + "%, Canditado 2: " + votoscant2 + "%, Canditado 3: " + votoscant3 + "%, Canditado 4: " + votoscant4 + "%, Votos Nulos: " + votosnulos + "%",Toast.LENGTH_LONG);
        notif.show();
        candidato1 = 0;
        candidato2 = 0;
        candidato3 = 0;
        candidato4 = 0;
        votoscant1 = 0;
        votoscant2 = 0;
        votoscant3 = 0;
        votoscant4 = 0;
        votosnulos = 0;
        nulos = 0;
        votosF = null;
    }
}