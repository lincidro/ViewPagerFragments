package com.eduardo.viewpagerfragments;

import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.eduardo.viewpagerfragments.Fragments.Adapter.MyPageAdapter;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";
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
        //findViewById
        viewPager = findViewById(R.id.vpPager);
        btnPrevious = findViewById(R.id.btnPrevious);
        btnNext = findViewById(R.id.btnNext);

        //setOnClickListener
        btnPrevious.setOnClickListener(this);
        btnNext.setOnClickListener(this);
    }

    void setAdapter(){
        fragmentPagerAdapter = new MyPageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(fragmentPagerAdapter);
    }


    @Override
    public void onClick(View v) {
        int currentItem = -1;
        int maxItemPosition = Constants.NUM_ITEMS-1;
        switch (v.getId()){
            case R.id.btnPrevious:
                Log.i(TAG,"click on btnPrevious");
                currentItem = viewPager.getCurrentItem();
                if(currentItem>0) {
                    viewPager.setCurrentItem(currentItem-1);
                } else {
                    Toast.makeText(this,"Ya no se puede retroceder.",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btnNext:
                Log.i(TAG,"click on btnNext");
                currentItem = viewPager.getCurrentItem();
                if(currentItem!=maxItemPosition) {
                    viewPager.setCurrentItem(currentItem+1);
                } else {
                    Toast.makeText(this,"Ya no se puede avanzar.",Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    void goPrevious(){

    }
}
