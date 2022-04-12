import java.util.Scanner;

public class programe7 {
public static void main(String[] args) {
    System.out.println("entrer un nombre entre 0 et 100");
    Scanner nombreSaisie=new Scanner(System.in);
  int nombre=nombreSaisie.nextInt();
  if (nombre==0) {
    System.out.println("le nombre saisie est nul");
  }else if (nombre <0) {
    System.out.println("le nombre saisie est negatif");
  }else{
    System.out.println("le nombre saisie est positif");
  }
}
    
}