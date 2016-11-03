package ru.romanzes.lifesliceapp.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import ru.romanzes.lifesliceapp.ui.fragment.FragmentA;
import ru.romanzes.lifesliceapp.ui.fragment.FragmentB;

public class MainTabsAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public MainTabsAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FragmentA();
            case 1:
                return new FragmentB();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}