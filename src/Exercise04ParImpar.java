import javax.swing.*;
import java.util.Scanner;


public class Exercise04ParImpar {
    public static void main(String[] args) {
        /*
        Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou ÍMPAR.
        */

        int i;
        int numInteiro;

        Scanner input = new Scanner(System.in);

        System.out.println(" indique um numero:? ");
        numInteiro = input.nextInt();


        if(numInteiro % 2 == 0) {
            System.out.println("o numero " + numInteiro + " é PAR ");
        }else {
            System.out.println("o numero " + numInteiro + " é IMPAR ");
        }




    }
}
