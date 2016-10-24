import java.util.Scanner;

public class InteracaoUsuario {
	Scanner entrada = new Scanner(System.in);
	
	Hotel h2 = new Hotel();
	
	public void informaUsuario(){
		System.out.println(h2.reservaQuarto());
	}
}
