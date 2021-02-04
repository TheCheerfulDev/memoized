package nl.thecheerfuldev.memoized;

import java.util.HashMap;

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

    public long travelGridMemoized(int x, int y) {
        return travelGridMemoized(x, y, new HashMap<>());
    }

    private long travelGridMemoized(int x, int y, HashMap<String, Long> map) {
        if (x == 0 || y == 0) {
            return 0;
        }
        if (x == 1 || y == 1) {
            return 1;
        }
        final String key = x + "," + y;
        if (map.containsKey(key)) {
            return map.get(key);
        }
        map.put(key, travelGridMemoized(x - 1, y, map) + travelGridMemoized(x, y - 1, map));
        return map.get(key);
    }

}
