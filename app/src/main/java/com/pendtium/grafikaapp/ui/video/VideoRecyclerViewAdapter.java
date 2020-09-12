package com.pendtium.grafikaapp.ui.video;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.pendtium.grafikaapp.R;

import java.util.List;

public class VideoRecyclerViewAdapter extends RecyclerView.Adapter<VideoRecyclerViewHolder> {

    //set tittle
    String[] subVideo = {"Pengenalan GLUT", "Primitive Objects dan Objek 2 Dimensi", "Transformasi dan Animasi Objek 2D", "Interaksi Keyboard", "Menggambar Objek 3D", "Implementasi Lighting pada Lorong 3D", "Texture Mapping pada Bangun 3D"};
    private List<Data> dataList;
    VideoFragment context;
    LayoutInflater inflater;

    public VideoRecyclerViewAdapter(VideoFragment context, List<Data> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    //set set holder from base
    @Override
    public VideoRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.base_layout_video, parent, false);
        return new VideoRecyclerViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final VideoRecyclerViewHolder holder, int position) {

        Data data = dataList.get(position);
        holder.deskripsi.setText(data.getTitle());
        Glide.with(context).load(data.getImageId()).into(holder.icon);
        holder.video.setText(subVideo[position]);
        holder.video.setTag(holder);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
