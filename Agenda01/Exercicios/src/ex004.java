package src;

import java.util.Scanner;

public class ex004 {

    public static void main (final String[] args) {

        System.out.print("Digite a temperatura em Fahrenheit: ");
        final Scanner entrada = new Scanner(System.in);
        final int temperatura = entrada.nextInt();
    
    System.out.print("A temperatura em graus Celsius é: ");
    System.out.println((temperatura-32)/1.8);
    }
    
}