/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codehub.into;

import gr.codehub.into.model.Customer;
import java.util.Scanner;

/**
 *
 * @author iracl
 */
public class MainApplication {
    public static void main(String[] args) {
   //    UI ui = new UI();
   //    ui.calculateBmi();
       
       Customer customer  = new Customer();
       customer.setName("Marina");
       System.out.println("" + customer.getName());
       
       Customer otherCustomer = customer;
       System.out.println("" + otherCustomer.getName());
       otherCustomer.setName("Sophia");
       System.out.println("" + customer.getName());
       
       otherCustomer.calculate();
       System.out.println("" + customer.getName());
        System.out.println("" + otherCustomer.getName());
       
       int x= 7;
       int y = x;
       x = 3;
        System.out.println(y);
        
        
        String g1 = "hello";
        String g2 =g1;
        System.out.println(g1);
        g2 = "bye";
        System.out.println(g1);
        
    }
}
