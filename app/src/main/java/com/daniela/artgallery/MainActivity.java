package com.daniela.artgallery;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import OpenHelper.SQLite_OpenHelper;

public class MainActivity extends AppCompatActivity {
    private Button gensB;
    private Button infoB;
    private SQLite_OpenHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gensB = (Button)findViewById(R.id.gensB);
        infoB = (Button)findViewById(R.id.infoB);

        gensB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, gensActivity.class);
                startActivity(intent);
            }
        });
        infoB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, infoActivity.class);
                startActivity(intent);
            }
        });

        //cargar descripcion de las obras
        dbHelper = new SQLite_OpenHelper(this, "DBgallery", null, 1);
        dbHelper.abrir();
        //Gerhard Richter
        dbHelper.insertarInfo("gr1", "Gerhard Richter","gr1","2000","$90.000","Juan Perez");
        dbHelper.insertarInfo("gr2", "Gerhard Richter","gr2","1998","$50.000","Juan Perez");
        dbHelper.insertarInfo("gr3", "Gerhard Richter","gr3","1999","$45.000","Juan Perez");
        dbHelper.insertarInfo("gr4", "Gerhard Richter","gr4","1990","$80.000","Juan Perez");
        dbHelper.insertarInfo("gr5", "Gerhard Richter","gr5","1995","$500.000","Juan Perez");
        dbHelper.insertarInfo("gr6", "Gerhard Richter","gr6","1993","$55.000","Juan Perez");

        //Anselm Kiefer
        dbHelper.insertarInfo("ak1", "Anselm Kiefer","ak1","1955","$120.345","Valentina Martínez");
        dbHelper.insertarInfo("ak2", "Anselm Kiefer","ak2","1998","$50.000","Valentina Martínez");
        dbHelper.insertarInfo("ak3", "Anselm Kiefer","ak3","1999","$45.700","Valentina Martínez");
        dbHelper.insertarInfo("ak4", "Anselm Kiefer","ak4","1987","$89.000","Valentina Martínez");
        dbHelper.insertarInfo("ak5", "Anselm Kiefer","ak5","1995","$590.000","Valentina Martínez");
        dbHelper.insertarInfo("ak6", "Anselm Kiefer","ak6","1998","$550.000","Valentina Martínez");

        //Yayoi Kusama
        dbHelper.insertarInfo("yk1", "Yayoi Kusama","yk1","2000","$90.000","Daniel Castro");
        dbHelper.insertarInfo("yk2", "Yayoi Kusama","yk2","1998","$50.000","Daniel Castro");
        dbHelper.insertarInfo("yk3", "Yayoi Kusama","yk3","1999","$45.000","Daniel Castro");
        dbHelper.insertarInfo("yk4", "Yayoi Kusama","yk4","1990","$80.000","Daniel Castro");
        dbHelper.insertarInfo("yk5", "Yayoi Kusama","yk5","1995","$500.000","Daniel Castro");
        dbHelper.insertarInfo("yk6", "Yayoi Kusama","yk6","1993","$55.000","Daniel Castro");


        //Peter Doing
        dbHelper.insertarInfo("pt1", "Peter Doing","pt1","2000","$90.000","Matías Ríos");
        dbHelper.insertarInfo("pt2", "Peter Doing","pt2","1998","$50.000","Matías Ríos");
        dbHelper.insertarInfo("pt3", "Peter Doing","pt3","1999","$45.000","Matías Ríos");
        dbHelper.insertarInfo("pt4", "Peter Doing","pt4","1990","$80.000","Matías Ríos");
        dbHelper.insertarInfo("pt5", "Peter Doing","pt5","1995","$500.000","Matías Ríos");
        dbHelper.insertarInfo("pt6", "Peter Doing","pt6","1993","$55.000","Matías Ríos");


        //Mark Bryan
        dbHelper.insertarInfo("mb1", "Mark Bryan","mb1","2000","$90.000","Emma Espinoza");
        dbHelper.insertarInfo("mb2", "Mark Bryan","mb2","1998","$50.000","Emma Espinoza");
        dbHelper.insertarInfo("mb3", "Mark Bryan","mb3","1999","$45.000","Emma Espinoza");
        dbHelper.insertarInfo("mb4", "Mark Bryanr","mb4","1990","$80.000","Emma Espinoza");
        dbHelper.insertarInfo("mb5", "Mark Bryan","mb5","1995","$500.000","Emma Espinoza");
        dbHelper.insertarInfo("mb6", "Mark Bryan","mb6","1993","$55.000","Emma Espinoza");

        //David Caspar Friedrich
        dbHelper.insertarInfo("dc1", "David Caspar Friedrich","dc1","1955","$120.345","Maite Reyes");
        dbHelper.insertarInfo("dc2", "David Caspar Friedrich","dc2","1998","$50.000","Maite Reyes");
        dbHelper.insertarInfo("dc3", "David Caspar Friedrich","dc3","1999","$45.700","Maite Reyes");
        dbHelper.insertarInfo("dc4", "David Caspar Friedrich","dc4","1987","$89.000","Maite Reyes");
        dbHelper.insertarInfo("dc5", "David Caspar Friedrich","dc5","1995","$590.000","Maite Reyes");
        dbHelper.insertarInfo("dc6", "David Caspar Friedrich","dc6","1998","$550.000","Maite Reyes");

        //George Baselitz
        dbHelper.insertarInfo("gb1", "George Baselitz","gb1","2000","$90.000","Daniel Castro");
        dbHelper.insertarInfo("gb2", "George Baselitz","gb2","1998","$50.000","Daniel Castro");
        dbHelper.insertarInfo("gb3", "George Baselitz","gb3","1999","$45.000","Daniel Castro");
        dbHelper.insertarInfo("gb4", "George Baselitz","gb4","1990","$80.000","Daniel Castro");
        dbHelper.insertarInfo("gb5", "George Baselitz","gb5","1995","$500.000","Daniel Castro");
        dbHelper.insertarInfo("gb6", "George Baselitz","gb6","1993","$55.000","Daniel Castro");


        //Kris Kuksi
        dbHelper.insertarInfo("kk1", "Kris Kuksi","kk1","2000","$90.000","Isidora Jara");
        dbHelper.insertarInfo("kk2", "Kris Kuksi","kk2","1998","$50.000","Isidora Jara");
        dbHelper.insertarInfo("kk3", "Kris Kuksi","kk3","1999","$45.000","Isidora Jara");
        dbHelper.insertarInfo("kk4", "Kris Kuksi","kk4","1990","$80.000","Isidora Jara");
        dbHelper.insertarInfo("kk5", "Kris Kuksi","kk5","1995","$500.000","Isidora Jara");
        dbHelper.insertarInfo("kk6", "Kris Kuksi","kk6","1993","$55.000","Isidora Jara");

        //David Hockney
        dbHelper.insertarInfo("dh1", "David Hockney","dh1","2000","$90.000","Martina Olivares");
        dbHelper.insertarInfo("dh2", "David Hockney","dh2","1998","$50.000","Martina Olivares");
        dbHelper.insertarInfo("dh3", "David Hockney","dh3","1999","$45.000","Martina Olivares");
        dbHelper.insertarInfo("dh4", "David Hockney","dh4","1990","$80.000","Martina Olivares");
        dbHelper.insertarInfo("dh5", "David Hockney","dh5","1995","$500.000","Martina Olivares");
        dbHelper.insertarInfo("dh6", "David Hockney","dh6","1993","$55.000","Martina Olivares");

        //Jeff Koons
        dbHelper.insertarInfo("jk1", "Jeff Koons","jk1","1955","$120.345","Valentina Martínez");
        dbHelper.insertarInfo("jk2", "Jeff Koons","jk2","1998","$50.000","Valentina Martínez");
        dbHelper.insertarInfo("jk3", "Jeff Koonsr","jk3","1999","$45.700","Valentina Martínez");
        dbHelper.insertarInfo("jk4", "Jeff Koons","jk4","1987","$89.000","Valentina Martínez");
        dbHelper.insertarInfo("jk5", "Jeff Koonsr","jk5","1995","$590.000","Valentina Martínez");
        dbHelper.insertarInfo("jk6", "Jeff Koons","jk6","1998","$550.000","Valentina Martínez");

        //Takashi Murakami
        dbHelper.insertarInfo("tm1", "Takashi Murakami","tm1","2000","$90.000","Daniel Castro");
        dbHelper.insertarInfo("tm2", "Takashi Murakami","tm2","1998","$50.000","Daniel Castro");
        dbHelper.insertarInfo("tm3", "Takashi Murakami","tm3","1999","$45.000","Daniel Castro");
        dbHelper.insertarInfo("tm4", "Takashi Murakami","tm4","1990","$80.000","Daniel Castro");
        dbHelper.insertarInfo("tm5", "Takashi Murakami","tm5","1995","$500.000","Daniel Castro");
        dbHelper.insertarInfo("tm6", "Takashi Murakami","tm6","1993","$55.000","Daniel Castro");


        //Damien Hirst
        dbHelper.insertarInfo("dah1", "Damien Hirst","dah1","2000","$90.000","Matías Ríos");
        dbHelper.insertarInfo("dah2", "Damien Hirst","dah2","1998","$50.000","Matías Ríos");
        dbHelper.insertarInfo("dah3", "Damien Hirst","dah3","1999","$45.000","Matías Ríos");
        dbHelper.insertarInfo("dah4", "Damien Hirst","dah4","1990","$80.000","Matías Ríos");
        dbHelper.insertarInfo("dah5", "Damien Hirst","dah5","1995","$500.000","Matías Ríos");
        dbHelper.insertarInfo("dah6", "Damien Hirst","dah6","1993","$55.000","Matías Ríos");


        //Carmen Herrera
        dbHelper.insertarInfo("ch1", "Carmen Herrera","ch1","2000","$90.000","Emma Espinoza");
        dbHelper.insertarInfo("ch2", "Carmen Herrera","ch2","1998","$50.000","Emma Espinoza");
        dbHelper.insertarInfo("ch3", "Carmen Herrera","ch3","1999","$45.000","Emma Espinoza");
        dbHelper.insertarInfo("ch4", "Carmen Herrera","ch4","1990","$80.000","Emma Espinoza");
        dbHelper.insertarInfo("ch5", "Carmen Herrera","ch5","1995","$500.000","Emma Espinoza");
        dbHelper.insertarInfo("ch6", "Carmen Herrera","ch6","1993","$55.000","Emma Espinoza");

        //Frank Stella
        dbHelper.insertarInfo("fk1", "Frank Stella","fk1","1955","$120.345","Maite Reyes");
        dbHelper.insertarInfo("fk2", "Frank Stella","fk2","1998","$50.000","Maite Reyes");
        dbHelper.insertarInfo("fk3", "Frank Stella","fk3","1999","$45.700","Maite Reyes");
        dbHelper.insertarInfo("fk4", "Frank Stella","fk4","1987","$89.000","Maite Reyes");
        dbHelper.insertarInfo("fk5", "Frank Stella","fk5","1995","$590.000","Maite Reyes");
        dbHelper.insertarInfo("fk6", "Frank Stella","fk6","1998","$550.000","Maite Reyes");

        //Julio Le Parc
        dbHelper.insertarInfo("jp1", "Julio Le Parc","jp1","2000","$90.000","Daniel Castro");
        dbHelper.insertarInfo("jp2", "Julio Le Parc","jp2","1998","$50.000","Daniel Castro");
        dbHelper.insertarInfo("jp3", "Julio Le Parc","jp3","1999","$45.000","Daniel Castro");
        dbHelper.insertarInfo("jp4", "Julio Le Parc","jp4","1990","$80.000","Daniel Castro");
        dbHelper.insertarInfo("jp5", "Julio Le Parc","jp5","1995","$500.000","Daniel Castro");
        dbHelper.insertarInfo("jp6", "Julio Le Parc","jp6","1993","$55.000","Daniel Castro");


        //Sean Scully
        dbHelper.insertarInfo("so1", "Sean Scully","so1","2000","$90.000","Isidora Jara");
        dbHelper.insertarInfo("so2", "Sean Scully","so2","1998","$50.000","Isidora Jara");
        dbHelper.insertarInfo("so3", "Sean Scully","so3","1999","$45.000","Isidora Jara");
        dbHelper.insertarInfo("so4", "Sean Scully","so4","1990","$80.000","Isidora Jara");
        dbHelper.insertarInfo("so5", "Sean Scully","so5","1995","$500.000","Isidora Jara");
        dbHelper.insertarInfo("so6", "Sean Scully","so6","1993","$55.000","Isidora Jara");



        //Anish Kapoor
        dbHelper.insertarInfo("aka1", "Anish Kapoor","aka1","2000","$90.000","Martina Olivares");
        dbHelper.insertarInfo("aka2", "Anish Kapoor","aka2","1998","$50.000","Martina Olivares");
        dbHelper.insertarInfo("aka3", "Anish Kapoor","aka3","1999","$45.000","Martina Olivares");
        dbHelper.insertarInfo("aka4", "Anish Kapoor","aka4","1990","$80.000","Martina Olivares");
        dbHelper.insertarInfo("aka5", "Anish Kapoor","aka5","1995","$500.000","Martina Olivares");
        dbHelper.insertarInfo("aka6", "Anish Kapoor","aka6","1993","$55.000","Martina Olivares");

        //Cecily Brown
        dbHelper.insertarInfo("cb1", "Cecily Brown","cb1","1955","$120.345","Valentina Martínez");
        dbHelper.insertarInfo("cb2", "Cecily Brown","cb2","1998","$50.000","Valentina Martínez");
        dbHelper.insertarInfo("cb3", "Cecily Brown","cb3","1999","$45.700","Valentina Martínez");
        dbHelper.insertarInfo("cb4", "Cecily Brown","cb4","1987","$89.000","Valentina Martínez");
        dbHelper.insertarInfo("cb5", "Cecily Brown","cb5","1995","$590.000","Valentina Martínez");
        dbHelper.insertarInfo("cb6", "Cecily Brown","cb6","1998","$550.000","Valentina Martínez");

        //Neo Rauch
        dbHelper.insertarInfo("nr1", "Neo Rauch","nr1","2000","$90.000","Daniel Castro");
        dbHelper.insertarInfo("nr2", "Neo Rauch","nr2","1998","$50.000","Daniel Castro");
        dbHelper.insertarInfo("nr3", "Neo Rauch","nr3","1999","$45.000","Daniel Castro");
        dbHelper.insertarInfo("nr4", "Neo Rauch","nr4","1990","$80.000","Daniel Castro");
        dbHelper.insertarInfo("nr5", "Neo Rauch","nr5","1995","$500.000","Daniel Castro");
        dbHelper.insertarInfo("nr6", "Neo Rauch","nr6","1993","$55.000","Daniel Castro");


        //Marlene Dumas
        dbHelper.insertarInfo("md1", "Marlene Dumas","md1","2000","$90.000","Matías Ríos");
        dbHelper.insertarInfo("md2", "Marlene Dumas","md2","1998","$50.000","Matías Ríos");
        dbHelper.insertarInfo("md3", "Marlene Dumas","md3","1999","$45.000","Matías Ríos");
        dbHelper.insertarInfo("md4", "Marlene Dumas","md4","1990","$80.000","Matías Ríos");
        dbHelper.insertarInfo("md5", "Marlene Dumas","md5","1995","$500.000","Matías Ríos");
        dbHelper.insertarInfo("md6", "Marlene Dumas","md6","1993","$55.000","Matías Ríos");


        //Chuck Close
        dbHelper.insertarInfo("cc1", "Chuck Close","cc1","2000","$90.000","Emma Espinoza");
        dbHelper.insertarInfo("cc2", "Chuck Close","cc2","1998","$50.000","Emma Espinoza");
        dbHelper.insertarInfo("cc3", "Chuck Close","cc3","1999","$45.000","Emma Espinoza");
        dbHelper.insertarInfo("cc4", "Chuck Close","cc4","1990","$80.000","Emma Espinoza");
        dbHelper.insertarInfo("cc5", "Chuck Close","cc5","1995","$500.000","Emma Espinoza");
        dbHelper.insertarInfo("cc6", "Chuck Close","cc6","1993","$55.000","Emma Espinoza");

        //Gottfried Helnwein
        dbHelper.insertarInfo("gh1", "Gottfried Helnwein","gh1","1955","$120.345","Maite Reyes");
        dbHelper.insertarInfo("gh2", "Gottfried Helnwein","gh2","1998","$50.000","Maite Reyes");
        dbHelper.insertarInfo("gh3", "Gottfried Helnwein","gh3","1999","$45.700","Maite Reyes");
        dbHelper.insertarInfo("gh4", "Gottfried Helnwein","gh4","1987","$89.000","Maite Reyes");
        dbHelper.insertarInfo("gh5", "Gottfried Helnwein","gh5","1995","$590.000","Maite Reyes");
        dbHelper.insertarInfo("gh6", "Gottfried Helnwein","gh6","1998","$550.000","Maite Reyes");

        //Pedro Campos
        dbHelper.insertarInfo("pc1", "Pedro Campos","pc1","2000","$90.000","Daniel Castro");
        dbHelper.insertarInfo("pc2", "Pedro Campos","pc2","1998","$50.000","Daniel Castro");
        dbHelper.insertarInfo("pc3", "Pedro Campos","pc3","1999","$45.000","Daniel Castro");
        dbHelper.insertarInfo("pc4", "Pedro Campos","pc4","1990","$80.000","Daniel Castro");
        dbHelper.insertarInfo("pc5", "Pedro Campos","pc5","1995","$500.000","Daniel Castro");
        dbHelper.insertarInfo("pc6", "Pedro Campos","pc6","1993","$55.000","Daniel Castro");


        //Jason de Graaf
        dbHelper.insertarInfo("jg1", "Jason de Graaf","jg1","2000","$90.000","Isidora Jara");
        dbHelper.insertarInfo("jg2", "Jason de Graaf","jg2","1998","$50.000","Isidora Jara");
        dbHelper.insertarInfo("jg3", "Jason de Graaf","jg3","1999","$45.000","Isidora Jara");
        dbHelper.insertarInfo("jg4", "Jason de Graaf","jg4","1990","$80.000","Isidora Jara");
        dbHelper.insertarInfo("jg5", "Jason de Graaf","jg5","1995","$500.000","Isidora Jara");
        dbHelper.insertarInfo("jg6", "Jason de Graaf","jg6","1993","$55.000","Isidora Jara");
    }
}