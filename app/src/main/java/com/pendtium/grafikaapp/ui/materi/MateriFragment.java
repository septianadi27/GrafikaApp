package com.pendtium.grafikaapp.ui.materi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.github.chrisbanes.photoview.PhotoViewAttacher;
import com.pendtium.grafikaapp.R;

import java.util.ArrayList;
import java.util.List;

public class MateriFragment extends Fragment {

    private RecyclerView recyclerView;
    private MateriRecyclerViewAdapter adapter;
    private List<Data> dataList;
    ImageView imageView;
    PhotoViewAttacher photoViewAttacher;
    ArrayList<String> dataSet;
    private ScrollView scrollView;

    public MateriFragment newInstance() {
        MateriFragment fragment = new MateriFragment();
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState){super.onCreate(savedInstanceState);}

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_materi, container, false);

        dataList = new ArrayList<>();
        adapter = new MateriRecyclerViewAdapter(this, dataList);
        recyclerView = (RecyclerView) root.findViewById(R.id.recylerview_photos);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));

        MateriRecyclerViewAdapter adapter = new MateriRecyclerViewAdapter(this, dataList);

        recyclerView.setAdapter(adapter);
        data();

        return root;
    }

    //set picture menu
    private void data(){
        int[] imageIcon = new int[]{
                R.drawable.pengantar,
                R.drawable.primitive,
                R.drawable.twodimension,
                R.drawable.transform,
                R.drawable.interact,
                R.drawable.threedimension
        };

        //set description menu
        Data data = new Data("Berisi informasi seputar Pengantar Grafika Komputer ...", imageIcon[0]);
        dataList.add(data);

        data = new Data("Primitif objek merupakan salah satu subbab dari grafika komputer ...", imageIcon[1]);
        dataList.add(data);

        data = new Data("Grafik komputer 2 dimensi biasa disebut 2D adalah bentuk dari benda ...", imageIcon[2]);
        dataList.add(data);

        data = new Data("Pemodifikasian objek dilakukan dengan operasi transformasi ...", imageIcon[3]);
        dataList.add(data);

        data = new Data("Interaksi dapat dilakukan dengan berbagai cara, diantaranya  ... ", imageIcon[4]);
        dataList.add(data);

        data = new Data("Grafik komputer 3 dimensi biasa disebut 3D adalah bentuk dari benda ...", imageIcon[5]);
        dataList.add(data);

        adapter.notifyDataSetChanged();
    }
}