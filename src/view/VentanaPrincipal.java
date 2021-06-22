package view;

import javax.swing.*;
import net.miginfocom.swing.MigLayout;
import java.awt.*;

@SuppressWarnings("serial")
public class VentanaPrincipal extends JFrame {
	
	// Variables de la ventana
	private JTextField textoPlaneta;	
	private JTextField textoVelocidad;
	private JTextField textoAngulo;
	private JTextField textoSegundo;
	private JTextPane textoResultados;
	private JTextPane textoEstudio;
	
	JButton Boton;
		
	private JLabel tituloResultados;
	private JLabel tituloEstudio;	
	private JLabel tituloGrafica;
	public Canvas miCanvas;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	JMenuItem mntmInicio;
	JMenuItem mntmSalir;

	// Iniciamos la ventana con ayuda de un plugin para crear el GridLayout
	public VentanaPrincipal () {
				
		getContentPane().setLayout(new MigLayout("", "[grow][][][20.00,grow][239.00][36.00,grow][256.00]", "[-32.00][29.00][66.00,grow][52.00][60.00][32.00][21.00][][][][27.00,grow][grow][][][][grow]"));
		
		tituloGrafica = new JLabel("Gr\u00E1fica");
		tituloGrafica.setFont(new Font("Tahoma", Font.PLAIN, 16));
		getContentPane().add(tituloGrafica, "cell 4 1,alignx center,aligny center");
		
		miCanvas = new Canvas();
		miCanvas.setBackground(Color.WHITE);
		
		getContentPane().add(miCanvas, "cell 0 2 7 4,grow");
		
		tituloResultados = new JLabel("Resultados");
		getContentPane().add(tituloResultados, "cell 4 10,grow");
		
		tituloEstudio = new JLabel(" Estudio del segundo");
		getContentPane().add(tituloEstudio, "cell 6 10");
		
		JLabel tituloPlaneta = new JLabel("Planeta: ");
		tituloPlaneta.setFont(new Font("Tahoma", Font.PLAIN, 12));
		getContentPane().add(tituloPlaneta, "cell 0 11,alignx trailing");
		
		textoPlaneta = new JTextField();
		getContentPane().add(textoPlaneta, "cell 1 11,alignx left,growy");
		textoPlaneta.setColumns(10);
		
		Boton = new JButton("Resultado");
		Boton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		getContentPane().add(Boton, "cell 2 11 1 4,alignx center,growy");
		
		textoResultados = new JTextPane();
		getContentPane().add(textoResultados, "cell 4 11 1 5,grow");
		
		textoEstudio = new JTextPane();
		getContentPane().add(textoEstudio, "cell 6 11 1 5,grow");
		
		JLabel tituloVelocidad = new JLabel("Velocidad inical: ");
		tituloVelocidad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		getContentPane().add(tituloVelocidad, "cell 0 12,alignx trailing");
		
		textoVelocidad = new JTextField();
		getContentPane().add(textoVelocidad, "flowx,cell 1 12,alignx left,growy");
		textoVelocidad.setColumns(10);
		
		JLabel tituloAngulo = new JLabel("Angulo:");
		tituloAngulo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		getContentPane().add(tituloAngulo, "cell 0 13,alignx trailing");
		
		textoAngulo = new JTextField();
		getContentPane().add(textoAngulo, "cell 1 13,alignx left,growy");
		textoAngulo.setColumns(10);
		
		JLabel tituloSegundo = new JLabel("Segundo estudio:");
		tituloSegundo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		getContentPane().add(tituloSegundo, "cell 0 14,alignx trailing");
		
		textoSegundo = new JTextField();
		getContentPane().add(textoSegundo, "cell 1 14,alignx left,growy");
		textoSegundo.setColumns(10);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mntmInicio = new JMenuItem("Inicio");
		mnArchivo.add(mntmInicio);
		
		mntmSalir = new JMenuItem("Salir");
		mnArchivo.add(mntmSalir);
		
		initialize();
	}
	
	public void initialize() {
		this.setSize (750,500);
		this.setLocation (200,150);
		this.setResizable(false);
		this.setTitle("Tiro Parabolico");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	// Aqui se muestran los resultados
	public JTextField getTextoPlaneta() {
		return textoPlaneta;
	}

	public JTextField getTextoVelocidad() {
		return textoVelocidad;
	}

	public JTextField getTextoAngulo() {
		return textoAngulo;
	}

	public JTextField getTextoSegundo() {
		return textoSegundo;
	}

	public JTextPane getTextoResultados() {
		return textoResultados;
	}

	public JTextPane getTextoEstudio() {
		return textoEstudio;
	}
	
}
