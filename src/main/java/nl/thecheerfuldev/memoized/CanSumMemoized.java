package nl.thecheerfuldev.memoized;

import java.util.HashMap;
import java.util.Map;

public class CanSumMemoized {

    public boolean canSumMemoized(int targetSum, int[] numbers) {
        return canSumMemoized(targetSum, numbers, new HashMap<>());
    }

    private boolean canSumMemoized(int targetSum, int[] numbers, Map<Integer, Boolean> memo) {
        if (memo.containsKey(targetSum)) {
            return memo.get(targetSum);
        }
        if (targetSum == 0) {
            return true;
        }
        if (targetSum < 0) {
            return false;
        }

        for (int number : numbers) {
            int remainder = targetSum - number;
            memo.put(remainder, canSumMemoized(remainder, numbers, memo));
            if (memo.get(remainder)) {
                return true;
            }
        }
        return false;
    }

}
