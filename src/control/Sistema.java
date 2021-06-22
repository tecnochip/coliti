package control;

import view.VentanaInicial;

public class Sistema {
	public static void main(String[] args) {
		
		ControlMenu controlador = new ControlMenu();
		VentanaInicial vp = new VentanaInicial(controlador);
		controlador.setVentana(vp);
		vp.setVisible(true);
		

	}
}
