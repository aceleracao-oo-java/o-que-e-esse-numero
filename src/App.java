import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Cria um Scanner para a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Soliciata ao usuário que insira um número inteiro
        System.out.println("Digite um número inteiro: ");

        // Lê o número inserido pelo usuário
        int numero = scanner.nextInt();

        // Fecha o Scanner para desalocar memória
        scanner.close();

        // lógica do exercício

        if (numero % 2 == 0) {
            if (numero >= 0) {
                System.out.println("O número " + numero + " é par e positivo");
            } else {
                System.out.println("O número " + numero + " é par e negativo");
            }
        } else {
            if (numero >= 0) {
                System.out.println("O número " + numero + " é ímpar e positivo");
            } else {
                System.out.println("O número " + numero + " é ímpar e negativo");
            }
        }
    }
}
