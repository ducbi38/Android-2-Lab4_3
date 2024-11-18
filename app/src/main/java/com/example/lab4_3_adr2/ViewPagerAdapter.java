package com.example.lab4_3_adr2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        // Xác định fragment nào được hiển thị trên mỗi tab
        switch (position) {
            case 0:
                return new ImageFragment(); // Fragment 1 (Hình)
            case 1:
                return new TextFragment();  // Fragment 2 (Chữ)
            default:
                return new ImageFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2; // Số lượng tab
    }
}
