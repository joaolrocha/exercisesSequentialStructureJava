import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        //hora e calcula o salário desse funcionário.
        // A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

        int numeroFuncionario;
        double horasTrabalhadas;
        double valorHora;
        double calculaSalario;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        numeroFuncionario = sc.nextInt();
        horasTrabalhadas = sc.nextDouble();
        valorHora = sc.nextDouble();

        calculaSalario = horasTrabalhadas * valorHora;

        System.out.println("Numero de funcionario: " + numeroFuncionario);
        System.out.printf("O salario do funcionario será de: U$ %.2f%n", calculaSalario);




        sc.close();

    }
}
