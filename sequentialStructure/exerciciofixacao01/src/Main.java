import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office Desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.println(product1 + ", wich price is: $" + price1);
        System.out.println(product2 + ", wich price is: $" + price2);

        System.out.println("Record: " + age + " years old, code " + code + " and gender: " + gender);

        // Measue with eight decimal places: 53,23456700
        System.out.printf("%.8f%n", measure);

        // Rouded (three decimal places): 53,235
        System.out.printf("%.3f%n", measure);

        // US decimal point: 53.235
        Locale.setDefault(Locale.US);
        System.out.printf("%.3f%n", measure);

        //outra forma de resolucao da questao

        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f%n", product1, price1);
        System.out.printf("%s, which price is $ %.2f%n", product2, price2);
        System.out.println();
        System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
        System.out.println();
        System.out.printf("Measue with eight decimal places: %.8f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);

    }
}
