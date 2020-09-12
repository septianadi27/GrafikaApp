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
import com.pendtium.grafikaapp.ui.materi.Materi1Pengantar.OpenglFragment;
import com.pendtium.grafikaapp.ui.materi.Materi1Pengantar.TeknologiFragment;
import com.pendtium.grafikaapp.ui.materi.Materi1Pengantar.SistemFragment;
import com.pendtium.grafikaapp.ui.materi.Materi1Pengantar.PengertianFragment;
import com.pendtium.grafikaapp.ui.materi.Materi1Pengantar.PerananFragment;
import com.pendtium.grafikaapp.ui.materi.Materi1Pengantar.SejarahFragment;

import java.util.ArrayList;
import java.util.List;

public class Materi1TabsActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrollable_tabs);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new PengertianFragment(), "Pengertian");
        adapter.addFrag(new SejarahFragment(), "Sejarah");
        adapter.addFrag(new PerananFragment(), "Peranan & Penggunaan");
        adapter.addFrag(new SistemFragment(), "Sistem");
        adapter.addFrag(new TeknologiFragment(), "Teknologi Display");
        adapter.addFrag(new OpenglFragment(), "OPENGL");
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
