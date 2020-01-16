package com.pendtium.grafikaapp.ui.materi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.pendtium.grafikaapp.R;

import java.util.List;

public class MateriRecyclerViewAdapter extends RecyclerView.Adapter<MateriRecyclerViewHolder> {

    //set tittle
    String[] subMateri = {"Materi 1", "Materi 2", "Materi 3", "Materi 4", "Materi 5"};
    private List<Data> dataList;
    MateriFragment context;
    LayoutInflater inflater;

    public MateriRecyclerViewAdapter(MateriFragment context, List<Data> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    //set set holder from base
    @Override
    public MateriRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.base_layout_materi, parent, false);
        return new MateriRecyclerViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final MateriRecyclerViewHolder holder, int position) {

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
