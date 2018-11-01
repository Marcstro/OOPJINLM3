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
    
        JLabel ButtonRow = new JLabel();
        JButton scramble = new JButton("Scramble");
        JButton fuskScramble = new JButton("FuskScramble");
        JLabel winst = new JLabel();
        
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
        GameBoard.setPreferredSize(new Dimension(355, 355));
        GameBoard.setLayout(new GridLayout(4,4, 5, 5));
        
        lablarna = new LinkedList<>();
        lablarna.add(l1);lablarna.add(l2);lablarna.add(l3);lablarna.add(l4);
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
            l.addActionListener(this);
            l.setVisible(true);
            l.setSize(50,50);
            l.setPreferredSize(new Dimension(55, 55));
            l.setName(Integer.toString(raknare));
            raknare++;
        }
        GameBoard.add(tomma);
        add(GameBoard);
        
        setLayout( new FlowLayout() );
        
        ButtonRow.setLayout( new FlowLayout() );
        
        ButtonRow.add(scramble);
        ButtonRow.add(fuskScramble);
        ButtonRow.setVisible(true);
        ButtonRow.setPreferredSize(new Dimension(355, 355));
        
        add(ButtonRow);
        
        scramble.addActionListener(this);
        scramble.setVisible(true);
        scramble.setSize(150,150);
        scramble.setPreferredSize(new Dimension(155, 155));
        
        fuskScramble.addActionListener(this);
        fuskScramble.setVisible(true);
        fuskScramble.setSize(150,150);
        fuskScramble.setPreferredSize(new Dimension(155, 155));
        
        setSize(1200,1100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        
    }
    public void BytPos(int knappP){
        Collections.swap(lablarna, knappP, tompos);
        rita();
        tompos=knappP;
    }
    public void Scramble(){
       Collections.shuffle(lablarna);
       rita();
       tompos = lablarna.indexOf(tomma);
    }
    public void FuskScramble(){
        for(JButton l: lablarna){
            if(lablarna.indexOf(l)!=Integer.parseInt(l.getName())){
                Collections.swap(lablarna, lablarna.indexOf(l), Integer.parseInt(l.getName()));
                tompos=lablarna.indexOf(tomma);
                rita();
                break;
            }
        }
        if(win())
            woohoo();
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
     public void woohoo(){
        GameBoard.removeAll();
        JLabel w = new JLabel("Grattis, du vann!");
        w.setSize(350,350);
        w.setPreferredSize(new Dimension(355, 355));
        w.setFont(new Font("Courier New", Font.ITALIC, 25));
        w.setVisible(true);
        
        GameBoard.add(w);
        GameBoard.setHorizontalAlignment(JLabel.CENTER);
        invalidate();
        validate();
        repaint();
    }
    public void rita(){
        GameBoard.removeAll();
        int rakna=0;
        for(JButton l: lablarna){
            rakna++;
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
        
         if(e.getSource()==scramble){
              Scramble();
         }
         if(e.getSource()==fuskScramble){
              FuskScramble();
         }
         
         else{
              JButton button = (JButton)e.getSource();
              int pos = lablarna.indexOf(button);if(pos-tompos == -1 || pos-tompos == 1 || pos-tompos == 4 || pos-tompos == -4 ){
                BytPos(pos);
                if(win()){
                    woohoo();
                }
              }
         }
    }

    public static void main(String[] args){
        InlamningsUppgift3 n = new InlamningsUppgift3();}
}
