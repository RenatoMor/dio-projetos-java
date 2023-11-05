import java.util.ArrayList;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String menu = "\n==================== MENU ====================\n" +
                "[1] Depositar\n" +
                "[2] Sacar\n" +
                "[3] Extrato\n" +
                "[0] Sair\n" +
                "==============================================\n\n=> ";

// Variáveis------------------------------------------------------------------------

        double saldo = 0;
        double limite = 500;
        ArrayList<String> extrato = new ArrayList<>();
        int numeroSaques = 0;
        final int LIMITE_SAQUES = 3;

// loop principal-------------------------------------------------------------------        

        while (true) {
            System.out.print(menu);
            String opcao = sc.nextLine();

// Depósito-------------------------------------------------------------------------

            switch (opcao) {
                case "1":
                    System.out.print("Informe o valor do depósito: R$ ");
                    double valorDeposito = Double.parseDouble(sc.nextLine());
                    if (valorDeposito > 0) {
                        saldo += valorDeposito;
                        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        String dataTransacao = sdf.format(new Date());
                        String transacao = "Depósito - " + dataTransacao + " - R$ " + valorDeposito;
                        extrato.add(transacao);
                    } else {
                        System.out.println("Operação falhou! O valor informado é inválido.");
                    }
                    break;

// Saque----------------------------------------------------------------------------

                case "2":
                    System.out.print("Informe o valor do saque: R$ ");
                    double valorSaque = Double.parseDouble(sc.nextLine());
                    boolean excedeuSaldo = valorSaque > saldo;
                    boolean excedeuLimite = valorSaque > limite;
                    boolean excedeuSaques = numeroSaques >= LIMITE_SAQUES;

// Condições para saque-------------------------------------------------------------
    
                    if (excedeuSaldo) {
                        System.out.println("Operação falhou! Saldo insuficiente.");
                    } else if (excedeuLimite) {
                        System.out.println("Operação falhou! Excedeu o limite.");
                    } else if (excedeuSaques) {
                        System.out.println("Operação falhou! Excedeu o limite diário de saque.");
                    } else if (valorSaque > 0) {
                        saldo -= valorSaque;
                        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        String dataTransacao = sdf.format(new Date());
                        String transacao = "Saque - " + dataTransacao + " - R$ " + valorSaque;
                        extrato.add(transacao);
                        numeroSaques++;
                    } else {
                        System.out.println("O valor informado é inválido! Tente novamente.");
                    }
                    break;

// Extrato--------------------------------------------------------------------------

                case "3":
                    System.out.println("\n================ EXTRATO ================");
                    if (extrato.isEmpty()) {
                        System.out.println("Não foram realizadas movimentações.");
                    } else {
                        for (String transacao : extrato) {
                            System.out.println(transacao);
                        }
                    }
                    System.out.println("\nSaldo: R$ " + saldo);
                    System.out.println("==========================================");
                    break;

// Sair-----------------------------------------------------------------------------

                case "0":
                    sc.close();
                    return;

// Default--------------------------------------------------------------------------

                default:
                    System.out.println("Operação inválida, por favor selecione novamente a operação desejada.");
                    break;                                           
            }             
        }                                               
    }
}
