import java.util.Scanner;

public interface HCF {
    
    public static int findHCF(int a, int b){
        int hcf = 1;
        for (int i = 1; i <= a; i++) {
            if (a%i==0&&b%i==0) {
                hcf=i;
            }
        }
        return hcf;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.err.println(findHCF(a, b));
    }
}
