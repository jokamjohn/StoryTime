package me.johnkagga.storytime;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.res.ResourcesCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import me.johnkagga.storytime.model.Page;
import me.johnkagga.storytime.model.Story;


/**
 * A placeholder fragment containing a simple view.
 */
public class StoryActivityFragment extends Fragment {

    private static final String LOG_TAG = StoryActivityFragment.class.getSimpleName();

    private Story mStory = new Story();

    private ImageView mImageView;
    private TextView mTextView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;

    public StoryActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootVeiw = inflater.inflate(R.layout.fragment_story, container, false);

        Intent intent = getActivity().getIntent();
        String name = intent.getStringExtra(getString(R.string.key_name));
        if (name == null){
            name = "friend";
        }
        Log.v(LOG_TAG, name);

        mImageView = (ImageView)rootVeiw.findViewById(R.id.storyImageView);
        mTextView = (TextView)rootVeiw.findViewById(R.id.storyTextView);
        mButtonChoice1 = (Button)rootVeiw.findViewById(R.id.choiceButton1);
        mButtonChoice2 = (Button)rootVeiw.findViewById(R.id.choicebutton2);

        return rootVeiw;
    }

    public void loadPage () {
        //getting the page
        Page page = mStory.getPage(0);
        //setting the drawable
        Drawable drawable = ResourcesCompat.getDrawable(getResources(),page.getImageId(),null);
        mImageView.setImageDrawable(drawable);
        mTextView.setText(page.getText());
        mButtonChoice1.setText(page.getChoice1().getText());
        mButtonChoice2.setText(page.getChoice2().getText());

    }
}
