package BiShi;

import java.util.Scanner;
import java.util.Stack;

public class JD1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            char[] s = str.toCharArray();
            Stack<Character> stack = new Stack<>();
            int num = 1;
            for(int i = 0; i <str.length(); i++) {
                if(s[i] == '('){
                    stack.push(s[i]);
                } else {
                    num *= stack.size();
                    stack.pop();
                }
            }
            System.out.println(num);
        }

    }
}