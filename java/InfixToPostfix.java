import java.util.Stack;

public class InfixToPostfix {

    static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2;
            case '^': return 3;
        }
        return -1;
    }

    public static String convert(String exp) {
        String result = "";  // ← ganti StringBuilder dengan String biasa
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); ++i) {
            char c = exp.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                result += c;  // ← append() diganti +=
            } 
            else if (c == '(') {
                stack.push(c);                                                      // Saol : "a+b*(c^d-e)"
            } 
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result += stack.pop();  // ← append() diganti +=
                }
                stack.pop();
            } 
            else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result += stack.pop();  // ← append() diganti +=
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            result += stack.pop();  // ← append() diganti +=
        }

        return result;  // ← tidak perlu .toString()
    }

    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)";
        System.out.println("Infix  : " + exp);
        System.out.println("Postfix: " + convert(exp));
    }
}