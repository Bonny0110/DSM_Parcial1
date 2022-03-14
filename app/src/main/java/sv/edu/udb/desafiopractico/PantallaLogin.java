package sv.edu.udb.desafiopractico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class PantallaLogin extends AppCompatActivity {

    private EditText user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_login);
        user = (EditText) findViewById(R.id.etUsuario);
        pass = (EditText) findViewById(R.id.etContra);
    }

    public void abrirNuevaCuenta(View v){
        finish();
    }

    public void Login(View v){
        try {
            AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "desafiopractico1", null, 1);
            SQLiteDatabase bd = admin.getWritableDatabase();
            String userToCheck = user.getText().toString();
            String passToCheck = pass.getText().toString();
            if(userToCheck.length()!=0 && passToCheck.length()!=0)
            {
                Cursor userExist = bd.rawQuery("select * from users where user = '" + userToCheck + "'", null);
                if(userExist.moveToFirst())
                {
                    bd.close();
                    if(passToCheck.trim().equals(userExist.getString(1).trim()))
                    {
                        Toast.makeText(this, "Bienvenido " + userExist.getString(0) + "", Toast.LENGTH_SHORT).show();
                        Intent llamar = new Intent(this, PantallaMenu.class);
                        startActivity(llamar);
                        this.finish();
                    }
                    else
                    {
                        Toast.makeText(this, "Contraseña inválida", Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(this, "Usuario no existente, por favor cree una cuenta", Toast.LENGTH_SHORT).show();
                }
            }
            else
            {
                Toast.makeText(this, "Todos los campos deben estar llenos", Toast.LENGTH_SHORT).show();
            }

        }
        catch (Exception e)
        {
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }
        }
    }
