import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String b;

        b = a >= 100 ? "pass" : "failure";

        System.out.println(b);

        // if (b == 0) {
        //     System.out.print("pass");
        // }
        //     else {
        //         System.out.print("failure");
        //     }

    }
}