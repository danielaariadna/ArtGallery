package com.daniela.artgallery;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class SwipeObrasActivity extends Activity {

    public static Integer[] images = {
            R.drawable.ej1, R.drawable.ej1, R.drawable.ej1, R.drawable.ej1,
            R.drawable.ej1, R.drawable.ej1
    };



    private String[] imagesDescriptions;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.swipe_obras);

        String nombreArtista = getIntent().getStringExtra("NOMBRE");
        String i = getIntent().getStringExtra("position");
        int index = Integer.parseInt(i);
        imagesDescriptions = getResources().getStringArray(R.array.images_descriptions);

        SwipeImagePagerAdapter swipeNewsAdapter = new SwipeImagePagerAdapter();

        ViewPager newsPager;
        newsPager = findViewById(R.id.swipe_pager);
        newsPager.setAdapter(swipeNewsAdapter);
        newsPager.setCurrentItem(index);

        newsPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {
                MostrarObrasActivity.mSelected = i;
            }

            @Override
            public void onPageSelected(int i) {
            }

            @Override
            public void onPageScrollStateChanged(int i) {
            }
        });

        if (nombreArtista.equals("Gerhard Richter")) {
            images = new Integer[] {
                    R.drawable.gr1, R.drawable.gr2, R.drawable.gr3,
                    R.drawable.gr4, R.drawable.gr5, R.drawable.gr6
            };
        } else if (nombreArtista.equals("Anselm Kiefer")) {
            images = new Integer[] {
                    R.drawable.ak1, R.drawable.ak2, R.drawable.ak3,
                    R.drawable.ak4, R.drawable.ak5, R.drawable.ak6
            };
        } else if (nombreArtista.equals("Yayoi Kusama")) {
            images = new Integer[] {
                    R.drawable.yk1, R.drawable.yk2, R.drawable.yk3,
                    R.drawable.yk4, R.drawable.yk5, R.drawable.yk6
            };
        } else if (nombreArtista.equals("Peter Doig")) {
            images = new Integer[] {
                    R.drawable.pt1, R.drawable.pt2, R.drawable.pt3,
                    R.drawable.pt4, R.drawable.pt5, R.drawable.pt6
            };
        } else if (nombreArtista.equals("David Caspar Friedrich")) {
            images = new Integer[] {
                    R.drawable.dc1, R.drawable.dc2, R.drawable.dc3,
                    R.drawable.dc4, R.drawable.dc5, R.drawable.dc6
            };
        } else if (nombreArtista.equals("Mark Bryan")) {
            images = new Integer[] {
                    R.drawable.mb1, R.drawable.mb2, R.drawable.mb3,
                    R.drawable.mb4, R.drawable.mb5, R.drawable.mb6
            };
        }else if (nombreArtista.equals("Kris Kuksi")) {
            images = new Integer[] {
                    R.drawable.kk1, R.drawable.kk2, R.drawable.kk3,
                    R.drawable.kk4, R.drawable.kk5, R.drawable.kk6
            };
        }else if (nombreArtista.equals("Georg Baselitz")) {
            images = new Integer[] {
                    R.drawable.gb1, R.drawable.gb2, R.drawable.gb3,
                    R.drawable.gb4, R.drawable.gb5, R.drawable.gb6
            };
        } else if (nombreArtista.equals("David Hockney")) {
            images = new Integer[] {
                    R.drawable.dh1, R.drawable.dh2, R.drawable.dh3,
                    R.drawable.dh4, R.drawable.dh5, R.drawable.dh6
            };
        } else if (nombreArtista.equals("Jeff Koons")) {
            images = new Integer[] {
                    R.drawable.jk1, R.drawable.jk2, R.drawable.jk3,
                    R.drawable.jk4, R.drawable.jk5, R.drawable.jk6
            };
        }  else if (nombreArtista.equals("Takashi Murakami")) {
            images = new Integer[] {
                    R.drawable.tm1, R.drawable.tm2, R.drawable.tm3,
                    R.drawable.tm4, R.drawable.tm5, R.drawable.tm6
            };
        } else if (nombreArtista.equals("Damien Hirst")) {
            images = new Integer[] {
                    R.drawable.dah1, R.drawable.dah2, R.drawable.dah3,
                    R.drawable.dah4, R.drawable.dah5, R.drawable.dah6
            };
        } else if (nombreArtista.equals("Carmen Herrera")) {
            images = new Integer[] {
                    R.drawable.ch1, R.drawable.ch2, R.drawable.ch3,
                    R.drawable.ch4, R.drawable.ch5, R.drawable.ch6
            };
        } else if (nombreArtista.equals("Frank Stella")) {
            images = new Integer[] {
                    R.drawable.fk1, R.drawable.fk2, R.drawable.fk3,
                    R.drawable.fk4, R.drawable.fk5, R.drawable.fk6
            };
        } else if (nombreArtista.equals("Julio Le Parc")) {
            images = new Integer[] {
                    R.drawable.jp1, R.drawable.jp2, R.drawable.jp3,
                    R.drawable.jp4, R.drawable.jp5, R.drawable.jp6
            };
        } else if (nombreArtista.equals("Sean Scully")) {
            images = new Integer[] {
                    R.drawable.so1, R.drawable.so2, R.drawable.so3,
                    R.drawable.so4, R.drawable.so5, R.drawable.so6
            };
        } else if (nombreArtista.equals("Anish Kapoor")) {
            images = new Integer[] {
                    R.drawable.aka1, R.drawable.aka2, R.drawable.aka3,
                    R.drawable.aka4, R.drawable.aka5, R.drawable.aka6
            };
        } else if (nombreArtista.equals("Cecily Brown")) {
            images = new Integer[] {
                    R.drawable.cb1, R.drawable.cb2, R.drawable.cb3,
                    R.drawable.cb4, R.drawable.cb5, R.drawable.cb6
            };
        } else if (nombreArtista.equals("Neo Rauch")) {
            images = new Integer[] {
                    R.drawable.nr1, R.drawable.nr2, R.drawable.nr3,
                    R.drawable.nr4, R.drawable.nr5, R.drawable.nr6
            };
        } else if (nombreArtista.equals("Marlene Dumas")) {
            images = new Integer[] {
                    R.drawable.md1, R.drawable.md2, R.drawable.md3,
                    R.drawable.md4, R.drawable.md5, R.drawable.md6
            };
        } else if (nombreArtista.equals("Chuck Close")) {
            images = new Integer[] {
                    R.drawable.cc1, R.drawable.cc2, R.drawable.cc3,
                    R.drawable.cc4, R.drawable.cc4, R.drawable.cc6
            };
        } else if (nombreArtista.equals("Gottfried Helnwein")) {
            images = new Integer[] {
                    R.drawable.gh1, R.drawable.gh2, R.drawable.gh3,
                    R.drawable.gh4, R.drawable.gh5, R.drawable.gh6
            };
        }else if (nombreArtista.equals("Pedro Campos")) {
            images = new Integer[] {
                    R.drawable.pc1, R.drawable.pc2, R.drawable.pc3,
                    R.drawable.pc4, R.drawable.pc5, R.drawable.pc6
            };
        }else if (nombreArtista.equals("Jason de Graaf")) {
            images = new Integer[] {
                    R.drawable.jg1, R.drawable.jg2, R.drawable.jg3,
                    R.drawable.jg4, R.drawable.jg5, R.drawable.jg6
            };
        }
    }

    private class SwipeImagePagerAdapter extends PagerAdapter {
        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object instantiateItem(ViewGroup collection, int position) {
            LayoutInflater inflater = (LayoutInflater) collection.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = inflater.inflate(R.layout.mostrar_obras, null);
            LinearLayout swipeDescription = view.findViewById(R.id.swipe_descripcion);

            ImageView imageView = view.findViewById(R.id.galeria_imagenes);
            imageView.setImageResource(images[position]);

            TextView imageDescription = view.findViewById(R.id.imagen_descripcion);
            imageDescription.setText(imagesDescriptions[position]);

            TextView btnVolver6 = view.findViewById(R.id.btnVolver6);

            btnVolver6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onBackPressed();
                }
            });
            TextView btnMenuPrincipal6 = view.findViewById(R.id.btnMenuPrincipal6);
            btnMenuPrincipal6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SwipeObrasActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            });
            Button infoButton = view.findViewById(R.id.infoButton);
            Button offerButton = view.findViewById(R.id.offerButton);

            infoButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(SwipeObrasActivity.this, InfoObra.class);
                    intent.putExtra("imageId", images[position]);
                    startActivity(intent);
                }
            });

            offerButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(SwipeObrasActivity.this, ofertaActivity.class);
                    intent.putExtra("imageId", images[position]);
                    startActivity(intent);
                }
            });

            collection.addView(view, 0);
            return view;
        }

        @Override
        public void destroyItem(ViewGroup collection, int position, Object view) {
            collection.removeView((View) view);
        }

        @Override
        public boolean isViewFromObject(View view, Object o) {
            return (view == o);
        }
    }
}

