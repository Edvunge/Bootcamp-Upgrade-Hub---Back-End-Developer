import java.util.Scanner;


public class Exercise07DiaMulher {
    /*
    Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos para todos, mas especialmente para mulheres.
    Faça um programa que leia nome, sexo e o valor das compras do cliente e calcule o preço com desconto.
    Sabendo que:
    - Homens ganham 5% de desconto
    - Mulheres ganham 13% de desconto
    */
    public static void main(String[] args) {



        double aumentoSalarial;
        double valorCompras;
        int anosEmpresa;

        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        // esta parte é para leitura de string pelo teclado.
        System.out.println(" Qual é o seu nome:? ");
        String womemName = sc.nextLine();

        System.out.println(" Qual é o seu sexo:? ");
        String sexo = sc.nextLine();

        // esta parte é para leitura pelo teclado.
        System.out.println(" Qual é o valor das compras:? ");
        valorCompras = input.nextDouble();

        /*
         - Homens ganham 5% de desconto
         - Mulheres ganham 13% de desconto
        */


        if( 2 < valorCompras ){
            aumentoSalarial = salario + 3;
            System.out.println(" o seu salario com o aumento 3% é " + aumentoSalarial);
        } else {
            aumentoSalarial = salario + 20;
            System.out.println(" o seu salario com o aumento 20% é " + aumentoSalarial);
        }



    }
}
