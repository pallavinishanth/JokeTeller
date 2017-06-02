package com.udacity.gradle.jokes;

import java.util.Arrays;
import java.util.Collections;

public class Joker {

    private String[] jokes = {"Don’t be sad when a bird craps on your head. Be happy that dogs can’t fly.",
            "Yes, money cannot buy you happiness, but I’d still feel a lot more comfortable crying in a new BMW than on a bike.",
            "Why did the physics teacher break up with the biology teacher? There was no chemistry.",
            "Why did the donut visit the dentist? To get a new filling.",
            "Waiter, there’s a fly twitching in my soup!And what do you expect for the price? A ballet?!"};

    public String getJoke() {

        Collections.shuffle(Arrays.asList(jokes));

        //return "This is totally a funny joke";
        return jokes[0];
    }
}
