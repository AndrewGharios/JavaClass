import java.util.HashMap;
import java.util.Map;

public class task16 {
    static Map<Integer, Integer> countEach(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : a) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return map;
    }

    public static void main(String[] args) {
        int[] a = {2, 1, 5, 7, 5, 2, 2, 2};
        System.out.println(countEach(a));
    }
}