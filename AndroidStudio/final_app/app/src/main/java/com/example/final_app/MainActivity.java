package com.example.final_app;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
        try
        {
            OutputStreamWriter file= new OutputStreamWriter(
                            openFileOutput("info.txt", Context.MODE_PRIVATE));

            file.write("prueba,123,nombre completo,empresa,puesto trabajo,");
            file.close();
        }
        catch (Exception ex)
        {
            Log.e("Ficheros", "Error al escribir fichero a memoria interna");
        }
        }

    public void Validar(View view) {
        String usuario = et1.getText().toString();
        String password = et2.getText().toString();

        try {
            InputStream file = openFileInput("info.txt");

            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                String linea = sc.nextLine();

                if (usuario.isEmpty()) {
                    Toast.makeText(this, "DEBE INTRODUCIR UN USUARIO", Toast.LENGTH_LONG).show();
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
                        }
                    }
                    if (entrado == false) {
                        Toast.makeText(this, "Datos erróneos, Por favor intente de nuevo", Toast.LENGTH_SHORT).show();
                    }

                  }
                }
                file.close();
        }catch (Exception ex)
        {
            Log.e("Ficheros", "Error al leer fichero desde recurso raw");
        }
    }
    public void crear_cuenta(View view) {
        Toast.makeText(this, "DONE!", Toast.LENGTH_SHORT).show();
        Intent validar = new Intent(this, RegistrarActivity.class);
        validar.putExtra("Nombre", et1.getText().toString());
        startActivity(validar);
    }
}