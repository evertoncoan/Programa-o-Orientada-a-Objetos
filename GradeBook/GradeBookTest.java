package GradeBook;

// Figura 3.11: GradeBookTest.java
// construtor GradeBook utilizado para especificar o nome
// do curso na hora em que cada objeto GradeBook é criado.

public class GradeBookTest
{
	// método main inicia a execução de programa
	public static void main( String[] args )
	{
		// cria objeto GradeBook
		GradeBook gradeBook1 = new GradeBook(
				"CS101 Introduction to Java Programming" );
		GradeBook gradeBook2 = new GradeBook(
				"CS102 Data Structures in Java" );
		
		// exibe valor inicial de courseName para cada GradeBook
		System.out.printf( "gradeBook1 course name is: %s\n",
				gradeBook1.getCourseName() );
		System.out.printf( "gradeVook2 course name is: %s\n",
				gradeBook2.getCourseName() );
	} // fim de main
} // fim da classe GradeBookTest