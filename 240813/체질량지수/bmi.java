import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double h = sc.nextDouble();
        double w = sc.nextDouble();
        double b ;

        b = ((w*10000)/(h*h));

        System.out.println((int)b);
        
        if (b >= 25) {
            System.out.println("Obesity");
            
        }
    }
}