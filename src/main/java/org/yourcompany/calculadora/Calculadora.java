

package org.yourcompany.calculadora;


/**
*
* @author Posa el teu nom
*/
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class Calculadora {


   public static void main(String[] args) {
       int resposta = 0;
       int int_val_usuari1 = 0, int_val_usuari2 = 0;
       Scanner teclat = new Scanner(System.in);


       while (true){
           System.out.println("Menu Supercalculadora");
           System.out.println("\n1- Suma dels primers n números\n\n2- Factorial d'un nombre\n\n3- Suma dels quadrats dels primers n números\n\n4- Potència dels primers n números\n\n5- Nombre de dígits d'un nombre\n\n6- Sortir\n\n7- Entrada cinema");
           try{
               resposta = teclat.nextInt();
               if (resposta == 1){
                   System.out.println("Introdueix un número enter positiu:");
                   int_val_usuari1 = teclat.nextInt();
                   System.out.println("Suma dels primers "+int_val_usuari1+" números: " + sumaPrimersNumeros(int_val_usuari1));
               } else if (resposta == 2){
                   System.out.println("Introdueix un número enter positiu:");
                   int_val_usuari1 = teclat.nextInt();
                   System.out.println("Factorial de "+int_val_usuari1+": " + calcularFactorial(int_val_usuari1));
               } else if (resposta == 3){
                   System.out.println("Introdueix un número enter positiu:");
                   int_val_usuari1 = teclat.nextInt();
                   System.out.println("Suma dels quadrats dels primers "+int_val_usuari1+" números: " + sumaQuadrats(int_val_usuari1));
               } else if (resposta == 4){
                   System.out.println("Introdueix un número enter positiu:");
                   int_val_usuari1 = teclat.nextInt();
                   System.out.println("Introdueix un altre número enter positiu:");
                   int_val_usuari2 = teclat.nextInt();
                   System.out.println("El número "+int_val_usuari1+" elevat a la "+int_val_usuari2+" és: " + calcularPotencia(int_val_usuari1, int_val_usuari2));
               } else if (resposta == 5){
                   System.out.println("Introdueix un número enter positiu:");
                   int_val_usuari1 = teclat.nextInt();
                   System.out.println("Nombre de dígits de "+int_val_usuari1+": " + nombreDigits(int_val_usuari1));
               } else if (resposta == 6){
                   System.out.println("Sortir");
                   break;
               } else if (resposta == 7){
                   System.out.println("Introdueix el nombre de vegades que vols tirar la moneda:");
                   int_val_usuari1 = teclat.nextInt();
                   System.out.println("Nombre de cares obtingudes: " + caresMoneda(int_val_usuari1));
               } else if (resposta == 8){
                   System.out.println("Introdueix el preu base de l'entrada:");
                   double preu_base = teclat.nextDouble();
                   System.out.println("Es cap de setmana? (true/false):");
                   boolean cap_setmana = teclat.nextBoolean();
                   System.out.println("Tens carnet jove? (true/false):");
                   boolean carnet_jove = teclat.nextBoolean();
                   System.out.println("Preu entrada cinema: " + entradaCinema(preu_base, cap_setmana, carnet_jove)+"€");
               } else {
                   System.out.println("Opció no vàlida, torna-ho a intentar");
               }
           } catch (InputMismatchException e) {
               System.out.println("El numero no és un valor no valid");
               teclat.nextLine();
           }
       }
   }


   /**
    * Calcula el nombre de dígits d’un número enter.
    * Funciona tant per a nombres positius com negatius.
    * Si el nombre és 0, retornaa 1.
    *
    * @param nombre Número del qual es vol saber el nombre de dígits
    * @return Quantitat de dígits que té {@code nombre}
    */
   public static int nombreDigits(int nombre) {
       if (nombre == 0) {
           return 1; // el 0 té un dígit
       }       
       int comptador = 0;
       while (nombre != 0) {
           nombre /= 10;
           comptador++; 
       }
       return comptador;
   }


   public static int sumaPrimersNumeros(int n) {
       int suma = 0, i = 0;
       while (n >= i) {
           suma += i;
           i++;
       }
       return suma;
   }
  

   public static int calcularFactorial(int n) {
       int factorial = 1, i = 1;
       while (n >= i) {
           factorial *= i;
           i++;
       }
       return factorial;
   }
   public static int sumaQuadrats(int n) {
       int suma = 0, i = 0;
       while (n >= i) {
           suma += (i*i);
           i++;
       }
       return suma;
   }


   public static int calcularPotencia(int base, int exponent) {
       int i = 0, resultat = 1;
       while (i < exponent) {
           resultat *= base;
           i++;
       }
       return resultat;
   }


   public static int caresMoneda(int n) {
       Random random = new Random();
       int moneda = 0, cara = 0, creu = 0, i = 0;
       while (i <= n){
           moneda = random.nextInt(0,2);
           if(moneda==1){
               creu++;
           } else {
               cara++;
           }
           i++;
       }
       return cara;
   }
  
   public static double entradaCinema(double preu_base, boolean cap_setmana, boolean carnet_jove) {
       double per = 1.0;
       if (cap_setmana == true) {
           per = per * 1.1;
       }
       if (carnet_jove == true) {
           per = per *0.85;
       }
       double preuFinal = preu_base*per;
       return preuFinal;
   }
}






