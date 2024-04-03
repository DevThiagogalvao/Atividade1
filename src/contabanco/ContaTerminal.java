import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        int numero;
        String agencia;
        String nome;
        double saldo;

        System.out.print("Digite seu nome: ");
        nome = input.nextLine();

        System.out.print("Insira o número da conta: ");
        numero = input.nextInt();

        System.out.print("Insira a agência: ");
        agencia = input.next();

        System.out.print("Deposite um valor: ");
        saldo = input.nextDouble();

        input.close();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numero + " saldo de " + saldo + " já está disponível para saque.");
    }
}
