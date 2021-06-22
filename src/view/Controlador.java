package view;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

import model.Calculos;

public class Controlador {
	
	private VentanaPrincipal vista;
	private VentanaMVC framet;
	private VistaConica lineal;
	

	public Controlador (VentanaPrincipal vista) {		

		this.vista = vista;

		this.vista.Boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Graphics g = vista.miCanvas.getGraphics();
					Calculos datos = new Calculos(vista.getTextoPlaneta().getText(),
									Double.parseDouble(vista.getTextoVelocidad().getText()),
									Double.parseDouble(vista.getTextoAngulo().getText()),									 
									Double.parseDouble(vista.getTextoSegundo().getText()));

					vista.getTextoResultados().setText(datos.toString());
					vista.getTextoEstudio().setText(datos.Imprimir());
					
					if (vista.getTextoPlaneta().getText().equals("tierra") ||vista.getTextoPlaneta().getText().equals("TIERRA")){
					g.setColor(Color.cyan);}
					else if (vista.getTextoPlaneta().getText().equals("mercurio") ||vista.getTextoPlaneta().getText().equals("MERCURIO")){
						g.setColor(Color.BLUE);}
					else if (vista.getTextoPlaneta().getText().equals("venus") ||vista.getTextoPlaneta().getText().equals("VENUS")){
						g.setColor(Color.YELLOW);}
					else if (vista.getTextoPlaneta().getText().equals("marte") ||vista.getTextoPlaneta().getText().equals("MARTE")){
						g.setColor(Color.RED);}
					else if (vista.getTextoPlaneta().getText().equals("jupiter") ||vista.getTextoPlaneta().getText().equals("jupiter")){
						g.setColor(Color.GREEN);}
					else if (vista.getTextoPlaneta().getText().equals("Saturno") ||vista.getTextoPlaneta().getText().equals("SATURNO")){
						g.setColor(Color.GRAY);}
					else {
						g.setColor(Color.BLACK);}
					g.drawArc(0, 0,500+(int)datos.Alcance(),500+(int)datos.Alcance(), 900, 900);

				}catch (java.lang.NumberFormatException ex) {
					System.out.println ("Los datos o algun dato introducidos no es correcto");
				}
			}			
		});
		
		this.vista.mntmSalir.addActionListener(new ActionListener() 
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	        	System.exit(0);
	        }
	    });
		
		this.vista.mntmInicio.addActionListener(new ActionListener() 
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	        	VentanaInicial frame = new VentanaInicial(null);
	        	frame.setVisible(true);
	        	vista.setVisible(false);
	        }
	    });
	}
		
		public Controlador (VentanaMVC framet) {
			
				this.framet.mnSalir.addActionListener(new ActionListener() 
			    {
			        public void actionPerformed(ActionEvent e)
			        {
			        	System.exit(0);
			        }
			    });
				
				this.framet.mnInicio.addActionListener(new ActionListener() 
			    {
			        public void actionPerformed(ActionEvent e)
			        {
			        	VentanaInicial frame = new VentanaInicial(null);
			        	frame.setVisible(true);
			        	vista.setVisible(false);
			        }
			    });
			}
		
				public Controlador (VistaConica lineal) {
					this.lineal.mSalir.addActionListener(new ActionListener() 
				    {
				        public void actionPerformed(ActionEvent e)
				        {
				        	System.exit(0);
				        }
				    });
					
					this.lineal.mInicio.addActionListener(new ActionListener() 
				    {
				        public void actionPerformed(ActionEvent e)
				        {
				        	VentanaInicial frame = new VentanaInicial(null);
				        	frame.setVisible(true);
				        	vista.setVisible(false);
				        }
				    });
				}

		public void setVentana(VentanaPrincipal ventana) {
		this.vista = ventana;
		
	}
}
