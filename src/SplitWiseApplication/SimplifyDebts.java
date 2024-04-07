package SplitWiseApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimplifyDebts {

    public int simplifyDebts(int[][] transactions) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] txn : transactions) {
            int from = txn[0];
            int to = txn[1];
            int amount = txn[2];
            map.put(from, map.getOrDefault(from, 0) - amount);
            map.put(to, map.getOrDefault(to, 0) + amount);
        }

        List<Integer> balances = new ArrayList<>();
        for (int amount : map.values()) {
            if (amount != 0) {
                balances.add(amount);
            }
        }
        return dfs(balances, 0);
    }

    private int dfs(List<Integer> balances, int currentIndex) {
        if (balances.size() == 0 || currentIndex >= balances.size()) {
            return 0;
        }

        int currentValue = balances.get(currentIndex);

        if (currentValue == 0) {
            return dfs(balances, currentIndex + 1);
        }

        int minimumTxns = Integer.MAX_VALUE;
        for (int index = currentIndex + 1; index < balances.size(); index++) {
            int value = balances.get(index);
            if (currentValue * value < 0) {
                balances.set(index, currentValue + value);
                minimumTxns = Math.min(minimumTxns, 1 + dfs(balances, index + 1));
                balances.set(index, value);
            }
        }
        return minimumTxns;
    }

}
