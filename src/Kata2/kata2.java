
package Kata2;

import java.util.HashMap;
import java.util.Map;

public class kata2 {

    public static void main(String[] args) {
        int[] data = {1,1,2,0,0,1,3};
        Map<Integer,Integer> histogram = new HashMap<>();

        for (int value: data) {
            histogram.put(value,histogram.containsKey(value) ?
                    histogram.get(value) +1 : 1);
        }

        for (int key:histogram.keySet()) {
            System.out.println(key + " -->" + histogram.get(key));
        }

    }
}
