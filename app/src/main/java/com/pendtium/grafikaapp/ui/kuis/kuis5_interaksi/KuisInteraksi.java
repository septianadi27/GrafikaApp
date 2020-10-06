package com.pendtium.grafikaapp.ui.kuis.kuis5_interaksi;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.pendtium.grafikaapp.MenuUtama;
import com.pendtium.grafikaapp.R;

public class KuisInteraksi extends AppCompatActivity {

    TextView pertanyaan, judul;
    RadioGroup rg;
    RadioButton PilA, PilB, PilC, PilD;
    ImageView imgKuis;
    ImageButton nxt;
    int nomor = 0;

    private long backPressedTime;

    public static int hasil, benar, salah;

    String[] nomor_urut = new String[]{
            "1", "2","3","4","5","6","7","8","9","10"

    };
    String[] pertanyaan_kuis = new String[]{
            "Grafika komputer merupakan?",
            "Grafika Interaktif modern ditemukan oleh ...",
            "Komponen dasar sistem grafik interaktif meliputi ...",
            "Mengembangkan teknik interaktif dengan sarana keyboard dan pena cahaya, proyek penelitian dan produk Computer Aided Design (CAD) telah muncul. Merupakan perkembangan grafika computer pada fase ke ...",
            "Berikut ini merupakan contoh perangkat lunak yang dikembangkan dalam aplikasi commercial art dan fine art",
            "Sistem interaktif grafik pertama, sketchpad ditemukan pada tahun ...",
            "Dibawah ini merupakan gambaran teknologi Cathode Ray Tube (CRT) sebagai berikut, Kecuali ...",
            "OpenGL rilis pada tahun ...",
            "Awalnya, OpenGL didesain untuk pemroraman Bahasa ...",
            "Fungsi dasar dari OpenGL adalah ..."

    };

    String[] pilihan_jawaban = new String[]{
            "Hardware dan software untuk membuat kecerdasan buatan","Hardware dan software untuk membuat sebuah website interaktif","Hardware dan software untuk melakukan proses exploit, hacking dan cracking","Hardware dan software untuk membuat gambar, grafik, atau citra untuk seni, game, foto dan animasi",
            "Ivan Sutherland","Frances Allen","Rosalind Picard","Butler Lapmson",
            "Masukan, Proses, Output","Masukan, Penyimpanan, Output","Masukan, Proses dan Penyimpanan, Output","Masukan, Proses, Output, Penyipanan",
            "Fase Pertama","Fase Kedua","Fase Ketiga","Fase Keempat",
            "Corel Draw, Autocad, Powerpoint","Adobe Photoshop, Adobe Premiere, Autocad","Corel Draw, Adobe Photoshop, Adobe Premiere","Paint, Powerpoint, Adobe Premiere",
            "1962","1963","1964","1966",
            "Refreshing, Solid, Resolution, Real, Pixel","Refreshing, Persistance, Resolution, Aspec ratio, Pixel","Clear, Solid, Resolution, Aspec ratio, Real","Refreshing, Real, Resolution, Aspec ratio, Pixel",
            "1990","1991","1992","1993",
            "Java","C/C++","Kotlin","Ruby",
            "Mengeluarkan koleksi perintah khusus atau executable ke system operasi","Menjadi standard dalam output grafik di semua sistem operasi","Mengeluarkan koleksi perintah aritmatika kompleks untuk diubah menjadi bentuk gambar","Menjadi standard dalam output grafik di Sebagian sistem operasi"
    };

    String[] jawaban_benar = new String[]{
            "Hardware dan software untuk membuat gambar, grafik, atau citra untuk seni, game, foto dan animasi",
            "Ivan Sutherland",
            "Masukan, Proses dan Penyimpanan, Output",
            "Fase Kedua",
            "Corel Draw, Adobe Photoshop, Adobe Premiere",
            "1963",
            "Refreshing, Persistance, Resolution, Aspec ratio, Pixel",
            "1992",
            "C/C++",
            "Mengeluarkan koleksi perintah khusus atau executable ke system operasi",
    };

