import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

import java.util.Collection;


/**
 * Created by junkyu on 2017. 7. 8..
 */
public class HasSizeMatcher extends TypeSafeMatcher<Collection<? extends Object>> {
    private Matcher<Integer> matcher;

    public HasSizeMatcher(Matcher<Integer> matcher) {
        this.matcher = matcher;
    }

    @Override
    public boolean matchesSafely(Collection<? extends Object> collection){
        return matcher.matches(collection.size());
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("a collection with a size that is");
        matcher.describeTo(description);
    }
}
