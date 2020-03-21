/**
 * there are instance, a user need to scroll 
 * before they are able to get and element
*/

onView(withId(R.id.submit_button))
  .perform(scrollTo())
  .check(matches(isCompletelyDisplayed()));
