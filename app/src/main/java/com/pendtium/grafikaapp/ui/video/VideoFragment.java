package com.pendtium.grafikaapp.ui.video;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pendtium.grafikaapp.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class VideoFragment extends Fragment {

    @BindView(R.id.recyclerViewFeed)
    RecyclerView recyclerViewFeed;

    YoutubeRecyclerAdapter mRecyclerAdapter;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_video, container, false);

        ButterKnife.bind(this, view);
        // prepare data for list
        List<YoutubeVideo> youtubeVideos = prepareList();
        mRecyclerAdapter = new YoutubeRecyclerAdapter(youtubeVideos);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerViewFeed.setLayoutManager(mLayoutManager);
        recyclerViewFeed.setItemAnimator(new DefaultItemAnimator());
        recyclerViewFeed.setAdapter(mRecyclerAdapter);

        return view;
    }

    private List<YoutubeVideo> prepareList() {
        ArrayList mYoutubeVideo = new ArrayList();
        // add first item
        YoutubeVideo video1 = new YoutubeVideo();
        video1.setId(1l);
        video1.setImageUrl("https://i.ytimg.com/vi/zI-Pux4uaqM/maxresdefault.jpg");
        video1.setTitle("Thugs Of Hindostan - Official Trailer | Amitabh Bachchan | Aamir Khan | Katrina Kaif | Fatima");
        video1.setVideoId("zI-Pux4uaqM");
        mYoutubeVideo.add(video1);

        // add second item
        YoutubeVideo video2 = new YoutubeVideo();
        video2.setId(2l);
        video2.setImageUrl("https://i.ytimg.com/vi/8ZK_S-46KwE/maxresdefault.jpg");
        video2.setTitle("Colors for Children to Learning with Baby Fun Play with Color Balls Dolphin Slider Toy Set Kids Edu");
        video2.setVideoId("8ZK_S-46KwE");
        mYoutubeVideo.add(video2);

        // add third item
        YoutubeVideo video3 = new YoutubeVideo();
        video3.setId(3l);
        video3.setImageUrl("https://i.ytimg.com/vi/8czMWUH7vW4/hqdefault.jpg");
        video3.setTitle("Air Hostess Accepts Marriage Proposal Mid-Air, Airline Fires her.");
        video3.setVideoId("8czMWUH7vW4");
        mYoutubeVideo.add(video3);

        // add four item
        YoutubeVideo video4 = new YoutubeVideo();
        video4.setId(4l);
        video4.setImageUrl("https://i.ytimg.com/vi/YrQVYEb6hcc/maxresdefault.jpg");
        video4.setTitle("EXPERIMENT Glowing 1000 degree METAL BALL vs Gunpowder (100 grams)");
        video4.setVideoId("YrQVYEb6hcc");
        mYoutubeVideo.add(video4);

        // add four item
        YoutubeVideo video5 = new YoutubeVideo();
        video5.setId(5l);
        video5.setImageUrl("https://i.ytimg.com/vi/S84Fuo2rGoY/maxresdefault.jpg");
        video5.setTitle("What happened after Jauhar of Padmavati");
        video5.setVideoId("S84Fuo2rGoY");
        mYoutubeVideo.add(video5);

        mYoutubeVideo.add(video1);
        mYoutubeVideo.add(video2);
        mYoutubeVideo.add(video3);
        mYoutubeVideo.add(video4);
        return mYoutubeVideo;
    }
}