import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n>=1 && n<=12) {
            if (n==2) {
                System.out.println("28");
            }
            System.out.println("31");
        }
    }
}