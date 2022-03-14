package sv.edu.udb.desafiopractico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SalariosCalculo extends AppCompatActivity {

    private TextView tvEmpleado1;
    private TextView tvSueldoL1;
    private TextView tvDescAfp1;
    private TextView tvDescIsss1;
    private TextView tvDescRenta1;
    private TextView tvBono1;

    private TextView tvEmpleado2;
    private TextView tvSueldoL2;
    private TextView tvDescAfp2;
    private TextView tvDescIsss2;
    private TextView tvDescRenta2;
    private TextView tvBono2;

    private TextView tvEmpleado3;
    private TextView tvSueldoL3;
    private TextView tvDescAfp3;
    private TextView tvDescIsss3;
    private TextView tvDescRenta3;
    private TextView tvBono3;

    private TextView tvMax;
    private TextView tvMin;
    private TextView tvG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salarios_calculo);

        Bundle bundle = getIntent().getExtras();
        String nombre1 = bundle.getString("etEmpleado1");
        tvEmpleado1 = (TextView) findViewById(R.id.txtnombre1);
        tvEmpleado1.setText(nombre1);

        String nombre2 = bundle.getString("etEmpleado2");
        tvEmpleado2 = (TextView) findViewById(R.id.txtnombre2);
        tvEmpleado2.setText(nombre2);

        String nombre3 = bundle.getString("etEmpleado3");
        tvEmpleado3 = (TextView) findViewById(R.id.txtnombre3);
        tvEmpleado3.setText(nombre3);

        double h1=Double.parseDouble( bundle.getString("etHorasLaboradas1"));
        double h2=Double.parseDouble( bundle.getString("etHorasLaboradas2"));
        double h3=Double.parseDouble( bundle.getString("etHorasLaboradas3"));
        double salario1 = 0;
        double isss1 = 0;
        double afp1 = 0;
        double renta1 = 0;
        double salarioL1 = 0;
        double bono1 = 0;
        double salario2 = 0;
        double isss2 = 0;
        double afp2 = 0;
        double renta2 = 0;
        double salarioL2 = 0;
        double bono2 = 0;
        double salario3 = 0;
        double isss3 = 0;
        double afp3 = 0;
        double renta3 = 0;
        double salarioL3 = 0;
        double bono3 = 0;
        int g = 0;

        if (h1 <= 160) {
            salario1 = (h1*9.75);
            isss1 = (salario1*0.0525);
            afp1 = (salario1*0.0688);
            renta1 = (salario1*0.1);
            salarioL1 = (salario1-isss1-afp1-renta1);

            tvSueldoL1 = (TextView) findViewById(R.id.txtSueldol1);
            tvDescAfp1 = (TextView) findViewById(R.id.txtAfp1);
            tvDescIsss1 = (TextView) findViewById(R.id.txt);
            tvDescRenta1 = (TextView) findViewById(R.id.txtRenta1);
            tvSueldoL1.setText(String.valueOf(salarioL1));
            tvDescIsss1.setText(String.valueOf(isss1));
            tvDescAfp1.setText(String.valueOf(afp1));
            tvDescRenta1.setText(String.valueOf(renta1));

        }
        else {
            salario1 = (160*9.775)+((h1-160)*11.5);
            isss1 = (salario1*0.0525);
            afp1 = (salario1*0.0688);
            renta1 = (salario1*0.1);
            salarioL1 = (salario1-isss1-afp1-renta1);

            tvSueldoL1 = (TextView) findViewById(R.id.txtSueldol1);
            tvDescAfp1 = (TextView) findViewById(R.id.txtAfp1);
            tvDescIsss1 = (TextView) findViewById(R.id.txt);
            tvDescRenta1 = (TextView) findViewById(R.id.txtRenta1);
            tvSueldoL1.setText(String.valueOf(salarioL1));
            tvDescIsss1.setText(String.valueOf(isss1));
            tvDescAfp1.setText(String.valueOf(afp1));
            tvDescRenta1.setText(String.valueOf(renta1));
        }

        if (h2 <= 160) {
            salario2 = (h2*9.75);
            isss2 = (salario2*0.0525);
            afp2 = (salario2*0.0688);
            renta2 = (salario2*0.1);
            salarioL2 = (salario2-isss2-afp2-renta2);

            tvSueldoL2 = (TextView) findViewById(R.id.txtSueldoL2);
            tvDescAfp2 = (TextView) findViewById(R.id.txtAfp2);
            tvDescIsss2 = (TextView) findViewById(R.id.txtIsss2);
            tvDescRenta2 = (TextView) findViewById(R.id.txtRenta2);
            tvSueldoL2.setText(String.valueOf(salarioL2));
            tvDescIsss2.setText(String.valueOf(isss2));
            tvDescAfp2.setText(String.valueOf(afp2));
            tvDescRenta2.setText(String.valueOf(renta2));

        }
        else {
            salario2 = (160*9.775)+((h2-160)*11.5);
            isss2 = (salario2*0.0525);
            afp2 = (salario2*0.0688);
            renta2 = (salario2*0.1);
            salarioL2 = (salario2-isss2-afp2-renta2);

            tvSueldoL2 = (TextView) findViewById(R.id.txtSueldoL2);
            tvDescAfp2 = (TextView) findViewById(R.id.txtAfp2);
            tvDescIsss2 = (TextView) findViewById(R.id.txtIsss2);
            tvDescRenta2 = (TextView) findViewById(R.id.txtRenta2);
            tvSueldoL2.setText(String.valueOf(salarioL2));
            tvDescIsss2.setText(String.valueOf(isss2));
            tvDescAfp2.setText(String.valueOf(afp2));
            tvDescRenta2.setText(String.valueOf(renta2));
        }

        if (h3 <= 160) {
            salario3 = (h3*9.75);
            isss3 = (salario3*0.0525);
            afp3 = (salario3*0.0688);
            renta3 = (salario3*0.1);
            salarioL3 = (salario3-isss3-afp3-renta3);

            tvSueldoL3 = (TextView) findViewById(R.id.txtSueldoL3);
            tvDescAfp3 = (TextView) findViewById(R.id.txtAfp3);
            tvDescIsss3 = (TextView) findViewById(R.id.txtIsss3);
            tvDescRenta3 = (TextView) findViewById(R.id.txtRenta3);
            tvSueldoL3.setText(String.valueOf(salarioL3));
            tvDescIsss3.setText(String.valueOf(isss3));
            tvDescAfp3.setText(String.valueOf(afp3));
            tvDescRenta3.setText(String.valueOf(renta3));

        }
        else {
            salario3 = (160*9.775)+((h3-160)*11.5);
            isss3 = (salario3*0.0525);
            afp3 = (salario3*0.0688);
            renta3 = (salario3*0.1);
            salarioL3 = (salario3-isss3-afp3-renta3);

            tvSueldoL3 = (TextView) findViewById(R.id.txtSueldoL3);
            tvDescAfp3 = (TextView) findViewById(R.id.txtAfp3);
            tvDescIsss3 = (TextView) findViewById(R.id.txtIsss3);
            tvDescRenta3 = (TextView) findViewById(R.id.txtRenta3);
            tvSueldoL3.setText(String.valueOf(salarioL3));
            tvDescIsss3.setText(String.valueOf(isss3));
            tvDescAfp3.setText(String.valueOf(afp3));
            tvDescRenta3.setText(String.valueOf(renta3));
        }

        String cargo1= bundle.getString("etPuesto1");
        if (cargo1.equals("Gerente")){
            bono1 = (salarioL1*0.1);
            tvBono1 = (TextView) findViewById(R.id.txtBono1);
            tvBono1.setText(String.valueOf(bono1));
        }
        else if (cargo1.equals("Asistente")){
            bono1 = (salarioL1*0.05);
            tvBono1 = (TextView) findViewById(R.id.txtBono1);
            tvBono1.setText(String.valueOf(bono1));
        }
        else if (cargo1.equals("Secretaria")){
            bono1 = (salarioL1*0.03);
            tvBono1 = (TextView) findViewById(R.id.txtBono1);
            tvBono1.setText(String.valueOf(bono1));
        }
        else {
            bono1 = (salarioL1*0.02);
            tvBono1 = (TextView) findViewById(R.id.txtBono1);
            tvBono1.setText(String.valueOf(bono1));
        }

        String cargo2 = bundle.getString("etPuesto2");
        if (cargo2.equals("Gerente")){
            bono2 = (salarioL2*0.1);
            tvBono2 = (TextView) findViewById(R.id.txtBono2);
            tvBono2.setText(String.valueOf(bono2));
        }
        else if (cargo2.equals("Asistente")){
            bono2 = (salarioL2*0.05);
            tvBono2 = (TextView) findViewById(R.id.txtBono2);
            tvBono2.setText(String.valueOf(bono2));
        }
        else if (cargo2.equals("Secretaria")){
            bono2 = (salarioL2*0.03);
            tvBono2 = (TextView) findViewById(R.id.txtBono2);
            tvBono2.setText(String.valueOf(bono2));
        }
        else {
            bono2 = (salarioL2*0.02);
            tvBono2 = (TextView) findViewById(R.id.txtBono2);
            tvBono2.setText(String.valueOf(bono2));
        }

        String cargo3 = bundle.getString("etPuesto3");
        if (cargo3.equals("Gerente")){
            bono3 = (salarioL3*0.1);
            tvBono3 = (TextView) findViewById(R.id.txtBono3);
            tvBono3.setText(String.valueOf(bono3));
        }
        else if (cargo3.equals("Asistente")){
            bono3 = (salarioL3*0.05);
            tvBono3 = (TextView) findViewById(R.id.txtBono3);
            tvBono3.setText(String.valueOf(bono3));
        }
        else if (cargo3.equals("Secretaria")){
            bono3 = (salarioL3*0.03);
            tvBono3 = (TextView) findViewById(R.id.txtBono3);
            tvBono3.setText(String.valueOf(bono3));
        }
        else{
            bono3 = (salarioL3*0.02);
            tvBono3 = (TextView) findViewById(R.id.txtBono3);
            tvBono3.setText(String.valueOf(bono3));
        }

        if (cargo1.equals("Gerente") && cargo2.equals("Asistente") && cargo3.equals("Secretaria")){
            tvBono1 = (TextView)findViewById(R.id.txtBono1);

            tvBono1.setText("No hay bono");
            tvBono2 = (TextView) findViewById(R.id.txtBono2);

            tvBono2.setText("No hay bono");
            tvBono3 = (TextView) findViewById(R.id.txtBono3);

            tvBono3.setText("No hay bono");
        }

        if (salarioL1 > salarioL2) {
            if (salarioL1 > salarioL3) {
                tvMax = (TextView) findViewById(R.id.txtMa);
                tvMax.setText(nombre1);
            }
        }
        if (salarioL2 > salarioL1) {
            if (salarioL2 > salarioL3) {
                tvMax = (TextView) findViewById(R.id.txtMa);
                tvMax.setText(nombre2);
            }
        }
        if (salarioL3 > salarioL2) {
            if (salarioL3 > salarioL1) {
                tvMax = (TextView) findViewById(R.id.txtMa);
                tvMax.setText(nombre3);
            }
        }

        if (salarioL1 < salarioL2) {
            if (salarioL1 < salarioL3) {
                tvMin = (TextView) findViewById(R.id.txtMenor);
                tvMin.setText(nombre1);
            }
        }
        if (salarioL2 < salarioL1) {
            if (salarioL2 < salarioL3) {
                tvMin = (TextView) findViewById(R.id.txtMenor);
                tvMin.setText(nombre2);
            }
        }
        if (salarioL3 < salarioL2) {
            if (salarioL3 < salarioL1) {
                tvMin = (TextView) findViewById(R.id.txtMenor);
                tvMin.setText(nombre3);
            }
        }

        if (salarioL1 > 300) {
            g++;
        }
        if (salarioL2 > 300) {
            g++;
        }
        if (salarioL3 > 300) {
            g++;
        }
        tvG = (TextView) findViewById(R.id.txtG);
        tvG.setText(String.valueOf(g));

    }
}