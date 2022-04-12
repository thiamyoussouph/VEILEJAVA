import java.util.Scanner;

public class ControleBoucleDoWhiles {
    public static void main(String[] args) {
        Scanner clavier =new Scanner(System.in);
        int nombres;
        do {
            System.out.println("dentrer un nombre positif ");
            nombres=clavier.nextInt();
            
        } while (nombres < 0);
        System.out.println("vous avez entrer une valeur positif ");
    }
}
