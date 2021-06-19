package control;

import model.*;
import view.Controlador;
import view.VentanaPrincipal;

public class Sistema {

	public static void main(String[] args) {
				
		Sistema datos = new Sistema();

		VentanaPrincipal vista = new VentanaPrincipal (datos);
		Controlador controlador = new Controlador(vista);

		vista.setVisible(true);

	}



}
