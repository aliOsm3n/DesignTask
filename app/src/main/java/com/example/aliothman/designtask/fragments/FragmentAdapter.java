package com.example.aliothman.designtask.fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


public class FragmentAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public FragmentAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                Cancel_Fragment tab1 = new Cancel_Fragment();
                return tab1;
            case 1:
                Accept_Fragment tab2 = new Accept_Fragment();
                return tab2;
            case 2:
                Wait_Fragment tab3 = new Wait_Fragment();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }

}
