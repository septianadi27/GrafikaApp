package com.pendtium.grafikaapp.ui.kuis.kuis4_transformasi;

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

public class KuisTransformasi extends AppCompatActivity {

    TextView pertanyaan, judul;
    RadioGroup rg;
    RadioButton PilA, PilB, PilC, PilD;
    ImageView imgKuis;
    ImageButton nxt;
    int nomor = 0;

    private long backPressedTime;

    public static int hasil, benar, salah;

    String[] nomor_urut = new String[]{
            "1", "2","3","4","5"

    };
    String[] pertanyaan_kuis = new String[]{
            "Berikut merupakan beberapa contoh dari transformasi, kecuali ...",
            "Tujuan dari transformasi geometri adalah ...",
            "Berikut ini merupakan fungsi dasar transformasi, kecuali ...",
            "Fungsi dari glutTimerFunc adalah ...",
            "Fungsi dari glutPostRedisplay adalah ..."

    };

    String[] pilihan_jawaban = new String[]{
            "Translasi, Skala, Rotasi","Skala, Rotasi, Shearing","Rotasi, Shearing, Gabungan","Shearing, Duplicate, Gabungan",
            "Memindahkan satu atau beberapa objek dari satu tempat ke tepat yang lain","Membantu mempermudah untuk membuat gambar","Membantu mempermudah untuk membuat kurva","Menyalin satu atau beberapa objek dari satu tempat ke tepat yang lain",
            "glTranslated, glTranslatef","glRotated, glRotatef","glScaled, glScalef","glFusiond,glFusionf",
            "Membuat animasi yang dapat dikontrol berdasarkan waktu","Memberi waktu pada program hingga selesai","Membuat animasi berhenti ketika waktu telah habis","Membuat waktu mundur pada program dan berakhir Ketika waktu habis",
            "Mengirimkan perintah untuk melakukan pemindahan objek","Mengirimkan perintah untuk mengaktifkan display secara berkala","Mengirimkan perintah untuk mereset display","Mengirimkan perintah untuk mengaktifkan layar"

    };

    String[] jawaban_benar = new String[]{
            "Shearing, Duplicate, Gabungan",
            "Memindahkan satu atau beberapa objek dari satu tempat ke tepat yang lain",
            "glFusiond,glFusionf",
            "Membuat animasi yang dapat dikontrol berdasarkan waktu",
            "Mengirimkan perintah untuk mengaktifkan display secara berkala",

    };

    private static final Integer[] img ={
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
        setContentView(R.layout.activity_kuis4_transformasi);

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

        judul.setText(nomor_urut[nomor]+"/5");
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
                judul.setText(nomor_urut[nomor] +"/5" );
                pertanyaan.setText(pertanyaan_kuis[nomor]);
                imgKuis.setImageResource(img[nomor]);
                PilA.setText(pilihan_jawaban[nomor * 4]);
                PilB.setText(pilihan_jawaban[(nomor * 4) + 1]);
                PilC.setText(pilihan_jawaban[(nomor * 4) + 2]);
                PilD.setText(pilihan_jawaban[(nomor * 4) + 3]);
            } else {
                hasil = benar * 20;
                Intent selesai = new Intent(getApplicationContext(), HasilKuisTransformasi.class);
                startActivity(selesai);
            }

        }
        else {
                Toast.makeText(this, "Pilih Terlebih dahulu", Toast.LENGTH_SHORT).show();
            }
    }

}