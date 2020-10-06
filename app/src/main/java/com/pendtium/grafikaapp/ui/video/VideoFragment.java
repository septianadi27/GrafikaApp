package com.pendtium.grafikaapp.ui.video;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.github.chrisbanes.photoview.PhotoViewAttacher;
import com.pendtium.grafikaapp.R;

import java.util.ArrayList;
import java.util.List;

public class VideoFragment extends Fragment {

    private RecyclerView recyclerView;
    private VideoRecyclerViewAdapter adapter;
    private List<Data> dataList;
    ImageView imageView;
    PhotoViewAttacher photoViewAttacher;
    ArrayList<String> dataSet;
    private ScrollView scrollView;

    public VideoFragment newInstance() {
        VideoFragment fragment = new VideoFragment();
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState){super.onCreate(savedInstanceState);}

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_video, container, false);

        dataList = new ArrayList<>();
        adapter = new VideoRecyclerViewAdapter(this, dataList);
        recyclerView = (RecyclerView) root.findViewById(R.id.recylerview_photos);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));

        VideoRecyclerViewAdapter adapter = new VideoRecyclerViewAdapter(this, dataList);

        recyclerView.setAdapter(adapter);
        data();

        return root;
    }

    //set picture menu
    private void data(){
        int[] imageIcon = new int[]{
                R.drawable.pengantar,
                R.drawable.twodimension,
                R.drawable.transform,
                R.drawable.interact,
                R.drawable.threedimension,
                R.drawable.lighting,
                R.drawable.texture
        };

        //set description menu
        Data data = new Data("Dalam video ini berisi materi mengenai pengenalan GLUT (GL Utility Toolkit) Merupakan pengembangan dari openGL yang didesain untuk aplikasi dengan level kecil hingga menengah.", imageIcon[0]);
        dataList.add(data);

        data = new Data("Dalam video ini berisi materi mengenai Primitive Objek dan Objek 2 Dimensi. Di sini akan dijelaskan bagaimana kita bisa menggambar objek 2D dengan library freeglut.", imageIcon[1]);
        dataList.add(data);

        data = new Data("Dalam video ini berisi mengenai Transformasi dan Animasi Objek 2D. Di sini akan dijelaskan bagaimana kita bisa membuat animasi dan mengatur FPS.", imageIcon[2]);
        dataList.add(data);

        data = new Data("Dalam video ini berisi mengenai Interaksi Keyboard. Di sini akan dijelaskan bagaimana kita bisa membuat animasi dan mengontrolnya melalui keyboard.", imageIcon[3]);
        dataList.add(data);

        data = new Data("Dalam video ini berisi mengenai Objek 3D. Di sini akan dijelaskan bagaimana cara kerja objek 3D dan proses pembuatan rumah dan manusia salju.", imageIcon[4]);
        dataList.add(data);

        data = new Data("Dalam video ini berisi  mengenai Lighting. Di sini akan dijelaskan bagaimana cara kerja lighting pada objek 3D.", imageIcon[5]);
        dataList.add(data);

        data = new Data("Dalam video ini berisi mengenai Texture Mapping. Di sini akan dijelaskan bagaimana cara melakukan texture mapping pada objek 3D.", imageIcon[6]);
        dataList.add(data);

        adapter.notifyDataSetChanged();
    }
}