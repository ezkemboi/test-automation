package com.example.espresso_android_java;

import androidx.test.filters.LargeTest;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

/**
 * Show Images instrumentation test
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class ShowImagesTest {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void showImages() {
        // click on button
        onView(withId(R.id.showImages)).perform(click());
        // check if all 4 images are displayed
        onView(withId(R.id.imageView)).check(matches(isDisplayed()));
        onView(withId(R.id.imageView2)).check(matches(isDisplayed()));
        onView(withId(R.id.imageView3)).check(matches(isDisplayed()));
        onView(withId(R.id.imageView4)).check(matches(isDisplayed()));
    }
}
