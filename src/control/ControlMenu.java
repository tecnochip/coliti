package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Ecu3;
import view.*;

public class ControlMenu implements ActionListener {
	VentanaInicial ventana;
	
	public ControlMenu() {
			
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Creamos las llamadas de los botones del menu inical
		
		 if (e.getActionCommand()=="Tiro") {
			 
			 VentanaPrincipal vp = new VentanaPrincipal();
			 Controlador controlador = new Controlador(vp);
			 controlador.setVentana(vp);
				vp.setVisible(true);
				ventana.setVisible(false);				
		 }
		 
		 else if (e.getActionCommand()=="Ecuaciones") { 
			 
			  new Ecu3().setVisible(true);
			  ventana.setVisible(false);	
		 }
		 
		 else {    
		            new VistaConica().setVisible(true);
		            ventana.setVisible(false);
	        }		
	}
	
	public void setVentana(VentanaInicial ventana) {
		this.ventana = ventana;
	}
}
