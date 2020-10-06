package com.pendtium.grafikaapp.ui.HalamanUtama;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import com.pendtium.grafikaapp.R;
import com.pendtium.grafikaapp.ui.materi.Materi1TabsActivity;
import com.pendtium.grafikaapp.ui.materi.Materi2TabsActivity;
import com.pendtium.grafikaapp.ui.materi.Materi3TabsActivity;
import com.pendtium.grafikaapp.ui.materi.Materi4TabsActivity;
import com.pendtium.grafikaapp.ui.materi.Materi5TabsActivity;
import com.pendtium.grafikaapp.ui.materi.Materi6TabsActivity;

public class HalamanUtamaRecyclerViewHolder extends RecyclerView.ViewHolder {
    public TextView materi, titleMateri, deskripsi;
    public ImageView icon;
    public LinearLayout itemList;
    Context context;
    Toolbar toolbar;

    public HalamanUtamaRecyclerViewHolder(View itemView) {
        super(itemView);
        context = itemView.getContext();

        deskripsi = (TextView) itemView.findViewById(R.id.deskripsi);
        materi = (TextView) itemView.findViewById(R.id.judulMateri);
        titleMateri = (TextView) itemView.findViewById(R.id.title);
        icon = (ImageView) itemView.findViewById(R.id.icon);
        itemList = (LinearLayout) itemView.findViewById(R.id.Lmateri);
        toolbar = (Toolbar) itemView.findViewById(R.id.toolbar);

    }
}
