import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com
       // quatro casas decimais conforme exemplos.
       // Fórmula da área: area = π . raio2
        // Considere o valor de π = 3.14159

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio2, pi, area;
        raio2 = sc.nextDouble();
        pi = 3.14159;
        area = pi * raio2 * raio2;

        System.out.printf("A area do circulo é : %.4f " , area );



    }

}
