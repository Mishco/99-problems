package lists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Collections;

import static java.util.Arrays.asList;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class P08Tests {

    @Test
    public void shouldRemoveConsecutiveDuplicatesInAList() {
        List<String> compressedList = P08.compress(asList("a", "a", "a", "a", "b", "c", "c", "d", "e", "e", "e", "e"));
        assertThat(compressedList, hasSize(5));
        assertThat(compressedList, contains("a", "b", "c", "d", "e"));
    }

    @Test
    public void shouldNotRemoveNonConsecutiveSimilarElementsFromAList() {
        List<String> compressedList = P08.compress(asList("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e"));
        assertThat(compressedList, hasSize(6));
        assertThat(compressedList, contains("a", "b", "c", "a", "d", "e"));
    }

    @Test
    public void shouldNotBeNull() {
        Assertions.assertThrows(NullPointerException.class, () -> P08.compress(null));
    }
    
    @Test
    public void shouldNotBeEmpty() {
        assertTrue(P08.compress(Collections.emptyList()).isEmpty());
    }
}
