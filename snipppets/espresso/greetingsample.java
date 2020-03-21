/**
 * sample greetings test in java using espresso
 */
public class EspressoSampleGreet {
  @Test
  public void greetingSample() {
    // fill input field
    onView(withId(R.id.name_field)).perform(typeText("Kemboi"));
    // click submit button
    onView(withId(R.id.greet_button)).perform(click());
    // check output
    onView(withText("Hello Kemboi!")).check(matches(isDisplayed()));
  }
}
