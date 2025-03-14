import java.util.Scanner;
//TODO:Conhecer e importar a classe Scanner

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Criando o objeto Scanner para entrada de dados dos valores digitados no terminal
        Scanner scanner = new Scanner(System.in);

        //Exibir as mensagens para o nosso usuário, solicitando os dados do usuário
        System.out.println("Por favor, digite o número da conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Quebra de linha

        System.out.println("Por favor, digite o número da agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();

        // Exibindo a mensagem final de conta criada
        System.out.printf(
            "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.\n",
            nomeCliente, agencia, numero, saldo
        );

        // Fechando o scanner
        scanner.close();
    }
}

