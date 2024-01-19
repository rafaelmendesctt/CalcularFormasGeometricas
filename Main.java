package CalcularFormasGeometricas;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		Medidas medidas = new Medidas();
		
		System.out.print("Digite a medida A: ");
		medidas.setMedidaA(scanner.nextDouble());
		System.out.print("Digite a medida B: ");
		medidas.setMedidaA(scanner.nextDouble());
		System.out.print("Digite a medida C: ");
		medidas.setMedidaA(scanner.nextDouble());
		
		Quadrado quadrado = new Quadrado();
		double areaDoQuadrado = quadrado.calcularAreaDoQuadrado(medidas);
		System.out.printf("AREA DO QUADRADO = %.4f\n", areaDoQuadrado);
		
		Triangulo triangulo = new Triangulo();
		double areaDoTriangulo = triangulo.calcularAreaDoTriangulo(medidas);
		System.out.printf("AREA DO TRIANGULO = %.4f\n", areaDoTriangulo);
		
		Trapezio trapezio = new Trapezio();
		double areaDoTrapezio = trapezio.calcularAreaDoTrapezio(medidas);
		System.out.printf("AREA DO TRAPÉZIO = %.4f\n", areaDoTrapezio);
		
		scanner.close();
	}
}
