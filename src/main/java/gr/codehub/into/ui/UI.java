/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codehub.into.ui;

import gr.codehub.into.model.Bmi;
import gr.codehub.into.model.Customer;
import java.util.Scanner;

/**
 *
 * @author iracl
 */
public class UI {
    public void calculateBmi(){
        double weight = 95;
       double height= 1.78;
//       Scanner scanner =  new Scanner(System.in);
//       System.out.println("Please give your weight in kg ");
//       weight = scanner.nextDouble();
//       System.out.println("Please give your height in m");
//       height = scanner.nextDouble();
       Bmi bmi = new Bmi(weight, height);
       System.out.println("Your bmi is "+ bmi.calculateBmi());
       System.out.println("BMI Ranges"); 
       System.out.println( bmi.getDescription()); 
    }
    
    
    public void managingCustomer(){
                  
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
