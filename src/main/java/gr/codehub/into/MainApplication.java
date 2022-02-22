/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codehub.into;

import java.math.BigDecimal;
 
 
/**
 *
 * @author iracl
 */
public class MainApplication {
    public static void main(String[] args) {

        BigDecimal x = new BigDecimal("0.1");
        BigDecimal y = new BigDecimal("0.1");
        System.out.println( x.add(y) );    
        boolean equals =  x.add(y).equals(new BigDecimal("0.2"))  ;
        System.out.println(equals);
        BigDecimal z= x;
        System.out.println(x == z);
        System.out.println(x.equals(y));
        
        Integer n = 4;
        int n1 =4;
        
    }
}
