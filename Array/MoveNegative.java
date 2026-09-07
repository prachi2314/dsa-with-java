import java.util.Arrays;

public class MoveNegative {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        sortArrayByParity(arr);
        System.out.println((Arrays.toString(arr)));
    }

    public static void moveNegatives(int[] arr) {
        int i=0;
        int j=arr.length-1;

        while (i<j) {
            while (i<j && arr[i]<0) {
            i++;
            }

            while (i<j && arr[j]>=0) {
                j--;
            }

            if (i<j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        
    }

    // to move even first then odd in array
    public static int[] sortArrayByParity(int[] arr) {
        int i =0;
        int j=arr.length-1;

        while(i<j){
            while(i<j && arr[i]%2 == 0){
                i++;
            }
            while (i<j && arr[j]%2!= 0) {
                j--;
            }

            if (i<j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return arr;
    }
    
}