package lotto.model;

import lotto.utility.Validator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BoughtLotto {
    private static final Map<Integer, LottoNumber> LOTTO_NUMBER = new HashMap<>();

    static {
        for (int i = 1; i <= 45; i++) {
            LOTTO_NUMBER.put(i, new LottoNumber(i));
        }
    }

    private final List<LottoNumber> numbers;

    public BoughtLotto(List<Integer> numbers) {
        Validator.isValidNumbers(numbers);

        this.numbers = numbers.stream()
                .map(LOTTO_NUMBER::get)
                .collect(Collectors.toList());
    }

    public List<LottoNumber> getNumbers() {
        return numbers;
    }

    public List<Integer> getIntegerTypeNumbers() {
        return numbers.stream()
                .map(LottoNumber::getNumber)
                .collect(Collectors.toList());
    }

}
