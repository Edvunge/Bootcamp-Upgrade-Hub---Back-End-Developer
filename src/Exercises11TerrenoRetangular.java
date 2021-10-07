import java.util.Scanner;



public class Exercises11TerrenoRetangular {
    public static void main(String[] args) {
        /*
        Faça um programa que leia a largura e o comprimento de um terreno retangular,
        calculando e mostrando a sua área em m².
        O programa também deve mostrar a classificação desse terreno,
        de acordo com a lista abaixo:
        - Abaixo de 100m² = TERRENO POPULAR
        - Entre 100m² e 500m² = TERRENO MASTER
        - Acima de 500m² = TERRENO VIP
        */

        double larguraTerreno;
        double comprimentoTerreno;
        double area;


        Scanner input = new Scanner(System.in);

        // esta parte é para leitura pelo teclado.
        System.out.println(" Insira a largura:? ");
        larguraTerreno = input.nextDouble();

        System.out.println(" Insira o comprimento:? ");
        comprimentoTerreno = input.nextDouble();

        /*
        de acordo com a lista abaixo:
        - Abaixo de 100m² = TERRENO POPULAR
        - Entre 100m² e 500m² = TERRENO MASTER
        - Acima de 500m² = TERRENO VIP
        */

        /*
        base = comprimento
        altura = largura

        area = base x altura
        */

        area = comprimentoTerreno * larguraTerreno;

        if( area < 100){
            System.out.println(" TERRENO POPULAR. ");
        } else if (area == 100 && area < 500){
            System.out.println(" TERRENO MASTER. ");
        } else {
            System.out.println(" TERRENO VIP. ");
        }



    }
}
