package com.daniela.artgallery;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.text.DecimalFormat;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.database.Cursor;
import OpenHelper.SQLite_OpenHelper;


public class VerOfertasActivity extends AppCompatActivity {
    private SQLite_OpenHelper dbHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_ofertas);

        TextView btnMenuPrincipal = findViewById(R.id.btnMenuPrincipal7);
        btnMenuPrincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VerOfertasActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        TextView btnVolver4 = findViewById(R.id.btnVolver7);

        btnVolver4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                onBackPressed();

            }
        });

        LinearLayout layoutOfertas = findViewById(R.id.layoutOfertas);
        dbHelper = new SQLite_OpenHelper(this, "DBgallery", null, 1);
        dbHelper.abrir();

        // Obtener todas las ofertas de la base de datos
        String[] columnas = {"nombre", "apellido", "mail", "tel", "oferta", "obra"};
        Cursor cursor = dbHelper.getWritableDatabase().query("ofertas", columnas, null, null, null, null, null);

        if (cursor.moveToFirst()) {
            do {

                // Obtener los datos de la oferta del cursor
                String nombre = cursor.getString(cursor.getColumnIndex("nombre"));
                String apellido = cursor.getString(cursor.getColumnIndex("apellido"));
                String correo = cursor.getString(cursor.getColumnIndex("mail"));
                String telefono = cursor.getString(cursor.getColumnIndex("tel"));
                String obra = cursor.getString(cursor.getColumnIndex("obra"));
                double oferta = cursor.getDouble(cursor.getColumnIndex("oferta"));
                DecimalFormat decimalFormat = new DecimalFormat("#,###.00");
                String ofertaFormateada = decimalFormat.format(oferta);

                TextView textViewOferta = new TextView(this);
                textViewOferta.setTextColor(Color.WHITE);
                textViewOferta.setTextSize(18);
                textViewOferta.setText("Nombre: " + nombre + "\n" +
                        "Apellido: " + apellido + "\n" +
                        "Correo: " + correo + "\n" +
                        "Teléfono: " + telefono + "\n" +
                        "Oferta: $" + ofertaFormateada  + "\n"+
                        "Obra: " + obra +
                        "\n-----------------------------------");
                textViewOferta.setPadding(0, 0, 0, 16);

                // Agregar el TextView al layout de ofertas
                layoutOfertas.addView(textViewOferta);
            } while (cursor.moveToNext());
        }

        cursor.close();
        dbHelper.cerrar();

    }
}