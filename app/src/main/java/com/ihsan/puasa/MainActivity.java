package com.ihsan.puasa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listpuasa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listpuasa = findViewById(R.id.listPuasa);


        listpuasa.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // mememanggil int dri public void yan defaulfnya biasanya i
                if (position == 0) {
                    Intent seninKamis = new Intent(MainActivity.this, Deskripsi.class);
                    seninKamis.putExtra("posisi", position);
                    seninKamis.putExtra("link", "http://www.almunawwar.net/manfaat-puasa-senin-kamis/");
                    startActivity(seninKamis);
                } else if (position == 1) {
                    Intent Daud = new Intent(MainActivity.this, Deskripsi.class);
                    Daud.putExtra("posisi", position);
                    Daud.putExtra("link", "https://muslim.or.id/17877-puasa-daud-sebaik-baiknya-puasa.html");
                    startActivity(Daud);
                } else if (position == 2) {
                    Intent Arofah = new Intent(MainActivity.this, Deskripsi.class);
                    Arofah.putExtra("posisi", position);
                    Arofah.putExtra("link", "https://muslim.or.id/18509-keutamaan-puasa-arafah.html");
                    startActivity(Arofah);
                }else if (position == 3) {
                    Intent Asysyuro = new Intent(MainActivity.this, Deskripsi.class);
                    Asysyuro.putExtra("posisi", position);
                    Asysyuro.putExtra("link", "https://muslim.or.id/23090-keutamaan-puasa-asyura-dan-sejarahnya.html");
                    startActivity(Asysyuro);
                }else if (position == 4) {
                    Intent Syaban = new Intent(MainActivity.this, Deskripsi.class);
                    Syaban.putExtra("posisi", position);
                    Syaban.putExtra("link", "https://muslim.or.id/15917-anjuran-puasa-syaban.html");
                    startActivity(Syaban);
                }else if (position == 5) {
                    Intent Syawal = new Intent(MainActivity.this, Deskripsi.class);
                    Syawal.putExtra("posisi", position);
                    Syawal.putExtra("link", "https://muslim.or.id/17782-tata-cara-puasa-syawal.html");
                    startActivity(Syawal);
                }else if (position == 6) {
                    Intent Bidh = new Intent(MainActivity.this, Deskripsi.class);
                    Bidh.putExtra("posisi", position);
                    Bidh.putExtra("link", "https://muslim.or.id/17851-puasa-tiga-hari-setiap-bulan-dan-puasa-ayyamul-bidh.html");
                    startActivity(Bidh);
                }




            }
        });
    }
}
