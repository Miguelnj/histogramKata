
package Kata2;

import java.util.Map;

public class kata2 {

    public static void main(String[] args) {
        String[] data = {"Rosa","Juan","Miguel","Miguel","Juan","Miguel","Carmelo","Liz"};
        Histogram histo = new Histogram(data);
        Map<String,Integer> histogr = histo.getHistogram();

        for (String key:histogr.keySet()) {
            System.out.println(key + " -->" + histogr.get(key));
        }
    }
}
