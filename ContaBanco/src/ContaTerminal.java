import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
                Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        
        System.out.println("####INSIRA OS DADOS DA SUA CONTA BANCÁRIA#######");
        System.out.print("Conta: ");
        int conta = scanner.nextInt(); //precisa colocar o 'int' dentro do next

        System.out.print("Agência: ");
        String agencia = scanner.next();

        System.out.print("Nome: ");
        String nome = scanner.next(); 
        scanner.nextLine(); // comando necessário para conseguir adicionar nome + sobrenome nesta única variável

        System.out.print("Informe o saldo disponível: ");
        double saldo = scanner.nextDouble();
        

        System.out.println("Olá " + nome + ", seu saldo de R$" + saldo + " já esta disponível para saque.");
        System.out.println("Agência: " + agencia + "  /  Conta: " + conta);
        

        scanner.close();
    }
}
