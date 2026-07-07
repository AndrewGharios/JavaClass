import java.util.TreeSet;
import java.util.Comparator;

public class task7 {
    static class IntCmp implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            if (o1 % 2 == 0 && o2 % 2 != 0) return -1;
            if (o1 % 2 != 0 && o2 % 2 == 0) return 1;
            return o1.compareTo(o2);
        }
    }

    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>(new IntCmp());
        for (int i = 1; i <= 10; i++) {
            set.add(i);
        }
        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}