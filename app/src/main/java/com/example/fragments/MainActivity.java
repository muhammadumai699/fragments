package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        tabLayout.setupWithViewPager(viewPager);

        Adapter adapter = new Adapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);

        adapter.addFragment(new Monday(), "Monday");
        adapter.addFragment(new Tuesday(),"Tuesday");
        adapter.addFragment(new Wednesday(), "Wednesday");

        viewPager.setAdapter(adapter);


    }
}