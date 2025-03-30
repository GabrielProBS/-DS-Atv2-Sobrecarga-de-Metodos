import java.util.Scanner;
import java.util.locale;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Locale.setDefault(Locale.US); //Para que o "." reprensente o separador decimal
    int op;
    do {
        System.out.println("Escolha uma opção:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        System.out.println("3. Celsius para Fahrenheit com arredondamento (escolhido por você)");
        System.out.println("4. Sair");

        op = scanner.nextInt();
        scanner.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Digite a temperatura em Celsius: ");
                    double celsius = scanner.nextDouble();
                    double fahrenheit = (celsius * 9 / 5) + 32;
                    System.out.printf("Temperatura em Fahrenheit: %.2f%n", fahrenheit);
                    break;
                case 2:
                    System.out.print("Digite a temperatura em Fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                        
                    System.out.printf("Temperatura em Celsius: %.2f%n", celsius);
                    break;
                case 3:
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
    } while (op != 4);
    scanner.close();
}