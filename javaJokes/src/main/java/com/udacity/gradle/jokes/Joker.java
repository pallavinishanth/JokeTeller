package com.udacity.gradle.jokes;

import java.util.Arrays;
import java.util.Collections;

public class Joker {

    private String[] jokes = {"Don’t be sad when a bird craps on your head. Be happy that dogs can’t fly.",
            "Yes, money cannot buy you happiness, but I’d still feel a lot more comfortable crying in a new BMW than on a bike.",
            "Why did the physics teacher break up with the biology teacher? There was no chemistry.",
            "Why did the donut visit the dentist? To get a new filling.",
            "Waiter, there’s a fly twitching in my soup!And what do you expect for the price? A ballet?!",
    "Today a man knocked on my door and asked for a small donation towards the local swimming pool. I gave him a glass of water.",
    "Life is all about perspective. The sinking of the Titanic was a miracle to the lobsters in the ship's kitchen.",
    "My wife and I were happy for twenty years. Then we met.",
    "Relationships are a lot like algebra. Have you ever looked at your X and wondered Y?",
    "If you think nobody cares whether you're alive, try missing a couple of payments.",
    "I changed my password to 'incorrect'. So whenever I forget what it is the computer will say 'Your password is incorrect'.",
    "Entered what I ate today into my new fitness app and it just sent an ambulance to my house."};

    public String getJoke() {

        Collections.shuffle(Arrays.asList(jokes));

        //return "This is totally a funny joke";
        return jokes[0];
    }
}
