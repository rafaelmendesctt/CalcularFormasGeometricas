package CalcularFormasGeometricas;

public class Triangulo {
	public double calcularAreaDoTriangulo(Medidas medidas) {
		double areaDoTriangulo = medidas.getMedidaA()*medidas.getMedidaB()/2;
		return areaDoTriangulo;
	}
}
