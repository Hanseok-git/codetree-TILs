import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a;

        a = n*n;

        System.out.println(a);

        if ( n < 5 ) {
            System.out.print("tiny");
        }
    }
}