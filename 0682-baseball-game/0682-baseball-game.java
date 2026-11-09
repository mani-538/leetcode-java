import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String operation : operations) {
            if (operation.equals("C")) {
                stack.pop();

            } else if (operation.equals("D")) {
                stack.push(stack.peek() * 2);

            } else if (operation.equals("+")) {
                int lastScore = stack.pop();
                int newScore = lastScore + stack.peek();

                stack.push(lastScore);
                stack.push(newScore);

            } else {
                stack.push(Integer.parseInt(operation));
            }
        }

        int total = 0;

        for (int score : stack) {
            total += score;
        }

        return total;
    }
}