public class LeftRotateArrayByOne {

    static public void rotateArray(int a[]){
        
        int temp = a[0];
        
        for (int i = 1; i < a.length; i++) {
            a[i-1]=a[i];
        }
        a[a.length-1]=temp;
        
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7};
        rotateArray(a);
        
    }
}