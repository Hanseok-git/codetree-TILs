import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Aa, Ba;
        char Am, Bm;

        Aa = sc.nextInt();
        Am = sc.next().charAt(0);
        Ba = sc.nextInt();
        Bm = sc.next().charAt(0);

        if ((Aa>=19 && Am == 'M') || (Ba>=19 && Bm == 'M')) {
            System.out.print("1");
        }
        else {
            System.out.print("0");
        }
    }
}