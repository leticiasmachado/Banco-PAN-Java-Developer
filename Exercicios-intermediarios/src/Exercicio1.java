
import java.io.IOException;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String AN1, AN2, AN3;

        AN1 = sc.nextLine();
        AN2 = sc.nextLine();
        AN3 = sc.nextLine();

        if (AN1.equals("vertebrado")) {
            if (AN2.equals("ave")) {
                if (AN3.equals("carnivoro")) {
                    System.out.println("aguia");
                } else { //onivoro
                    System.out.println("pomba");
                }
            } else { //mamífero 
                if (AN3.equals("onivoro")) {
                    System.out.println("homem");
                } else { //herbívoro
                    System.out.println("vaca");
                }
            }
        } else { //invertebrado
            if (AN2.equals("inseto")) {
                if (AN3.equals("hematofago")) {
                    System.out.println("pulga");
                } else { //herbívoro
                    System.out.println("lagarta");
                }
            } else { //anelídeo
                if (AN3.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else { //onivoro
                    System.out.println("minhoca");
                }
            }
        }
    }
}
