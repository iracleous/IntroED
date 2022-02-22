/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codehub.into;

import gr.codehub.into.model.Bmi;
import java.util.Scanner;

/**
 *
 * @author iracl
 */
public class UI {
    public void calculateBmi(){
        double weight;
       double height;
       Scanner scanner =  new Scanner(System.in);
       System.out.println("Please give your weight in kg ");
       weight = scanner.nextDouble();
       System.out.println("Please give your height in m");
       height = scanner.nextDouble();
       Bmi bmi = new Bmi(weight, height);
       System.out.println("Your bmi is "+ bmi.calculateBmi());
       System.out.println("BMI Ranges"); 
       System.out.println( bmi.getDescription()); 
    }
}
