package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {

    private final Sample sample = new Sample();

    @Test
    void add_2_and_2_should_return_4() {
        int result = sample.op(Sample.Operation.ADD, 2, 2);

        Assertions.assertThat(result)
            .as("Addition of 2 and 2")
            .isEqualTo(4);
    }

    @Test
    void add_4_and_4_should_return_8() {
        int result = sample.op(Sample.Operation.ADD, 4, 4);

        Assertions.assertThat(result)
            .as("Addition of 4 and 4")
            .isEqualTo(8);
    }

    @Test
    void multi_4_and_4_should_return_16() {
        int result = sample.op(Sample.Operation.MULT, 4, 4);

        Assertions.assertThat(result)
            .as("Multiplication of 4 and 4")
            .isEqualTo(16);
    }
}
