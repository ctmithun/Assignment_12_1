package com.billionman.com.assignment_12_1;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.support.annotation.Nullable;

/**
 * Created by CTM on 02-07-2017.
 */

public class PrefsActivity extends PreferenceActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        addPreferencesFromResource(R.xml.);
        addPreferencesFromResource(R.xml.prefs);
    }
}
