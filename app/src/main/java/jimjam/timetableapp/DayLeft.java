package jimjam.timetableapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Jimmie on 14/12/2016.
 */

public class DayLeft extends Fragment {

    public static DayLeft newInstance(){
        DayLeft dayLeft = new DayLeft();
        return dayLeft;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_fragment_mid_left,null);
        return rootView;
    }

    @Override
    public String toString(){
        return "DayLeft";
    }
}
