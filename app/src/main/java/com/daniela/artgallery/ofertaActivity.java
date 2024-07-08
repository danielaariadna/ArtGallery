package com.daniela.artgallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import OpenHelper.SQLite_OpenHelper;
public class ofertaActivity extends AppCompatActivity {
    private Button ofB;
    SQLite_OpenHelper helper = new SQLite_OpenHelper(this,"DBgallery",null,1 );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oferta);

        int imagen = getIntent().getIntExtra("imageId", 0);
        ImageView imageView = findViewById(R.id.min_obra);
        imageView.setImageResource(imagen);

        ofB = findViewById(R.id.ofB);
        ofB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validarCampos()) {
                    onBackPressed();
                }
            }
        });
        TextView btnMenuPrincipal = findViewById(R.id.btnMenuPrincipal4);
        btnMenuPrincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ofertaActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        TextView btnVolver4 = findViewById(R.id.btnVolver4);

        btnVolver4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    onBackPressed();

            }
        });
    }

    private boolean validarCampos() {

        ImageView imageView = findViewById(R.id.minObra);
        int imageResourceId = getIntent().getIntExtra("imageId", 0);
        String imagePath = getResources().getResourceEntryName(imageResourceId);

        // Obtener referencias a los EditTexts
        EditText editTextNombre = findViewById(R.id.editTextNombre);
        EditText editTextApellido = findViewById(R.id.editTextApellido);
        EditText editTextCorreo = findViewById(R.id.editTextCorreo);
        EditText editTextOferta = findViewById(R.id.editTextOferta);
        EditText editTextTelefono = findViewById(R.id.editTextTelefono);

        // Obtener los valores de los campos
        String nombre = editTextNombre.getText().toString().trim();
        String apellido = editTextApellido.getText().toString().trim();
        String correo = editTextCorreo.getText().toString().trim();
        String ofertaStr = editTextOferta.getText().toString().trim();
        String telefono = editTextTelefono.getText().toString().trim();

        // Validar que todos los campos estén completos
        if (nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty() || ofertaStr.isEmpty() || telefono.isEmpty()) {
            Toast.makeText(ofertaActivity.this, "Por favor, complete todos los campos.", Toast.LENGTH_SHORT).show();
            return false;
        }

        // Validar que los campos de nombre y apellido no contengan números y tengan longitud máxima de 15 caracteres
        if (nombre.matches(".*\\d.*") || apellido.matches(".*\\d.*")) {
            Toast.makeText(ofertaActivity.this, "Los campos de nombre y apellido no pueden contener números.", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (nombre.length() > 15 || apellido.length() > 15) {
            Toast.makeText(ofertaActivity.this, "Los campos de nombre y apellido deben tener máximo 15 caracteres.", Toast.LENGTH_SHORT).show();
            return false;
        }
        // Validar que el nombre no contenga caracteres especiales
        if (!nombre.matches("[a-zA-Z\\s]+") || !apellido.matches("[a-zA-Z\\s]+")) {
            Toast.makeText(ofertaActivity.this, "Los campos de nombre y apellido no pueden contener caracteres especiales.", Toast.LENGTH_SHORT).show();
            return false;
        }

        // Validar que la oferta no sea $0
        double oferta = Double.parseDouble(ofertaStr);
        if (oferta == 0) {
            Toast.makeText(ofertaActivity.this, "La oferta debe ser mayor a $0.", Toast.LENGTH_SHORT).show();
            return false;
        }

        // Validar que el correo tenga el formato correcto
        if (!correo.endsWith("@gmail.com") && !correo.endsWith("@hotmail.com") && !correo.endsWith("@yahoo.com")) {
            Toast.makeText(ofertaActivity.this, "Por favor, ingrese un correo válido.", Toast.LENGTH_SHORT).show();
            return false;
        }

        // Validar que el número de teléfono tenga una longitud exacta de 10 caracteres
        if (telefono.length() != 10) {
            Toast.makeText(ofertaActivity.this, "Por favor, ingrese un número de teléfono válido.", Toast.LENGTH_SHORT).show();
            return false;
        }

        helper.abrir();
        helper.insertarOferta(nombre, apellido, correo,telefono,oferta,imagePath);
        helper.cerrar();

        // Todas las validaciones han sido exitosas
        return true;
    }
}
