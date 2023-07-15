import java.util.Scanner;

public class ContaBancaria {

    Scanner scanner = new Scanner(System.in);

    int Agencia;
    int NumeroConta;
    String NomeCliente;
    double Saldo = 549.50;

    // CLASSES DE ENTRADA DO MEU USUÁRIO
    public void Nomecliente() {
        NomeCliente = scanner.nextLine();

    }

    public void AgenciaConta() {
        Agencia = scanner.nextInt();
    }

    public void Numeroconta() {
        NumeroConta = scanner.nextInt();
    }

    // OUTPUT DESTAS INFORMAÇÕES
    public void OutputSaldoConta() {
        System.out.println("SALDO DISPONÍVEL : " + Saldo);

    }
}
