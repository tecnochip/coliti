import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ViewGraph extends JFrame {
	
	ViewGraph(){
		
		// propiedades de la ventana
		setTitle("Hola Mundo");
		setSize (500,300);
		setLocation (700, 500);

		// creo el "lienzo" principal
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setLayout(new BorderLayout());
		
		// creo los botones de abajo
		JButton cancelar = new JButton ("Cancelar");
		JButton aceptar = new JButton ("Aceptar");
		
		
		// creo el panel de abajo y añado los botones
		JPanel panelSup = new JPanel ();
		panelSup.setLayout(new FlowLayout (FlowLayout.RIGHT));
		panelSup.add(cancelar);
		panelSup.add(aceptar);
		
		// creo el panel de arriba y añado la etiqueta y el campo de texto
		JPanel panelInf = new JPanel ();
		panelInf.setLayout(new FlowLayout (FlowLayout.CENTER));
		JLabel labelNombre = new JLabel ("nombre: ");
		JTextField campoNombre = new JTextField ();
		campoNombre.setColumns(20);
		panelInf.add(labelNombre);
		panelInf.add(campoNombre);
		
		// creo el panel donde voy a hacer la gráfica.
		JPanel graph = new JPanel ();
		
		// añado los paneles arriba y abajo en el "lienzo" principal
		panelPrincipal.add(panelSup, BorderLayout.SOUTH);
		panelPrincipal.add(panelInf, BorderLayout.NORTH);
		panelPrincipal.add(graph, BorderLayout.CENTER);
		
		
				
		aceptar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Graphics graphics = graph.getGraphics();
				Dimension dimension = graph.getSize();
				
				// pintar eje x
				graphics.setColor(Color.BLUE);
				graphics.drawLine (0, (int)dimension.getHeight()/2, (int)dimension.getWidth(), (int)dimension.getHeight()/2);
				
				graphics.setColor(Color.BLACK);
				
				Point ini = transformar (0,0, dimension);
				Point fin = transformar (100, 150, dimension);
				
				// punto inicial
				graphics.drawLine ((int)ini.getX(), (int)ini.getY(), (int)ini.getX(), (int)ini.getY());
				// punto final
				graphics.drawLine ((int)fin.getX(), (int)fin.getY(), (int)fin.getX(), (int)fin.getY());
				

				for (int x = 0; x < (int)dimension.getWidth(); x++) {
					//int y = x*x + 2*x - 50;
					
					int y = (int) (1 * 3*(double)x - 50);
					Point punto = transformar (x, y, dimension);
					
					graphics.drawLine ((int)punto.getX(), (int)punto.getY(), (int)punto.getX(), (int)punto.getY());
				}
			}
		});
		
		cancelar.addActionListener(new ActionListener () {

			@Override
			public void actionPerformed(ActionEvent e) {
				Graphics graphics = graph.getGraphics();
				Dimension dimension = graph.getSize();
				
				graphics.clearRect(0, 0, (int)dimension.getWidth(), (int)dimension.getHeight());
				
				
				// pintar eje x
				graphics.setColor(Color.BLUE);
				graphics.drawLine (0, (int)dimension.getHeight()/2, (int)dimension.getWidth(), (int)dimension.getHeight()/2);
			}
			
		});
		
		// añado el lienzo principal a la ventana
		add (panelPrincipal);
	}
	
	public Point transformar (int x, int y, Dimension dimPanel) {
		Point ret = new Point ();
		
		ret.setLocation (x, dimPanel.getHeight() - y);
		
		return ret;
	}
}


