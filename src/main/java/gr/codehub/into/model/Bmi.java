/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codehub.into.model;

/**
 *
 * @author iracl
 */
public class Bmi {
   
     private double weight ;
     private double height;
     private double bmi;
    
     private static final String SEVERELY_UNDERWEIGHT = "Severely Underweight";
     private static final String UNDERWEIGHT = "Underweight";
     private static final String NORMAL = "Normal";        
     private static final String OVERWEIGHT =  "Overweight";
     private static final String MODERATELY_OBESE =  "Moderately Obese";
     private static final String SEVERELY_OBESE = "Severely Obese";
     private static final String MORBIDLY_OBESE = "Morbidly Obese";   
      
     public Bmi(double weight, double height){
        this.weight = weight;
        this.height = height;
        bmi =  calculateBmi();
     }
     
     public double calculateBmi(){
        double bmi = weight / Math.pow(height, 2);
        return bmi;  
     }
 
     public String getDescription(){
        if (bmi < 16){ 
             return SEVERELY_UNDERWEIGHT;
        }
        else if (bmi < 18.4) {
            return UNDERWEIGHT;
        } 
        else if (bmi < 24.9) {
            return NORMAL;
        }
        else if (bmi < 29.9) {
            return OVERWEIGHT;
        }
        else if (bmi < 34.9) {
            return MODERATELY_OBESE;
        }
        else if (bmi < 39.9) {
            return SEVERELY_OBESE;
        }
        else {
            return MORBIDLY_OBESE;
        }
     }
    
}
