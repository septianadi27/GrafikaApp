package com.pendtium.grafikaapp.ui.kuis;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pendtium.grafikaapp.R;

import java.util.List;


public class KuisAdapter extends RecyclerView.Adapter<KuisViewModel> {
    KuisFragment context;
    private List<Kuis> mData;

    public KuisAdapter(KuisFragment context, List<Kuis> mData) {
        this.context =  context;
        this.mData = mData;
    }
    @NonNull
    @Override
    public KuisViewModel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_kuis, parent, false);
        return new KuisViewModel(v);
    }

    @Override
    public void onBindViewHolder(@NonNull KuisViewModel holder, int position) {
        holder.kuis_title.setText(mData.get(position).getTitle());
        holder.img_thumbnail.setImageResource(mData.get(position).getThumbnail());
        holder.img_two.setImageResource(mData.get(position).getThumbnail2());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


}
