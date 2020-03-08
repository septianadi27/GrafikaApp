package com.pendtium.grafikaapp.ui.materi.Materi2Primitive;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.github.chrisbanes.photoview.PhotoView;
import com.pendtium.grafikaapp.R;

public class DefinisiFragment extends Fragment {

    public DefinisiFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.materi2_fragment_definisi, container, false);

        PhotoView photoView = (PhotoView) root.findViewById(R.id.photo_view1);
        photoView.setImageResource(R.drawable.opengl_coordinate);

        // Inflate the layout for this fragment
        return root;
    }

}
