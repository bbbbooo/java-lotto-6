package lotto.domain;

import lotto.exception.InvalidInputException;

import static lotto.constants.DomainConstants.MAX_BONUS_NUMBER;
import static lotto.constants.DomainConstants.MIN_BONUS_NUMBER;
import static lotto.constants.InputConstants.NUMERIC;
import static lotto.constants.InvalidExceptionConstants.INVALID_BONUS_NUMBER_RANGE_MESSAGE;
import static lotto.constants.InvalidExceptionConstants.INVALID_INPUT_MESSAGE;


public class BonusNumber {
    private final Integer number;

    public BonusNumber(String number) {
        validate(number);
        this.number = Integer.parseInt(number);
    }

    private void validate(String number) {
        if (!isNumeric(number)) {
            throw new InvalidInputException(INVALID_INPUT_MESSAGE);
        }
        if (isCorrectNumberRange(Integer.parseInt(number))) {
            throw new InvalidInputException(INVALID_BONUS_NUMBER_RANGE_MESSAGE);
        }
    }

    private boolean isNumeric(String number) {
        return number.matches(NUMERIC);
    }

    private boolean isCorrectNumberRange(Integer number) {
        return number < MIN_BONUS_NUMBER || number > MAX_BONUS_NUMBER;
    }

    public Integer getNumber() {
        return number;
    }
}
