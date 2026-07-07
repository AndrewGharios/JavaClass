import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Participant implements Comparable<Participant> {
    int id, score;
    Participant(int id, int score) {
        this.id = id;
        this.score = score;
    }
    
    @Override
    public int compareTo(Participant other) {
        if (this.score != other.score) {
            return other.score - this.score;
        }
        return this.id - other.id;
    }
}

public class lab20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Participant> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            int score = sc.nextInt();
            list.add(new Participant(id, score));
        }
        Collections.sort(list);
        for (Participant p : list) {
            System.out.println(p.id + " " + p.score);
        }
        sc.close();
    }
}