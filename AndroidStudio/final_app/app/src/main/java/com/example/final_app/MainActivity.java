package com.example.final_app;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    boolean entrado = false;
    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.txt_usuario);
        et2 = (EditText) findViewById(R.id.txt_password);
        File file = new File(getApplicationContext().getFilesDir() + "info.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
                FileWriter Archivo = new FileWriter(file);
                Archivo.write("prueba,123,nombre completo,empresa,puesto trabajo,");
                Archivo.close();
            }
        } catch (IOException e) {
            Log.e("Ficheros", "Error al escribir en el fichero info.txt");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.exit) {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setMessage("¿Quiere salir de la app?");
            builder.setCancelable(true);

            builder.setNegativeButton("YES", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });

            builder.setPositiveButton("NO", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }
        return  true;
    }

    public void Validar(View view) {
        String usuario = et1.getText().toString();
        String password = et2.getText().toString();
        File file = new File(getApplicationContext().getFilesDir() + "info.txt");

        if (usuario.isEmpty() && password.isEmpty()) {
            Toast.makeText(this, "DEBE INTRODUCIR UN USUARIO Y PASSWORD", Toast.LENGTH_SHORT).show();
        }else {

            if(usuario.isEmpty()){
                Toast.makeText(this, "DEBE INTRODUCIR UN USUARIO", Toast.LENGTH_SHORT).show();
            }

            if (password.isEmpty()) {
                Toast.makeText(this, "DEBE INTRODUCIR UN PASSWORD", Toast.LENGTH_SHORT).show();
            }
        }

        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                String linea = sc.nextLine();

                if (usuario.isEmpty()==false && password.isEmpty()==false) {

                    String[] datos = linea.split(",");
                    String usr = datos[0];
                    String pwd = datos[1];
                    String nom_complt = datos[2];
                    String empresa = datos[3];
                    if (usuario.equals(datos[0])) {
                           if (password.equals(pwd) && usuario.equals(usr)) {
                            Toast.makeText(this, "DONE!", Toast.LENGTH_SHORT).show();
                            et1.setText(null);
                            et2.setText(null);
                            Intent validar = new Intent(this, ficharActivity.class);
                            validar.putExtra("nom_complt", nom_complt );
                            validar.putExtra("empresa",empresa);
                            validar.putExtra("usr", usuario);
                            startActivity(validar);
                            entrado = true;
                        }
                    }
                  }
                }
                 if (entrado == false && !usuario.isEmpty() && !password.isEmpty()) {
                Toast.makeText(this, "Datos erróneos, Por favor intente de nuevo", Toast.LENGTH_SHORT).show();
              }
                entrado = false;
                sc.close();
        }catch (Exception ex)
        {
            Log.e("Ficheros", "Error al escribir en el fichero info.txt");
        }
    }
    public void crear_cuenta(View view) {
        Toast.makeText(this, "DONE!", Toast.LENGTH_SHORT).show();
        Intent validar = new Intent(this, RegistrarActivity.class);
        validar.putExtra("Nombre", et1.getText().toString());
        startActivity(validar);
    }
}