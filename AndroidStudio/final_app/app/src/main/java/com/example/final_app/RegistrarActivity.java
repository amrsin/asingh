package com.example.final_app;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class RegistrarActivity extends AppCompatActivity {

    private EditText et1, et2, et3, et4, et5, et6;
    boolean distinto = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        et1 = (EditText) findViewById(R.id.txt_nom_completo);
        et2 = (EditText) findViewById(R.id.txt_empresa);
        et3 = (EditText) findViewById(R.id.txt_puesto_trabajo);
        et4 = (EditText) findViewById(R.id.txt_new_usuario);
        et5 = (EditText) findViewById(R.id.txt_password);
        et6 = (EditText) findViewById(R.id.txt_password2);
    }

    public void add_user(View view) {

        String nom_completo = et1.getText().toString();
        String empresa = et2.getText().toString();
        String puest_trabajo = et3.getText().toString();
        String usuario = et4.getText().toString();
        String password = et5.getText().toString();
        String password2 = et6.getText().toString();
        String linea_aux = "";
        String cuenta = usuario + "," + password + "," + nom_completo + "," + empresa + "," + puest_trabajo + ",";


        if (nom_completo.isEmpty()) {
            Toast.makeText(this, "DEBE INTRODUCIR UN NOMBRE COMPLETO", Toast.LENGTH_SHORT).show();
        }
        if (empresa.isEmpty()) {
            Toast.makeText(this, "DEBE INTRODUCIR UNA EMPRESA", Toast.LENGTH_SHORT).show();
        }
        if (puest_trabajo.isEmpty()) {
            Toast.makeText(this, "DEBE INTRODUCIR UN PUESTO TRABAJO", Toast.LENGTH_SHORT).show();
        }
        if (usuario.isEmpty()) {
            Toast.makeText(this, "DEBE INTRODUCIR UN USUARIO", Toast.LENGTH_SHORT).show();
        }
        if (password.isEmpty()) {
            Toast.makeText(this, "DEBE INTRODUCIR UN PASSWORD", Toast.LENGTH_SHORT).show();
        }
        if (password2.isEmpty()) {
            Toast.makeText(this, "DEBE INTRODUCIR UN CONFIRMAR PASSWORD", Toast.LENGTH_SHORT).show();
        }

        try {
            File file = new File(getApplicationContext().getFilesDir() + "info.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                String linea = sc.nextLine();
                linea_aux = linea_aux + linea + "\n";

                if (!nom_completo.isEmpty() && !empresa.isEmpty() && !puest_trabajo.isEmpty() && !usuario.isEmpty()
                        && !password.isEmpty() && !password2.isEmpty()) {
                    String[] datos = linea.split(",");

                    if(datos[0].equals(usuario)) {
                        Toast.makeText(this, "NOMBRE USUARIO NO DISPONIBLE", Toast.LENGTH_SHORT).show();
                        distinto = false;
                    }
                    if (password.length()<8) {

                        Toast.makeText(this, "PASSWORD DEBE DE TENER UN MINIMO TAMAÑO DE 8 ", Toast.LENGTH_SHORT).show();
                    }
                    if (!password2.equals(password)) {

                            Toast.makeText(this, "PASSWORD CONFIRMAR NO COINCIDE CON PASSWORD", Toast.LENGTH_SHORT).show();
                        }
                }
            }
            if (distinto == true) {
                if (!nom_completo.isEmpty() && !empresa.isEmpty() && !puest_trabajo.isEmpty() && !usuario.isEmpty()
                        && !password.isEmpty() && !password2.isEmpty() && password.length()>8 && password2.equals(password)) {

                    try {
                        FileWriter Archivo = new FileWriter(file);
                        Archivo.write(linea_aux + cuenta + "\n");
                        Archivo.close();
                        Toast.makeText(this, "USUARIO CON NOMBRE " + nom_completo + " CREADO", Toast.LENGTH_SHORT).show();
                    } catch (Exception ex) {
                        Log.e("Ficheros", "Error al escribir en el fichero info.txt");
                    }
                }
            }
        } catch (Exception e) {
            Log.e("Ficheros", "Error al leer en el fichero info.txt");
        }
    }
}