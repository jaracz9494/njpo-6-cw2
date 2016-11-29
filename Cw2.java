/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Dominik
 */
public class Cw2 {
    private static final int ILE = 2;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame frame = new JFrame ("Silnia");
        JButton przycisk = new JButton("Nie chcę dłużej czekać");
        
        
        
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,200);
        frame.setVisible(true);
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.add(przycisk);
        
        
        watek[] wat = new watek[ILE];
        
        Scanner sc = new Scanner (System.in);
        long podaj;
        
        
        System.out.println("LICZENIE SILNI");
        System.out.println("podaj cyfre:");
        podaj = Integer.parseInt(sc.nextLine());
        System.out.println();
        przycisk.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent evt) {
                    wat[0].interrupt();
                    wat[1].interrupt();    
                    //System.exit(0);
                }
        });
        
        wat[0] = new watek("iteracyjnie", podaj);
        wat[0].start();
        
        
        wat[1] = new watek("rekurencyjnie", podaj);
        wat[1].start();    
        
        
    }
    
}
