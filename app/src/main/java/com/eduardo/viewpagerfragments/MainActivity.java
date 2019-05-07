package com.eduardo.viewpagerfragments;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.eduardo.viewpagerfragments.Fragments.FirstFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static class MyPageAdapter extends FragmentPagerAdapter{

        private static int NUM_ITEMS = 3;

        public MyPageAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return NUM_ITEMS;
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return FirstFragment.newInstance(0,"Page #1");
                case 1:
                    return FirstFragment.newInstance(1,"Page #2");
                case 2:
                    return FirstFragment.newInstance(2,"Page #3");
                default:
                    return null;
            }
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return "PaGe: "+super.getPageTitle(position);
        }
    }
}
