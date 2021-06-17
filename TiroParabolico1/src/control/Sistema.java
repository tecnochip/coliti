package control;
import model.*;

public class Sistema {

	public static void main(String[] args) {
		String planeta = "tierra";
		double velocidad = 50, angulo = 30, segundo = 3;
		
		Calculos resultado = new Calculos(planeta,velocidad,angulo,segundo);
		System.out.println (resultado);
		System.out.println (resultado.Imprimir());

	}

}
