package com.pendtium.grafikaapp.ui.informasi;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.pendtium.grafikaapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentInformasiPengembang extends Fragment {

    private Button b1, b2;

    public FragmentInformasiPengembang() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_informasi_pengembang, container, false);

        b1 = v.findViewById(R.id.buttonWhatsapp);
        b2 = v.findViewById(R.id.buttonMail);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number ="6285234158105&text=Saya%20ingin%20melaporkan%20error%20atau%20memberikan%20saran%20pada%20aplikasi%20GrafikaApp.";
                String url = "https://api.whatsapp.com/send?phone="+number;
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String subject = "Laporan Error/Saran GrafikaApp";
                String message = "Saya ingin melaporkan error atau memberikan saran pada aplikasi GrafikaApp.";
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto","septian.adipratama85@outlook.com", null));
                intent.putExtra(Intent.EXTRA_SUBJECT, subject);
                intent.putExtra(Intent.EXTRA_TEXT, message);
                startActivity(Intent.createChooser(intent, "Choose an Email client :"));
            }
        });

        return v;
    }

}
