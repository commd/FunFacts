package com.chuck.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by chuck on 7/6/15.
 */
public class ColorWheel {


    // Member variables (properties about the object)
    public String[] mColor = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };


    // Method (abiliteis: things the object can do
    public int getColor() {
        // Randomly select a fact
        Random randomGenerator = new Random();  // Construct a new Random number generator
        int randomNumber = randomGenerator.nextInt(mColor.length);
        int colorAsInt = Color.parseColor( mColor[randomNumber]);
        return colorAsInt;
    }
}
