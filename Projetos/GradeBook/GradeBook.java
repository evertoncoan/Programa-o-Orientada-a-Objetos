package GradeBook;

// Figura 3.10: GradeBook.Java
// Classe GradeBook com um construtor para inicializar o
// nome do curso.
public class GradeBook 
{
	private String courseName; // nome do curso para esse GradeBook
	
	// o construtor inicializa courseName com o argumento String
	public GradeBook( String name )
	{
		courseName = name; // inicializa courseName
	} // fim do construtor
	
	// método para configurar o nome do curso
	public void setCourseName( String name )
	{
		courseName = name; // armazena o nome do curso
	} // fim do método setCourseName
	
	// método para recuperar o nome do curso
	public String getCourseName()
	{
		return courseName;
	} // fim do método getCourseName
	
	// exibe uma mensagem de boas-vindas para o usuário GradeBook
	public void displayMessage()
	{
		// essa instrução chama getCourseName para obter o
		// nome do curso que esse GradeBook representa
		System.out.printf( "Welcome to the GradeBook for\n%s!\n",
				getCourseName() );
	} // fim do método displayMessage
} // fim da classe GradeBook
