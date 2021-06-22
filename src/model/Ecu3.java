package model;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class Ecu3 extends JFrame {
	
	Double a11,a12,a13,a21,a22,a23,a31,a32,a33;
	DefaultTableModel modelo = new DefaultTableModel();


	// Variables
	private JButton jButton1;
	private JLabel jLabel1;
	private JScrollPane jScrollPane1;
	private JLabel lblX;
	private JLabel lblY;
	private JLabel lblZ;
	private JTable tblA;


    public Ecu3() {
        initComponents();
        String titu[]={"X","Y","Z","B"};
        modelo.setColumnIdentifiers(titu);
        tblA.setModel(modelo);
        String datos[]={"2","4","6","8"};
        String datos2[]={"1","-3","5","-9"};
        String datos3[]={"-10","50","-7","20"};
        modelo.addRow(datos);
        modelo.addRow(datos2);
        modelo.addRow(datos3);
    }
    
    private Double redo(Double N){
        return (Math.rint(N*100)/100);
    }


    private void initComponents() {

        jLabel1 = new JLabel();
        jScrollPane1 = new JScrollPane();
        tblA = new JTable();
        jButton1 = new JButton();
        lblX = new JLabel();
        lblY = new JLabel();
        lblZ = new JLabel();
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
		this.setTitle("Sistema de Ecuaciones Lineales de 3x3");
    
        tblA.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        tblA.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        
        jScrollPane1.setViewportView(tblA);

        jButton1.setText("Solucionar");
        jButton1.addActionListener(new ActionListener() {
        	
            public void actionPerformed(ActionEvent e) {
                Double a,ax,ay,az,b1,b2,b3;
                
                b1=Double.parseDouble(modelo.getValueAt(0, 3).toString());
                b2=Double.parseDouble(modelo.getValueAt(1, 3).toString());
                b3=Double.parseDouble(modelo.getValueAt(2, 3).toString());
                captura();
                a=deter();
                a11=b1;a21=b2;a31=b3;
                ax=deter();
                captura();
                a12=b1;a22=b2; a32=b3;
                ay=deter();
                captura();
                a13=b1;a23=b2;a33=b3;
                az=deter();
                lblX.setText("X="+redo(ax/a)+"");
                lblY.setText("Y="+redo(ay/a)+"");
                lblZ.setText("Z="+redo(az/a)+"");
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1,GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblX, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblY, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(lblZ, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1,GroupLayout.PREFERRED_SIZE, 109,GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1,GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblX, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblY, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblZ, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41))
        );

        pack();
        
     
    }

   
    private void captura(){
        a11=Double.parseDouble(modelo.getValueAt(0, 0).toString());
        a12=Double.parseDouble(modelo.getValueAt(0, 1).toString());
        a13=Double.parseDouble(modelo.getValueAt(0, 2).toString());
        a21=Double.parseDouble(modelo.getValueAt(1, 0).toString());
        a22=Double.parseDouble(modelo.getValueAt(1, 1).toString());
        a23=Double.parseDouble(modelo.getValueAt(1, 2).toString());
        a31=Double.parseDouble(modelo.getValueAt(2, 0).toString());
        a32=Double.parseDouble(modelo.getValueAt(2, 1).toString());
        a33=Double.parseDouble(modelo.getValueAt(2, 2).toString());
    }
    
    private Double deter(){
        Double d;
        d=(a11*a22*a33+a12*a23*a31+a13*a21*a32)-(a13*a22*a31+a12*a21*a33+a11*a23*a32);
        return d;
    }
}


