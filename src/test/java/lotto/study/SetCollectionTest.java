package lotto.study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.*;

public class SetCollectionTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @DisplayName("Set의 size()를 활용해 Set의 크기를 확인하는지")
    @Test
    void confirmSetSize() {
        // given
        Integer expectedSetSize = 3;

        // when & then
        assertThat(numbers.size()).isEqualTo(expectedSetSize);
    }

    @DisplayName("Set의 contains() 메소드를 활용해 1, 2, 3의 값이 존재하는지를 확인하는지")
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void contains(Integer number) {
        // given & when & then
        assertThat(numbers.contains(number)).isTrue();
    }
}