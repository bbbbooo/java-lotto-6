package lotto.service;

import camp.nextstep.edu.missionutils.Randoms;
import lotto.exception.InvalidInputException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoService {
    private static final String INVALID_NON_THOUSAND_UNIT = "1000원 단위로 입력해주세요.";
    private static final Integer MIN_NUMBER = 1;
    private static final Integer MAX_NUMBER = 45;
    private static final Integer NUMBER_STANDARD = 6;
    private static final Integer DIVIDE_STANDARD = 1000;

    public Integer purchaseLottoWithValidPrice(Integer inputMoney) {
        validateInputMoney(inputMoney);
        return inputMoney / DIVIDE_STANDARD;
    }

    private void validateInputMoney(Integer inputMoney) {
        if (!IsThousandUnit(inputMoney)) {
            throw new InvalidInputException(INVALID_NON_THOUSAND_UNIT);
        }
    }

    private Boolean IsThousandUnit(Integer inputMoney) {
        return inputMoney % DIVIDE_STANDARD == 0;
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
