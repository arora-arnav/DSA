import java.util.*;

public class LargestElementInArrays {
    public static void main(String[] args) {
        int arr[] = {2,3,123,34,245};
        int Largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>Largest) {
                Largest = arr[i];
            }
        }
        System.out.println(Largest);
    }
}
