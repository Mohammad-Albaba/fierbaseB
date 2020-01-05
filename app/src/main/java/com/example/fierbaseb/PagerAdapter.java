package com.example.fierbaseb;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    Fragment fragment = new Fragment();

    public PagerAdapter(FragmentManager fm) {
        super(fm);

    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FirstFragment();
            case 1:

                return new SecondFragment();
            case 2:

                return new ThirdFragment();
            case 3:

                return new FourFragment();

        }
        return fragment;

    }

    @Override
    public int getCount() {
        return 4;
    }
}
