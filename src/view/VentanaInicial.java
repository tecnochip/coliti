package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;


import javax.swing.JButton;

import control.ControlMenu;


@SuppressWarnings("serial")
public class VentanaInicial extends JFrame {
	
	 private JButton ecuaciones;
	 private JButton conicas;
	 private JButton parabolico;
	 
	 ControlMenu controlador;
	 
	 
	 public VentanaInicial(ControlMenu c) {
			JPanel panelcentral = new JPanel();
			
			this.controlador=c;
			
			ecuaciones = new JButton("Ecuaciones Lineales");
			ecuaciones.setActionCommand("Ecuaciones");
			ecuaciones.addActionListener(c);
			
			conicas = new JButton("Ecuaciones Conicas");
			conicas.setActionCommand("Conicas");
			conicas.addActionListener(c);
			
			
			parabolico = new JButton("Tiro Parabolico");
			parabolico.setActionCommand("Tiro");
			parabolico.addActionListener(c);
			
			// creo el panel de arriba y los botones
			JPanel panelSup = new JPanel ();
			panelSup.setLayout(new FlowLayout (FlowLayout.CENTER));
			panelSup.add(ecuaciones);
			
			// creo el panel de centro y el lienzo
			JPanel panelCnt = new JPanel ();
			panelCnt.setLayout(new FlowLayout (FlowLayout.CENTER));
			panelCnt.add(conicas);
			
			// creo el panel de abajo, la etiqueta y el campo de texto
			JPanel panelInf = new JPanel ();
			panelInf.setLayout(new FlowLayout (FlowLayout.CENTER));
			panelInf.add(parabolico);
			
			// Creo los paneles arriba y abajo en el "lienzo" principal
			panelcentral.add(panelSup, BorderLayout.SOUTH);
			panelcentral.add(panelCnt,BorderLayout.CENTER);
			panelcentral.add(panelInf, BorderLayout.NORTH);
			
			add(panelcentral);
			
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setSize(500,100);
			this.setResizable(false);
			this.setTitle("Proyecto de Ingenieria");
			this.setVisible(true);
			
			
	 
	 }


}
