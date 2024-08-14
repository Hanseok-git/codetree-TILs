import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();

        if (3<=m && m<=5) {
            System.out.print("Spring");
        }
        if (6<=m && m<=8) {
            System.out.print("Summer");
        }
        if (9<=m && m<=11) {
            System.out.print("Fall");
        }
        if ((1<=m && m<=2) || m==12) {
            System.out.print("Winter");
        }
    }
}