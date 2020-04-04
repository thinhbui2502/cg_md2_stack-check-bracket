import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String inputString = "s * (s – a) * (s – b) * (s – c)";
        Stack<Integer> bStack = new Stack<>();

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == '(') {
                bStack.push(i);
            } else if (inputString.charAt(i) == ')') {
                if (!bStack.isEmpty()) {
                    bStack.pop();
                } else {
                    bStack.push(i);
                }
            }
        }

        if (bStack.isEmpty()) {
            System.out.println("GOOD!");
        } else {
            System.out.println("FAILED!");
        }

    }
}
