import java.util.Scanner;

public class SimulacaoBancariaUserFriendly {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("-------------------------------------------");
            System.out.println("O que deseja fazer em sua conta bancária?");
            System.out.println("-------------------------------------------");
            System.out.println("Digite 1 para Depositar um valor.");
            System.out.println("Digite 2 para Sacar um valor.");
            System.out.println("Digite 3 para Consultar o saldo da conta.");
            System.out.println("Digite 0 para caso deseje encerrar sua atividade.");
            System.out.println("-------------------------------------------");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1: //Depositar
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    System.out.println("Qual o valor que deseja depositar?");
                    double deposito = scanner.nextDouble();
                    saldo = saldo + deposito;
                    System.out.printf("O novo saldo é de R$%.1f%n", saldo);
                    break;
                case 2: //Sacar
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    System.out.println("Qual o valor que deseja sacar?");
                    double saque = scanner.nextDouble();
                    if(saldo >= saque){
                        saldo = saldo - saque;
                        System.out.printf("O saque no valor de R$%.1f foi realizado com sucesso! Seu novo saldo é de R$%.1f%n", saque, saldo);
                    } else{
                        System.out.println("Saldo insuficiente para este valor de saque!");
                    }
                    break;
                case 3: //Consultar Saldo
                    // TODO: Exibir o saldo atual da conta.
                    System.out.printf("O saldo atual da conta é de R$%.1f%n", saldo);
                    break;
                case 0: //Encerrar
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
