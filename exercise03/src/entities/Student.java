package entities;

public class Student {
	
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}
	
	public void checkPass() {
		if (finalGrade() >= 60.00) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			double miss = 60 - finalGrade();
			System.out.printf("FALTARAM %.2f PONTOS", miss);
		}
	}

}
