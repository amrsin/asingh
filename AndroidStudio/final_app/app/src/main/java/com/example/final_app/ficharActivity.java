package com.example.final_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        File file = new File(getApplicationContext().getFilesDir() + "registro.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
                FileWriter Archivo = new FileWriter(file);
                Archivo.write("prueba,May 01 2020,07-47-09 PM,IN\n");
                Archivo.close();
            }
        } catch (IOException e) {
            Log.e("Ficheros", "Error al crear el fichero registro.txt");

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

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.exit) {
            AlertDialog.Builder builder = new AlertDialog.Builder(ficharActivity.this);
            builder.setMessage("¿Quiere cerrar session?");
            builder.setCancelable(true);

            builder.setNegativeButton("YES", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });

            builder.setPositiveButton("NO", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }
        return true;
    }


    public void click_in(View view) {
        click("IN");
    }

    public void click_out(View view) {
        click("OUT");
    }

    public void click(String status_work) {
        String linea_aux = "";
        try {
            File file = new File(getApplicationContext().getFilesDir() + "registro.txt");
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
                File file = new File(getApplicationContext().getFilesDir() + "registro.txt");
                FileWriter Archivo = new FileWriter(file);
                Archivo.write(linea_aux + registro + "\n");
                Archivo.close();
                Toast.makeText(this, "AGREGANDO REGISTRO " + status_work, Toast.LENGTH_SHORT).show();

            } catch (Exception ex) {
                Log.e("Ficheros", "Error al escribir en el fichero resgistro.txt");
            }
        }
        existe = false;
    }

    public  void registro_diario(View view) {

        registro("diario");

    }

    public  void registro_total(View view) {

        registro("total");
    }

    public void registro(String registro) {
        String linea_aux = "";
        try {
            File file = new File(getApplicationContext().getFilesDir() + "registro.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                String linea = sc.nextLine();
                String[] datos = linea.split(",");
                fecha = dateString.split(",");

                if (registro.equals("diario")) {
                    if (datos[0].equals(usr) && datos[1].equals(fecha[0]) ) {
                        linea_aux = linea_aux + linea + "\n";
                    }

                }

                if (registro.equals("total")) {
                    if(datos[0].equals(usr)) {
                        linea_aux = linea_aux + linea + "\n";
                    }
                }
            }
            if (linea_aux.isEmpty() && registro.equals("diario")) {
                linea_aux = "No hay registros de " + usr + "," + fecha[0];
            }
            if (linea_aux.isEmpty() && registro.equals("total")) {
                linea_aux = "No hay registros de " + usr;
            }
            linea_aux = linea_aux.replaceAll("," , " - ");

        } catch (Exception e) {

        }

            AlertDialog alertDialog = new AlertDialog.Builder(ficharActivity.this).create();
            alertDialog.setTitle("Registro " + registro);
            alertDialog.setMessage(linea_aux);
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();
        }


    public void perfil(View view) {
        String linea_aux = "";
        try {
            File file = new File(getApplicationContext().getFilesDir() + "info.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                String linea = sc.nextLine();
                String[] datos = linea.split(",");

                if (usr.equals(datos[0])) {

                    linea_aux = "-------------------------------------------------------------------\n" +
                                "Usuario | " + datos[0] + "\n" +
                                "Nombre completo | " + datos[2] + "\n" +
                                "Empresa | " + datos[3] + "\n" +
                                "Puesto trabajo | " + datos[4] + "\n" +
                                "-------------------------------------------------------------------";
                }
            }

        } catch (Exception e) {

        }

        AlertDialog alertDialog = new AlertDialog.Builder(ficharActivity.this).create();
        alertDialog.setTitle("Perfil");
        alertDialog.setMessage(linea_aux);
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }

                });
        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "CERRAR SESION",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });
        alertDialog.show();
    }
}