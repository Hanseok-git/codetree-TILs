import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if ( a > b ) {
            a -= b;
            System.out.println(a);
        }

        if ( a < b ) {
            b -= a;
            System.out.println(b);
        }

        if ( a == b ){
            a -= b;
            System.out.print(a);
        }
    }
}