import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        char s = sc.next().charAt(0);

        if (s == "Y") {
            if (t>=37) {
                System.out.println("E");
            }
            else {
                System.out.println("N");
            }
        }

        if (s == "N") {
            if (t>=37) {
                System.out.println("E");
            }
            else {
                System.out.println("N");
            }
        }
    }
}