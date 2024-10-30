package lotto.model;

import lotto.utility.Validator;

import java.util.HashMap;
import java.util.Map;

public class LottoNumber {
    private static final Map<Integer, LottoNumber> LOTTO_NUMBER = new HashMap<>();

    static {
        for (int i = 1; i <= 45; i++) {
            LOTTO_NUMBER.put(i, new LottoNumber(i));
        }
    }

    private final int number;

    LottoNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LottoNumber that = (LottoNumber) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(number);
    }

    public int getNumber(){
        return number;
    }

    public static LottoNumber getLottoNumber(int number) {
        return LOTTO_NUMBER.get(number);
    }

}