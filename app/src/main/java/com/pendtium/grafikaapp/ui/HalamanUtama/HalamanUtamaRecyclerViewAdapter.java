package com.pendtium.grafikaapp.ui.HalamanUtama;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.pendtium.grafikaapp.R;

import java.util.List;

public class HalamanUtamaRecyclerViewAdapter extends RecyclerView.Adapter<HalamanUtamaRecyclerViewHolder> {

    //set tittle
    String[] subMateri = {"Pengantar Grafikom", "Primitive Object", "Object 2D", "Transformasi", "Interaksi", "Object 3D"};
    private List<Data> dataList;
    HalamanUtamaFragment context;
    LayoutInflater inflater;

    public HalamanUtamaRecyclerViewAdapter(HalamanUtamaFragment context, List<Data> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    //set set holder from base
    @Override
    public HalamanUtamaRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.base_layout_home, parent, false);
        return new HalamanUtamaRecyclerViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final HalamanUtamaRecyclerViewHolder holder, int position) {

        Data data = dataList.get(position);
        holder.deskripsi.setText(data.getTitle());
        Glide.with(context).load(data.getImageId()).into(holder.icon);
        holder.materi.setText(subMateri[position]);
        holder.materi.setTag(holder);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
