import model.Client;
import model.BankAccount;
import utils.Console;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws InputMismatchException {
        System.out.println("### CADASTRO DE CONTA BANCÁRIA ###");
        boolean inProgressRegister = true;
        while(inProgressRegister) {
            try {
                Scanner sc = new Scanner(System.in).useLocale(Locale.US);

                System.out.print("Digite o número da conta: ");
                int accountNumber = sc.nextInt();

                System.out.print("Digite o número da agência: ");
                String accountAgency = sc.next();

                sc.nextLine();
                System.out.print("Digite o nome do cliente: ");
                String clientName = sc.nextLine();

                System.out.print("Digite o saldo da conta: ");
                double balance = sc.nextDouble();

                Client client = new Client(clientName);
                BankAccount account = new BankAccount(accountAgency, accountNumber, balance, client);

                inProgressRegister = false;
                System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", account.getClient(), account.getAgency(), account.getAccount(), account.getBalance());

                sc.close();
            } catch (InputMismatchException e) {
                Console.clear();
                System.out.println("Formato inválido. Favor tente novamente.");
            }
        }
    }
}
