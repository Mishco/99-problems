package lists;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.hasSize;

public class P15Tests {

    @Test
    public void shouldDuplicateElementsInAList() {
        List<String> duplicates = P15.duplicate(Arrays.asList("a", "b", "c"), 3);
        assertThat(duplicates, hasSize(9));
        assertThat(duplicates, contains("a", "a", "a", "b", "b", "b", "c", "c", "c"));
    }

    @Test
    public void shouldDuplicateElementsInAListViaStream() {
        List<String> duplicates = P15.duplicateStream(Arrays.asList("a", "b", "c"), 3);
        assertThat(duplicates, hasSize(9));
        assertThat(duplicates, contains("a", "a", "a", "b", "b", "b", "c", "c", "c"));
    }

    @Test
    public void shouldBeEmptyList() {
        List<String> duplicates = P15.duplicateStream(Collections.emptyList(), 3);
        assertThat(duplicates, hasSize(0));
    }
}
