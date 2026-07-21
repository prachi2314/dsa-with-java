/**
 * minNum
 */
public class minNum {
    public static void main(String[] args) {
        int[] arr = {25, 65, 4, 56, 52, 84};
        int result = minElement(arr);
        System.out.println("Min Element is: " + result);
    }

    public static int minElement(int[] arr){
        int min = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}