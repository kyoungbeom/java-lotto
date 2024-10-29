package lotto.model;

import lotto.utility.Validator;

public class WinningRecord {

    private final WinningRank winningRank;
    private final PrizeRecord prizeRecord;

    public WinningRecord(int rank, PrizeRecord prizeRecord) {
        Validator.isValidRank(rank);

        this.winningRank = WinningRank.getWinningRank(rank);
        this.prizeRecord = prizeRecord;
    }

    public void increaseWinningCount() {
        prizeRecord.increaseWinningCount();
    }

    public int calculateTotalPrize() {
        return prizeRecord.calculateTotalPrize();
    }

    public int getPrize() {
        return prizeRecord.getPrize();
    }

    public int getWinningCount() {
        return prizeRecord.getWinningCount();
    }

    public int getMatchCount() {
        return winningRank.getMatchCount();
    }

}