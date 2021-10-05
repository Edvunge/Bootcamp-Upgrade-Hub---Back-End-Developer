import java.util.Scanner;



public class Exercise06AlistamentoMilitar {
    public static void main(String[] args) {

        /*
        Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua situação em relação ao
        alistamento militar. - Se estiver antes dos 18 anos, mostre em quantos anos faltam para o alistamento.
        - Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do alistamento.

        23:38 começo da digestao

        idade < 18
        18 - 13 = 5
        idadeObrigatoria - idadeUser = result


        idade > 18
        18 - 23 = 5
        idadeUser - idadeObrigatoria = result
        */

        int yearBorn;
        int yearCurrent = 2021;
        int ageMandatory = 18;

        Scanner input = new Scanner(System.in);

        System.out.println(" Qual é o seu ano de nascimento:? ");
        yearBorn = input.nextInt();

        /*
        idade <= 2021 - 1995
        */
        int age = yearCurrent - yearBorn;

        /*   inteiro idade = 1995 - 18   */
        int resultAge1 = yearBorn - ageMandatory;


        /*  inteiro idade = 18 - 1995   */
        int resultAge2 = yearBorn - ageMandatory ;


        if (age < ageMandatory){

            System.out.println(" Alistamento Militar: NÃO podes se inscrever, faltam-te " + resultAge2 + "Anos ");

        } else {

            System.out.println(" Alistamento Militar: já podes se inscrever, e passaste " + resultAge1 + "Anos " );

        }



    }
}
