

import java.util.Scanner;

public class TeteValeur {
    public static void main(String[] args) {
        System.out.println("entrer un nombre");
        Scanner nombre1=new Scanner(System.in);
        int premiernpmbre=nombre1.nextInt();
        System.out.println("entrer le deuxieme nombre");
        Scanner nombre2=new Scanner(System.in);
        int dexiemeNombre=nombre2.nextInt();
        int resultat=premiernpmbre + dexiemeNombre;

        if (premiernpmbre > dexiemeNombre) {
            System.out.println("la somme est :"+resultat);
            System.out.println("le nombre: "+premiernpmbre+ " est superieure au nombre: "+dexiemeNombre);
        }else if(premiernpmbre == dexiemeNombre){
            System.out.println("le nombre: "+premiernpmbre+ " et le nombre  "+dexiemeNombre+" sont egaux");
        }else {
            System.out.println("la somme est :"+resultat);
            System.out.println("le nombre: "+dexiemeNombre+ " est superieure au nombre: "+premiernpmbre);
        }
    }
}
