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
            case 0: return VpLayout.newInstance(R.drawable.cutcigar,  "1. Cut the Cigar", "Shoot for 1/8th of an inch you just want to cut the cap");
            case 1: return VpLayout.newInstance(R.drawable.toastcigar, "2. Toast the Foot", "holding the cigar at a 46deg angle apply heat to the foot");
            case 2: return VpLayout.newInstance(R.drawable.lightcigar, "3. Light the Cigar", "without letting the flame touch the cigar puff a few times");
            case 3: return VpLayout.newInstance(R.drawable.evenlylit, "4. Make sure its evenly lit", "look at the foot of the cigar and lightly blow on it to ensure its evenly lit");
            case 4: return VpLayout.newInstance(R.drawable.cigarpagerenjoy, "5. Smoke and Enjoy", "Smoke without inhaling and puff every 30 - 60 sec");
            default: return VpLayout.newInstance(R.drawable.aboutcohiba, "404: Fragment not found", "hi");
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
