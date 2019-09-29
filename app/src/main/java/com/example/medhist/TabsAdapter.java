package com.example.medhist;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TabsAdapter extends FragmentStatePagerAdapter {

    int tabCount;
    public TabsAdapter(FragmentManager fm, int tabCount){
        super(fm);
        this.tabCount = tabCount;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        //Returning the current tabs
        switch (position) {
            case 0:
                ProfileTab profileTab = new ProfileTab();
                return profileTab;
            case 1:
                FamilyTab familyTab = new FamilyTab();
                return familyTab;
            case 2:
                MedicationTab medicationTab = new MedicationTab();
                return medicationTab;
            case 3:
                TreatmentTab treatmentTab = new TreatmentTab();
                return treatmentTab;
            default:
                return null;
        }
    }

    //Overriden method getCount to get the number of tabs
    @Override
    public int getCount() {
        return tabCount;
    }
}
