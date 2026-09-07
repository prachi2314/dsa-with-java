public class MissingNum {
    public static void main(String[] args) {
        int[] arr = {0, 1,4, 2};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] arr) {
        int n = arr.length;
        int expectedSum = n*(n+1)/2;
        int actualSum=0;
        for(int i=0; i<arr.length; i++){
            actualSum += arr[i];
        }
        return (expectedSum - actualSum);
    }
}
