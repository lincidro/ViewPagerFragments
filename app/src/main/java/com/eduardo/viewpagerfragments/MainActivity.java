package com.eduardo.viewpagerfragments;

import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.eduardo.viewpagerfragments.Fragments.Adapter.MyPageAdapter;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    FragmentPagerAdapter fragmentPagerAdapter;
    ViewPager viewPager;
    Button btnPrevious;
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initXML();
        setAdapter();

    }

    void initXML(){
        viewPager = findViewById(R.id.vpPager);
        btnPrevious = findViewById(R.id.btnPrevious);
        btnNext = findViewById(R.id.btnNext);

        btnPrevious.setOnClickListener(this);
        btnNext.setOnClickListener(this);
    }

    void setAdapter(){
        fragmentPagerAdapter = new MyPageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(fragmentPagerAdapter);
    }


    @Override
    public void onClick(View v) {

    }
}