    private static final Integer[] img ={
            R.drawable.line,
            R.drawable.line,
            R.drawable.line,
            R.drawable.line,
            R.drawable.line,
            R.drawable.line,
            R.drawable.line,
            R.drawable.line,
            R.drawable.line,
            R.drawable.line
    };

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis5_interaksi);

        judul = findViewById(R.id.jud);
        pertanyaan = findViewById(R.id.pertanyaan);
        nxt = findViewById(R.id.nxtbutton);
        nxt.setVisibility(View.GONE);
        rg = findViewById(R.id.radio_group);
        PilA = findViewById(R.id.pilihanA);
        PilB = findViewById(R.id.pilihanB);
        PilC = findViewById(R.id.pilihanC);
        PilD = findViewById(R.id.pilihanD);
        imgKuis = findViewById(R.id.imageView2);

        judul.setText(nomor_urut[nomor]+"/10");
        pertanyaan.setText(pertanyaan_kuis[nomor]);
        PilA.setText(pilihan_jawaban[0]);
        PilB.setText(pilihan_jawaban[1]);
        PilC.setText(pilihan_jawaban[2]);
        PilD.setText(pilihan_jawaban[3]);


        rg.check(0);
        benar = 0;
        salah = 0;
        nxt.setVisibility(View.GONE);
        nxt.animate().translationY(nxt.getHeight());


    }

    public void onRBClicked (View view){
        boolean isSelected = ((RadioButton)view).isChecked();
        switch (view.getId()){
            case R.id.pilihanA:
            case R.id.pilihanD:
            case R.id.pilihanB:
            case R.id.pilihanC:
                if (isSelected) {
                    nxt.setVisibility(View.VISIBLE);
                    nxt.animate().translationY(0);
                }else{
                    nxt.setVisibility(View.GONE);
                    nxt.animate().translationY(nxt.getHeight());
                }
                break;
        }
    }
    public void onBackPressed() {
        if(backPressedTime +2000 > System.currentTimeMillis()){
            finish();
            Intent backhome  = new Intent(getApplicationContext(), MenuUtama.class);
            startActivity(backhome);
        }else {
            Toast backToast = Toast.makeText(getBaseContext(), "Press back again to Main Menu", Toast.LENGTH_SHORT);
            backToast.show();
        }
        backPressedTime =System.currentTimeMillis();

    }

    @SuppressLint("SetTextI18n")
    public void next(View view){

        if (PilA.isChecked() || PilB.isChecked() || PilC.isChecked() || PilD.isChecked()) {

            RadioButton jawaban_user = findViewById(rg.getCheckedRadioButtonId());
            String ambil_jawaban_user = jawaban_user.getText().toString();

            rg.check(0);
            nxt.setVisibility(View.GONE);
            nxt.animate().translationY(nxt.getHeight());

            if (ambil_jawaban_user.equalsIgnoreCase(jawaban_benar[nomor])) benar++;
            else salah++;
            nomor++;

            if (nomor < pertanyaan_kuis.length) {
                judul.setText(nomor_urut[nomor] +"/10" );
                pertanyaan.setText(pertanyaan_kuis[nomor]);
                imgKuis.setImageResource(img[nomor]);
                PilA.setText(pilihan_jawaban[nomor * 4]);
                PilB.setText(pilihan_jawaban[(nomor * 4) + 1]);
                PilC.setText(pilihan_jawaban[(nomor * 4) + 2]);
                PilD.setText(pilihan_jawaban[(nomor * 4) + 3]);
            } else {
                hasil = benar * 10;
                Intent selesai = new Intent(getApplicationContext(), HasilKuisInteraksi.class);
                startActivity(selesai);
            }

        }
        else {
                Toast.makeText(this, "Pilih Terlebih dahulu", Toast.LENGTH_SHORT).show();
            }
    }

}