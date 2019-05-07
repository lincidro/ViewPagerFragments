package com.eduardo.viewpagerfragments.Fragments.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.eduardo.viewpagerfragments.Fragments.FirstFragment;

public class MyPageAdapter extends FragmentPagerAdapter {

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
                return FirstFragment.newInstance(0,"Página #1");
            case 1:
                return FirstFragment.newInstance(1,"Página #2");
            case 2:
                return FirstFragment.newInstance(2,"Página #3");
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Página: "+position;
    }
}