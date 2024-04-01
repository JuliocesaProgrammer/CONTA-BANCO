import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência:");
        int agencia = scanner.nextInt();
        System.out.println("Por favor, digite o número da Conta:");
        int conta = scanner.nextInt();
        System.out.println("Por favor, digite o seu nome:");
        String nome = scanner.next();
        System.out.println("Por favor, digite o quanto quer depositar:");
        int deposito = scanner.nextInt();

        System.out.println("Ola, " + nome + " Obrigado por criar uma conta no nosso banco. Sua agência é: " + agencia + " Conta de número: " + conta + " E seu saldo " + deposito +
        " Já está disponível");
    }
}
