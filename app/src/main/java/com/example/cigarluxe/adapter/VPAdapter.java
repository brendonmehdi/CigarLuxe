package com.example.cigarluxe.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.cigarluxe.R;
import com.example.cigarluxe.TutorialFragment;
import com.example.cigarluxe.VpLayout;

public class VPAdapter extends FragmentStateAdapter {
    public VPAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0: return VpLayout.newInstance(R.drawable.money1, "When naming a variable you should use camel case", "hi");
            case 1: return VpLayout.newInstance(R.drawable.strength1, "Comment often and be as detailed as possible", "hi");
            case 2: return VpLayout.newInstance(R.drawable.aboutashton, "Name variables and classes with descriptive names", "hi");
            case 3: return VpLayout.newInstance(R.drawable.cigar, "Don't be afraid to make mistakes", "hi");
            case 4: return VpLayout.newInstance(R.drawable.aboutashton, "Shorter code does not mean better code", "ho");
            default: return VpLayout.newInstance(R.drawable.aboutcohiba, "404: Fragment not found", "hi");
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
