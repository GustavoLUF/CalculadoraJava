import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo valor: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("Selecione a operação desejada:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Opção: ");
        
        int operacao = scanner.nextInt();
        
        double resultado = 0;
        switch (operacao) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operação inválida!");
                return;
        }
        
        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}