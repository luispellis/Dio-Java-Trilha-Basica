import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: Importando a classe Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Banco para continuar insira as informações a seguir: ");

        // Exibindo a mensagem para o usuário 
        System.out.println("Digite seu nome:  ");
        // Coletando a informação inserida pelo usuário 
        String nomecliente = scanner.next();
       
        System.out.println("Digite o numero da sua conta:  ");
        int numeroconta = scanner.nextInt();
        
        System.out.println("Digite sua agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite o seu saldo: ");
        double saldo = scanner.nextDouble();

        // Exibindo a mensagem de conta criada com sucesso !!
        System.out.println("Olá " + nomecliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroconta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
