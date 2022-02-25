package nl.thecheerfuldev.tabulation;

public class GridTravelerTabulation {

    public long travelGridTabulation(int x, int y) {

        long[][] table = new long[x + 1][y + 1];

        table[1][1] = 1;

        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= y; j++) {
                // pass my value to the next if not out of bounds
                if (j < y) {
                    table[i][j + 1] += table[i][j];
                }
                // pass my value to the cell below if not out of bounds
                if (i < x) {
                    table[i + 1][j] += table[i][j];
                }

            }
        }
        return table[x][y];
    }

}
