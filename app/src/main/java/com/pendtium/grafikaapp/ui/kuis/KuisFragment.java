package com.pendtium.grafikaapp.ui.kuis;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.pendtium.grafikaapp.R;

import java.util.ArrayList;
import java.util.List;

public class KuisFragment extends Fragment {

    private KuisViewModel kuisViewModel;
    private RecyclerView rv;
    private KuisAdapter adapter;
    private List<Kuis> lstKuis;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_kuis, container, false);

        lstKuis = new ArrayList<>();
        adapter = new KuisAdapter(this, lstKuis);
        rv = root.findViewById(R.id.rv_idkuis);
        rv.setLayoutManager(new GridLayoutManager(getContext(),1));

        KuisAdapter adapter = new KuisAdapter(this, lstKuis);

        rv.setAdapter(adapter);
        lstKuis.add(new Kuis("Pengantar Grafika", R.drawable.next, R.drawable.one));
        lstKuis.add(new Kuis("Primitive Object", R.drawable.next, R.drawable.two));
        lstKuis.add(new Kuis("Object 2D", R.drawable.next, R.drawable.three));
        lstKuis.add(new Kuis("Transformasi", R.drawable.next, R.drawable.four));
        lstKuis.add(new Kuis("Interaksi", R.drawable.next, R.drawable.five));
        lstKuis.add(new Kuis("Object 3D", R.drawable.next, R.drawable.six));

        return root;
    }
}
