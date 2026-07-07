import java.util.ArrayList;
import java.util.Scanner;

public class lab14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> stack = new ArrayList<>();
        
        while (true) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            String cmd = parts[0];
            
            if (cmd.equals("push")) {
                int n = Integer.parseInt(parts[1]);
                stack.add(n);
                System.out.println("ok");
            } else if (cmd.equals("pop")) {
                System.out.println(stack.remove(stack.size() - 1));
            } else if (cmd.equals("back")) {
                System.out.println(stack.get(stack.size() - 1));
            } else if (cmd.equals("size")) {
                System.out.println(stack.size());
            } else if (cmd.equals("clear")) {
                stack.clear();
                System.out.println("ok");
            } else if (cmd.equals("exit")) {
                System.out.println("bye");
                break;
            }
        }
        sc.close();
    }
}