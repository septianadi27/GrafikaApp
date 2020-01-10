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
    private void data(){
        int[] imageIcon = new int[]{
                R.drawable.github,
                R.drawable.github,
                R.drawable.github,
                R.drawable.github,
                R.drawable.github
        };

        Data data = new Data("Isi Materi 1 lorem ipsum dimsum lorem ipsum dimsum lorem ipsum dimsum lorem ipsum dimsum lorem ipsum dimsum", imageIcon[0]);
        dataList.add(data);

        data = new Data("Isi Materi 2 lorem ipsum dimsum lorem ipsum dimsum lorem ipsum dimsum lorem ipsum dimsum lorem ipsum dimsum", imageIcon[1]);
        dataList.add(data);

        data = new Data("Isi Materi 3 lorem ipsum dimsum lorem ipsum dimsum lorem ipsum dimsum lorem ipsum dimsum lorem ipsum dimsum", imageIcon[2]);
        dataList.add(data);

        data = new Data("Isi Materi 4 lorem ipsum dimsum lorem ipsum dimsum lorem ipsum dimsum lorem ipsum dimsum lorem ipsum dimsum", imageIcon[3]);
        dataList.add(data);

        data = new Data("Isi Materi 5 lorem ipsum dimsum lorem ipsum dimsum lorem ipsum dimsum lorem ipsum dimsum lorem ipsum dimsum", imageIcon[4]);
        dataList.add(data);

        adapter.notifyDataSetChanged();
    }
}