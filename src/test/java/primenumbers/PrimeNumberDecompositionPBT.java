package primenumbers;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitQuickcheck.class)
public class PrimeNumberDecompositionPBT {

    private final PrimeNumberFactorDecomposition primeNumberFactorDecomposition = new PrimeNumberFactorDecomposition();

    @Property
    public void the_multiplication_of_all_factors_should_be_equals_to_input_value(@InRange(minInt = 1, maxInt = 1000000) int numericValue) {
        Optional<Integer> multiplication = primeNumberFactorDecomposition.decompose(numericValue).stream().reduce((i1, i2) -> i1 * i2);
        assertThat(multiplication).contains(numericValue);
    }

}
