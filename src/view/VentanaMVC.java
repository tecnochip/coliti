package view;

import java.awt.*;
import javax.swing.border.*;
import javax.swing.*;

public class VentanaMVC extends JFrame {

	private JPanel panelArriba;
	private JTextField textField;
	private JPanel panelAbajo;
	private JButton cancelar;
	private JButton aceptar;
	private JMenuBar meBar;
	private JMenu nArchivo;
	JMenuItem mnInicio;
	JMenuItem mnSalir;

	/**
	 * Create the frame.
	 */
	public VentanaMVC() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panelArriba = new JPanel();
		panelArriba.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelArriba.setLayout(new BorderLayout(0, 0));
		setContentPane(panelArriba);
		
		JPanel panel = new JPanel();
		panelArriba.add(panel, BorderLayout.NORTH);
		
		JLabel labelNombre = new JLabel("Nombre: ");
		panel.add(labelNombre);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		panelAbajo = new JPanel();
		panelArriba.add(panelAbajo, BorderLayout.SOUTH);
		panelAbajo.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		
		cancelar = new JButton("Cancelar");
		panelAbajo.add(cancelar);
		
		aceptar = new JButton("Aceptar");
		panelAbajo.add(aceptar);
		
		meBar = new JMenuBar();
		setJMenuBar(meBar);
		
		nArchivo = new JMenu("Archivo");
		meBar.add(nArchivo);
		
		mnInicio = new JMenuItem("Inicio");
		nArchivo.add(mnInicio);
		
		mnSalir = new JMenuItem("Salir");
		nArchivo.add(mnSalir);
	}

}