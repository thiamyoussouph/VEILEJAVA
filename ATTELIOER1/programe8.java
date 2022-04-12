import java.util.Scanner;

public class programe8 {
    public static void main(String[] args) {
        System.out.println("entrer un nombre");
        Scanner nombreSaisie=new Scanner(System.in);
        int nombre=nombreSaisie.nextInt();
        int i=1;
        do {
            System.out.println("les nombre sont: "+i);
            i ++;
        } while (i <=nombre);
    

    }
}
