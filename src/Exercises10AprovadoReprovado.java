import java.util.Scanner;

public class Exercises10AprovadoReprovado {
    public static void main(String[] args) {
        /*
        Crie um programa que leia duas notas de um aluno e calcule a sua média, mostrando uma mensagem no final,
        de acordo com a média atingida:
        - Média até 4.9: REPROVADO
        - Média entre 5.0 e 6.9: RECUPERAÇÃO
        - Média 7.0 ou superior: APROVADO
        */

        double fristNote;
        double secondNote;
        double media;


        Scanner input = new Scanner(System.in);

        // esta parte é para leitura de dos numeros pelo teclado.
        System.out.println(" Insira a primeira nota:? ");
        fristNote = input.nextDouble();

        System.out.println(" Insira a segunda nota:? ");
        secondNote = input.nextInt();

        media = ( fristNote + secondNote ) / 2;

        /*
          - Média até 4.9: REPROVADO
        - Média entre 5.0 e 6.9: RECUPERAÇÃO
        - Média 7.0 ou superior: APROVADO
        */
        if( media < 4.9){
            System.out.println(" LAMENTAMOS!! ,  REPROVADO ");
        } else if (media == 5.0 && media < 6.9){
            System.out.println(" estas em recuperação. ");
        } else {
            System.out.println(" PARABENS!! , APROVADO ");
        }


    }
}
