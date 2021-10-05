import java.util.Scanner;


public class Exercise03CalcMedia {
    public static void main(String[] args) {
        /*
        Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua média e mostre na tela.
        No final, analise a média e mostre se o aluno teve ou não um bom aproveitamento (se ficou acima da média 7.0).
        */

        double fristNote;
        double secondNote;


        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);


        // esta parte é para leitura de string pelo teclado.
        System.out.println(" Qual é o seu nome:? ");
        String nameStudent = sc.nextLine();



        // esta parte é para leitura de das notas pelo teclado.
        System.out.println(" Qual é a sua primeira nota:? ");
        fristNote = input.nextDouble();

        System.out.println(" Qual é a sua segunda nota:? ");
        secondNote = input.nextInt();



        // esta parte é para o calculo da media do aluno
        double mediaStudent = ( fristNote + secondNote ) / 2 ;


        // esta secção é a saida na tela, de dados do aluno.
        System.out.println("Caro " + nameStudent + " bem-vindo");
        System.out.println("a sua primeira nota é: " + fristNote);
        System.out.println("a sua segunda nota é: " + secondNote);
        System.out.println("a media é  de: " + mediaStudent);



        if (mediaStudent > 7.0){
            System.out.println(" PARABENS!   ,   Caro estudante tiveste um bom aproveitamento. ");
        } else {
            System.out.println(" LAMENTAMOS!  ,   Caro estudante tiveste um mau aproveitamento. ");
        }


    }
}
