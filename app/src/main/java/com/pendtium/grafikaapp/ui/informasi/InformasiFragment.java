package com.pendtium.grafikaapp.ui.informasi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.pendtium.grafikaapp.R;

public class InformasiFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_informasi, container, false);

        //set tab menu
        TabLayout tabLayout =(TabLayout)root.findViewById(R.id.tabInformasi);
        ViewPager Pager =(ViewPager)root.findViewById(R.id.viewpagerInformasi);

        InformasiTabPagerAdapter Tabpageradapter = new InformasiTabPagerAdapter(getFragmentManager());
        Pager.setAdapter(Tabpageradapter);
        tabLayout.setupWithViewPager(Pager);

        return root;
    }
}