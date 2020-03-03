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

import java.util.ArrayList;
import java.util.List;

public class Materi3TabsActivity extends AppCompatActivity {
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
        Materi3TabsActivity.ViewPagerAdapter adapter = new Materi3TabsActivity.ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new PengertianFragment(), "ONE");
        adapter.addFrag(new SejarahFragment(), "TWO");
        adapter.addFrag(new PerananFragment(), "THREE");
        //adapter.addFrag(new SistemFragment(), "FOUR");
        //adapter.addFrag(new TeknologiFragment(), "FIVE");
        //adapter.addFrag(new SixFragment(), "SIX");
        //adapter.addFrag(new SevenFragment(), "SEVEN");
        //adapter.addFrag(new EightFragment(), "EIGHT");
        //adapter.addFrag(new NineFragment(), "NINE");
        //adapter.addFrag(new TenFragment(), "TEN");
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
