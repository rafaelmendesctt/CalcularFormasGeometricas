package CalcularFormasGeometricas;

public class Trapezio {
	public double calcularAreaDoTrapezio(Medidas medidas) {
		double areaDoTrapezio = (medidas.getMedidaA()+medidas.getMedidaB())*medidas.getMedidaC()/2;
		return areaDoTrapezio;
	}
}