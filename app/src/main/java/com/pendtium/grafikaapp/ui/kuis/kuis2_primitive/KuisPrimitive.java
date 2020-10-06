package com.pendtium.grafikaapp.ui.kuis.kuis2_primitive;

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

public class KuisPrimitive extends AppCompatActivity {

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
            "Apa yang anda ketahui tentang primitive objek?",
            "Yang bukan contoh primitive objek grafika dasar yaitu ...",
            "Untuk mengatur ukuran kanvas sesuai dengan apa yang kita inginkan digunakan fungsi ...",
            "Sintax dibawah ini mendefinisikan ...",
            "Apa maksud dari fungsi dasar penggunaan titik glVertex2f (x,y)?",
            "Kumpulan titik-titik yang tersusun sedemikian rupa sehingga memiliki pangkal dan ujung disebut ...",
            "Fungsi pada grafika komputer yang menghasilkan output objek berupa sebuah titik yaitu ...",
            "Fungsi pada grafika komputer yang menghasilkan output objek berupa garis terhubung penuh (tertutup) yaitu ...",
            "Fungsi dari glPointSize(int size) adalah ...",
            "Fungsi dari glLineWidth(int value) adalah ..."

    };

    String[] pilihan_jawaban = new String[]{
            "Bentuk objek dasar dari pembentukan objek lain yang lebih kompleks dari objek primitive","Bentuk objek dasar dari pembentukan objek lain yang kurang kompleks dari objek primitive","Bentuk objek dasar dari pembentukan titik yang lebih kompleks dari objek primitive","Bentuk objek dasar dari pembentukan titik lain yang kurang kompleks dari objek primitive",
            "Kurva","Titik","Squads","Text",
            "glLineWidth","glPointSize","gluCreateWindow","gluOrtho2D",
            "Besarnya sistem koordinat dengan range sumbu x adalah (-320,320) dan range sumbu y adalah (-240,240)","Besarnya sistem koordinat dengan range sumbu x adalah (-320,-240) dan range sumbu y adalah (320,240)","Besarnya sistem koordinat dengan range sumbu x adalah (-320,240) dan range sumbu y adalah (320,-240)","Besarnya sistem koordinat dengan range sumbu x adalah (320,-320) dan range sumbu y adalah (240,-240)",
            "Menggambar titik pada koordinat x dan y, dengan nilai integer","Menggambar titik pada koordinat x dan y, dengan nilai float","Menggambar titik pada koordinat x dan y, dengan nilai double","Menggambar titik pada koordinat x dan y, dengan nilai decimal",
            "Pixel","Garis","Resolusi","Vector",
            "GL_LINES","GL_LINES_STRIP","GL_LINES_LOOP","GL_POINT",
            "GL_LINES","GL_LINES_STRIP","GL_LINES_LOOP","GL_POINT",
            "Suatu fungsi yang berfungsi untuk mengatur besarnya suatu objek","Suatu fungsi yang berfungsi untuk mengatur besarnya suatu garis","Suatu fungsi yang berfungsi untuk mengatur tebalnya garis","Suatu fungsi yang berfungsi untuk mengatur tebalnya objek",
            "Suatu fungsi yang berfungsi untuk mengatur besarnya suatu objek","Suatu fungsi yang berfungsi untuk mengatur besarnya suatu garis","Suatu fungsi yang berfungsi untuk mengatur tebalnya garis","Suatu fungsi yang berfungsi untuk mengatur tebalnya objek"
    };

    String[] jawaban_benar = new String[]{
            "Bentuk objek dasar dari pembentukan objek lain yang lebih kompleks dari objek primitive",
            "Squads",
            "gluOrtho2D",
            "Besarnya sistem koordinat dengan range sumbu x adalah (-320,320) dan range sumbu y adalah (-240,240)",
            "Menggambar titik pada koordinat x dan y, dengan nilai float",
            "Pixel",
            "GL_POINT",
            "GL_LINES_LOOP",
            "Suatu fungsi yang berfungsi untuk mengatur besarnya suatu objek",
            "Suatu fungsi yang berfungsi untuk mengatur tebalnya garis"
    };

    private static final Integer[] img ={
            R.drawable.line,
            R.drawable.line,
            R.drawable.line,
            R.drawable.soal1,
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
        setContentView(R.layout.activity_kuis2_primitive);

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
                Intent selesai = new Intent(getApplicationContext(), HasilKuisPrimitive.class);
                startActivity(selesai);
            }

        }
        else {
                Toast.makeText(this, "Pilih Terlebih dahulu", Toast.LENGTH_SHORT).show();
            }
    }

}