import java.util.Scanner;

public class programe9 {
    public static void main(String[] args) {
        System.out.println("entrer un reel");
        Scanner nombre_reel =new Scanner(System.in);
        float reel=nombre_reel.nextFloat();
        System.out.println("entrer la chaine de crcter ");
        Scanner chaine_carractere=new Scanner(System.in);
        String chaine=chaine_carractere.nextLine();
        System.out.println("entrer le nombre entier");
        Scanner nombre_entier=new Scanner(System.in);
        int entier=nombre_entier.nextInt();
        System.out.println("les valeur saisies sont:" + reel + chaine + entier);
    }
}
