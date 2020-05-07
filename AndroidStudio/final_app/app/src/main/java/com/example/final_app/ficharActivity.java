package com.example.final_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ficharActivity extends AppCompatActivity {
    private TextView tv1, tv2;
    private ImageView img1, img2;
    private long date;
    private String dateString;
    private SimpleDateFormat simp_date;
    private boolean existe = false;
    private String usr;
    private String[] fecha;
    private String linea_aux = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        try {
            OutputStreamWriter file = new OutputStreamWriter(
                    openFileOutput("registro.txt", Context.MODE_PRIVATE));

            file.write("prueba,May 01 2020,07-47-09PM,IN");
            file.close();
        } catch (Exception ex) {
            Log.e("Ficheros", "Error al escribir fichero a memoria interna");
        }

        setContentView(R.layout.activity_fichar);
        tv2 = (TextView) findViewById(R.id.tv_bienvenida);
        img1 = (ImageView) findViewById(R.id.img_work_in);
        img2 = (ImageView) findViewById(R.id.img_work_out);

        String nom_complt = getIntent().getStringExtra("nom_complt");
        String empresa = getIntent().getStringExtra("empresa");
        usr = getIntent().getStringExtra("usr");
        tv2.setText(nom_complt + " | " + empresa);

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
                                date = System.currentTimeMillis();
                                simp_date = new SimpleDateFormat("MMM dd yyyy" + "," + "hh-mm-ss a");
                                dateString = simp_date.format(date);
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

    public void click_in(View view) {
        click("IN");
    }

    public void click_out(View view) {
        click("OUT");
    }

    public void click(String status_work) {

        try {
            InputStream file = openFileInput("registro.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                String linea = sc.nextLine();
                linea_aux = linea_aux + linea + "\n";
                String[] datos = linea.split(",");
                fecha = dateString.split(",");
                if (datos[0].equals(usr) && datos[1].equals(fecha[0]) && datos[3].equals(status_work)) {
                    existe = true;
                }
            }

        } catch (Exception e) {

        }

        if (existe) {
            Toast.makeText(this, "YA EXISTE REGISTRO " + status_work + " de " + fecha[0], Toast.LENGTH_SHORT).show();
        } else {

            String registro = usr + "," + fecha[0] + "," + fecha[1] + "," + status_work;
            try {
                OutputStreamWriter Archivo = new OutputStreamWriter(
                        openFileOutput("registro.txt", Context.MODE_PRIVATE));

                Archivo.write(linea_aux + registro + "\n");
                Archivo.close();
                Toast.makeText(this, "AGREGANDO REGISTRO " + status_work, Toast.LENGTH_SHORT).show();

            } catch (Exception ex) {
                Log.e("Ficheros", "Error al escribir fichero a memoria interna");
            }
        }
        existe = false;
        linea_aux = "";
    }
}