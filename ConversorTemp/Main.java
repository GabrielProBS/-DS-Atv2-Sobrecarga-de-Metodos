import java.util.Scanner;
import java.util.Locale;
public static void main(String[] args) {
    Conversor Conversor = new Conversor();
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US); //Para que o "." reprensente o separador decimal
    int op;
    double celsius;

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
                    celsius = scanner.nextDouble();
                    System.out.println("Temperatura em Fahrenheit: " + Conversor.conversor(celsius));
                    break;
                case 2:
                    System.out.print("Digite a temperatura em Fahrenheit: ");
                    float fahrenheit = scanner.nextFloat();
                    System.out.println("Temperatura em Celsius: " + Conversor.conversor(fahrenheit));
                    break;
                case 3:
                    System.out.print("Digite a temperatura em Celsius: ");
                    celsius = scanner.nextDouble();
                    System.out.print("Qual valor você deseja para que o valor arredondado tenha?");
                    int valorparaArredondar = scanner.nextInt();
                    double resultado = Conversor.conversor(celsius) + valorparaArredondar; //Processo de arredondamento
                    System.out.println("Temperatura em Fahrenheit (arredondado): " + resultado);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
    } while (op != 4);
    scanner.close();
}
