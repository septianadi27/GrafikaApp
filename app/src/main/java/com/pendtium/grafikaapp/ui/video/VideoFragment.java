package com.pendtium.grafikaapp.ui.video;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pendtium.grafikaapp.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;


public class VideoFragment extends Fragment {

    public VideoFragment() {}

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_video, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);

        String[] videoIds = {"gQLDKsEh9RY", "rAyo-z3GI40", "YnEWARtswKA", "WZSev3wyMA4", "-k5033OJbpg", "s63GBXkFtj4"};

        RecyclerView.Adapter recyclerViewAdapter = new RecyclerViewAdapter(videoIds, this.getLifecycle());
        recyclerView.setAdapter(recyclerViewAdapter);

        return view;
    }

}