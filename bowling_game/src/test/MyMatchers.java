import org.hamcrest.Factory;
import org.hamcrest.Matcher;

import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created by junkyu on 2017. 7. 8..
 */
public class MyMatchers {

    // All custom matchers go in a special Factory class
    @Factory
    public static Matcher<Collection<? extends Object>> hasSize(int value){
        return new HasSizeMatcher(is(value));
    }
}
