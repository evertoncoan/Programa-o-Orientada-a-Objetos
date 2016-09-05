package Account;

// Figura 3.14: AccountTest.Java
// Entrada e saída de números de ponto flutuante com objetos Account.
import java.util.Scanner;

public class AccountTest 
{
	// método main inicia a execução do aplicativo Java
	public static void main( String[] args )
	{
		Account account1 = new Account( 50.00 ); // cria o objeto Account
		Account account2 = new Account( -7.53 ); // cria o objeto Account
		
		// exibe o saldo inicial de cada objeto
		System.out.printf( "account1 balance: $%.2f \n",
				account1.getBalance() );
		System.out.printf( "account2 balance: $%.2f \n\n",
				account2.getBalance() );
		
		// cria Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner( System.in );
		double depositAmount; // quantia de depósito lida a partir do usuário
		
		System.out.print( "Enter deposit amount for account1: " ); // prompt
		depositAmount = input.nextDouble(); // entrada do usuário
		System.out.printf( "\nadding %.2f to account1 balance\n\n",
				depositAmount );
		account1.credit( depositAmount ); // adiciona o saldo de account1
		
		// exibe os saldos
		System.out.printf( "account1 balance: $%.2f \n",
				account1.getBalance() );
		System.out.printf( "account2 balance: $%.2f \n\n",
				account2.getBalance() );
		// prompt
		System.out.print( "Enter deposit amount for account2: ");
		depositAmount = input.nextDouble(); // entrada do usuário
		System.out.printf( "\nadding %.2f to account2 balance\n\n",
				depositAmount );
		account2.credit( depositAmount ); // adiciona ao saldo
										  // de account2
		// exibe os saldos
		System.out.printf( "account1 balance: $%.2f \n",
				account1.getBalance() );
		System.out.printf( "account2 balance: $%.2f \n",
				account2.getBalance() );
	} // fim de main
} // fim da classe AccountTest
