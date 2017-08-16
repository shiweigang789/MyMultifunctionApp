package com.duoduolicai360.mymultifunctionapp;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import com.duoduolicai360.mymultifunctionapp.test.TestActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by swg on 2017/8/16.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class TestActivityInstrumentationTest {

    private static final String STRING_TO_BE_TYPED = "Peter";

    @Rule
    public ActivityTestRule<TestActivity> mTestActivity = new ActivityTestRule<>(TestActivity.class);

    @Test
    public void sayHello(){
        onView(withId(R.id.et)).perform(typeText(STRING_TO_BE_TYPED), closeSoftKeyboard());
        onView(withText("Say hello!")).perform(click());
        String expectedText = "Hello, " + STRING_TO_BE_TYPED + "!";
        onView(withId(R.id.tv)).check(matches(withText(expectedText)));
    }

}
