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
        mPages[0] = new Page(R.drawable.page0,
                "On your return trip from studying Saturn's rings, you hear a distress signal that seems to be coming from the surface of Mars. It's strange because there hasn't been a colony there in years. Even stranger, it's calling you by name: \\\"Help me, %1$s, you're my only hope.\\\"",
                new Choice("Stop and Investigate", 1),
                new Choice("Continue home to earth",2));
    }
}
