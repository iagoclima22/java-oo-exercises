package aplication;
import java.util.Scanner;
import entities.Student;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student aluno = new Student();
		
		aluno.name = sc.nextLine();
		aluno.grade1 = sc.nextDouble();
		aluno.grade2 = sc.nextDouble();
		aluno.grade3 = sc.nextDouble();
		
		System.out.println("NOTA FINAL = " + aluno.finalGrade());
		aluno.checkPass();	
		sc.close();
	}
}
