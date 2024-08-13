import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = 0;

        if (a%2==0) {
            b = (a/2);
        }
        if (b%2==1) {
            System.out.print((b+1)/2);
        }
    }
}