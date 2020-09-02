package com.pendtium.grafikaapp.ui.materi;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.pendtium.grafikaapp.R;
import com.pendtium.grafikaapp.ui.materi.Materi1Pengantar.PengertianFragment;
import com.pendtium.grafikaapp.ui.materi.Materi1Pengantar.PerananFragment;
import com.pendtium.grafikaapp.ui.materi.Materi1Pengantar.SejarahFragment;
import com.pendtium.grafikaapp.ui.materi.Materi6Object3D.ContohFragment;
import com.pendtium.grafikaapp.ui.materi.Materi6Object3D.DefinisiFragment;
import com.pendtium.grafikaapp.ui.materi.Materi6Object3D.ImplementasiFragment;

import java.util.ArrayList;
import java.util.List;

public class Materi6TabsActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_tabs);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        Materi6TabsActivity.ViewPagerAdapter adapter = new Materi6TabsActivity.ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new DefinisiFragment(), "Definisi");
        adapter.addFrag(new ImplementasiFragment(), "Implementasi");
        adapter.addFrag(new ContohFragment(), "Contoh Program");
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}
