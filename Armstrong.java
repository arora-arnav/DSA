import java.util.Scanner;


public class Armstrong {
    
    public static int countDigits(int n){
        int c=0;
        while (n!=0) {
            int ld=n%10;
            c++;//no of digits
            n=n/10;           
        }
        return c;

    }

    public static boolean isArmstrong(int n){
        int sum =0;
        int originalNum = n;
        int noOfDigits = countDigits(n);
        while (n!=0) {
            int ld=n%10;
            sum = sum + (int)Math.pow(ld, noOfDigits);
            n=n/10;
        }
        if (originalNum==sum) {
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isArmstrong(n));
        

    }
}
