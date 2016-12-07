/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Dominik
 */
public class okienko {
        JFrame frame = new JFrame ("Silnia");
        JButton przycisk = new JButton("Nie chcę dłużej czekać");
        
        JLabel podaj_l = new JLabel("Dla:");
        JFormattedTextField podaj_liczbe = new JFormattedTextField();
        
        JButton licz = new JButton("LICZ!");
        
        
        JLabel napis_iter = new JLabel("Iteracyjnie:");
        JLabel napis_iter_w = new JLabel("Wynik");
        JLabel napis_iter_c = new JLabel("Czas");
        
        JLabel napis_reku = new JLabel("Rekurencyjnie:");
        JLabel napis_reku_w = new JLabel("Wynik");
        JLabel napis_reku_c = new JLabel("Czas");
        
        JTextField iter_w = new JTextField();
        JTextField iter_c = new JTextField();
        
        JTextField reku_w = new JTextField();
        JTextField reku_c = new JTextField();
        
    
    public void okienko() {  
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,400);
        frame.setVisible(true);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);
        
        
        przycisk.setBounds(50, 10, 200, 50);
        panel.add(przycisk);
        
        podaj_l.setBounds(15, 70, 35, 20);
        panel.add(podaj_l);
        podaj_liczbe.setBounds(50, 70, 200, 20);
        podaj_liczbe.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0"))));
        panel.add(podaj_liczbe); 
        
        
        licz.setBounds(110, 95, 80, 30);
        panel.add(licz);
        
        
        napis_iter.setBounds(50, 130, 200, 20);
        panel.add(napis_iter);                
        
        napis_iter_w.setBounds(5, 150, 35, 20);
        panel.add(napis_iter_w);
        
        iter_w.setBounds(50, 150, 200, 20);
        iter_w.setEditable(false);
        panel.add(iter_w);
        
        napis_iter_c.setBounds(5, 180, 30, 20);
        panel.add(napis_iter_c);
        
        iter_c.setBounds(50, 180, 200, 20);
        iter_c.setEditable(false);
        panel.add(iter_c);
        
        
        napis_reku.setBounds(50, 210, 200, 20);
        panel.add(napis_reku);
        
        napis_reku_w.setBounds(5, 230, 35, 20);
        panel.add(napis_reku_w);
        
        reku_w.setBounds(50, 230, 200, 20);
        reku_w.setEditable(false);
        panel.add(reku_w);
        
        napis_reku_c.setBounds(5, 260, 30, 20);
        panel.add(napis_reku_c);
        
        reku_c.setBounds(50, 260, 200, 20);
        reku_c.setEditable(false);
        panel.add(reku_c);
        
       
    }
    
    public void ustaw_iter(String wyn, String czas) {
        iter_w.setText(wyn);
        iter_c.setText(czas);
    }
    
    public void ustaw_reku(String wyn, String czas) {
        reku_w.setText(wyn);
        reku_c.setText(czas);
    }
    
    
    public void ustaw_puste() {
        iter_w.setText("");
        iter_c.setText("");
        reku_w.setText("");
        reku_c.setText("");
    }
        
        
        
    
    
    public void nasluch_run(watek[] wat, okienko o) {
        licz.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent evt) {
                    
                    ustaw_puste();
                    
                    if (podaj_liczbe.getText().equals("")) {
                        podaj_liczbe.setText("0");
                    }
                    
                    wat[0] = new watek("iteracyjnie", Long.parseLong(podaj_liczbe.getText()), o);
                    wat[0].start();

                    wat[1] = new watek("rekurencyjnie", Long.parseLong(podaj_liczbe.getText()), o); 
                    wat[1].start();
                    
                }
        });
    }
    
    public void nasluch(watek[] wat) {
        przycisk.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent evt) {
                    
                    if (podaj_liczbe.getText().equals("")) {
                        podaj_liczbe.setText("0");
                    }
                    
                    try {
                    wat[0].interrupt();
                    wat[1].interrupt(); 
                    
                    } catch (NullPointerException e) {

                    }
                }
        });
    }
   
}
    
