import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Por favor, digite o número da sua Conta: ");
        int numero = sc.nextInt();

        System.out.println("Agora, por gentileza digite o número da sua Agência: ");
        String agencia = sc.next();

        System.out.println("por gentileza, digite seu Nome: ");
        String nomedoCliente = sc.next();

        System.out.println("por gentileza, digite seu Sobrenome: ");
        String sobrenomedoCliente = sc.next();

        System.out.println("por gentileza, digite o seu Saldo: ");
        double saldo = sc.nextDouble();


        System.out.println("Olá " + nomedoCliente  +  sobrenomedoCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo é " + saldo);

        sc.close();

    }
}
