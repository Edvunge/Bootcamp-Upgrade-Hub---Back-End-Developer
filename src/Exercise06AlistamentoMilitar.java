import java.util.Scanner;



public class Exercise06AlistamentoMilitar {
    public static void main(String[] args) {

        /*
        Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua situação em relação ao alistamento militar.
        - Se estiver antes dos 18 anos, mostre em quantos anos faltam para o alistamento.
        - Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do alistamento.
        */

        int yearBorn;
        int yearCurrent = 2021;
        int ageMandatory = 18;

        Scanner input = new Scanner(System.in);

        System.out.println(" Qual é o seu ano de nascimento:? ");
        yearBorn = input.nextInt();


        int age = yearCurrent - yearBorn;

        if (age < ageMandatory){
            int resultAge2 = ageMandatory - age;
            System.out.println(" Alistamento Militar: NÃO podes se inscrever, faltam-te " + resultAge2 + "Anos ");

        } else {
            int resultAge1 = age - ageMandatory ;
            System.out.println(" Alistamento Militar: já podes se inscrever, e passaste " + resultAge1 + "Anos " );

        }



    }
}