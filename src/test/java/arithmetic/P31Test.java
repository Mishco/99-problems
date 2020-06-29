package arithmetic;

import org.junit.jupiter.api.Test;

import java.util.AbstractMap.SimpleEntry;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertThat;

class P31Test {

    @Test
    public void shouldFindPrimeFactorsOf315() throws Exception {
        List<SimpleEntry<Integer, Integer>> primeFactors = P31.primeFactorsMult(315);
        assertThat(primeFactors, hasItems(new SimpleEntry<>(3, 2), new SimpleEntry<>(5, 1), new SimpleEntry<>(7, 1)));
    }

    @Test
    public void shouldFindPrimeFactorsOf33() throws Exception {
        List<SimpleEntry<Integer, Integer>> primeFactors = P31.primeFactorsMult(33);
        assertThat(primeFactors, hasItems(new SimpleEntry<>(3, 1), new SimpleEntry<>(11, 1)));
    }
}