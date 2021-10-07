import java.util.Scanner;

public class Exercises12AumentoSalarial {
    public static void main(String[] args) {
        /*
        Desenvolva um programa que leia o nome de um funcionário, seu salário,
        quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de acordo com a tabela a seguir:
        - Até 3 anos de empresa: aumento de 3%
        - entre 3 e 10 anos: aumento de 12.5%
        - 10 anos ou mais: aumento de 20%
        */


        double aumentoSalarial;
        double salario;
        int anosEmpresa;

        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        // esta parte é para leitura de string pelo teclado.
        System.out.println(" Qual é o seu nome:? ");
        String nameColaborete = sc.nextLine();

        // esta parte é para leitura pelo teclado.
        System.out.println(" Qual é o seu salario:? ");
        salario = input.nextDouble();

        System.out.println(" Insira os anos que trabalhas na empresa:? ");
        anosEmpresa = input.nextInt();

        if( anosEmpresa < 3){
           aumentoSalarial = salario + 3;
            System.out.println(" o seu salario com o aumento 3% é " + aumentoSalarial);
        } else if ( anosEmpresa == 3 && anosEmpresa < 10){
            aumentoSalarial = salario + 12.5;
            System.out.println(" o seu salario com o aumento 12.5% é " + aumentoSalarial );
        } else {
            aumentoSalarial = salario + 20;
            System.out.println(" o seu salario com o aumento 20% é " + aumentoSalarial);
        }



    }
}
