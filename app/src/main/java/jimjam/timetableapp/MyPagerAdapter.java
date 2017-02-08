package jimjam.timetableapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Jimmie on 14/12/2016.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {

    ArrayList<Fragment> pages = new ArrayList<>();

    public MyPagerAdapter(FragmentManager fm){

        super(fm);
    }

    @Override
    public Fragment getItem(int position){

        return pages.get(position);
    }

    @Override
    public int getCount() {

        return pages.size();
    }

    @Override
    public CharSequence getPageTitle(int position){

        return pages.get(position).toString();
    }

    public void addPage(Fragment f){

        pages.add(f);
    }
    @Override
    public float getPageWidth (int position) {
        return 0.93f;
    }
}
