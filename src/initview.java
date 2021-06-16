package coliti;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class initview {
static JPanel panelN,panelS,panelE,panelO,panelC;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					initview window = new initview();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public initview() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JFrame window = new JFrame();	// creem l’objecte window sense títol
		   window.setLayout(new BorderLayout());
		   JLabel etiqueta = new JLabel(); // creem l'objecte etiqueta
		   ImageIcon foto = new ImageIcon("uem.png"); // fiquem un logo a la aplicació
		 ///------------------------------------------------------------- escuchas
		   escoltaSalir escolta1 = new escoltaSalir();
		   Escoltar e = new Escoltar();
		   
		   JButton boto = new JButton("Iniciar");
		   JCheckBox lineal = new JCheckBox("Ecuaciones lineales");
		   JCheckBox conica = new JCheckBox("Ecuaciones conicas");
		   JCheckBox parabolico = new JCheckBox("Tiro parabolico");
		   		     
		   etiqueta.setText("App para resolver problemas matemáticos");
		   Font gran = new Font("Arial",0,20);
		   Font media = new Font("Arial",0,16);
		   etiqueta.setFont(gran);
		   etiqueta.setOpaque(true);
		   boto.setFont(media);
		   window.setLocation(500,500);
		   window.setResizable(false); // En true permitix ampliar la window
		   window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   window.setTitle("COLITI");
		 ///---------------------------------------------------------------paneles	 
			 panelN = new JPanel(new FlowLayout());
			 panelS = new JPanel(new FlowLayout());
	         panelE = new JPanel(new FlowLayout());
	         panelO = new JPanel(new FlowLayout());
	         panelC = new JPanel(new FlowLayout());
		   
		  ///---------------------------------------------------------------menu
			JMenuBar menu = new JMenuBar();
			JMenu archivo = new JMenu("Archivo");
			JMenuItem salir = new JMenuItem("Salir");
			///---------------------------------------------------------------escoltes
			boto.addActionListener(e); 
			salir.addActionListener(escolta1);
		   
		   window.add(panelN,BorderLayout.NORTH);
		   window.add(panelS,BorderLayout.SOUTH);
		   window.add(panelO,BorderLayout.WEST);
		   window.add(panelE,BorderLayout.EAST);
		   window.add(panelC,BorderLayout.CENTER);
		   panelN.add(etiqueta);
		   panelC.add(lineal);
		   panelC.add(conica);
		   panelC.add(parabolico);
		   panelS.add(boto);
		   window.setJMenuBar(menu);
		   menu.add(archivo);
		   archivo.add(salir);
		   window.pack();
		   window.setVisible(true);
	}
	
	private static class Escoltar implements ActionListener 
    { 
       public void actionPerformed(ActionEvent event) 
        {
              // ací posem les accions a executar quan se polse el botó
			  
        }
    }
	static public class escoltaSalir implements ActionListener
	{
	public void actionPerformed(ActionEvent e)
	{
		System.exit(0);
	}
	}

}
