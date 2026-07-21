public class sumNum {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int result = sumOfElements(arr);
        System.out.println("Sum of elements: " + result);
    }

    public static int sumOfElements(int[] arr){
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
}
