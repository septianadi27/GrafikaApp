package com.pendtium.grafikaapp.ui.materi;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.pendtium.grafikaapp.R;

public class MateriRecyclerViewHolder extends RecyclerView.ViewHolder {
    public TextView materi, titleMateri, deskripsi;
    public ImageView icon;
    public LinearLayout itemList;
    Context context;

    public MateriRecyclerViewHolder(View itemView) {
        super(itemView);
        context = itemView.getContext();

        deskripsi = (TextView) itemView.findViewById(R.id.deskripsi);
        materi = (TextView) itemView.findViewById(R.id.judulMateri);
        titleMateri = (TextView) itemView.findViewById(R.id.title);
        icon = (ImageView) itemView.findViewById(R.id.icon);
        itemList = (LinearLayout) itemView.findViewById(R.id.Lmateri);

        itemList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                switch (getAdapterPosition()){
                    case 0 :
                        //intent = new Intent(context, bfs_Activity.class);
                        break;
                    case 1 :
                        //intent = new Intent(context, dfs_Activity.class);
                        break;
                    case 2 :
                        //intent = new Intent(context, gt_Activity.class);
                        break;
                    case 3 :
                        //intent = new Intent(context, hc_Activity.class);
                        break;
                    case 4 :
                        //intent = new Intent(context, bestfs_Activity.class);
                        break;
                }
                context.startActivity(intent);
            }
        });
    }
}
