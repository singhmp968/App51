package com.example.mortezasaadat.app51;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by mortezasaadat on 9/5/16.
 */
public class PreferrencesActivity extends PreferenceActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        addPreferencesFromResource(R.xml.preferrences_file);

    }
}
