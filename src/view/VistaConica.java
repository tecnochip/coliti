package view;

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import model.Point;
import model.VistaGrafica;

@SuppressWarnings("serial")
public class VistaConica extends JFrame {
	// Variables 
	private JButton BtnGraficar;
	private JRadioButton RX;
	private JRadioButton RY;
	private ButtonGroup buttonGroup1;
	private JLabel jLabel1;
	private JLabel jLabel10;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JLabel jLabel7;
	private JLabel jLabel8;
	private JLabel jLabel9;
	private JPanel jPanel1;
	private JPanel jPanel2;
	private JPanel jPanel3;
	private JTextField a;
	private JTextField b;
	private JTextField h;
	private JTextField k;
	private JTextField m;
	private JTextField n;
	private JMenuBar mnBar;
	private JMenu mArchivo;
	JMenuItem mInicio;
	JMenuItem mSalir;
	

	ArrayList<Point>imprimirpixel=new ArrayList<>();
	Graphics g;
	VistaGrafica grafica;
	
	public VistaConica() {
	initComponents();
    this.n.setText("2");
    this.m.setText("2");
    this.m.setEnabled(false);
    this.n.setEnabled(false);
    this.h.setText("0");
    this.k.setText("0");
   
    
}

private void initComponents() {

    buttonGroup1 = new ButtonGroup();
    jLabel9 = new JLabel();
    new ButtonGroup();
    jPanel1 = new JPanel();
    jLabel3 = new JLabel();
    jPanel2 = new JPanel();
    BtnGraficar = new JButton();
    jLabel1 = new JLabel();
    a = new JTextField();
    jLabel2 = new JLabel();
    b = new JTextField();
    jLabel4 = new JLabel();
    jLabel5 = new JLabel();
    jLabel6 = new JLabel();
    jLabel7 = new JLabel();
    h = new JTextField();
    k = new JTextField();
    n = new JTextField();
    m = new JTextField();
    jLabel8 = new JLabel();
    jPanel3 = new JPanel();
    jLabel10 = new JLabel();
    RX = new JRadioButton();
    RY = new JRadioButton();

   

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBackground(Color.WHITE);
    this.setResizable(false);
	this.setTitle("ECUACIONES CONICAS");
	
	jLabel9.setText("jLabel9");

    jPanel1.setBackground(Color.LIGHT_GRAY);
    jPanel1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));

    jLabel3.setText("ECUACION CONICA  ((x-h)^2/a^2)+((y-k)^2/b^2)=1");

    GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(31, 31, 31)
            .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 289, GroupLayout.PREFERRED_SIZE)
            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
    );
    
	mnBar = new JMenuBar();
	setJMenuBar(mnBar);
	
	mArchivo = new JMenu("Archivo");
	mnBar.add(mArchivo);
	
	mInicio = new JMenuItem("Inicio");
	mArchivo.add(mInicio);
	
	mSalir = new JMenuItem("Salir");
	mArchivo.add(mSalir);
   

    BtnGraficar.setText("DIBUJAR");
    BtnGraficar.addActionListener(new ActionListener() {
    	
        public void actionPerformed(ActionEvent e) {
            BtnGraficarActionPerformed(e);
        }
    });

  
    jLabel1.setText("A:");
    
    jLabel2.setText("B:");
 
    jLabel4.setText("N:");
    

    jLabel5.setText("H:");
    
    jLabel6.setText("K:");
 
    jLabel7.setText("M:");
  
    jLabel8.setText("PARA MOVER GRAFICA");

    jPanel3.setBackground(Color.LIGHT_GRAY);
    jPanel3.setBorder(BorderFactory.createEtchedBorder());
  
    jLabel10.setText("TOMA VALOR NEGATIVO");

    buttonGroup1.add(RX);
    RX.setText("(a)");

    buttonGroup1.add(RY);
    RY.setText("(b)");

    GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(jLabel10)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(RX)
                    .addGap(8, 8, 8)
                    .addComponent(RY)))
            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jLabel10)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(RX)
                .addComponent(RY))
            .addGap(7, 7, 7))
    );

    GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(n,GroupLayout.PREFERRED_SIZE, 82,GroupLayout.PREFERRED_SIZE)
                        .addGroup(GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1,GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(a,GroupLayout.PREFERRED_SIZE, 84,GroupLayout.PREFERRED_SIZE)
                                .addComponent(b,GroupLayout.PREFERRED_SIZE, 84,GroupLayout.PREFERRED_SIZE))))
                    .addGap(28, 28, 28)
                    .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6,GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel7,GroupLayout.Alignment.LEADING,GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4,GroupLayout.Alignment.LEADING,GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addComponent(m,GroupLayout.PREFERRED_SIZE, 82,GroupLayout.PREFERRED_SIZE)))
            .addGap(18, 18, 18)
            .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                .addComponent(BtnGraficar, GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addComponent(jPanel3,GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                    .addComponent(k,GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(h,GroupLayout.Alignment.LEADING)))
            .addContainerGap(17, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1,GroupLayout.PREFERRED_SIZE, 27,GroupLayout.PREFERRED_SIZE)
                        .addComponent(a,GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE))
                    .addGap(9, 9, 9)
                    .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2,GroupLayout.PREFERRED_SIZE, 23,GroupLayout.PREFERRED_SIZE)
                        .addComponent(b,GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4,GroupLayout.PREFERRED_SIZE, 23,GroupLayout.PREFERRED_SIZE)
                        .addComponent(n,GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE))
                    .addGap(19, 19, 19)
                    .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7,GroupLayout.PREFERRED_SIZE, 23,GroupLayout.PREFERRED_SIZE)
                        .addComponent(m,GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabel8)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5,GroupLayout.PREFERRED_SIZE, 23,GroupLayout.PREFERRED_SIZE)
                        .addComponent(h,GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE))
                    .addGap(9, 9, 9)
                    .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6,GroupLayout.PREFERRED_SIZE, 23,GroupLayout.PREFERRED_SIZE)
                        .addComponent(k,GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jPanel3,GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)))
            .addGap(18, 18, 18)
            .addComponent(BtnGraficar,GroupLayout.PREFERRED_SIZE, 46,GroupLayout.PREFERRED_SIZE)
            .addContainerGap(46, Short.MAX_VALUE))
    );

    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1,GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
        .addComponent(jPanel2,GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1,GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel2,GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
}


