import java.util.*;

class PostfixEvaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expr = sc.nextLine(); 
        System.out.println(evaluatePostfix(expr));
        sc.close();
    }

    public static int evaluatePostfix(String expr) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = expr.split("\\s+"); 
        for (String token : tokens) {
            if (isOperator(token)) {
                int b = stack.pop();
                int a = stack.pop();
                int result = applyOperator(a, b, token);
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token)); 
            }
        }
        return stack.pop(); 
    }

    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || 
               token.equals("*") || token.equals("/");
    }

    private static int applyOperator(int a, int b, String op) {
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b; 
            default: throw new IllegalArgumentException("Invalid operator: " + op);
        }
    }
}
