/**
 * This is how espresso workflow do -> match -> act -> assert
 */

public class ExpressoFlow {
  @Test
  public void espressoFlow() {
    /**
     * onView() is a ViewMatcher. Then, click() is a ViewAction and
     * matches(isDisplayed()) is a ViewAssertion
     */
    onview(withId(R.id.my_view)).perform(click()).check(matches(isDisplayed()));
  }
}

// Notes on instrumentation/UI testing
/**
 * 1. ViewMatcher -> locate view matcher in the UI hierarchy. e.g
 * withId(R.id.my_view) or withText('find some text')
 */

/**
 * 2. ViewActions -> perfom specific action or group of actions. e.g
 * ViewInteraction.perform(click()), doubleClick(), or click(), longClick(),
 * doubleClick(), swipeDown(), swipeLeft(), swipeRight(), swipeUp(), typeText(),
 * pressKey(), clearText() etc.
 */

/**
 * 3. ViewAssertion -> assert view's state using ViewInteraction.check(assertion
 * method), where assetion method can be isDisplayed(), isEnabled(), isRoot()
 */