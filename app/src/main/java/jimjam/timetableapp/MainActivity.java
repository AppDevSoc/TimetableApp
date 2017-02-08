package jimjam.timetableapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ViewPager vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vp = (ViewPager) findViewById(R.id.viewpager);
        vp.setClipToPadding(false);
        addPages(vp);
        
        /*tab = (TabLayout) findViewById(R.id.tabs);
        tab.setTabGravity(TabLayout.GRAVITY_FILL);
        tab.setupWithViewPager(vp);
        tab.addOnTabSelectedListener(this);*/

        vp.setCurrentItem(2);
    }
    private void addPages(ViewPager viewPager){
        MyPagerAdapter myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        myPagerAdapter.addPage(DayLeft2.newInstance());
        myPagerAdapter.addPage(DayLeft.newInstance());
        myPagerAdapter.addPage(DayMain.newInstance());
        myPagerAdapter.addPage(DayRight.newInstance());
        myPagerAdapter.addPage(DayRight2.newInstance());

        vp.setAdapter(myPagerAdapter);
    }

    /*
    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        vp.setCurrentItem(tab.getPosition());
    }
    */

}
