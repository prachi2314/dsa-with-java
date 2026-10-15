public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int target = 60;

        int result = binarySearch(arr, target);
        System.out.println(result);
    }

    public static int binarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;

        while (low<=high) {
            int mid = low + (high-low)/2;
            if (arr[mid] == target) {
                return mid;
            } else if(arr[mid]>target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }
}
