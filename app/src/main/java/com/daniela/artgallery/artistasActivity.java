package com.daniela.artgallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class artistasActivity extends AppCompatActivity {
    private TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artistas);

        LinearLayout[] artistas = {
                findViewById(R.id.artista1),
                findViewById(R.id.artista2),
                findViewById(R.id.artista3),
                findViewById(R.id.artista4)
        };

        TextView[] names = {
                findViewById(R.id.name1),
                findViewById(R.id.name2),
                findViewById(R.id.name3),
                findViewById(R.id.name4)
        };

        title = findViewById(R.id.title);
        Bundle bundle = getIntent().getExtras();
        String genero = bundle.getString("GENERO");

        title.setText("ARTISTAS DEL " + bundle.getString("GENERO"));
        if (genero.equals("ARTE CONTEMPORÁNEO")) {
            names[0].setText("Gerhard Richter");
            names[1].setText("Anselm Kiefer");
            names[2].setText("Yayoi Kusama");
            names[3].setText("Peter Doig");
        } else if (genero.equals("SURREALISMO")) {
            names[0].setText("Mark Bryan");
            names[1].setText("David Caspar Friedrich");
            names[2].setText("Georg Baselitz");
            names[3].setText("Kris Kuksi");
        } else if (genero.equals("ARTE POP")) {
            names[0].setText("David Hockney");
            names[1].setText("Jeff Koons");
            names[2].setText("Takashi Murakami");
            names[3].setText("Damien Hirst");
        } else if (genero.equals("CUBISMO")) {
            names[0].setText("Carmen Herrera");
            names[1].setText("Frank Stella");
            names[2].setText("Julio Le Parc");
            names[3].setText("Sean Scully");
        } else if (genero.equals("MODERNO")) {
            names[0].setText("Anish Kapoor");
            names[1].setText("Cecily Brown");
            names[2].setText("Neo Rauch");
            names[3].setText("Marlene Dumas");
        } else if (genero.equals("HIPERREALISMO")) {
            names[0].setText("Chuck Close");
            names[1].setText("Gottfried Helnwein");
            names[2].setText("Pedro Campos");
            names[3].setText("Jason de Graaf");
        }

        TextView btnVolver2 = findViewById(R.id.btnVolver2);

        btnVolver2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        TextView btnMenuPrincipal = findViewById(R.id.btnMenuPrincipal2);
        btnMenuPrincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(artistasActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        for (int i = 0; i < artistas.length; i++) {
            final int index = i;
            artistas[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(artistasActivity.this, MostrarObrasActivity.class);
                    Bundle b = new Bundle();
                    b.putString("NOMBRE", names[index].getText().toString());
                    b.putString("GENERO", genero);
                    intent.putExtras(b);
                    startActivity(intent);
                }
            });
        }



    }
}
