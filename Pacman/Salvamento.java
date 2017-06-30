import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Salvamento implements Serializable
{
	
	public void salvar(int numero, String nome) throws IOException
	{
		ObjectOutputStream out = new ObjectOutputStream( new FileOutputStream(new File(nome + ".sal")));

		out.writeInt(numero);
		out.close();
	}
	
	public int carregar(String nome) throws IOException
	{
		ObjectInputStream in = new ObjectInputStream (new FileInputStream(nome + ".sal"));
		
		int numero = in.readInt();
		in.close();
		
		return numero;
	}
}
