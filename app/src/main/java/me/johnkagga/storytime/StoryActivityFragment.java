package me.johnkagga.storytime;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A placeholder fragment containing a simple view.
 */
public class StoryActivityFragment extends Fragment {


    private static final String LOG_TAG = StoryActivityFragment.class.getSimpleName();

    public StoryActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootVeiw = inflater.inflate(R.layout.fragment_story, container, false);

        Intent intent = getActivity().getIntent();
        String name = intent.getStringExtra(getString(R.string.key_name));
        Log.d(LOG_TAG,name);
        if (name == null){
            name = "friend";
        }

        return rootVeiw;
    }
}
