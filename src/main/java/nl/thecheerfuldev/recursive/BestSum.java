package nl.thecheerfuldev.recursive;

import java.util.ArrayList;
import java.util.List;

public class BestSum {

    public List<Integer> bestSum(int targetSum, int[] numbers) {
        if (targetSum == 0) {
            return List.of();
        }
        if (targetSum < 0) {
            return null;
        }

        List<Integer> shortestCombination = null;

        for (int number : numbers) {
            int remainder = targetSum - number;
            List<Integer> remainderCombination = bestSum(remainder, numbers);
            if (remainderCombination != null) {
                List<Integer> combination = new ArrayList<>(remainderCombination);
                combination.add(number);

                if ( shortestCombination == null || combination.size() < shortestCombination.size()) {
                    shortestCombination = combination;
                }
            }
        }
        return shortestCombination;
    }

}
