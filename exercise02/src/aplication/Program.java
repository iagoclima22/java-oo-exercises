package aplication;
import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Employee funcionario = new Employee();
		
		System.out.print("Nome: ");
		funcionario.name = sc.nextLine();
		
		System.out.print("Salário bruto: ");
		funcionario.grossSalary = sc.nextDouble();
		
		System.out.print("Imposto: ");
		funcionario.tax = sc.nextDouble();
		
		System.out.println("Funcionario: " + funcionario);
		System.out.print("Qual a porcentagem para aumentar o salário? ");
		double aumento = sc.nextDouble();
		funcionario.increaseSalary(aumento);
		System.out.println("Funcionário: " + funcionario);
		
		sc.close();
	}

}
