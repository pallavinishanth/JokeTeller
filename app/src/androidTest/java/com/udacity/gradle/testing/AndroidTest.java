package com.udacity.gradle.testing;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.udacity.gradle.builditbigger.MainActivity;
import com.udacity.gradle.builditbigger.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;

/**
 * Created by PallaviNishanth on 6/5/17.
 */

@RunWith(AndroidJUnit4.class)
public class AndroidTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule<>(MainActivity.class);


    /**
     * Test to verify joke is a non-empty string
     */
    @Test
    public void testVerifyjokeNotnull(){

        onView(withId(R.id.telljoke_button)).perform(click());
        //onView(allOf(withId(R.id.JokeText), not(withText(" "))));
        onView(withId(R.id.JokeText)).check(matches(not(withText(" "))));


    }
}
