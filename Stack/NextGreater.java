import java.util.Arrays;
import java.util.Stack;

public class NextGreater {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 9, 12};
        System.out.println(Arrays.toString(nextGreater(arr)));
    }

    public static int[] nextGreater(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];
        
        for(int i = arr.length - 1; i >= 0; i--) {

            int current = arr[i];

            while(!stack.isEmpty() && stack.peek() <= current) {
                stack.pop();
            }

            if(stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            stack.push(current);
        }
        return result;
    }
}
