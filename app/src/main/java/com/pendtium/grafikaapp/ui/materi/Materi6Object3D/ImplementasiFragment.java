package com.pendtium.grafikaapp.ui.materi.Materi6Object3D;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.pendtium.grafikaapp.R;

public class ImplementasiFragment extends Fragment {

    public ImplementasiFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.materi6_fragment_implementasi, container, false);
    }

}

