package view;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import model.Calculos;

public class Controlador {

	private VentanaPrincipal vista;

	public Controlador ( VentanaPrincipal vista) {		

		this.vista = vista;

		this.vista.Boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Calculos datos = 
						new Calculos(vista.getTextoPlaneta().getText(),
								Double.parseDouble(vista.getTextoVelocidad().getText()),
								Double.parseDouble(vista.getTextoAngulo().getText()),									 
								Double.parseDouble(vista.getTextoSegundo().getText()));

				vista.getTextoResultados().setText(datos.toString());
				vista.getTextoEstudio().setText(datos.Imprimir());					
			}			
		});		
	}
}
