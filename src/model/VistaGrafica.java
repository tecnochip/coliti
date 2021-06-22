package model;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class VistaGrafica extends JFrame {
	 JPanel panel;

  
    public class  Paint extends JPanel {
        
        public Paint() {
                    
        }

        @Override
        protected void paintComponent(Graphics g) {
            //Dibujar plano
            
	    g.setColor(Color.WHITE);
	    g.drawLine(0, this.getHeight()/2, this.getWidth(), this.getHeight()/2);
	    g.drawLine(this.getWidth()/2, 0,this.getWidth()/2 , this.getHeight());
                        
           
            int x0=300;
            int y0=275;
              g.setColor(Color.RED);
//            g.drawRect(x0, y0, 2, 2);//punto del centro
            for(Point c:coordenadas){
                
                g.drawRect(x0+c.getX(), y0-c.getY(),1,1);
            }
            limpiar();//limpiar para hacer una nueva grafica
        }
        
    }
    ArrayList<Point>coordenadas;
    
    public VistaGrafica(ArrayList<Point> array) {
        super("Vista Grafica");
        this.coordenadas=array;
        initComponents();
        dibujar();
         
    }

    private void dibujar() {
        VistaGrafica.Paint dibujo = new VistaGrafica.Paint();
        dibujo.setBounds(0,0, 600,550);
        dibujo.setOpaque(false);
        panel.add(dibujo);
        panel.repaint();
        
    }
    
    public void limpiar(){
        this.coordenadas.clear();
    }
    
    
    private void initComponents() {

        panel = new JPanel();
      
        panel.setBackground(Color.BLACK);
        panel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        panel.setPreferredSize(new Dimension(600, 600));

        GroupLayout panelLayout = new GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(panel,GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(panel,GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }
}