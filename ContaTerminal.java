import java.util.Scanner;

public class ContaTerminal {
    public static void main (String [] args){

        int numeroConta;
        String agencia, nomeCliente;
        double saldo;

        Scanner scan = new Scanner(System.in);

        System.out.print("Por favor, digite o seu nome: ");
        nomeCliente = scan.nextLine();

        System.out.print("Por favor, digite o número da sua conta: ");
        numeroConta = Integer.parseInt(scan.nextLine());

        System.out.print("Por favor, digite a sua agência: ");
        agencia = scan.nextLine();

        System.out.print("Por favor, digite o saldo: ");
        saldo = Double.parseDouble(scan.nextLine());

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque."
                ,nomeCliente,agencia,numeroConta,saldo);

        scan.close();
    }
}
