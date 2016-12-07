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
        Scanner sc = new Scanner (System.in);
        
        watek[] wat = new watek[ILE];
        
        okienko o = new okienko();
        o.okienko();
           
        
        System.out.println("ROZPOCZĘTO LICZENIE SILNI");
        
        o.nasluch(wat);
        o.nasluch_run(wat, o);
        
        
        
        
    }
    
}
