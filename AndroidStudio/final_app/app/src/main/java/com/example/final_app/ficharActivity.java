package com.example.final_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;

public class ficharActivity extends AppCompatActivity {
    private TextView tv1, tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fichar);
        tv2 = (TextView) findViewById(R.id.tv_bienvenida);
        String nombre = getIntent().getStringExtra("Nombre");
        tv2.setText("Bienvenido/a "  + nombre);
        Thread t = new Thread() {
            @Override
            public void run() {
                try {
                    while (!isInterrupted()) {
                        Thread.sleep(1000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                tv1 = (TextView) findViewById(R.id.tv_date);
                                long date = System.currentTimeMillis();
                                SimpleDateFormat simp_date = new SimpleDateFormat("MMM dd yyyy " + " hh-mm-ss a");
                                String dateString = simp_date.format(date);
                                tv1.setText(dateString);
                            }
                        });
                    }
                } catch (InterruptedException e) {
                }
            }
        };
        t.start();
    }
}