package com.pendtium.grafikaapp.ui.kuis.kuis6_threedimension;

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

public class KuisThreeDimension extends AppCompatActivity {

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
            "Grafik 3 dimensi merupakan teknik penggambaran yang berpatokan pada?",
            "Perbedaan dari objek 2 dimensi dan 3 dimensi adalah ...",
            "Sebutkan sistem koordinat pada objek 3 dimensi!",
            "Sistem koordinat tangan kanan dapat digambarkan dengan 3 buah jari yaitu ...",
            "Untuk memanggil fungsi reshape yaitu dengan cara menambahkan fungsi ...",
            "Implementasi dari objek 3D berupa kerangka benda yang berpusat pada asal pemodelan sistem koordinat disebut ...",
            "Berikut ini beberapa bentuk primitive dari objek 3 dimensi, kecuali ...",
            "Apa fungsi parameter nilai pada setiap primitive 3 dimensi?",
            "Pembuatan kubus dapat dilakukan dengan menggunakan fungsi?",
            "Parameter fungsi radius pada pembuatan bola berfungsi ..."

    };

    String[] pilihan_jawaban = new String[]{
            "Titik koordinat sumbu x, y, dan z","Titik koordinat sumbu y dan z","Titik koordinat sumbu x dan y","Titik koordinat sumbu x dan z",
            "Ketinggian","Luas","Kedalaman","Lebar",
            "Sistem koordinat tangan kiri dan kanan","Sistem koordinat lengan atas dan bawah","Sistem koordinat depan dan kanan","Sistem koordinat kiri dan atas",
            "Jari tengah sebagai sumbu x, jari telunjuk sebagai sumbu z dan ibu jari sebagai sumbu y","Jari tengah sebagai sumbu z, jari telunjuk sebagai sumbu x dan ibu jari sebagai sumbu y","Jari tengah sebagai sumbu z, jari telunjuk sebagai sumbu y dan ibu jari sebagai sumbu x","Jari tengah sebagai sumbu y, jari telunjuk sebagai sumbu z dan ibu jari sebagai sumbu x",
            "glutReshapeFunc","glutWireCone","glutWireSphere","glutReshapeSphere",
            "Fungsi reshape","Fungsi sphere","Fungsi cube","Fungsi wire",
            "Sphere","Triangle","Cube","Tetrahedron",
            "Untuk mendefinisikan bentuk dasar secara matematik","Untuk mengekspresikan letak dan bentuk primitive objek tersebut","Untuk menentukan seberapa jauh primitive objek","Untuk menentukan koordinat pada primitive objek",
            "Void glutWireCone(GLdouble base);","Void glutWireDodecahedron(void);","Void glutWireCube(void);","Void glutWireCube(GLdouble size);",
            "Sebagai ukuran besar kecilnya diameter bola","Menentukan berapa banyak potongan dari kutub ke kutub","Menentukan banyaknya potongan yang tegak lurus dengan slices","Menentukan koordinat objek"
    };

    String[] jawaban_benar = new String[]{
            "Titik koordinat sumbu x, y, dan z",
            "Kedalaman",
            "Sistem koordinat tangan kiri dan kanan",
            "Jari tengah sebagai sumbu z, jari telunjuk sebagai sumbu y dan ibu jari sebagai sumbu x",
            "glutReshapeFunc",
            "Fungsi wire",
            "Triangle",
            "Untuk mengekspresikan letak dan bentuk primitive objek tersebut",
            "Void glutWireCube(GLdouble size);",
            "Sebagai ukuran besar kecilnya diameter bola",
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
        setContentView(R.layout.activity_kuis6_object3d);

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
                Intent selesai = new Intent(getApplicationContext(), HasilKuisThreeDimension.class);
                startActivity(selesai);
            }

        }
        else {
                Toast.makeText(this, "Pilih Terlebih dahulu", Toast.LENGTH_SHORT).show();
            }
    }

}