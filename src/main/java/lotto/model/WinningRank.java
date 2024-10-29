package lotto.model;

import java.util.HashMap;
import java.util.Map;

public class WinningRank {
    private static final Map<Integer, WinningRank> RANK_AND_MATCH = new HashMap<>();

    static {
        RANK_AND_MATCH.put(1, new WinningRank(1, 6));
        RANK_AND_MATCH.put(2, new WinningRank(2, 5));
        RANK_AND_MATCH.put(3, new WinningRank(3, 5));
        RANK_AND_MATCH.put(4, new WinningRank(4, 4));
        RANK_AND_MATCH.put(5, new WinningRank(5, 3));
        RANK_AND_MATCH.put(0, new WinningRank(0, 0));
    }

    private final int rank;
    private final int matchCount;

    private WinningRank(int rank, int matchCount) {
        this.rank = rank;
        this.matchCount = matchCount;
    }

    public static WinningRank getWinningRank(int rank) {
        return RANK_AND_MATCH.get(rank);
    }

    public int getMatchCount() {
        return matchCount;
    }

}
