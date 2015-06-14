package me.johnkagga.storytime.model;

import me.johnkagga.storytime.R;

/**
 * Created by John Kagga on 6/14/2015.
 */
public class Story {

    /*
    Creating an array object of the story page
     */
    private Page [] mPages;

    public Story (){
        mPages = new Page[7];

        /*
        Setting values to the first page of the story
         */
        mPages[0].setImageId(R.drawable.page0);
        mPages[0].setText("");
        mPages[0].setChoice1(new Choice());
        mPages[0].setChoice2(new Choice());
    }
}
