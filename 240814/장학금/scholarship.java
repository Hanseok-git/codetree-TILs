import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int l = sc.nextInt();

        if (90<= m && 95<=l) {
            System.out.print("100000");
        }
        else if (90<=m && (90<=l && l<95)) {
            System.out.print("50000");
        }
        else {
            System.out.print("0");
        }
    }
}