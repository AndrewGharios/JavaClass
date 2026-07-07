import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(10, 5, 20, 3, 15));
        System.out.println(Collections.min(a) + " " + Collections.max(a));
    }
}