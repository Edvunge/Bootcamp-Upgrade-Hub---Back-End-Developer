import java.util.Scanner;

public class Exercise01CarVelocity {
    public static void main(String[] args) {
        /*
        Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse 80Km/h,
        exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba o valor da multa,
        cobrando R$5 por cada Km acima da velocidade permitida.

        */

        int carVelocity;
        int multa = 5;
        int velocityPermited = 80;



        Scanner input = new Scanner(System.in);

        System.out.println(" Qual é a velocidade do carro:? ");
        carVelocity = input.nextInt();

        int taxe = carVelocity + multa;

        if (carVelocity > velocityPermited){
            System.out.println("voce foi multado.");
            int Diferenca =  carVelocity  - velocityPermited;
            int calcMult = Diferenca * 5;
            System.out.println(" o  calculo da diferença "  + Diferenca);
        }


    }
}
