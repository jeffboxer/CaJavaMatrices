/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajavamatrices;

/**
 *
 * @author Jefferson
 */
public class Matrix2by2 implements Matrix2by2Interface {
   
    //Attributes
    private int[] coef ={+2,-3,+3,+8};
    private int[] tot = {+2,3};
    private String[] var ={"x","y"} ;
    private int det ;
    
    //Constructor

    public Matrix2by2() {
        
        
    }
    
    
    //Getters and Setters

    public int[] getCoef() {
        return coef;
    }

    public void setCoef(int[] coef) {
        this.coef = coef;
    }

    public String[] getVar() {
        return var;
    }

    public void setVar(String[] var) {
        this.var = var;
    }

    public int[] getTot() {
        return tot;
    }

    public void setTot(int[] tot) {
        this.tot = tot;
    }

    public int getDet() {
        return det;
    }

    public void setDet(int det) {
        this.det = det;
    }
    
    
    
    
    
    
    //Methods
    @Override
    public void readLEq() {
        
         String eq1 ="" ;
         String eq2 ="" ;
       
         System.out.println("============ Equations with two variables. ===================");
         
        if (this.getCoef()[0]<0) {
            eq1 =" "+ eq1+String.valueOf(this.coef[0])+this.getVar()[0]+" ";
        } else {
           eq1="+"+ eq1+String.valueOf(this.coef[0]+this.getVar()[0])+" "; 
        }
        
        if (this.getCoef()[1]<0) {
            eq1 =" "+ eq1+String.valueOf(this.coef[1])+this.getVar()[1];
        } else {
           eq1 = " "+ eq1+"+"+String.valueOf(this.coef[1])+this.getVar()[1]; 
        }
        
        System.out.println(eq1+" = "+this.tot[0]);
        
        if (this.getCoef()[2]<0) {
            eq2 = eq2+" "+String.valueOf(this.coef[2])+this.getVar()[0];
        } else {
           eq2 = eq2+" "+"+"+String.valueOf(this.coef[2])+this.getVar()[0]; 
        }
        
        if (this.getCoef()[3]<0) {
            eq2 =eq2+String.valueOf(this.coef[3])+this.getVar()[1];
        } else {
           eq2 =eq2+" "+"+"+String.valueOf(this.coef[3])+this.getVar()[1]; 
        }
        
        System.out.println(eq2+" = "+this.tot[1]);
        
        System.out.println("===============================================================");
    }

    @Override
    public void find2x2Determinant() {
        
        System.out.println("Matrix A  ");
        System.out.println("| "+this.getCoef()[0]+" "+this.getCoef()[1]+" |");
        System.out.println("| "+this.getCoef()[1]+" "+this.getCoef()[2]+" |");
        System.out.println("================================================");
        System.out.println("Determinant Formula");
        System.out.println("a.d - c.b");
        System.out.println("================================================");
        System.out.println("Determinant A");
        System.out.println(this.getCoef()[0]+" * "+this.getCoef()[3] + " -( "+this.getCoef()[1]+" * "+this.getCoef()[2]+")");
        System.out.println(this.getCoef()[0]*this.getCoef()[3]+"- ("+this.getCoef()[1]*this.getCoef()[2]+")");
        System.out.println(this.getCoef()[0]*this.getCoef()[3]+(this.getCoef()[1]*this.getCoef()[2])*-1);
        this.setDet(this.getCoef()[0]*this.getCoef()[3]+(this.getCoef()[1]*this.getCoef()[2])*-1);
       
    }

    @Override
    public void findA() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void findInverseA() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void findX() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void findB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void readFinalResult() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
   
    
    
    
    
    
    
    
    
    }
    
    
