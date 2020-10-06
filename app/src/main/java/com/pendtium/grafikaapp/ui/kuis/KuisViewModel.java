package com.pendtium.grafikaapp.ui.kuis;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.pendtium.grafikaapp.R;
import com.pendtium.grafikaapp.ui.kuis.kuis2_primitive.KuisPrimitive;
import com.pendtium.grafikaapp.ui.kuis.kuis1_pengantar.KuisPengantar;
import com.pendtium.grafikaapp.ui.kuis.kuis3_twodimension.KuisTwodimension;
import com.pendtium.grafikaapp.ui.kuis.kuis4_transformasi.KuisTransformasi;
import com.pendtium.grafikaapp.ui.kuis.kuis5_interaksi.KuisInteraksi;
import com.pendtium.grafikaapp.ui.kuis.kuis6_threedimension.KuisThreeDimension;

public class KuisViewModel extends RecyclerView.ViewHolder {

    public TextView kuis_title;
    public ImageView img_thumbnail;
    public ImageView img_two;
    public CardView cardView;
    Context context;

    public KuisViewModel(View itemView) {
        super(itemView);
        context = itemView.getContext();

        kuis_title = itemView.findViewById(R.id.kuis_title);
        img_thumbnail = itemView.findViewById(R.id.kuis_img);
        img_two = itemView.findViewById(R.id.kuis_img2);

        cardView = itemView.findViewById(R.id.kuis_click);

        cardView.setOnClickListener(view -> {
            Intent intent = new Intent();
            switch (getAdapterPosition()){
                case 0 :
                    intent = new Intent(context, KuisPengantar.class);
                    break;
                case 1 :
                    intent = new Intent(context, KuisPrimitive.class);
                    break;
                case 2 :
                    intent = new Intent(context, KuisTwodimension.class);
                    break;
                case 3 :
                    intent = new Intent(context, KuisTransformasi.class);
                    break;
                case 4 :
                    intent = new Intent(context, KuisInteraksi.class);
                    break;
                case 5 :
                    intent = new Intent(context, KuisThreeDimension.class);
                    break;
            }
            context.startActivity(intent);

        });
    }

}