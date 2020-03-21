/**
 * This is how espresso workflow do -> match -> act -> assert
 */

public class ExpressoFlow {
  @Test
  public void espressoFlow() {
    // Need to perform an action
    onview(withId(R.id.button)).perform(click());
    // check an action performed if it get the results required
    onview(withId(R.id.results_textview)).check(matches(withText("The button was clicked")));
  }
}
