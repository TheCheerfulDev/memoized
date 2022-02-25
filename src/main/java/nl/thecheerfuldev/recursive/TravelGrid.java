package nl.thecheerfuldev.recursive;

public class TravelGrid {

    public long travelGrid(int x, int y) {
        if (x == 0 || y == 0) {
            return 0;
        }
        if (x == 1 || y == 1) {
            return 1;
        }
        return travelGrid(x - 1, y) + travelGrid(x, y - 1);
    }

}
