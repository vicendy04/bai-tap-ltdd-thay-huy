package com.tranvodinhhoang.laptrinhdidongbaitap.fragments;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;


public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new HomeFragment();
            case 1:
                return StudentInfoFragment.newInstance("Trần Võ Đình Hoàng", "22115053122211", "22T2", "Công nghệ thông tin");
            case 2:
                return new SettingFragment();
            default:
                return new HomeFragment(); // Default to Home
        }
    }

    @Override
    public int getItemCount() {
        return 3; // Total number of fragments
    }
}
