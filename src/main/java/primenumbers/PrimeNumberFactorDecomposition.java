package primenumbers;

import java.util.ArrayList;
import java.util.List;

class PrimeNumberFactorDecomposition {

    List<Integer> decompose(int value) {
        List<Integer> integers = new ArrayList<Integer>();

        if (value > 1) {
            for (int i = 2; i <= value; i++) {
                while (value % i == 0) {
                    integers.add(i);
                    value = value / i;
                }
            }
        } else {
            integers.add(value);
        }
        return integers;
    }
}