
/**
 * check for input taken and submit
 */

public class InputSubmit {
  @Test
  public void inputSubmit() {
    // scroll to buttom at the bottom of the screen
    onView(withId(R.id.submit_button)).perform(scrollTo()).check(matches(isCompletelyDisplayed()));
    // get the input
    onView(withId(R.id.input_text)).check(matches(isCompletelyDisplayed()));
    // add text to input
    onView(withId(R.id.input_text)).perfom(typeText("I love Coding")).check(hasText());
    // click submit action
    onView(withId(R.id.submit_button)).perfom(click());

    // After submit, we check on the next activity
    String activityName = NextActivity.class.getName();
    inteded(hasComponent(name));
  }
}