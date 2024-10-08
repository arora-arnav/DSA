public class SecondLargestElementInArray {
    
    public static int secondLargest(int arr[], int n){
        int largest = arr[0];
        int sLargest = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            if (arr[i]>largest) {
                sLargest = largest;
                largest = arr[i];
            }
            else if (arr[i]<largest && arr[i]>sLargest) {
                sLargest = arr[i];
            }
        }
        return sLargest;
    }

    public static int secondSmallest(int arr[], int n){
        int smallest = arr[0];
        int sSmallest = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            if (arr[i]<smallest) {
                sSmallest =smallest;
                smallest = arr[i];
            }
            else if (arr[i]>smallest && arr[i]<sSmallest) {
                sSmallest = arr[i];
            }
        }
        return sSmallest;
    }
    public static void main(String[] args) {
        int [] arr = {1,3,11,7,6,5};
        System.out.println(secondLargest(arr,arr.length));
        System.out.println(secondSmallest(arr,arr.length));
    }
}
