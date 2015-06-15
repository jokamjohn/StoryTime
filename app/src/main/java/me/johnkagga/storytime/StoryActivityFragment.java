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
    private String mName;
    private Page mCurrentPage;

    public StoryActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootVeiw = inflater.inflate(R.layout.fragment_story, container, false);

        Intent intent = getActivity().getIntent();
        mName = intent.getStringExtra(getString(R.string.key_name));
        if (mName == null){
            mName = "friend";
        }
        Log.v(LOG_TAG, mName);

        mImageView = (ImageView)rootVeiw.findViewById(R.id.storyImageView);
        mTextView = (TextView)rootVeiw.findViewById(R.id.storyTextView);
        mButtonChoice1 = (Button)rootVeiw.findViewById(R.id.choiceButton1);
        mButtonChoice2 = (Button)rootVeiw.findViewById(R.id.choicebutton2);

        //loads the first page when the app starts
        loadPage(0);

        return rootVeiw;
    }

    public void loadPage (int choice) {
        //getting the mCurrentPage
         mCurrentPage = mStory.getPage(choice);
        //setting the drawable
        Drawable drawable = ResourcesCompat.getDrawable(getResources(), mCurrentPage.getImageId(), null);
        mImageView.setImageDrawable(drawable);
        // adding the name to the text in the story
        String pageText = mCurrentPage.getText();
        pageText = String.format(pageText, mName);
        mTextView.setText(pageText);

        mButtonChoice1.setText(mCurrentPage.getChoice1().getText());
        mButtonChoice2.setText(mCurrentPage.getChoice2().getText());

        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nextpage = mCurrentPage.getChoice1().getNextPage();
                loadPage(nextpage);
            }
        });

        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nextpage = mCurrentPage.getChoice2().getNextPage();
                loadPage(nextpage);
            }
        });

    }
}
