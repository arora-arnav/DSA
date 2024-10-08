import java.util.Scanner;

public class a1 {
    
    public static int add2Nos(int no1, int no2){
        int sum = no1+no2;
        return sum;
    }

    public static int product2Nos(int no1, int no2){
        int product = no1*no2;
        return product;
    }

    public static int factorial(int no1){
        int fac = 1;
        for(int i = 1; i<=no1;i++){
            fac = fac * i;
        }
        return fac;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no1 = sc.nextInt();
        int no2 = sc.nextInt();
        System.out.println(add2Nos(no1,no2));
        System.out.println(product2Nos(no1,no2));
        System.out.println(factorial(no1));
    }
}
