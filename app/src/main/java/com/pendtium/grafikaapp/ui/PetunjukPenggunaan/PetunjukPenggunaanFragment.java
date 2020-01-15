package com.pendtium.grafikaapp.ui.PetunjukPenggunaan;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.pendtium.grafikaapp.R;

public class PetunjukPenggunaanFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        Intent intent = new Intent(getActivity(), PetunjukIntroActivity.class);
        startActivity(intent);

        return inflater.inflate(R.layout.fragment_halaman_utama, container, false);
    }
}