package nl.thecheerfuldev.memoized;

public class CanSum {

    public boolean canSum(int targetSum, int[] array) {
        if (targetSum == 0) {
            return true;
        }
        if (targetSum < 0) {
            return false;
        }

        for (int number : array) {
            if (canSum(targetSum - number, array)) {
                return true;
            }
        }
        return false;
    }
}
