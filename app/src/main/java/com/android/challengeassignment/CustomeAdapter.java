package com.android.challengeassignment;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.android.challengeassignment.fragments.BasicFragment;
import com.android.challengeassignment.fragments.ScientificFragment;


public class CustomeAdapter extends FragmentStatePagerAdapter {


    public CustomeAdapter(FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        switch(position){

            case 0 :
                return new BasicFragment();

            case 1:
                return new ScientificFragment();

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

//        return super.getPageTitle(position);
        switch (position){
            case 0:
                return "Basic";
            case 1:
                return "Scientific";
            default: return "TAB";
        }
    }
}