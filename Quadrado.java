package CalcularFormasGeometricas;

public class Quadrado {
	public double calcularAreaDoQuadrado(Medidas medidas) {
		double areaDoQuadrado = medidas.getMedidaA()*medidas.getMedidaA();
		return areaDoQuadrado;
	}
}