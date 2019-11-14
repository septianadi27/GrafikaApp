package com.pendtium.grafikaapp.ui.informasi;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class InformasiTabPagerAdapter extends FragmentStatePagerAdapter {

    String[] tabArray = new String[]{"Informasi Aplikasi","Informasi Pengembang"};
    Integer tabnumber = 2;

    public InformasiTabPagerAdapter (FragmentManager fm){
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabArray[position];
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                FragmentInformasiAplikasi FragmentInformasiAplikasi1 = new FragmentInformasiAplikasi();
                return FragmentInformasiAplikasi1;

            case 1:
                FragmentInformasiPengembang FragmentInformasiPengembang1 = new FragmentInformasiPengembang();
                return FragmentInformasiPengembang1;
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabnumber;
    }
}
