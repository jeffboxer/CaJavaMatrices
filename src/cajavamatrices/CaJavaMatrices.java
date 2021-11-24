/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajavamatrices;

import java.util.Scanner;

/**
 *
 * @author Jefferson
 */
public class CaJavaMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner se = new Scanner(System.in);
        
   
        System.out.println("==================Solving Simultaneous Equations---------------------------------------------");
        System.out.println("Please choose how many Simultaneous equations you would like to work with:");
        System.out.println("");
        System.out.println("1) Type number 1 for 2 Simultaneous Equations.");
        System.out.println("2) Type number 2 for 3 Simultaneous Equations.");
        System.out.println("---------------------------------------------------------------------------------------------");
        
        int eType = se.nextInt();
        
        switch (eType) {
            case 1:
                
             Matrix2by2 m1 = new Matrix2by2();
             
              m1.readLEq();
              m1.findA();
              m1.findX();
              m1.findB();
              m1.find2x2Determinant();
              m1.findInverseA(); 
              m1.readFinalResult();
                
                break;
                
            case 2:
                Matrix3x3 m2 =new Matrix3x3();
                m2.readLEq();
                m2.find3x3Determinant();
                m2.findA();
                m2.findX();
                m2.findB();
                m2.coFactors();
                m2.transposeA();
                m2.readFinalResult();
 

                
                break;
            default:
              
        }

//        
        
        

        
        
    }
    
}
