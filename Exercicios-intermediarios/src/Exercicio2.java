
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int morangos = input.nextInt();
        int macas = input.nextInt();

        double total = 0;
        if (morangos <= 5) {
            total = total + morangos * 2.5;
        } else {
            total = total + morangos * 2.2;
        }
        if (macas <= 5) {
            total += macas * 1.8;
        } else {
            total += macas * 1.5;
        }
        if (morangos + macas > 8 || total > 25) {
            total = total - (total * 0.1);
        }
        System.out.println(total);
    }
}
