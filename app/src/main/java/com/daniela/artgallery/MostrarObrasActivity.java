package com.daniela.artgallery;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;


public class MostrarObrasActivity extends Activity{

    public static int mSelected = 0;
    private GridView gridView;
    private TextView title;
    private TextView btnVolver3;
    private TextView btnMenuPrincipal3;

    private String nombreArtista;


    public static Integer[] imagesThumbnail = {
            R.drawable.ej1, R.drawable.ej1, R.drawable.ej1, R.drawable.ej1,
            R.drawable.ej1,R.drawable.ej1
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.galeria_obras);


        title = (TextView)findViewById(R.id.titulo);
        btnVolver3 = (TextView)findViewById(R.id.btnVolver3);
        btnMenuPrincipal3 = (TextView)findViewById(R.id.btnMenuPrincipal3);
        gridView = (GridView) findViewById(R.id.gridview_galeria);
        gridView.setAdapter(new imageAdapter(this));
        gridView.setSelection(mSelected);
        Bundle bundle = this.getIntent().getExtras();
        nombreArtista = bundle.getString("NOMBRE");
        title.setText("Obras del artista " + bundle.getString("NOMBRE"));

        btnVolver3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btnMenuPrincipal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MostrarObrasActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        if (nombreArtista.equals("Gerhard Richter")) {
            imagesThumbnail = new Integer[] {
                    R.drawable.gr1, R.drawable.gr2, R.drawable.gr3,
                    R.drawable.gr4, R.drawable.gr5, R.drawable.gr6
            };
        } else if (nombreArtista.equals("Anselm Kiefer")) {
            imagesThumbnail = new Integer[] {
                    R.drawable.ak1, R.drawable.ak2, R.drawable.ak3,
                    R.drawable.ak4, R.drawable.ak5, R.drawable.ak6
            };
        } else if (nombreArtista.equals("Yayoi Kusama")) {
            imagesThumbnail = new Integer[] {
                    R.drawable.yk1, R.drawable.yk2, R.drawable.yk3,
                    R.drawable.yk4, R.drawable.yk5, R.drawable.yk6
            };
        } else if (nombreArtista.equals("Peter Doig")) {
            imagesThumbnail = new Integer[] {
                    R.drawable.pt1, R.drawable.pt2, R.drawable.pt3,
                    R.drawable.pt4, R.drawable.pt5, R.drawable.pt6
            };
        } else if (nombreArtista.equals("David Caspar Friedrich")) {
            imagesThumbnail = new Integer[] {
                    R.drawable.dc1, R.drawable.dc2, R.drawable.dc3,
                    R.drawable.dc4, R.drawable.dc5, R.drawable.dc6
            };
        } else if (nombreArtista.equals("Mark Bryan")) {
            imagesThumbnail = new Integer[] {
                    R.drawable.mb1, R.drawable.mb2, R.drawable.mb3,
                    R.drawable.mb4, R.drawable.mb5, R.drawable.mb6
            };
        }else if (nombreArtista.equals("Kris Kuksi")) {
            imagesThumbnail = new Integer[] {
                    R.drawable.kk1, R.drawable.kk2, R.drawable.kk3,
                    R.drawable.kk4, R.drawable.kk5, R.drawable.kk6
            };
        }else if (nombreArtista.equals("Georg Baselitz")) {
            imagesThumbnail = new Integer[] {
                    R.drawable.gb1, R.drawable.gb2, R.drawable.gb3,
                    R.drawable.gb4, R.drawable.gb5, R.drawable.gb6
            };
        } else if (nombreArtista.equals("David Hockney")) {
            imagesThumbnail = new Integer[] {
                    R.drawable.dh1, R.drawable.dh2, R.drawable.dh3,
                    R.drawable.dh4, R.drawable.dh5, R.drawable.dh6
            };
        } else if (nombreArtista.equals("Jeff Koons")) {
            imagesThumbnail = new Integer[] {
                    R.drawable.jk1, R.drawable.jk2, R.drawable.jk3,
                    R.drawable.jk4, R.drawable.jk5, R.drawable.jk6
            };
        }  else if (nombreArtista.equals("Takashi Murakami")) {
            imagesThumbnail = new Integer[] {
                    R.drawable.tm1, R.drawable.tm2, R.drawable.tm3,
                    R.drawable.tm4, R.drawable.tm5, R.drawable.tm6
            };
        } else if (nombreArtista.equals("Damien Hirst")) {
            imagesThumbnail = new Integer[] {
                    R.drawable.dah1, R.drawable.dah2, R.drawable.dah3,
                    R.drawable.dah4, R.drawable.dah5, R.drawable.dah6
            };
        } else if (nombreArtista.equals("Carmen Herrera")) {
            imagesThumbnail = new Integer[] {
                    R.drawable.ch1, R.drawable.ch2, R.drawable.ch3,
                    R.drawable.ch4, R.drawable.ch5, R.drawable.ch6
            };
        } else if (nombreArtista.equals("Frank Stella")) {
            imagesThumbnail = new Integer[] {
                    R.drawable.fk1, R.drawable.fk2, R.drawable.fk3,
                    R.drawable.fk4, R.drawable.fk5, R.drawable.fk6
            };
        } else if (nombreArtista.equals("Julio Le Parc")) {
            imagesThumbnail = new Integer[] {
                    R.drawable.jp1, R.drawable.jp2, R.drawable.jp3,
                    R.drawable.jp4, R.drawable.jp5, R.drawable.jp6
            };
        } else if (nombreArtista.equals("Sean Scully")) {
            imagesThumbnail = new Integer[] {
                    R.drawable.so1, R.drawable.so2, R.drawable.so3,
                    R.drawable.so4, R.drawable.so5, R.drawable.so6
            };
        } else if (nombreArtista.equals("Anish Kapoor")) {
            imagesThumbnail = new Integer[] {
                    R.drawable.aka1, R.drawable.aka2, R.drawable.aka3,
                    R.drawable.aka4, R.drawable.aka5, R.drawable.aka6
            };
        } else if (nombreArtista.equals("Cecily Brown")) {
            imagesThumbnail = new Integer[] {
                    R.drawable.cb1, R.drawable.cb2, R.drawable.cb3,
                    R.drawable.cb4, R.drawable.cb5, R.drawable.cb6
            };
        } else if (nombreArtista.equals("Neo Rauch")) {
            imagesThumbnail = new Integer[] {
                    R.drawable.nr1, R.drawable.nr2, R.drawable.nr3,
                    R.drawable.nr4, R.drawable.nr5, R.drawable.nr6
            };
        } else if (nombreArtista.equals("Marlene Dumas")) {
            imagesThumbnail = new Integer[] {
                    R.drawable.md1, R.drawable.md2, R.drawable.md3,
                    R.drawable.md4, R.drawable.md5, R.drawable.md6
            };
        } else if (nombreArtista.equals("Chuck Close")) {
            imagesThumbnail = new Integer[] {
                    R.drawable.cc1, R.drawable.cc2, R.drawable.cc3,
                    R.drawable.cc4, R.drawable.cc4, R.drawable.cc6
            };
        } else if (nombreArtista.equals("Gottfried Helnwein")) {
            imagesThumbnail = new Integer[] {
                    R.drawable.gh1, R.drawable.gh2, R.drawable.gh3,
                    R.drawable.gh4, R.drawable.gh5, R.drawable.gh6
            };
        }else if (nombreArtista.equals("Pedro Campos")) {
            imagesThumbnail = new Integer[] {
                    R.drawable.pc1, R.drawable.pc2, R.drawable.pc3,
                    R.drawable.pc4, R.drawable.pc5, R.drawable.pc6
            };
        }else if (nombreArtista.equals("Jason de Graaf")) {
            imagesThumbnail = new Integer[] {
                    R.drawable.jg1, R.drawable.jg2, R.drawable.jg3,
                    R.drawable.jg4, R.drawable.jg5, R.drawable.jg6
            };
        }
    }

    public class imageAdapter extends BaseAdapter{
        private Context mContexto;
        public imageAdapter(Context c){ mContexto = c; }
        @Override
        public int getCount() { return imagesThumbnail.length; }
        @Override
        public Object getItem(int position) { return null; }
        @Override
        public long getItemId(int position) {
            return 0;
        }
        @Override
        public View getView(final int i, View convertView, ViewGroup parent)
        {
            ImageView imageView;
            if (convertView == null){
                imageView = new ImageView(mContexto);
                imageView.setLayoutParams(new GridView.LayoutParams
                        (ViewGroup.LayoutParams.MATCH_PARENT,350 ));
                if(Build.VERSION.SDK_INT >=Build.VERSION_CODES.JELLY_BEAN){
                    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    imageView.setCropToPadding(true);
                }else{
                    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                }
                imageView.setPadding(2,2,2,2);
            }else{
                imageView = (ImageView) convertView;
            }

            imageView.setImageResource(MostrarObrasActivity.imagesThumbnail[i]);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mSelected = (Integer) v.getTag();
                    notifyDataSetChanged();
                    String index = String.valueOf(i);
                    Bundle extras = new Bundle();
                    Intent in;
                    extras.putString("position", index);
                    extras.putString("NOMBRE", nombreArtista);
                    in = new
                            Intent(mContexto,SwipeObrasActivity.class).putExtras(extras);
                    mContexto.startActivity(in);
                }
            });
            try{
                imageView.setTag(i);
                if (i == mSelected){

                    imageView.setBackgroundColor(Color.parseColor("#ff6203"));
                }else{
                    imageView.setBackgroundColor(Color.TRANSPARENT);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
            return imageView;
        } }
}





