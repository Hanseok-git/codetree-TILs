import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Am = sc.nextInt();
        int Bm = sc.nextInt();
        int As = sc.nextInt();
        int Bs = sc.nextInt();        

        if (Am>Bm && As>Bs) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
}