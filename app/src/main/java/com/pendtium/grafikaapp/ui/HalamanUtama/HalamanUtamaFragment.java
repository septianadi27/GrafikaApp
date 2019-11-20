package com.pendtium.grafikaapp.ui.HalamanUtama;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;
import com.pendtium.grafikaapp.R;

public class HalamanUtamaFragment extends Fragment implements View.OnClickListener {

    public ExpandableRelativeLayout mExpandLayout;
    public ExpandableRelativeLayout mExpandLayout1;
    public LinearLayout linearLayout;
    public LinearLayout linearLayout1;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_halaman_utama, container, false);

        mExpandLayout = (ExpandableRelativeLayout) root.findViewById(R.id.expandableTujuan);
        mExpandLayout1 = (ExpandableRelativeLayout) root.findViewById(R.id.expandableDefinisi);

        linearLayout = (LinearLayout) root.findViewById(R.id.laytujuan);
        linearLayout1 = (LinearLayout) root.findViewById(R.id.layDefinisi);

        linearLayout.setOnClickListener(this);
        linearLayout1.setOnClickListener(this);

        return root;
    }

    public void onClick(final View v) {
        switch (v.getId()) {
            case R.id.laytujuan:
                mExpandLayout.toggle();
                break;
            case R.id.layDefinisi:
                mExpandLayout1.toggle();
                break;
        }
    }
}