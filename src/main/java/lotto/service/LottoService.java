package lotto.service;

import camp.nextstep.edu.missionutils.Randoms;
import lotto.exception.InvalidInputException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static lotto.constants.ServiceConstants.*;

public class LottoService {
    public Long purchaseLottoWithValidPrice(Long inputMoney) {
        validateInputMoney(inputMoney);
        return inputMoney / DIVIDE_STANDARD;
    }

    private void validateInputMoney(Long inputMoney) {
        if (!isThousandUnit(inputMoney)) {
            throw new InvalidInputException(INVALID_NON_THOUSAND_UNIT_MESSAGE);
        }
        if (isZero(inputMoney)) {
            throw new InvalidInputException(INPUT_ZERO_MESSAGE);
        }
    }

    private Boolean isZero(Long inputMoney) {
        return inputMoney.equals(ZERO_AMOUNT);
    }

    private Boolean isThousandUnit(Long inputMoney) {
        return inputMoney % DIVIDE_STANDARD == ZERO_AMOUNT;
    }

    public List<Integer> createRandomNumbers() {
        List<Integer> lottoNumbers = Randoms.pickUniqueNumbersInRange(MIN_NUMBER, MAX_NUMBER, NUMBER_STANDARD);
        return sortAscend(new ArrayList<>(lottoNumbers));
    }

    private List<Integer> sortAscend(List<Integer> lottoNumbers) {
        Collections.sort(lottoNumbers);
        return lottoNumbers;
    }
}
