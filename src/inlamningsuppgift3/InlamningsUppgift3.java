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

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.util.*;


public class InlamningsUppgift3 extends JFrame implements ActionListener{
    LinkedList<JButton> lablarna;
    int tompos;
    JLabel GameBoard = new JLabel();
    
    //public  InlamningsUppgift3(){
        
        
         
        // GameBoard = new JLabel();
        JLabel ButtonRow = new JLabel();
        //GameBoard.setSize(350,350);
        JButton l1 = new JButton("1");
        JButton l2 = new JButton("2");
        JButton l3 = new JButton("3");
        JButton l4 = new JButton("4");
        JButton l5 = new JButton("5");
        JButton l6 = new JButton("6");
        JButton l7 = new JButton("7");
        JButton l8 = new JButton("8");
        JButton l9 = new JButton("9");
        JButton l10 = new JButton("10");
        JButton l11 = new JButton("11");
        JButton l12 = new JButton("12");
        JButton l13 = new JButton("13");
        JButton l14 = new JButton("14");
        JButton l15 = new JButton("15");
        
        JButton tomma = new JButton();
        
        public  InlamningsUppgift3(){
           // l12.setActionCommand("testar03");
        GameBoard.setPreferredSize(new Dimension(355, 355));
        
        GameBoard.setLayout(new GridLayout(4,4, 5, 5));
        
        
         tompos = 15;
        
        lablarna = new LinkedList<>();
        
        
       // l1.setPreferredSize(new Dimension(350, 140));
        //Lyssnaren ml = new Lyssnaren();
        //l1.addMouseListener(ml);
        
        //this.addFocusListener(fl);
        lablarna.add(l1);lablarna.add(l2);lablarna.add(l3);
        lablarna.add(l4);
        lablarna.add(l5);lablarna.add(l6);lablarna.add(l7);
        lablarna.add(l8);lablarna.add(l9);lablarna.add(l10);
        lablarna.add(l11);lablarna.add(l12);lablarna.add(l13);
        lablarna.add(l14);lablarna.add(l15);lablarna.add(tomma);
        tomma.setActionCommand("16");
        
        
         
//        int raknare=0;
//        for(JButton l: lablarna){
//            GameBoard.add(l);
//            //l.addMouseListener(this);
//            l.addActionListener(this);
//            l.setVisible(true);
//            l.setSize(50,50);
//            l.setPreferredSize(new Dimension(55, 55));
//            l.setName(Integer.toString(raknare));
//            //l.setName("Hejsan");
//            raknare++;
//        }
        SortaAllt(lablarna);
        
        
        setLayout( new FlowLayout() );
        GameBoard.add(tomma);
        
        add(GameBoard);
        GameBoard.setVisible(true);
//        //l9.setSize(150,150);
//        l9.setPreferredSize(new Dimension(350, 140));
//       l9.add(l10);
//       l10.setPreferredSize(new Dimension(55, 55));
//        l9.add(l11);
//        add(l9);
//        l10.setVisible(true);
//        l11.setVisible(true);
//        l9.setLayout( new FlowLayout() );
        
         
//        invalidate();
//        repaint();
   
        setSize(1200,1100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        
        
        
    }
    
    public void BytPlats(int a){
        //System.out.println(lablarna.toString());
                for(JButton l: lablarna)
                    System.out.print(l.getActionCommand() + ", ");
                System.out.println("");
        System.out.println(lablarna.size() + ", " + a + ", " + tompos);
        Collections.swap(lablarna, (a-1), tompos);
        tompos=a-1;
        //GameBoard.removeAll();
        //SortaAllt(lablarna);
        //invalidate();
        repaint();
        for(JButton l: lablarna)
                    System.out.print(l.getActionCommand() + ", ");
        System.out.println("");
        omgruppera();
    }
    public void omgruppera(){
        GameBoard.removeAll();
        
        for(JButton l: lablarna){
            l.removeAll();
            l.removeActionListener(this);
            GameBoard.add(l);
            l.addActionListener(this);
            l.setVisible(true);
            l.setSize(50,50);
            l.setPreferredSize(new Dimension(55, 55));
        }
        //invalidate();
        repaint();
        System.out.println("test");
    }
    public void SortaAllt(LinkedList listan){
        int raknare=0;
        //GameBoard.removeAll();
        for(JButton l: lablarna){
            l.removeAll();
            l.removeActionListener(this);
            GameBoard.add(l);
            //l.addMouseListener(this);
            l.addActionListener(this);
            l.setVisible(true);
            l.setSize(50,50);
            l.setPreferredSize(new Dimension(55, 55));
            //l.setName(Integer.toString(raknare));
            //l.setName("Hejsan");
            raknare++;
        }
//        for(JButton l: lablarna){
//        System.out.print(l.getActionCommand() + ", ");
//        //l.setText(l.getActionCommand());
//        }
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        BytPlats(Integer.valueOf(e.getActionCommand()));
//        for(JButton l: lablarna){
//        System.out.print(l.getActionCommand() + ", ");
//        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        
//        System.out.println(e.toString());
//        String a=e.getActionCommand();
//        for(JButton l: lablarna){
//            if(l.getActionCommand().equals(a)){
//                l.setBackground(Color.BLUE);
//                l.setText(Integer.toString(tompos));
//                
//            }
//        }
//        System.out.println("test01");
//        System.out.println("Du klickade pa knapp: " + e.getActionCommand());
//        
        
        
        //BytPlats(Integer.parseInt(e.getActionCommand()));
        
    }
//    @Override
//    public void mouseClicked(MouseEvent e) {
//        //System.out.println("Nu trycktes "  + e.getSource().toString());
//        //System.out.println(actionEvent.getActionCommand());
//        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void mousePressed(MouseEvent e) {
//        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void mouseReleased(MouseEvent e) {
//        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void mouseEntered(MouseEvent e) {
//        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void mouseExited(MouseEvent e) {
//        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
    public static void main(String[] args){
        InlamningsUppgift3 n = new InlamningsUppgift3();}

    
}

//class Lyssnaren implements MouseListener{
//
//    
//    
//}
