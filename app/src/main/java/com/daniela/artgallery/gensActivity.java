package com.daniela.artgallery;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.content.Intent;

public class gensActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gens);

        TextView btnVolver1 = findViewById(R.id.btnVolver1);
        TextView verOfertas = findViewById(R.id.btnVerOfertas);
        LinearLayout contemp = findViewById(R.id.contemp);
        LinearLayout roman = findViewById(R.id.roman);
        LinearLayout artepop = findViewById(R.id.artepop);
        LinearLayout cubismo = findViewById(R.id.cubismo);
        LinearLayout modernismo = findViewById(R.id.modernismo);
        LinearLayout renacimiento = findViewById(R.id.renacimiento);

        btnVolver1.setOnClickListener(this);
        verOfertas.setOnClickListener(this);
        contemp.setOnClickListener(this);
        roman.setOnClickListener(this);
        artepop.setOnClickListener(this);
        cubismo.setOnClickListener(this);
        modernismo.setOnClickListener(this);
        renacimiento.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(gensActivity.this, artistasActivity.class);
        Intent intent2 = new Intent(gensActivity.this, MainActivity.class);
        Intent intent3 = new Intent(gensActivity.this, VerOfertasActivity.class);

        Bundle b = new Bundle();
        if (v.getId() == R.id.btnVolver1) {
            startActivity(intent2);
        } else if (v.getId() == R.id.btnVerOfertas) {
            startActivity(intent3);
        }else if (v.getId() == R.id.contemp) {
            b.putString("GENERO", "ARTE CONTEMPORÁNEO");
            intent.putExtras(b);
            startActivity(intent);
        } else if (v.getId() == R.id.roman) {
            b.putString("GENERO", "SURREALISMO");
            intent.putExtras(b);
            startActivity(intent);
        } else if (v.getId() == R.id.artepop) {
            b.putString("GENERO", "ARTE POP");
            intent.putExtras(b);
            startActivity(intent);
        } else if (v.getId() == R.id.cubismo) {
            b.putString("GENERO", "CUBISMO");
            intent.putExtras(b);
            startActivity(intent);
        } else if (v.getId() == R.id.modernismo) {
            b.putString("GENERO", "MODERNO");
            intent.putExtras(b);
            startActivity(intent);
        } else if (v.getId() == R.id.renacimiento) {
            b.putString("GENERO", "HIPERREALISMO");
            intent.putExtras(b);
            startActivity(intent);
        }
    }
}
