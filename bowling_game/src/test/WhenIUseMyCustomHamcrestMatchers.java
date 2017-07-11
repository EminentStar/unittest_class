import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by junkyu on 2017. 7. 8..
 */
public class WhenIUseMyCustomHamcrestMatchers {
    @Test
    public void thehasSizesMatcherShouldMatchACollectionWithExpectedSize(){
        List<String> items = new ArrayList<String>();
        items.add("java");
        assertThat(items, MyMatchers.hasSize(1));
    }
}
