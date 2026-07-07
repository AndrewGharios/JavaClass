import java.util.Scanner;
import java.util.Stack;

public class lab12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        boolean ok = true;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    ok = false;
                    break;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    ok = false;
                    break;
                }
            }
        }
        
        System.out.println(ok && stack.isEmpty() ? "yes" : "no");
        sc.close();
    }
}