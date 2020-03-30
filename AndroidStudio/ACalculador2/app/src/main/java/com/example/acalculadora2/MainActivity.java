package com.example.acalculadora2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edit_t1, edit_t2;
    private TextView text_v;
    private RadioButton rb1, rb2, rb3, rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast toast = Toast.makeText(this,"Bienvenido/a a ACalculadora2", Toast.LENGTH_LONG);
        toast.show();
        edit_t1= (EditText) findViewById(R.id.num_1);
        edit_t2 = (EditText) findViewById(R.id.num_2);
        text_v = (TextView) findViewById(R.id.resultado);
        rb1 = (RadioButton)findViewById(R.id.rb_suma);
        rb2 = (RadioButton)findViewById(R.id.rb_resta);
        rb3 = (RadioButton)findViewById(R.id.rb_multi);
        rb4 = (RadioButton)findViewById(R.id.rb_divi);
    }

    public void Calcular (View view) {
        int num1;
        int num2;
        int suma;
        int resta;
        int divi;
        int multi;
        num1 = Integer.parseInt(edit_t1.getText().toString());
        num2 = Integer.parseInt(edit_t2.getText().toString());

        if (rb1.isChecked()==true) {
            suma = num1 + num2;
            text_v.setText(String.valueOf(num1 + " + " + num2 + " = " +  suma));

        } else if (rb2.isChecked()==true) {
            resta = num1 - num2;
            text_v.setText(String.valueOf(num1 + " - " + num2 + " = " +  resta));

        }else if (rb3.isChecked()==true) {
            multi = num1 * num2;
            text_v.setText(String.valueOf(num1 + " x " + num2 + " = " +  multi));

        }else if (rb4.isChecked()==true) {
            if (num1==0 || num2==0) {
                Toast toast = Toast.makeText(this,"No se puede dividir entre cero", Toast.LENGTH_LONG);
                toast.show();
                text_v.setText(String.valueOf(" No se puede dividir entre cero" ));
            }else {
            divi = num1 / num2;
            text_v.setText(String.valueOf(num1 + " / " + num2 + " = " +  divi));
            }
        }
    }
}