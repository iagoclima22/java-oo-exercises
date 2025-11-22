package aplication;

import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Rectangle r = new Rectangle();
		
		System.out.println("Entre com a largura e altura do retângulo:");
		r.width = sc.nextDouble();
		r.height = sc.nextDouble();
		
		double areaR = r.area();
		double perimetroR = r.perimeter();
		double diagonalR = r.diagonal();
		
		System.out.printf("AREA = %.2f\n", areaR);
		System.out.printf("PERIMETRO = %.2f\n", perimetroR);
		System.out.printf("DIAGONAL = %.2f\n", diagonalR);
		
				
		sc.close();

	}

}
