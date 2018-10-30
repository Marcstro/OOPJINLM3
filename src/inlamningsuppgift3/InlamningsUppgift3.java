/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author marcu
aer awesome
 */


package inlamningsuppgift3;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class InlamningsUppgift3 extends JFrame{
    
    public  InlamningsUppgift3(){
    
        JLabel l1 = new JLabel("1");
        //l1.setFont("Times new Roman");
        l1.setFont(new Font("Serif", Font.PLAIN, 35));
        setLayout(new GridLayout(3,1, 1000, 0));

        
        l1.setPreferredSize(new Dimension(350, 140));
        Lyssnaren ml = new Lyssnaren();
        l1.addMouseListener(ml);
        
        //this.addFocusListener(fl);
        add(l1);
        setSize(1200,1100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    
    
    }
    
    public static void main(String[] args){
        InlamningsUppgift3 n = new InlamningsUppgift3();}
}

class Lyssnaren implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("testen");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
