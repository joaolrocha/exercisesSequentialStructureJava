import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
        //o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
        //Calcule e mostre o valor a ser pago.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cdg1 , cdg2, pc1 , pc2 ;
        double preco1, preco2, total;

        cdg1 = sc.nextInt();
        pc1 = sc.nextInt();
        preco1 = sc.nextDouble();

        cdg2 = sc.nextInt();
        pc2 = sc.nextInt();
        preco2 = sc.nextDouble();

        total = preco1 * pc1 + preco2 * pc2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        sc.close();



    }
}
