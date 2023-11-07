package lotto.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class WinningLottoTest {
    private WinningLotto winningLotto;

    @BeforeEach
    void setUp() {
       this.winningLotto = new WinningLotto(List.of(1,2,3,4,5,6), new BonusNumber(30));
    }

    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(Arrays.asList(1,2,3,4,5,6), 6),
                Arguments.of(Arrays.asList(1,2,3,4,5,7), 5),
                Arguments.of(Arrays.asList(1,2,3,4,8,9), 4),
                Arguments.of(Arrays.asList(1,2,3,8,9,10), 3),
                Arguments.of(Arrays.asList(1,2,8,9,10,11), 2),
                Arguments.of(Arrays.asList(1,8,9,10,11,12),1),
                Arguments.of(Arrays.asList(7,8,9,10,11,12),0)
        );
    }

    @DisplayName("로또 내 숫자를 세어 얼마나 맞았는지 확인")
    @ParameterizedTest
    @MethodSource("generateData")
    void countCorrectNumbersTest(List<Integer> lottoNumbers, Integer expectedMatchingNumber) {
        // given & when
        Integer matchingNumber = winningLotto.countCorrectNumbers(new Lotto(lottoNumbers));

        // then
        assertThat(matchingNumber).isEqualTo(expectedMatchingNumber);
    }

    @Test
    void isCorrectBonusNumber() {
    }
}