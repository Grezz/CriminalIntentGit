package com.grez.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by grez on 18.10.2016.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
