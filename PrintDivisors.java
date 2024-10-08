import java.util.Scanner;

public class PrintDivisors {
    
    public static void printAllDivisors(int n){
        
        for(int i = 1 ; i<= n; i++){
            if (n%i==0) {
                System.out.print(i+" ");
                
                
            }
        }
    }

    public static int addAllDivisors(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                sum = sum +i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printAllDivisors(n);
        System.out.println(addAllDivisors(n));

    }
}
