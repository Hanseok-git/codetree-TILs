import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char s1, s2, s3;
        int t1, t2, t3;
        

        s1 = sc.next().charAt(0);
        t1 = sc.nextInt();
        s2 = sc.next().charAt(0);
        t2 = sc.nextInt();
        s3 = sc.next().charAt(0);
        t3 = sc.nextInt();

        if(s1 == 'Y' && t1 >= 37) {
            if((s2 == 'Y' && t2 >= 37) || (s3 == 'Y' && t3 >= 37))
                System.out.println("E");
            else
                System.out.println("N");
        }
        else {
            if((s2 == 'Y' && t2 >= 37) && (s3 == 'Y' && t3 >= 37))
                System.out.println("E");
            else
                System.out.println("N");
        }

    }
}