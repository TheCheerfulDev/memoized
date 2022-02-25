package nl.thecheerfuldev.tabulation;

public class CanSumTabulation {

    public boolean canSumTabulation(int targetSum, int[] numbers) {
        boolean[] result = new boolean[targetSum + 1];
        result[0] = true;

        for (int i = 0; i < result.length; i++) {
            for (int number : numbers) {
                if (result[i] && i + number < result.length) {
                    result[i + number] = true;
                }
            }
        }
        return result[targetSum];
    }
}
