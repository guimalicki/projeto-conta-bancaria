import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta: ");
        int numero = sc.nextInt();

        System.out.println("Agora, digite o número da Agência: ");
        String agencia = sc.next();

        System.out.println("Digite seu nome completo: ");
        String nomeCliente = sc.next();

        System.out.println("Digite o saldo que possui na conta: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$ " + saldo + " já está disponível para saque.");

        sc.close();
    }
}
