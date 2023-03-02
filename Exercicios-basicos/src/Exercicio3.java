
import java.util.Scanner;


public class Exercicio3 {

    public static void main(String[] Args) {

        double h = 0;
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        for (int i = 1; i <= n; i++) {
            h = h + (double) 1 / i;
        }
        System.out.println(String.format("%.0f", h));

    }
}
