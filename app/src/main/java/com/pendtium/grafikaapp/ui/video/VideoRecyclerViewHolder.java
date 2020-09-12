package com.pendtium.grafikaapp.ui.video;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import com.pendtium.grafikaapp.R;

public class VideoRecyclerViewHolder extends RecyclerView.ViewHolder {
    public TextView video, titleVideo, deskripsi;
    public ImageView icon;
    public LinearLayout itemList;
    Context context;
    Toolbar toolbar;

    public VideoRecyclerViewHolder(View itemView) {
        super(itemView);
        context = itemView.getContext();

        deskripsi = (TextView) itemView.findViewById(R.id.deskripsi);
        video = (TextView) itemView.findViewById(R.id.judulVideo);
        titleVideo = (TextView) itemView.findViewById(R.id.title);
        icon = (ImageView) itemView.findViewById(R.id.icon);
        itemList = (LinearLayout) itemView.findViewById(R.id.Lvideo);
        toolbar = (Toolbar) itemView.findViewById(R.id.toolbar);



        //Set listener on click menu
        itemList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                switch (getAdapterPosition()){
                    case 0 :
                        intent = new Intent(context, Video1Activity.class);
                        break;
                    case 1 :
                        intent = new Intent(context, Video2Activity.class);
                        break;
                    case 2 :
                        intent = new Intent(context, Video3Activity.class);
                        break;
                    case 3 :
                        intent = new Intent(context, Video4Activity.class);
                        break;
                    case 4 :
                        intent = new Intent(context, Video5Activity.class);
                        break;
                    case 5 :
                        intent = new Intent(context, Video6Activity.class);
                        break;
                    case 6 :
                        intent = new Intent(context, Video7Activity.class);
                        break;
                }
                context.startActivity(intent);
            }
        });
    }
}
