package d3rv2.afrayedknot.com.d3rv2.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import d3rv2.afrayedknot.com.d3rv2.activities.R;

/**
 * Created by redna on 7/23/2017.
 */

public class DiceSetSaverFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_dice_set_saver, container, false);
    }
}
