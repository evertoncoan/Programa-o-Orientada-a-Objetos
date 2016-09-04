package Account;

// Figura 3.13: Account.java
// classe Account com um construtor para validar e
// inicializa a variável de instância balance do tipo double.
public class Account
{
	private double balance; // variável de instância que armazena o saldo
	
	// construtor
	public Account( double initialBalance )
	{
		// valida que inicialBalance é maior que 0,0;
		// se não, o saldo é inicializado como o valor padrão 0.0
		if ( initialBalance > 0.0)
			balance = initialBalance;
	} // fim do construtor Account
	
	// credita (adiciona) uma quantia à conta
	public void credit( double amount )
	{
		balance = balance + amount; // adiciona quantia ao saldo
	} // fim do método credit
	
	// retorna o saldo da conta
	public double getBalance()
	{
		return balance; // fornece o valor ao método chamador
	} // fim do método getBalance
} // fim da classe Account
