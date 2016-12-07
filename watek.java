/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw2;

import java.math.BigInteger;


/**
 *
 * @author Dominik
 */

public class watek extends Thread {
    
        String name;
        long ile, start, stop;
        BigInteger wynik = new BigInteger ("0");
        okienko o = new okienko();
        
        watek(String name, long ile, okienko o) {
            this.name=name;
            this.ile=ile;
            this.o=o;
            
        }
        
        public BigInteger rekurencyjne (long ile) {
            boolean przerwanie=false;
            
            if (ile<2) {
                return BigInteger.valueOf(1);
            }
            
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Przerwano działanie watku: " + name);
                przerwanie = true;
            }
            
            if(przerwanie == true) {
                return BigInteger.valueOf(1);
            }
                    
            return BigInteger.valueOf(ile).multiply(rekurencyjne(ile-1));
            
        }
        
        public BigInteger iteracyjne (long ile) {
            BigInteger wyn = new BigInteger ("1");
            
            if (ile==0) {
                return wyn;
            } else {
                try {
                while (ile>0) {
                    
                    wyn = wyn.multiply(BigInteger.valueOf(ile));
                    ile--;
                    Thread.sleep(100);
                    
                } 
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("Przerwano działanie watku: " + name);
            }
            return wyn;
            }
        }
        
        public void run() {                  
            
            if (name=="rekurencyjnie") {
                
                start = System.nanoTime();
                wynik = rekurencyjne(ile);
                stop = System.nanoTime();
                
                //System.out.println("Silnia rekurencyjnie:"); 
                o.ustaw_reku(wynik.toString(), Long.toString(stop-start));
                
                
            }
            
            if (name=="iteracyjnie") {
                start = System.nanoTime();
                wynik = iteracyjne(ile);
                stop = System.nanoTime();
                
                //System.out.println("Silnia iteracyjnie:");
                o.ustaw_iter(wynik.toString(), Long.toString(stop-start));
                
            }
            
            
            
            //System.out.println("Czas: " + (stop - start));
            //System.out.println("Wynik: " + wynik + "\n");
            System.out.println("Wykonano dla: " + name);
                  
            
        }
        
        public BigInteger wyswietl_wyn() {
            return wynik;
        }
        
        public long wysw_czas() {
            return (stop - start);
        }
    }
