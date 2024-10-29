package lotto.service;

import java.util.List;

public class LottoSeller {
    public static final int LOTTO_PRICE = 1000;

    private LottoSeller() {
    }

    public static List<Integer> sellLotto() {
        return LottoGenerator.generateLottoNumbers();
    }

}
