import java.util.Scanner;

public class Classe {
public static void main(String[] args) {

    System.out.println("dentrer un nombre x ");
    Scanner nombre1 =new Scanner(System.in);
    int x=nombre1.nextInt();
    System.out.println("dentrer un nombre y ");
    Scanner nombre2 =new Scanner(System.in);
    int y=nombre2.nextInt();
    System.out.println("dentrer un nombre a ");
    Scanner nombre3 =new Scanner(System.in);
    int a=nombre3.nextInt();
    System.out.println("dentrer un nombre b");
    Scanner nombre4 =new Scanner(System.in);
    int b=nombre4.nextInt();
    System.out.println("dentrer un nombre c ");
    Scanner nombre5 =new Scanner(System.in);
    int c=nombre5.nextInt();
    int somme = x+y+a+b+c;
    int resultat=somme /5;
    System.out.println("bonjoir la Moyene est" + " "+ resultat); 

    // if (x > 0) {
    //     int resultat= x/y;
    //     System.out.println("bonjoir la differance  est" +resultat+" ans"); 
    // }else{
    //     System.out.println("ble nombre ne dois pas etre nul"); 
    // }
  

}
    
}