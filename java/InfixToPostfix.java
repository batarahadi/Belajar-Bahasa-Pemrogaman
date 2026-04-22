import java.util.Stack;

public class InfixToPostfix {

    // Menentukan prioritas operator
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
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); ++i) {
            char c = exp.charAt(i);

            // Jika karakter adalah operan (angka/huruf), langsung masukkan ke hasil
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            } 
            // Jika '(', masukkan ke stack
            else if (c == '(') {
                stack.push(c);
            } 
            // Jika ')', keluarkan semua dari stack sampai ketemu '('
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            } 
            // Jika operator (+, -, *, /)
            else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        // Keluarkan sisa operator dari stack
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)";
        System.out.println("Infix  : " + exp);
        System.out.println("Postfix: " + convert(exp));
    }
}