package com.pendtium.grafikaapp.ui.kuis.kuis6_threedimension;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;

import com.pendtium.grafikaapp.MenuUtama;
import com.pendtium.grafikaapp.R;

public class HasilKuisThreeDimension extends Activity {

    private long backPressedTime;
    private Toast backToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_kuis);

        TextView hasil = findViewById(R.id.hasil);
        TextView nilai = findViewById(R.id.nilai);
        ImageView image = findViewById(R.id.imageView5);


        hasil.setText("Jawaban Benar : "+ KuisThreeDimension.benar+"\n Jawaban Salah : " + KuisThreeDimension.salah);
        nilai.setText(""+ KuisThreeDimension.hasil);
        if (KuisThreeDimension.hasil >= 70){
            image.setImageResource(R.drawable.happy_face);
        }else {
            image.setImageResource(R.drawable.sad_face);
        }
    }

    public void onBackPressed() {
        if(backPressedTime +2000 > System.currentTimeMillis()){
            finish();
            Intent backhome  = new Intent(getApplicationContext(), MenuUtama.class);
            startActivity(backhome);
        }else {
            backToast = Toast.makeText(getBaseContext(),"Press back again to Main Menu", Toast.LENGTH_SHORT);
            backToast.show();
        }
        backPressedTime =System.currentTimeMillis();

    }

    public void ulangi(View view){
        AlertDialog.Builder dial = new AlertDialog.Builder(this);
        dial.setMessage("Ulangi Kuis?")
                .setPositiveButton("Ya", (dialog, which) -> {
                    finish();
                    Intent i = new Intent(getApplicationContext(), KuisThreeDimension.class);
                    startActivity(i);
                })
                .setNegativeButton("Tidak", (dialog, which) -> dialog.cancel());
        dial.create();
        dial.show();
    }
    public void kuis(View view){
        finish();
        Intent i = new Intent(getApplicationContext(), MenuUtama.class);
        startActivity(i);

    }
}


