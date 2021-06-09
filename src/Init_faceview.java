import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;

public class Init_faceview extends JFrame {

	

	/**
	 * Create the frame.
	 */
	public Init_faceview() {
		
		// Creamos los paneles para el diseño
		JPanel titlepanel = new JPanel();
		getContentPane().add(titlepanel, BorderLayout.NORTH);
		JPanel methods= new JPanel();
		getContentPane().add(methods, BorderLayout.CENTER);
		
		//Creamos las etiquetas
		JLabel etiqTitle = new JLabel("COLITI APP");
		JLabel etiqLineal = new JLabel("Ecuaciones Lineales");
		
		
		
		
		titlepanel.add(etiqTitle);
		methods.add(lblNewLabel);
		
		
	}

}
