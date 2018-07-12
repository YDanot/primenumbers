package primenumbers;

import org.assertj.core.api.Assertions;
import org.assertj.core.util.Lists;
import org.junit.Test;
import primenumbers.PrimeNumberFactorDecomposition;

import java.util.List;

public class PrimeNumberDecompositionTest {

    private final PrimeNumberFactorDecomposition primeNumberFactorDecomposition = new PrimeNumberFactorDecomposition();

    @Test
    public void _1_should_be_decompose_in_1() {
        Assertions.assertThat(primeNumberFactorDecomposition.decompose(1)).isEqualTo(Lists.newArrayList(1));
    }

    @Test
    public void _2_should_be_decompose_in_2() {
        Assertions.assertThat(primeNumberFactorDecomposition.decompose(2)).isEqualTo(Lists.newArrayList(2));
    }

    @Test
    public void _3_should_be_decompose_in_3() {
        Assertions.assertThat(primeNumberFactorDecomposition.decompose(3)).isEqualTo(Lists.newArrayList(3));
    }

    @Test
    public void _4_should_be_decompose_in_2_2() {
        Assertions.assertThat(primeNumberFactorDecomposition.decompose(4)).isEqualTo(Lists.newArrayList(2, 2));
    }

    @Test
    public void _6_should_be_decompose_in_2_3() {
        Assertions.assertThat(primeNumberFactorDecomposition.decompose(6)).isEqualTo(Lists.newArrayList(2, 3));
    }

    @Test
    public void _8_should_be_decompose_in_2_2_2() {
        Assertions.assertThat(primeNumberFactorDecomposition.decompose(8)).isEqualTo(Lists.newArrayList(2, 2, 2));
    }

    @Test
    public void _9_should_be_decompose_in_3_3() {
        Assertions.assertThat(primeNumberFactorDecomposition.decompose(9)).isEqualTo(Lists.newArrayList(3, 3));
    }

    @Test
    public void _11_should_be_decompose_in_11() {
        Assertions.assertThat(primeNumberFactorDecomposition.decompose(11)).isEqualTo(Lists.newArrayList(11));
    }

    @Test
    public void _12345_should_be_decompose_in_3_5_823() {
        Assertions.assertThat(primeNumberFactorDecomposition.decompose(12345)).isEqualTo(Lists.newArrayList(3, 5, 823));
    }

    private List<Integer> decompose(int value) {
        return primeNumberFactorDecomposition.decompose(value);
    }
}
