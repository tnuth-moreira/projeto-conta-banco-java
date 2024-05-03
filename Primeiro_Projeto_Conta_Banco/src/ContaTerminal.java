import java.util.Scanner;

public class ContaTerminal {
    int numero;
    String agencia;
    String nomeCliente;
    double saldo;
    private Scanner scanner;

    public ContaTerminal() {
        this.scanner = new Scanner(System.in);
    }

    public int solicitarNumero() {
        System.out.println("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();
        scanner.nextLine();
        return numero;
    }

    public String solicitarAgencia() {
        System.out.println("Por favor, digite o número da Agência: ");
        agencia = scanner.next();
        scanner.nextLine();
        return agencia;
    }

    public String solicitarNomeCliente() {
        System.out.println("Por favor, digite seu nome e sobrenome: ");
        nomeCliente = scanner.next();
        scanner.nextLine();
        return nomeCliente;
    }

    public double solicitarSaldo() {
        System.out.println("Por favor, digite seu saldo disponível: ");
        saldo = scanner.nextDouble();
        scanner.nextLine();
        return saldo;
    }

    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();

        int numero = conta.solicitarNumero();
        String agencia = conta.solicitarAgencia();
        String nomeCliente = conta.solicitarNomeCliente();
        double saldo = conta.solicitarSaldo();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
