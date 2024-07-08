package com.daniela.artgallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import OpenHelper.SQLite_OpenHelper;

public class InfoObra extends AppCompatActivity {

    private SQLite_OpenHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_obra);

        ImageView imageView = findViewById(R.id.minObra);
        int imageResourceId = getIntent().getIntExtra("imageId", 0);
        imageView.setImageResource(imageResourceId);
        String imagePath = getResources().getResourceEntryName(imageResourceId);

        TextView btnVolver = findViewById(R.id.btnVolver);
        btnVolver.setOnClickListener(v -> onBackPressed());

        TextView btnMenuPrincipal = findViewById(R.id.btnMenuPrincipal);
        btnMenuPrincipal.setOnClickListener(v -> {
            Intent intent = new Intent(InfoObra.this, MainActivity.class);
            startActivity(intent);
        });

        dbHelper = new SQLite_OpenHelper(this, "DBgallery", null, 1);
        //dbHelper.leer();

        Cursor cursor = dbHelper.obtenerInfoObra(imagePath);

        if (cursor.moveToFirst()) {
            String autor = cursor.getString(cursor.getColumnIndex("autor"));
            String titulo = cursor.getString(cursor.getColumnIndex("titulo"));
            String anio = cursor.getString(cursor.getColumnIndex("anio"));
            String precio = cursor.getString(cursor.getColumnIndex("precio"));
            String duenio = cursor.getString(cursor.getColumnIndex("duenio"));

            TextView infoTextView = findViewById(R.id.infoTextView);
            String infoObra = "Autor: " + autor + "\n"
                    + "Título: " + titulo + "\n"
                    + "Año: " + anio + "\n"
                    + "Precio estimado: " + precio + "\n"
                    + "Dueño actual: " + duenio;
            infoTextView.setText(infoObra);
        }

        cursor.close();
        dbHelper.cerrar();
    }
}
