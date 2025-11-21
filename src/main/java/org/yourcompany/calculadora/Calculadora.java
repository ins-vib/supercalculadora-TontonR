package org.yourcompany.calculadora;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Calculadora amb diverses funcions matemàtiques i utilitats.
 * Mostra un menú per seleccionar operacions com sumes, factorials,
 * potències, llançaments de moneda i preus d'entrada de cinema.
 * Totes les funcions són estàtiques i poden ser cridades directament
 * sense instanciar la classe.
 * * @author Ruben
 */
public class Calculadora {

    /**
     * Constructor per defecte de la classe Calculadora.
     * No fa res especial ja que totes les funcions són estàtiques.
     */
    public Calculadora() {
        // Constructor buit per eliminar el warning de Javadoc
    }

    /**
     * Punt d'entrada del programa.
     * Executa el menú de la calculadora.
     *
     * @param args Arguments de línia de comandes (no utilitzat)
     */
    public static void main(String[] args) {
        MostraMenu();
    }

    /**
     * Calcula el nombre de dígits d’un número enter.
     * Funciona tant per a nombres positius com negatius.
     * Si el nombre és 0, retorna 1.
     *
     * @param nombre Número del qual es vol saber el nombre de dígits
     * @return Retorna la cuantitat de dígits que conté nombre
     */
    public static int nombreDigits(int nombre) {
        if (nombre == 0) {
            return 1;
        }       
        int comptador = 0;
        while (nombre != 0) {
            nombre /= 10;
            comptador++; 
        }
        return comptador;
    }

    /**
     * Calcula la suma dels primers n números enters.
     *
     * @param n Número enter positiu fins al qual es vol sumar
     * @return Suma dels primers n números
     */
    public static int sumaPrimersNumeros(int n) {
        int suma = 0, i = 0;
        while (n >= i) {
            suma += i;
            i++;
        }
        return suma;
    }

    /**
     * Calcula el factorial d’un nombre enter.
     *
     * @param n Número enter positiu del qual es vol calcular el factorial
     * @return Factorial del número
     */
    public static int calcularFactorial(int n) {
        int factorial = 1, i = 1;
        while (n >= i) {
            factorial *= i;
            i++;
        }
        return factorial;
    }
    
    /**
     * Calcula la suma dels quadrats dels primers n números enters.
     *
     * @param n Número enter positiu fins al qual es vol sumar els quadrats
     * @return Suma dels quadrats dels primers n números
     */
    public static int sumaQuadrats(int n) {
        int suma = 0, i = 0;
        while (n >= i) {
            suma += (i*i);
            i++;
        }
        return suma;
    }

    /**
     * Calcula la potencia d’un número enter.
     *
     * @param base Número enter base
     * @param exponent Número enter exponent
     * @return Resultat de base elevat a exponent
     */
    public static int calcularPotencia(int base, int exponent) {
        int i = 0, resultat = 1;
        resultat *= base;
        System.out.print(base);
        while (i < exponent - 1) {
            resultat *= base;
            System.out.print(" * " + base);
            i++;
        }
        System.out.println(" = " + resultat);
        return resultat;
    }

    /**
     * Llança una moneda un nombre determinat de vegades i compta les cares.
     *
     * @param n Nombre de llançaments de moneda
     * @return Nombre de cares que han sortit
     */
    public static int caresMoneda(int n) {
        Random random = new Random();
        int moneda, cara = 0, creu = 0, i = 0;
        while (i <= n) {
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

    /**
     * Calcula el preu final d'una entrada de cinema amb descomptes i recàrrecs.
     *
     * @param preu_base Preu base de l'entrada
     * @param cap_setmana Indica si és cap de setmana
     * @param carnet_jove Indica si es té carnet jove
     * @return Preu final de l'entrada
     */
    public static double entradaCinema(double preu_base, boolean cap_setmana, boolean carnet_jove) {
        double per = 1.0;
        if (cap_setmana) {
            per *= 1.1;
        }
        if (carnet_jove) {
            per *= 0.85;
        }
        return preu_base * per;
    }

    /**
     * Mostra el menú d'opcions de la calculadora i executa les funcions corresponents.
     */
    public static void MostraMenu() {
        int resposta;
        int int_val_usuari1, int_val_usuari2;
        Scanner teclat = new Scanner(System.in);

        while (true){
            System.out.println("Menu Supercalculadora");
            System.out.println("\n1- Suma dels primers n números\n\n2- Factorial d'un nombre\n\n3- Suma dels quadrats dels primers n números\n\n4- Potència dels primers n números\n\n5- Nombre de dígits d'un nombre\n\n6- Sortir\n\n7- Cares moneda \n\n8- Entrada cinema");
            try{
                resposta = teclat.nextInt();
                switch (resposta) {
                    case 1 -> {
                        System.out.println("Introdueix un número enter positiu:");
                        int_val_usuari1 = teclat.nextInt();
                        System.out.println("Suma dels primers "+int_val_usuari1+" números: " + sumaPrimersNumeros(int_val_usuari1));
                    }
                    case 2 -> {
                        System.out.println("Introdueix un número enter positiu:");
                        int_val_usuari1 = teclat.nextInt();
                        System.out.println("Factorial de "+int_val_usuari1+": " + calcularFactorial(int_val_usuari1));
                    }
                    case 3 -> {
                        System.out.println("Introdueix un número enter positiu:");
                        int_val_usuari1 = teclat.nextInt();
                        System.out.println("Suma dels quadrats dels primers "+int_val_usuari1+" números: " + sumaQuadrats(int_val_usuari1));
                    }
                    case 4 -> {
                        System.out.println("Introdueix un número enter positiu:");
                        int_val_usuari1 = teclat.nextInt();
                        System.out.println("Introdueix un altre número enter positiu:");
                        int_val_usuari2 = teclat.nextInt();
                        System.out.println("El número "+int_val_usuari1+" elevat a la "+int_val_usuari2+" és: " + calcularPotencia(int_val_usuari1, int_val_usuari2));
                    }
                    case 5 -> {
                        System.out.println("Introdueix un número enter positiu:");
                        int_val_usuari1 = teclat.nextInt();
                        System.out.println("Nombre de dígits de "+int_val_usuari1+": " + nombreDigits(int_val_usuari1));
                    }
                    case 6 -> {
                        System.out.println("Sortir");
                        return; // O break; si volguessim trencar només el switch i no el while
                    }
                    case 7 -> {
                        System.out.println("Introdueix el nombre de vegades que vols tirar la moneda:");
                        int_val_usuari1 = teclat.nextInt();
                        System.out.println("Nombre de cares obtingudes: " + caresMoneda(int_val_usuari1));
                    }
                    case 8 -> {
                        System.out.println("Introdueix el preu base de l'entrada:");
                        double preu_base = teclat.nextDouble();
                        System.out.println("Es cap de setmana? (true/false):");
                        boolean cap_setmana = teclat.nextBoolean();
                        System.out.println("Tens carnet jove? (true/false):");
                        boolean carnet_jove = teclat.nextBoolean();
                        System.out.println("Preu entrada cinema: " + entradaCinema(preu_base, cap_setmana, carnet_jove)+"€");
                    }
                    default -> System.out.println("Opció no vàlida, torna-ho a intentar");
                }
            } catch (InputMismatchException e) {
                System.out.println("El numero no és un valor no valid");
                teclat.nextLine();
            }
        }
    }
}