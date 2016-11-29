/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Dominik
 */
public class okienko {
        JFrame frame = new JFrame ("Silnia");
        JButton przycisk = new JButton("Nie chcę dłużej czekać");
        JTextField iter = new JTextField();
        JTextField reku = new JTextField();
    
    public void okienko() {  
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,200);
        frame.setVisible(true);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);
        
        przycisk.setBounds(50, 10, 200, 50);
        panel.add(przycisk);
        
        iter.setBounds(40, 80, 200, 20);
        panel.add(iter);
        
        reku.setBounds(40, 110, 200, 20);
        panel.add(reku);
    }
    
    public void nasluch(watek[] wat) {
        przycisk.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent evt) {
                    wat[0].interrupt();
                    wat[1].interrupt();    
                    //System.exit(0);
                }
        });
    }
}
    
