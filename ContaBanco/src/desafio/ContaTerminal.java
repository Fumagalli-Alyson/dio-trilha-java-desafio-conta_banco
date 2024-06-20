package desafio;

import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("> Informe o número da agência: ");
		int numeroAgencia = Integer.parseInt(scanner.nextLine());
		
		System.out.print("> Informe a agência: ");
		String agencia = scanner.nextLine();
		
		System.out.print("> Informe o nome do cliente: ");
		String nomeCliente = scanner.nextLine();
		
		System.out.print("> Informe o saldo: ");
		BigDecimal saldo = new BigDecimal(scanner.nextLine());
		
		scanner.close();
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroAgencia + " e seu saldo " + saldo + " já está disponível para saque.");
	}
}
