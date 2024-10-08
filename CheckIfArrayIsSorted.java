public class CheckIfArrayIsSorted {
    
    public static boolean checkArray(int arr[], int n){
        for (int i = 1; i < n; i++) {
            if (arr[i]>=arr[i-1]) {
                
            }
            else return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int [] arr = {1,3,2,3,3,2};
        System.out.println(checkArray(arr, arr.length));
        
    }
}
