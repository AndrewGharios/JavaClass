import java.util.ArrayList;
import java.util.Iterator;

class A implements Iterable<Integer> {
    ArrayList<Integer> a = new ArrayList<>();

    void add(Integer e) {
        a.add(e);
    }

    @Override
    public Iterator<Integer> iterator() {
        return a.iterator();
    }

    public static void main(String[] args) {
        A arr = new A();
        arr.add(2);
        arr.add(1);
        arr.add(3);
        
        for (Integer k : arr) {
            System.out.println(k);
        }
    }
}