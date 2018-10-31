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

import java.awt.BorderLayout;
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
    
    
    String teststring01;
    //public  InlamningsUppgift3(){
        
        
         
        // GameBoard = new JLabel();
        JLabel ButtonRow = new JLabel();
        JButton ordning = new JButton("Ordningen");
        JButton info = new JButton("INFO");
        JButton scramble = new JButton("Scramble");
        JLabel winst = new JLabel();
        
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
            tomma.setEnabled( false );
           // l12.setActionCommand("testar03");
        GameBoard.setPreferredSize(new Dimension(355, 355));
        
        GameBoard.setLayout(new GridLayout(4,4, 5, 5));
        
        
        
        
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
        lablarna.add(l14);lablarna.add(l15);
        
        lablarna.add(tomma);
        tomma.setActionCommand("16");
        tompos = 15;
        
         
        int raknare=0;
        for(JButton l: lablarna){
            l.setFont(new Font("Arial", Font.PLAIN, 40));
            GameBoard.add(l);
            //l.addMouseListener(this);
            l.addActionListener(this);
            l.setVisible(true);
            l.setSize(50,50);
            l.setPreferredSize(new Dimension(55, 55));
            l.setName(Integer.toString(raknare));
            //l.setName("Hejsan");
            raknare++;
        }
        GameBoard.add(tomma);
        add(GameBoard);
        //GameBoard.setVisible(true);
        
        //SortaAllt(lablarna);
        
        
        setLayout( new FlowLayout() );
        
        
        ButtonRow.setLayout( new FlowLayout() );
        
        
        ButtonRow.add(ordning);
        ButtonRow.add(scramble);
        ButtonRow.add(info);
        ButtonRow.add(winst);
        ButtonRow.setVisible(true);
        ButtonRow.setPreferredSize(new Dimension(355, 355));
        add(ButtonRow);
        
        
        scramble.addActionListener(this);
        scramble.setVisible(true);
        scramble.setSize(150,150);
        scramble.setPreferredSize(new Dimension(155, 155));
        
        //scramble.addActionListener(this);
        boolean vunnit = false;
        winst.setText(String.valueOf(vunnit));
        winst.setVisible(true);
        winst.setSize(150,150);
        winst.setPreferredSize(new Dimension(155, 155));
        
        info.addActionListener(this);
        info.setVisible(true);
        info.setSize(150,150);
        info.setPreferredSize(new Dimension(155, 155));
        
        ordning.addActionListener(this);
        ordning.setVisible(true);
        ordning.setSize(150,150);
        ordning.setPreferredSize(new Dimension(155, 155));
        
        
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
    public void BytPos(int knappP){
        Collections.swap(lablarna, knappP, tompos);
        rita();
        tompos=knappP;
        System.out.println(win());
    }
    public void Scramble(){
       Collections.shuffle(lablarna);
       rita();
       tompos = lablarna.indexOf(tomma);
    }
    public boolean win(){
        int raknare=0;
        for(JButton l: lablarna){
            if(Integer.parseInt(l.getName())!=raknare)
                return false;
            raknare++;
        }
        winst.setText(String.valueOf(true));
        return true;
    }
    public void rita(){
        GameBoard.removeAll();
        for(JButton l: lablarna){
            GameBoard.add(l);
            l.setVisible(true);
            l.setSize(50,50);
            l.setPreferredSize(new Dimension(55, 55));
        }
        invalidate();
        validate();
        repaint();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("---------------------");
//            JButton button = (JButton)e.getSource();
//         button.setBackground(Color.BLUE);
//OBS TITTA OVAN DET ÄR SÅ DU REAGERAR MED KNAPPAR DU TRYCKT PÅ
         if(e.getSource()==ordning){
             for(JButton l: lablarna)
                    System.out.print(l.getActionCommand() + ", ");
                System.out.println("");
                for(JButton l: lablarna)
                    System.out.print(l.getActionCommand() + ", ");
                System.out.println("");
            
         }
         else if(e.getSource()==info){
              System.out.println("Storleken pa list: " + lablarna.size() + 
                      ", Senaste klickade: " + teststring01 + ", Gamla klickade: " + tompos);
         }
         else if(e.getSource()==scramble){
              Scramble();
         }
         
         else{
              JButton button = (JButton)e.getSource();
              //String knappid = e.getActionCommand();
              int pos = lablarna.indexOf(button);
              //String namn = button.getName();
              //int t = tompos;
              //System.out.println("Du tryckte pa ruta " + pos +", och tompos ligger pa " + tompos);
              if(pos-tompos == -1 || pos-tompos == 1 || pos-tompos == 4 || pos-tompos == -4 )
                BytPos(pos);
              // pos = lablarna.indexOf(button);
              
              
             
             //detta nedan var här förut
//             JButton button = (JButton)e.getSource();
//              //button.setBackground(Color.BLUE);
//             int aa = lablarna.indexOf(button)+1;
//             int pekade=Integer.parseInt(e.getActionCommand())-1;
//             System.out.println("pekade=" + pekade + ", tompos = " + tompos);
//             if((pekade)==tompos || (pekade+1)==tompos || (pekade+4)==tompos){
//                 System.out.println("yes");
//                 System.out.println(e.getActionCommand());
//             //BytPlats(Integer.valueOf(e.getActionCommand()));}
//             System.out.println("aa=" +aa);
//             BytPlats(aa);
             
         }
        
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

//public void BytPlats(int a){
//        teststring01=Integer.toString(a);
//        //System.out.println(lablarna.toString());
////                for(JButton l: lablarna)
////                    System.out.print(l.getActionCommand() + ", ");
////                System.out.println("");
//       // System.out.println(lablarna.size() + ", " + a + ", " + tompos);
//      // System.out.println(tompos);
//       System.out.println(a-1);
//       System.out.println(tompos);
//        Collections.swap(lablarna, (a-1), tompos);
//        tompos=a-1;
//        //GameBoard.removeAll();
//        //SortaAllt(lablarna);
//        //invalidate();
//        repaint();
////        for(JButton l: lablarna)
////                    System.out.print(l.getActionCommand() + ", ");
////        System.out.println("");
//        omgruppera();
//    }
//    public void omgruppera(){
//        GameBoard.removeAll();
//        for(JButton l: lablarna){
//            l.removeAll();
//            //l.removeActionListener(this);
//            GameBoard.add(l);
//            //l.addActionListener(this);
//            l.setVisible(true);
//            l.setSize(50,50);
//            l.setPreferredSize(new Dimension(55, 55));
//        }
//        //SwingUtilities.updateComponentTreeUI(this);
//        invalidate();
//        validate();
//        repaint();
//    }
//    public void SortaAllt(LinkedList listan){
//        int raknare=0;
//        //GameBoard.removeAll();
//        for(JButton l: lablarna){
//            l.removeAll();
//            l.removeActionListener(this);
//            GameBoard.add(l);
//            //l.addMouseListener(this);
//            l.addActionListener(this);
//            l.setVisible(true);
//            l.setSize(50,50);
//            l.setPreferredSize(new Dimension(55, 55));
//            //l.setName(Integer.toString(raknare));
//            //l.setName("Hejsan");
//            raknare++;
//        }
////        for(JButton l: lablarna){
////        System.out.print(l.getActionCommand() + ", ");
////        //l.setText(l.getActionCommand());
////        }
//        
//    }