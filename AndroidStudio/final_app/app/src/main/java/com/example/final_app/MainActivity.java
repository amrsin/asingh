package com.example.final_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    boolean entrado = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.txt_usuario);
        et2 = (EditText) findViewById(R.id.txt_password);
    }

    public void Validar(View view) {
        String usuario = et1.getText().toString();
        String password = et2.getText().toString();

        try {
            InputStream file =
                    getResources().openRawResource(R.raw.usr_pwd);

            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                String linea = sc.nextLine();

                if (usuario.isEmpty()) {
                    Toast.makeText(this, "DEBE INTRODUCIR UN NOMBRE", Toast.LENGTH_LONG).show();
                }
                if (password.isEmpty()) {
                    Toast.makeText(this, "DEBE INTRODUCIR UN PASSWORD", Toast.LENGTH_LONG).show();
                }

                if (usuario.isEmpty()==false && password.isEmpty()==false) {

                    String[] datos = linea.split(",");
                    String usr = datos[0];
                    String pwd = datos[1];
                    if (usuario.equals(datos[0])) {
                           if (password.equals(pwd) && usuario.equals(usr)) {
                            Toast.makeText(this, "DONE!", Toast.LENGTH_SHORT).show();
                            Intent validar = new Intent(this, ficharActivity.class);
                            validar.putExtra("Nombre", et1.getText().toString());
                            startActivity(validar);
                            entrado = true;
                        } else {
                            if (entrado == false) {
                                Toast.makeText(this, "Datos erróneos, Por favor intente de nuevo", Toast.LENGTH_SHORT).show();
                            }
                        }
                    }

                  }
                }
                file.close();
        }catch (Exception ex)
        {
            Log.e("Ficheros", "Error al leer fichero desde recurso raw");
        }
    }
}