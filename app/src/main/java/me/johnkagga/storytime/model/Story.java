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

        mPages[1] = new Page(R.drawable.page0,
                "On your return trip from studying Saturn's rings, you hear a distress signal that seems to be coming from the surface of Mars. It's strange because there hasn't been a colony there in years. Even stranger, it's calling you by name: \\\"Help me, %1$s, you're my only hope.\\\"",
                new Choice("Explore the cave", 3),
                new Choice("Explore the rover", 4));

        mPages[2] = new Page(R.drawable.page0,
                "On your return trip from studying Saturn's rings, you hear a distress signal that seems to be coming from the surface of Mars. It's strange because there hasn't been a colony there in years. Even stranger, it's calling you by name: \\\"Help me, %1$s, you're my only hope.\\\"",
                new Choice("Head back to Mars to investigate", 4),
                new Choice("Continue home to Earth", 6));

        mPages[3] = new Page(R.drawable.page0,
                "On your return trip from studying Saturn's rings, you hear a distress signal that seems to be coming from the surface of Mars. It's strange because there hasn't been a colony there in years. Even stranger, it's calling you by name: \\\"Help me, %1$s, you're my only hope.\\\"",
                new Choice("Refill at ship and explore the rover", 4),
                new Choice("Continue towards the faint light", 5));

        mPages[4] = new Page(R.drawable.page0,
                "On your return trip from studying Saturn's rings, you hear a distress signal that seems to be coming from the surface of Mars. It's strange because there hasn't been a colony there in years. Even stranger, it's calling you by name: \\\"Help me, %1$s, you're my only hope.\\\"",
                new Choice("Explore the coordinates", 5),
                new Choice("Return to Earth", 6));

        mPages[5] = new Page(R.drawable.page0,
                "On your return trip from studying Saturn's rings, you hear a distress signal that seems to be coming from the surface of Mars. It's strange because there hasn't been a colony there in years. Even stranger, it's calling you by name: \\\"Help me, %1$s, you're my only hope.\\\""
               );

        mPages[6] = new Page(R.drawable.page0,
                "On your return trip from studying Saturn's rings, you hear a distress signal that seems to be coming from the surface of Mars. It's strange because there hasn't been a colony there in years. Even stranger, it's calling you by name: \\\"Help me, %1$s, you're my only hope.\\\""
               );

    }
}
