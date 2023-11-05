import java.util.Scanner;

public class contador {
// Metodo main------------------------------------------------------------------------
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
// inputs------------------------------------------------------------------------------
        System.out.println("Digite o primeiro parametro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parametro: ");
        int parametroDois = terminal.nextInt();
// try exception-----------------------------------------------------------------------
        try {
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println("ATENÇÃO! O SEGUNDO PARAMETRO DEVE SER MAIOR QUE O PRIMEIRO.");
        }
    }
    // Metodo contar-----------------------------------------------------------------------
    private static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
// Condições do metodo-----------------------------------------------------------------
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}