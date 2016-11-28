/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author Dominik
 */
public class watek implements Runnable {
    
        String name;
        long ile, start, stop;
        
        watek(String name, long ile) {
            this.name=name;
            this.ile=ile;
        }
        
        public long rekurencyjne (long ile) {
            if (ile<2) {
                return 1;
            }
            return ile*rekurencyjne(ile-1);
        }
        
        public long iteracyjne (long ile) {
            long wynik=1;
            
            if (ile==0) {
                return 0;
            } else {
                while (ile>0) {
                    wynik *= ile;
                    ile--;
                } 
            return wynik;
            }
        }
        
        public void run() {
            long wynik=0;
            
            if (name=="rekurencyjnie") {
                
                start = System.nanoTime();
                wynik = rekurencyjne(ile);
                stop = System.nanoTime();
                
                System.out.println("Silnia rekurencyjnie:");               
                
            }
            
            if (name=="iteracyjnie") {
                start = System.nanoTime();
                wynik = iteracyjne(ile);
                stop = System.nanoTime();
                
                System.out.println("Silnia iteracyjnie:");
                
            }
            
            System.out.println("Czas: " + (stop - start));
            System.out.println("Wynik: " + wynik + "\n");
            
            
            
        }
    }
