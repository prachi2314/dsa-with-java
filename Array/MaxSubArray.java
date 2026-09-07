public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {4, -1, 2, 1};
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] arr) {
        int currentSum = 0;
        int maxSum = arr[0];
        for(int i=0; i<arr.length; i++){
            currentSum += arr[i];
            maxSum = Math.max(maxSum, currentSum);
            if(currentSum<0){
                currentSum = 0;
            }
        }
        
        return  maxSum;
    }
}
