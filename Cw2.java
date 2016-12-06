/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw2;

import java.math.BigInteger;
import java.util.Scanner;

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
        Scanner sc = new Scanner (System.in);
        long podaj;
        
        watek[] wat = new watek[ILE];
        
        okienko o = new okienko();
        o.okienko();
           
        
        System.out.println("LICZENIE SILNI");
        System.out.println("podaj cyfre:");
        podaj = Integer.parseInt(sc.nextLine());
        System.out.println();
        o.nasluch(wat);
        
        
        wat[0] = new watek("iteracyjnie", podaj, o);
        //wat[0].run(o);
        wat[0].start();
        
        wat[1] = new watek("rekurencyjnie", podaj, o);
        //wat[1].run(o); 
        wat[1].start();
        
        
    }
    
}
