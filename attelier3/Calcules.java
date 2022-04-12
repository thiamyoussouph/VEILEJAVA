import java.util.Scanner;

public class Calcules {
    public static void main(String[] args) {
        System.out.println("dentrer un nombre x ");
        Scanner nombre1 =new Scanner(System.in);
        int x=nombre1.nextInt();
        System.out.println("dentrer un nombre y ");
        Scanner nombre2 =new Scanner(System.in);
        int y=nombre2.nextInt();
        addition(x,y);
        System.out.println("le resulta est ");
    }
    public static int addition(int nb1, int nb2){
     int  resultat= nb1 + nb2 ;
     return resultat;

    }
}