private void BtnGraficarActionPerformed(ActionEvent e) {
   
    if(a.getText().isEmpty() || b.getText().isEmpty() || h.getText().isEmpty() || k.getText().isEmpty() || n.getText().isEmpty() || m.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "No debe dejar los campos vacios","Error",JOptionPane.WARNING_MESSAGE);
    }else{
    	
    double ap,bp,h,k;
    int n,m;
    
    ap=Double.parseDouble(this.a.getText());
    bp=Double.parseDouble(this.b.getText()); 
    h=Double.parseDouble(this.h.getText());
    k=Double.parseDouble(this.k.getText());
    n=Integer.parseInt(this.n.getText());
    m=Integer.parseInt(this.m.getText());
    

    GraficarFigura(ap,bp,h,k,n,m);//para graficar 

    VistaGrafica vg = new VistaGrafica(imprimirpixel);
    vg.setVisible(true);
    vg.setLocationRelativeTo(null);
    vg.setResizable(false);

   }
}

public void GraficarFigura(double aux1,double bux1,double haux, double kaux,int n, int m){
    //ejecuta el algoritmo y obtenenmos los puntos x,y
    
    
    int a,b,y=0,x=0,h,k;
      a= (int) aux1; //convierte los valores a tipo entero
      b= (int) bux1;
      h=(int)haux;
      k=(int)kaux;
      
      if(n==2 && m==2){
            
           if(this.RY.isSelected()){
              
             //cuando a y b toman valores negativos
                    while(x<this.getHeight()){
                    //calculo de la variable despejada
                    y= (int) Math.ceil((double)Math.sqrt(((1+((double)Math.pow(x,2))/((double)Math.pow(a,2)))*((int)Math.pow(b,2)))));

                    imprimirpixel.add(new Point(h+x,k+y));
                    imprimirpixel.add(new Point(h-x,k+y));
                    imprimirpixel.add(new Point(h-x,k-y));
                    imprimirpixel.add(new Point(h+x,k-y));

                    x=x+1;

                   }
                       
                    
           }else{//cuando seleccione el otro radio button
               if(this.RX.isSelected()){
                   while(y<this.getWidth()){
                	   
                    //calculo de la variable despejada
                    x= (int) Math.ceil((double)Math.sqrt(((1+((double)Math.pow(y,2))/((double)Math.pow(b,2)))*((int)Math.pow(a,2)))));

                    imprimirpixel.add(new Point(h+x,k+y));
                    imprimirpixel.add(new Point(h-x,k+y));
                    imprimirpixel.add(new Point(h-x,k-y));
                    imprimirpixel.add(new Point(h+x,k-y));
                    y=y+1;
                        }
               }
           }

          //para formar elipse
          if(b==a){//circulo
             
            while(y<=b){
                //calculo de la variable despejada
                  x= (int) Math.ceil(((double)Math.sqrt((1-((double)Math.pow(y,2))/((double)Math.pow(b,2)))*((int)Math.pow(a,2)))));
    
                        imprimirpixel.add(new Point(h+x,k+y));
                        imprimirpixel.add(new Point(h-x,k+y));
                        imprimirpixel.add(new Point(h-x,k-y));
                        imprimirpixel.add(new Point(h+x,k-y));
//                        
                        y=y+1;
                        }
                 }else{
                      if(a>b){
                        while(x<a){
                        	
                    //calculo de la variable despejada
                    y= (int) Math.ceil((double)Math.sqrt(((1-((double)Math.pow(x,2))/((double)Math.pow(a,2)))*((int)Math.pow(b,2)))));

                    imprimirpixel.add(new Point(h+x,k+y));
                    imprimirpixel.add(new Point(h-x,k+y));
                    imprimirpixel.add(new  Point(h-x,k-y));
                    imprimirpixel.add(new  Point(h+x,k-y));
                    x=x+1;
                        }
                    }else{//b>a
                            while(y<b){
                    //calculo de la variable despejada
                    x= (int) Math.ceil((double)Math.sqrt(((1-((double)Math.pow(y,2))/((double)Math.pow(b,2)))*((int)Math.pow(a,2)))));

                    imprimirpixel.add(new  Point(h+x,k+y));
                    imprimirpixel.add(new  Point(h-x,k+y));
                    imprimirpixel.add(new  Point(h-x,k-y));
                    imprimirpixel.add(new  Point(h+x,k-y));
                    y=y+1;
                        }
                    } 
          }

      }else{
            if(n==1 && m==1){//para linea
                int yp=-672;//para que comience desde los negativos hasta llegar a lo alto del panel;
                while(yp<=this.getHeight()){
                           
                            
                            x=(int) Math.ceil((1-(Math.pow((yp),n))/b)*a);
                            imprimirpixel.add(new  Point(x+h,yp+k));
                            yp=yp+1;                                  
              }
               
            }else{
              if(m==1){//parabola vertical
                  if(b>a){
                    if(a<1){//cuando a toma valor negativo
                    int apro=a*-1;//si a tiene valor negativo se pasa a positivo
                    
                    while(x<=Math.pow(apro,2)){
                            //calculo de la variable despejada
                            y=(int) Math.ceil((double)Math.pow((((1-((double)Math.pow((x-h),2)/apro))*b)),m)+k);

                            imprimirpixel.add(new Point(x,y));
                            x=x+1;
                           }
                        }else{
                                while(x<=Math.pow(a,2)){
                                //calculo de la variable despejada
                                y=(int) Math.ceil((double)Math.pow((((1-((double)Math.pow((x-h),2)/a))*b)),m)+k);

                                imprimirpixel.add(new Point(x,y));
                                x=x+1;

                            }
                         }
                       }else{ //a>b
                           if(b<1){//cuando b tiene valor negativo
                            int bpro=b*-1;//si a tiene valor negativo se pasa a positivo
                            while(x<=bpro){
                            //calculo de la variable despejada
                            y=(int) Math.ceil((double)Math.pow((((1-((double)Math.pow((x-h),2)/a))*bpro)),m)+k);
                            imprimirpixel.add(new Point(x,y));
                            x=x+1;
                            }
                    
                        }else{
                            while(x<=Math.pow(a,2)){

                             y=(int) Math.ceil((double)Math.pow((((1-((double)Math.pow((x-h),2)/a))*b)),m)+k);
                                imprimirpixel.add(new Point(x,y));                 
                                x=x+1;

                                        }
                            }

                        }
                  
            }else if(n==1){//parabola horizontal
                    if(a>b){
                        if(b<1){//cuando b toma valor negativo
                            int bnu=(b*-1);
                            while(y<=Math.pow(bnu,2)){
                            	
                      //calculo de la variable despejada
                         x= (int) Math.ceil((double)Math.pow(((1-((double)Math.pow((y-k),2))/bnu)*a),n)+h);
                        imprimirpixel.add(new Point(x,y));  
                        y=y+1;

                         }
                        }else{
                        while(y<=Math.pow(b,2)){
                        	
                      //calculo de la variable despejada
                        x= (int) Math.ceil((double)Math.pow(((1-((double)Math.pow((y-k),2))/b)*a),n)+h);
                        imprimirpixel.add(new Point(x,y));
                        y=y+1;

                         }
                       }
                    }else{//b>a
                    	
                        if(a<1){
                            int apro=(a*-1);
                            while(y<=(double)Math.pow(b,2)){
                            	
                         //calculo de la variable despejada
                           x= (int) Math.ceil((double)Math.pow(((1-((double)Math.pow((y-k),2))/b)*apro),n)+h);
                           imprimirpixel.add(new Point(x,y));
                           y=y+1;
                            }
                            
                        }else{
                        while(y<=(double)Math.pow(b,2)){
                         //calculo de la variable despejada
                           x= (int) Math.ceil((double)Math.pow(((1-((double)Math.pow((y-k),2))/b)*a),n)+h);
                           imprimirpixel.add(new Point(x,y));
                           y=y+1;
                            }
                        }
                    }
                   }else{//si ninguna de las demas condiciones se cumple no hace nada
                       }
          }    
      }
   }
}