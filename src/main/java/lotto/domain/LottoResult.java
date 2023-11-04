package lotto.domain;

import java.util.List;

public class LottoResult {
    private Integer correctNumbers;
    private Boolean isCorrectBonusNumber;

    public LottoResult(Integer correctNumbers, Boolean isCorrectBonusNumber) {
        this.correctNumbers = correctNumbers;
        this.isCorrectBonusNumber = isCorrectBonusNumber;
    }

    public Integer getCorrectNumbers() {
        return correctNumbers;
    }

    public Boolean getCorrectBonusNumber() {
        return isCorrectBonusNumber;
    }

    @Override
    public String toString() {
        return "LottoResult{" +
                "correctNumbers=" + correctNumbers +
                ", isCorrectBonusNumber=" + isCorrectBonusNumber +
                '}';
    }
}
