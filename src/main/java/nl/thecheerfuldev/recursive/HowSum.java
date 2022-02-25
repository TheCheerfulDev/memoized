package nl.thecheerfuldev.recursive;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HowSum {

    public List<Integer> howSum(int targetSum, int[] numbers) {
        if (targetSum == 0) {
            return new ArrayList<>();
        }
        if (targetSum < 0) {
            return null;
        }

        for (int number : numbers) {
            List<Integer> result = howSum(targetSum - number, numbers);
            if (result != null) {
                result.add(number);
                return result;
            }
        }

        return null;
    }

    public List<Integer> howSumMemoized(int targetSum, int[] array, Map<Integer, List<Integer>> calculated) {
        if (calculated.containsKey(targetSum)) {
            return calculated.get(targetSum);
        }
        if (targetSum == 0) {
            return new ArrayList<>();
        }
        if (targetSum < 0) {
            return null;
        }

        for (int number : array) {
            List<Integer> result = howSum(targetSum - number, array);
            if (result != null) {
                result.add(number);
                calculated.put(targetSum, new ArrayList<>(result));
                return calculated.get(targetSum);
            }
        }
        calculated.put(targetSum, null);
        return calculated.get(targetSum);
    }

}
