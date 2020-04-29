package com.example.final_app;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrarActivity extends AppCompatActivity {

    private EditText et1, et2, et3, et4, et5, et6;
    boolean entrado = false;

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
    }
}