import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(((n%2==1) && n<=9) || ((n%2==0) && n>=10)) { 
            if (((n%2==0) && n<10) && n!=2 || n == 11) {
                System.out.println("30");
            }
            System.out.println("31");
        }
        else {
            System.out.println("28");
        }
    }
}