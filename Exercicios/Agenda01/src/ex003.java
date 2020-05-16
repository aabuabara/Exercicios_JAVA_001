package src;

import java.util.Scanner;

public class ex003 {
    public static void main (final String[] args) {

        System.out.print("Digite a temperatura em graus Celsius: ");
        final Scanner entrada = new Scanner(System.in);
        final int temperatura = entrada.nextInt();
    
    System.out.print("A temperatura em Fahrenheit é: ");
    System.out.println(temperatura*1.8 + 32);
    }
    
}