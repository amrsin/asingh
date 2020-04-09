package com.example.avalidacion;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et1, et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.txt_nombre);
        et2 = (EditText) findViewById(R.id.txt_password);
    }
    public void  Validar(View view) {
        String nombre = et1.getText().toString();
        String password = et2.getText().toString();

        if (nombre.isEmpty()) {
            Toast.makeText(this, "DEBE INTRODUCIR UN NOMBRE", Toast.LENGTH_LONG).show();
        }
        if (password.isEmpty()) {
            Toast.makeText(this, "DEBE INTRODUCIR UN PASSWORD", Toast.LENGTH_LONG).show();

        }
        if (!nombre.isEmpty() && !nombre.isEmpty()) {

            Toast.makeText(this, "VALIDADO", Toast.LENGTH_SHORT).show();
            Intent validar = new Intent(this, SegundoActivity.class);
            validar.putExtra("Nombre", et1.getText().toString());
            startActivity(validar);
        }
    }
}