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
public class FragmentInformasiAplikasi extends Fragment {

    private Button b1;

    public FragmentInformasiAplikasi() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_informasi_aplikasi, container, false);

        b1 = v.findViewById(R.id.buttonGithub);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://github.com/septianadi27/GrafikaApp";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        return v;
    }

}
