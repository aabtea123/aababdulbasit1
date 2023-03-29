package com.example.aababdulbasit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;

import com.example.aababdulbasit.fragment.Fragment1;
import com.example.aababdulbasit.fragment.Fragment2;
import com.example.aababdulbasit.fragment.Fragment3;
import com.example.aababdulbasit.fragment.ViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;


public class TabActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        // Inisialisasi Tab Layout dan ViewPager
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        // Tambahkan fragment ke adapter
        adapter.addFragment(new Fragment1(), "jenis");
        adapter.addFragment(new Fragment2(), "Perlengkapan");
        adapter.addFragment(new Fragment3(), "hallal");

        // Set adapter ke ViewPager
        viewPager.setAdapter(adapter);

        // Tambahkan ViewPager ke Tab Layout
        tabLayout.setupWithViewPager(viewPager);

        // Set icon untuk setiap tab (optional)
        tabLayout.getTabAt(0).setIcon(R.drawable.ikon1);
        tabLayout.getTabAt(1).setIcon(R.drawable.ikon2);
        tabLayout.getTabAt(2).setIcon(R.drawable.ikon3);
    }
}
