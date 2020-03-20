package rocks.zipcode.quiz4.arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[values.length/2];
    }

    public static String[] removeMiddleElement(String[] values) {
        String[] ans = new String[values.length-1];
        for (int i = 0; i <values.length/2 ; i++) {
            ans[i] = values[i];
        }
        for (int i = values.length/2+1; i < values.length; i++) {
            ans[i-1] = values[i];
        }
        return ans;
    }

    public static String getLastElement(String[] values) {
        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {
        return null;
    }
}