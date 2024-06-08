import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        //To Do: Conhecer e importar a Classe Scanner
        //Exibir as mensagens para o nosso usuário
        //Obter pela Scanner os valores digitados no Terminal
        // Exibir a mensagem Conta Criada

        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número de sua Agência");
        String agencia = scanner.next();

        System.out.println("Para prosseguir, por gentileza, digite o número de sua Conta");
        int numero = scanner.nextInt();

        System.out.println("Digite agora o seu primeiro nome");
        String nome = scanner.next();

        System.out.println("Digite então o seu sobrenome");
        String sobrenome = scanner.next();

        double saldo = 237.48;

        scanner.close();

        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá, " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", sua conta é " + numero + " e o seu saldo " + saldo + " já está disponível para saque");

    }
}
