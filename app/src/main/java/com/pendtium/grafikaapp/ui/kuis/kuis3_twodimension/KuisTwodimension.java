package com.pendtium.grafikaapp.ui.kuis.kuis3_twodimension;

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

public class KuisTwodimension extends AppCompatActivity {

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
            "Yang dimaksud vertex dalam Objek 2D adalah ...",
            "Syarat untuk dapat membentuk objek 2D adalah ...",
            "Diketahui sebuah titik pembentuk segitiga (-100, 100), maka titik-titik untuk membentuk segitiga siku-siku adalah ...",
            "Sebuah polygon dapat dibuat dengan syarat ...",
            "Segitiga yg bergabung pada 2 titik terakhir pada segitiga sebelumnya adalah implementasi dari fungsi ...",
            "Fungsi pada grafika komputer yang menghasilkan output berupa  segi empat dideklarasikan dengan ...",
            "Jumlah vertex yang dibutuhkan untuk menghasilkan output berupa segi empat adalah ...",
            "Titik pembentuk trapesium berikut yang benar adalah ...",
            "Fungsi pada grafika komputer yang menghasilkan objek dengan sisi sembarang adalah ...",
            "Untuk memberi warna pada objek menggunakan fungsi ..."

    };

    String[] pilihan_jawaban = new String[]{
            "Titik pembentuk sisi","Titik pertemuan tiap dua sisi","Titik-titik pada objek 2D","Titik ujung objek 2D",
            "Terdiri dari 1 titik dan 1 garis","Berpatokan pada 3 titik koordinat sumbu x, y, z","Terdapat 2 vertex","Terdapat lebih dari 2 vertex",
            "(0,100), (0,0)","(-100,-100), (100,0)","(0,100), (100,0)","(100,-100), (100,0)",
            "Ada lebih dari 1 vertex","Kurang dari 1 vertex","Ada lebih dari 2 vertex","Kurang dari 2 vertex",
            "#define GL_TRIANGEL","#define GL_TRIANGLE_STRIP","#define GL_TRIANGLE_FAN","#define GL_POLYGON",
            "GL_QUADS","GL_SQUARE","GL_RECTANGULAR","GL_STRIP",
            "8 vertex","6 vertex","4 vertex","2 vertex",
            "(-5,5), (5,5), (5,-5), (-5,-5)","(-5,5), (10,5), (5,-5), (-10,-5)","(-5,5), (5,5), (10,-5), (-10,-5)","(5,5), (10,-5), (-5,-5), (-10,5)",
            "Polygon","Triangle","Regtangular","Quads",
            "glcolor3a(0.,0.,0.,)","glcolor3c(0.,0.,0.,)","glcolor3e(0.,0.,0.,)","glcolor3f(0.,0.,0.,)"

    };

    String[] jawaban_benar = new String[]{
            "Titik pertemuan tiap dua sisi",
            "Terdapat lebih dari 2 vertex",
            "(0,100), (0,0)",
            "Ada lebih dari 2 vertex",
            "#define GL_TRIANGLE_STRIP",
            "GL_QUADS",
            "4 vertex",
            "(-5,5), (5,5), (10,-5), (-10,-5)",
            "Polygon",
            "glcolor3f(0.,0.,0.,)"
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
        setContentView(R.layout.activity_kuis3_object2d);

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
                judul.setText(nomor_urut[nomor] +"/10" );
                pertanyaan.setText(pertanyaan_kuis[nomor]);
                imgKuis.setImageResource(img[nomor]);
                PilA.setText(pilihan_jawaban[nomor * 4]);
                PilB.setText(pilihan_jawaban[(nomor * 4) + 1]);
                PilC.setText(pilihan_jawaban[(nomor * 4) + 2]);
                PilD.setText(pilihan_jawaban[(nomor * 4) + 3]);
            } else {
                hasil = benar * 10;
                Intent selesai = new Intent(getApplicationContext(), HasilKuisTwodimension.class);
                startActivity(selesai);
            }

        }
        else {
                Toast.makeText(this, "Pilih Terlebih dahulu", Toast.LENGTH_SHORT).show();
            }
    }

}