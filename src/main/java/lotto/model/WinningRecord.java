package lotto.model;

public class WinningRecord {
    private static final int[] MATCH_COUNT_BY_RANK = {0, 6, 5, 5, 4, 3};

    private int matchCount;
    private PrizeRecord prizeRecord;

    public WinningRecord(int rank, PrizeRecord prizeRecord) {
        this.matchCount = MATCH_COUNT_BY_RANK[rank];
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
        return this.matchCount;
    }

}