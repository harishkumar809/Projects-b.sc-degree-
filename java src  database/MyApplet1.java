/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pack3;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.*;
 
public class MyApplet1 extends Applet {
 
    Label l1,l2,l3;
    TextField t1,t2;
    Button button;
    @Override
    public void init(){ 
      l1=new Label("First no ");
      l2=new Label("second no ");
      l3=new Label("");
      t1=new TextField(); 
      t2=new TextField();
      button =new Button("Add");
    add(l1);
    add(t1);
    add(l2);
    add(t2);
    add(button); 
	add(l3);
	setLayout(null);
	l1.setBounds(30,50,100,20);
	l2.setBounds(30,100,100,20);
	t1.setBounds(150,50,150,20);
	t2.setBounds(150,100,150,20); 
	button.setBounds(110,130,110,20);
	l3.setBounds(150,180,500,20);   
        button.addActionListener(new myHandler());
        
        
        
    }
    public class myHandler implements ActionListener
    {
          @Override
          public void actionPerformed(ActionEvent e)
          {
              Integer a=0,b=0,sum=0;
              a=Integer.parseInt(t1.getText());
              b=Integer.parseInt(t2.getText());
              sum=a+b;
              l3.setText("sum of "+a+" and "+b+" = "+sum);
              
          }
    }
    
    

    
    
    
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */ 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    private Container getContentPane() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setDefaultCloseOperation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void pack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
