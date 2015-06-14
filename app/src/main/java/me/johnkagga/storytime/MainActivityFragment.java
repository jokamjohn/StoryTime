package me.johnkagga.storytime;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    private EditText mEditText;
    private Button mButton;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootVeiw = inflater.inflate(R.layout.fragment_main, container, false);

        mEditText = (EditText)rootVeiw.findViewById(R.id.editText);
        mButton = (Button)rootVeiw.findViewById(R.id.startbutton);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mEditText.getText().toString();
                startStory (name);
            }
        });
        return rootVeiw;
    }

    /*
    New story method that calls the new activity
     */
    private void startStory (String name) {
        Intent storyIntent = new Intent(getActivity(),StoryActivity.class);
        storyIntent.putExtra("name",name);
        startActivity(storyIntent);
    }
}
