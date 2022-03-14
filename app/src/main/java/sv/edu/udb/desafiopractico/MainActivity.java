package sv.edu.udb.desafiopractico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText newuser, newpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newuser = (EditText) findViewById(R.id.etNuevoUser);
        newpass = (EditText) findViewById(R.id.etRepass);
    }

    public void abrirLogin(View v){
        Intent login = new Intent(this, PantallaLogin.class);
        startActivity(login);
    }

    public void nuevaCuenta(View v){
        try
        {
            AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,"desafiopractico1", null,1);
            SQLiteDatabase bd = admin.getWritableDatabase();
            String userToSave = newuser.getText().toString();
            String passToSave = newpass.getText().toString();
            if(userToSave.length()!=0 && passToSave.length()!=0)
            {
                Cursor isUniqueUser = bd.rawQuery("select * from users WHERE user = '" + userToSave + "'", null);
                if(!isUniqueUser.moveToFirst())
                {
                    ContentValues newRecord = new ContentValues();
                    newRecord.put("user", userToSave);
                    newRecord.put("password", passToSave);
                    bd.insert("users", null, newRecord);
                    bd.close();
                    newuser.setText("");
                    newpass.setText("");
                    Toast.makeText(this, "Cuenta creada!", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(this, "Usuario existente, intente de nuevo", Toast.LENGTH_SHORT).show();
                }
            }
            else
            {
                Toast.makeText(this, "Debe llenar todos los campos", Toast.LENGTH_SHORT).show();
            }

        }
        catch (Exception e)
        {
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }
    }
}