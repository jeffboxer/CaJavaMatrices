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
    private String[] coefS= {"","","",""};
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

    public String[] getCoefS() {
        return coefS;
    }

    public void setCoefS(String[] coefS) {
        this.coefS = coefS;
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
            this.coefS[0]=String.valueOf(this.coef[0]);
        } else {
           eq1="+"+ eq1+String.valueOf(this.coef[0]+this.getVar()[0])+" ";
           this.coefS[0]="+"+String.valueOf(this.coef[0]);
        }
        
        if (this.getCoef()[1]<0) {
            eq1 =" "+ eq1+String.valueOf(this.coef[1])+this.getVar()[1];
            this.coefS[1]=String.valueOf(this.coef[1]);
        } else {
           eq1 = " "+ eq1+"+"+String.valueOf(this.coef[1])+this.getVar()[1];
           this.coefS[1]=String.valueOf(this.coef[1]);
        }
        
        System.out.println(eq1+" = "+this.tot[0]);
        
        if (this.getCoef()[2]<0) {
            eq2 = eq2+" "+String.valueOf(this.coef[2])+this.getVar()[0];
            this.coefS[2]=String.valueOf(this.coef[2]);
        } else {
           eq2 = eq2+" "+"+"+String.valueOf(this.coef[2])+this.getVar()[0];
           this.coefS[2]=String.valueOf(this.coef[2]);
        }
        
        if (this.getCoef()[3]<0) {
            eq2 =eq2+String.valueOf(this.coef[3])+this.getVar()[1];
            this.coefS[3]=String.valueOf(this.coef[3]);
        } else {
           eq2 =eq2+" "+"+"+String.valueOf(this.coef[3])+this.getVar()[1];
           this.coefS[3]=String.valueOf(this.coef[3]);
        }
        
        System.out.println(eq2+" = "+this.tot[1]);
        
        System.out.println("===============================================================");
    }

    @Override
    public void find2x2Determinant() {
        

        System.out.println("================================================");
        System.out.println("Determinant Formula");
        System.out.println("a.d - c.b");
        System.out.println("================================================");
        System.out.println("Determinant A");
        System.out.println(this.getCoef()[0]+" * "+this.getCoef()[3] + " -( "+this.getCoef()[1]+" * "+this.getCoef()[2]+")");
        System.out.println(this.getCoef()[0]*this.getCoef()[3]+"- ("+this.getCoef()[1]*this.getCoef()[2]+")");
        System.out.print("det|A|= ");
        System.out.println(this.getCoef()[0]*this.getCoef()[3]+(this.getCoef()[1]*this.getCoef()[2])*-1);
        this.setDet(this.getCoef()[0]*this.getCoef()[3]+(this.getCoef()[1]*this.getCoef()[2])*-1);
        System.out.println("=================================================");
       
    }

    @Override
    public void findA() {
        System.out.println("Matrix A  ");
        System.out.println("| "+this.getCoef()[0]+" "+this.getCoef()[1]+" |");
        System.out.println("| "+this.getCoef()[2]+" "+this.getCoef()[3]+" |");
        
    }

    @Override
    public void findInverseA() {
        System.out.println("Inverse of A");
        System.out.print("|  d -b |  ");
        
        if (this.getCoef()[3]<1) {
            this.coefS[3] = String.valueOf(getCoef()[3]);
            
        } else {
            this.coefS[3] = "+"+String.valueOf(getCoef()[3]);
        }
        
        if ((this.getCoef()[1]*-1)<0) {
            this.coefS[1] = String.valueOf(this.getCoef()[1]*-1);
            
        } else {
            this.coefS[1] = "+"+String.valueOf(this.getCoef()[1]*-1);
        }
        
        System.out.println(" | "+this.getCoefS()[3]+" "+this.getCoefS()[1]+" |");
        
        System.out.print("| -c  a | = ");
        
        if (this.getCoef()[0]<1) {
            this.coefS[0] = String.valueOf(getCoef()[0]);
            
        } else {
            this.coefS[0] = "+"+String.valueOf(getCoef()[0]);
        }
        
        if ((this.getCoef()[2]*-1)<0) {
            this.coefS[2] = String.valueOf(this.getCoef()[2]*-1);
            
        } else {
            this.coefS[2] = "+"+String.valueOf(this.getCoef()[2]*-1);
        }
        
        System.out.println("| "+this.getCoefS()[2]+" "+this.getCoefS()[0]+" |");
        System.out.println("");
    }

    @Override
    public void findX() {
        System.out.println("Matrix X  ");
        System.out.println("| "+this.getVar()[0]+" |");
        System.out.println("| "+this.getVar()[1]+" |");
    }

    @Override
    public void findB() {
        System.out.println("Matrix B  ");
        System.out.println("| "+this.getTot()[0]+" |");
        System.out.println("| "+this.getTot()[1]+" |");
    }

    @Override
    public void readFinalResult() {
        System.out.println("=============== Final Result formula. ======================");
        System.out.println("X = ( A^-1 . B ). 1/det|A| ");
        System.out.println("");
        System.out.print("X = ");
        System.out.print(" | "+this.getCoefS()[3]+" "+this.getCoefS()[1]+" |");
        System.out.println("   | "+this.getTot()[0]+" |");
        System.out.print("     ");
        System.out.print("| "+this.getCoefS()[2]+" "+this.getCoefS()[0]+" |");
        System.out.print(" . ");
        System.out.print("| "+this.getTot()[1]+" |");
        
        System.out.println("");
    }

    
   
    
    
    
    
    
    
    
    
    }
    
    
