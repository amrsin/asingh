package com.example.acalculadora;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edit_t1, edit_t2;
    private TextView text_v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_t1= (EditText) findViewById(R.id.num_1);
        edit_t2 = (EditText) findViewById(R.id.num_2);
        text_v = (TextView) findViewById(R.id.resultado);
    }

    public void suma(View view) {
        int num_1;
        int num_2;
        int suma;
        num_1 = Integer.parseInt(edit_t1.getText().toString());
        num_2 = Integer.parseInt(edit_t2.getText().toString());
        suma = num_1 + num_2;
        text_v.setText(String.valueOf(num_1 + " + " + num_2 + " = " +  suma));
    }

    public void resta(View view) {
        int num_1;
        int num_2;
        int resta;
        num_1 = Integer.parseInt(edit_t1.getText().toString());
        num_2 = Integer.parseInt(edit_t2.getText().toString());
        resta = num_1 - num_2;
        text_v.setText(String.valueOf(num_1 + " - " + num_2 + " = " +  resta));
    }

    public void multi(View view) {
        int num_1;
        int num_2;
        int multi;
        num_1 = Integer.parseInt(edit_t1.getText().toString());
        num_2 = Integer.parseInt(edit_t2.getText().toString());
        multi = num_1 * num_2;
        text_v.setText(String.valueOf(num_1 + " * " + num_2 + " = " +  multi));
    }

    public void divi(View view) {
        int num_1;
        int num_2;
        int divi;
        num_1 = Integer.parseInt(edit_t1.getText().toString());
        num_2 = Integer.parseInt(edit_t2.getText().toString());
        divi = num_1 / num_2;
        text_v.setText(String.valueOf(num_1 + " / " + num_2 + " = " +  divi));
    }
}