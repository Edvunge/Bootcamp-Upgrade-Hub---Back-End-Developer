import java.util.Scanner;



public class ExercicioDoisInteiros {
    public static void main(String[] args) {
        /*
        Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando na tela uma das mensagens abaixo:
        - O primeiro valor é o maior - O segundo valor é o maior - Não existe valor maior, os dois são iguais
        */

        double numberOne;
        double numberTwo;


        Scanner input = new Scanner(System.in);

        // esta parte é para leitura de dos numeros pelo teclado.
        System.out.println(" Insira um numero:? ");
        numberOne = input.nextDouble();

        System.out.println(" Insira um segundo numero:? ");
        numberTwo = input.nextInt();

        if(numberOne > numberTwo){
            System.out.println(" O primeiro valor é o maior ");
        } else if (numberOne < numberTwo){
            System.out.println(" O segundo valor é o maior ");
        } else {
            System.out.println(" Não existe valor maior, os dois são iguais ");
        }


    }
}
