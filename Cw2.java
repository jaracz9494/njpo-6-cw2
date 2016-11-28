/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw2;

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
        watek[] wat = new watek[ILE];
        
        Scanner sc = new Scanner (System.in);
        long podaj;
        
        
        System.out.println("LICZENIE SILNI");
        System.out.println("podaj cyfre:");
        podaj = Integer.parseInt(sc.nextLine());
        System.out.println();
        
        wat[0] = new watek("iteracyjnie", podaj);
        wat[0].run();
        
        wat[1] = new watek("rekurencyjnie", podaj);
        wat[1].run();        
        
    }
    
}
