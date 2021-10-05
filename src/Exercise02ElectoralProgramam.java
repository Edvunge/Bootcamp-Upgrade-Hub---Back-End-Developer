import java.util.Scanner;


public class Exercise02ElectoralProgramam{
    public static void main(String[] args) {
        /*
        Faça um programa que leia o ano de nascimento de uma pessoa,
        calcule a idade dela e depois mostre se ela pode ou não votar.
        */
        int yearBorn;
        int currentYear = 2021;


        Scanner input = new Scanner(System.in);

        System.out.println(" Qual é o seu ano de nascimento:? ");
        yearBorn = input.nextInt();


        int age =  currentYear - yearBorn;


        if(age > 18){
            System.out.println(" já podes votar, tens idade suficiente. ");
        } else{
            System.out.println(" UPS!!  LAMENTAMOS!  , mais não tens idade suficiente pra votar. ");
        }



    }
}
