package com.pendtium.grafikaapp.ui.pengantar;

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

public class PengantarFragment extends Fragment {

    private PengantarViewModel pengantarViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        pengantarViewModel =
                ViewModelProviders.of(this).get(PengantarViewModel.class);
        View root = inflater.inflate(R.layout.fragment_pengantar, container, false);
        final TextView textView = root.findViewById(R.id.text_pengantar);
        pengantarViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}