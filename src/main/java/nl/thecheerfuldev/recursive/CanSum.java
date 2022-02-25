package nl.thecheerfuldev.recursive;

public class CanSum {

    public boolean canSum(int targetSum, int[] numbers) {
        if (targetSum == 0) {
            return true;
        }
        if (targetSum < 0) {
            return false;
        }

        for (int number : numbers) {
            if (canSum(targetSum - number, numbers)) {
                return true;
            }
        }
        return false;
    }
}
