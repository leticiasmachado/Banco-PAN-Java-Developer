
import static java.lang.Character.toLowerCase;
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strSplit = str.split(" ");
        int espacosEmBranco = strSplit.length - 1, quantVogais = 0;

        for (String item : strSplit) {
            for (int i = 0; i < item.length(); i++) {
                char carac = item.charAt(i);
                carac = toLowerCase(carac);
                if ((carac == 'a') || (carac == 'e') || (carac == 'i') || (carac == 'o') || (carac == 'u')) {
                    quantVogais++;
                }
            }

        }
        System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
    }
}
