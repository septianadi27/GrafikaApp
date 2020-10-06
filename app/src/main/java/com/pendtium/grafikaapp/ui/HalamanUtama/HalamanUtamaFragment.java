package com.pendtium.grafikaapp.ui.HalamanUtama;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.github.chrisbanes.photoview.PhotoViewAttacher;
import com.pendtium.grafikaapp.R;

import java.util.ArrayList;
import java.util.List;

public class HalamanUtamaFragment extends Fragment {

    private RecyclerView recyclerView;
    private HalamanUtamaRecyclerViewAdapter adapter;
    private List<Data> dataList;
    ImageView imageView;
    PhotoViewAttacher photoViewAttacher;
    ArrayList<String> dataSet;
    private ScrollView scrollView;

    public HalamanUtamaFragment newInstance() {
        HalamanUtamaFragment fragment = new HalamanUtamaFragment();
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState){super.onCreate(savedInstanceState);}

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_halaman_utama, container, false);

        dataList = new ArrayList<>();
        adapter = new HalamanUtamaRecyclerViewAdapter(this, dataList);
        recyclerView = (RecyclerView) root.findViewById(R.id.recylerview_photos);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),3));

        HalamanUtamaRecyclerViewAdapter adapter = new HalamanUtamaRecyclerViewAdapter(this, dataList);

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
        Data data = new Data("", imageIcon[0]);
        dataList.add(data);

        data = new Data("", imageIcon[1]);
        dataList.add(data);

        data = new Data("", imageIcon[2]);
        dataList.add(data);

        data = new Data("", imageIcon[3]);
        dataList.add(data);

        data = new Data("", imageIcon[4]);
        dataList.add(data);

        data = new Data("", imageIcon[5]);
        dataList.add(data);

        adapter.notifyDataSetChanged();
    }
}