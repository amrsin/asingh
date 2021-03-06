package com.example.acalculadora3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edit_t1, edit_t2;
    private TextView text_v;
    private CheckBox ck1, ck2, ck3, ck4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast toast = Toast.makeText(this, "Bienvenido/a a ACalculadora3", Toast.LENGTH_LONG);
        toast.show();
        edit_t1 = (EditText) findViewById(R.id.num_1);
        edit_t2 = (EditText) findViewById(R.id.num_2);
        text_v = (TextView) findViewById(R.id.resultado);
        ck1 = (CheckBox) findViewById(R.id.ck_suma);
        ck2 = (CheckBox) findViewById(R.id.ck_resta);
        ck3 = (CheckBox) findViewById(R.id.ck_multi);
        ck4 = (CheckBox) findViewById(R.id.ck_divi);
    }

    public void Calcular(View view) {
        int num1;
        int num2;
        num1 = Integer.parseInt(edit_t1.getText().toString());
        num2 = Integer.parseInt(edit_t2.getText().toString());
        String result = "";
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multi = num1 * num2;


        if (ck1.isChecked()==true) {
        String cadena = String.valueOf(num1 + " + " + num2 + " = " + suma);
        result = (result + cadena + "\n");
        }
        if (ck2.isChecked()==true) {
            String cadena = String.valueOf(num1 + " - " + num2 + " = " + resta);
            result = (result + cadena + "\n");

        }
        if (ck3.isChecked()==true) {
            String cadena = String.valueOf(num1 + " x " + num2 + " = " + multi);
            result = (result + cadena + "\n");
        }
        if (ck4.isChecked()==true) {
            if (num1 == 0 || num2 == 0) {
                Toast toast = Toast.makeText(this, "No se puede dividir entre cero", Toast.LENGTH_LONG);
                toast.show();
            } else {
                int divi = num1 / num2;
                String cadena = String.valueOf(num1 + " / " + num2 + " = " + divi);
                result = (result + cadena + "\n");
            }
        }
        text_v.setText(result);
    }
}