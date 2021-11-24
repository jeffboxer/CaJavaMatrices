/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajavamatrices;

/**
 *
 * @author Jefferson
 */
public class Matrix3x3 implements Matrix3x3Interface{
    
    Menu2 m3 = new Menu2();
    
    private int[] coFactors = {0,0,0,0,0,0,0,0,0};
    private String[] coefS= {"","","","","","","","",""};
    private String[] var ={"x","y","z"} ;
    private int det ;
    private float det1 ;
    private float x;
    private float y;
    private float z;
    
   

    public Matrix3x3() {

        m3.Menu2();
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    
    
    

    public Menu2 getM3() {
        return m3;
    }

    public void setM3(Menu2 m3) {
        this.m3 = m3;
    }

    public int[] getCoFactors() {
        return coFactors;
    }

    public void setCoFactors(int[] coFactors) {
        this.coFactors = coFactors;
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

    public int getDet() {
        return det;
    }

    public void setDet(int det) {
        this.det = det;
    }

    public float getDet1() {
        return det1;
    }

    public void setDet1(float det1) {
        this.det1 = det1;
    }
    
    

    

    @Override
    public void readLEq() {
      
        
       
        System.out.println("============ Equations with three variables. ===================");

        //Read Equation 1
        String eq1 = "";
        if (m3.getEqS()[0] < 0) {
            eq1 = eq1 + String.valueOf(m3.getEqS()[0]) + this.getVar()[0] + " ";
            this.coefS[0] = String.valueOf(m3.getEqS()[0]);
        } else {
            eq1 = "+" + eq1 + String.valueOf(m3.getEqS()[0] + this.getVar()[0]) + " ";
            this.coefS[0] = "+" + String.valueOf(m3.getEqS()[0]);
        }

        if (m3.getEqS()[1] < 0) {
            eq1 = eq1 + String.valueOf(m3.getEqS()[1]) + this.getVar()[1] + " ";
            this.coefS[1] = String.valueOf(m3.getEqS()[1]);
        } else {
            eq1 = " " + eq1 + "+" + String.valueOf(m3.getEqS()[1] + this.getVar()[1]) + " ";
            this.coefS[1] = "+" + String.valueOf(m3.getEqS()[1]);
        }

        if (m3.getEqS()[2] < 0) {
            eq1 = eq1 + String.valueOf(m3.getEqS()[2]) + this.getVar()[2] + " ";
            this.coefS[2] = String.valueOf(m3.getEqS()[2]);
        } else {
            eq1 = " " + eq1 + "+" + String.valueOf(m3.getEqS()[2] + this.getVar()[2]) + " ";
            this.coefS[2] = "+" + String.valueOf(m3.getEqS()[2]);
        }

        System.out.println(eq1 + " = " + m3.geteTot()[0]);

        //Read Equation 2
        String eq2 = "";

        if (m3.getEqS()[3] < 0) {
            eq2 = eq2 + String.valueOf(m3.getEqS()[3]) + this.getVar()[0] + " ";
            this.coefS[3] = String.valueOf(m3.getEqS()[3]);
        } else {
            eq2 = "+" + eq2 + String.valueOf(m3.getEqS()[3] + this.getVar()[0]) + " ";
            this.coefS[3] = "+" + String.valueOf(m3.getEqS()[3]);
        }

        if (m3.getEqS()[4] < 0) {
            eq2 = eq2 + String.valueOf(m3.getEqS()[4]) + this.getVar()[1] + " ";
            this.coefS[4] = String.valueOf(m3.getEqS()[4]);
        } else {
            eq2 = " " + eq2 + "+" + String.valueOf(m3.getEqS()[4] + this.getVar()[1]) + " ";
            this.coefS[4] = "+" + String.valueOf(m3.getEqS()[4]);
        }

        if (m3.getEqS()[5] < 0) {
            eq2 = eq2 + String.valueOf(m3.getEqS()[5]) + this.getVar()[2] + " ";
            this.coefS[5] = String.valueOf(m3.getEqS()[5]);
        } else {
            eq2 = " " + eq2 + "+" + String.valueOf(m3.getEqS()[5] + this.getVar()[2]) + " ";
            this.coefS[5] = "+" + String.valueOf(m3.getEqS()[5]);
        }

        System.out.println(eq2 + " = " + m3.geteTot()[1]);

        //Read Equation 3
        String eq3 = "";

        if (m3.getEqS()[6] < 0) {
            eq3 = eq3 + String.valueOf(m3.getEqS()[6]) + this.getVar()[0] + " ";
            this.coefS[6] = String.valueOf(m3.getEqS()[6]);
        } else {
            eq3 = "+" + eq3 + String.valueOf(m3.getEqS()[6] + this.getVar()[0]) + " ";
            this.coefS[6] = "+" + String.valueOf(m3.getEqS()[6]);
        }

        if (m3.getEqS()[7] < 0) {
            eq3 = eq3 + String.valueOf(m3.getEqS()[7]) + this.getVar()[1] + " ";
            this.coefS[7] = String.valueOf(m3.getEqS()[7]);
        } else {
            eq3 = " " + eq3 + "+" + String.valueOf(m3.getEqS()[7] + this.getVar()[1]) + " ";
            this.coefS[7] = "+" + String.valueOf(m3.getEqS()[7]);
        }

        if (m3.getEqS()[8] < 0) {
            eq3 = eq3 + String.valueOf(m3.getEqS()[8]) + this.getVar()[2] + " ";
            this.coefS[8] = String.valueOf(m3.getEqS()[8]);
        } else {
            eq3 = " " + eq3 + "+" + String.valueOf(m3.getEqS()[8] + this.getVar()[2]) + " ";
            this.coefS[8] = "+" + String.valueOf(m3.getEqS()[8]);

            System.out.println(eq3 + " = " + m3.geteTot()[2]);

            System.out.println("===============================================================");
        }

    }

    @Override
    public void find3x3Determinant() {

      
        System.out.println("Determinant Formula");
        System.out.println("a.e.i + b.f.g + c.d.h -(c.e.g + a.f.h + b.d.i )");
        System.out.println("================================================");
        System.out.println("Determinant A");
        System.out.println("det|A|=(" + m3.getEqS()[0] + "*" + m3.getEqS()[4] + "*" + m3.getEqS()[8] + "+"
                + m3.getEqS()[1] + "*" + m3.getEqS()[5] + "*" + m3.getEqS()[6] + "+"
                + m3.getEqS()[2] + "*" + m3.getEqS()[3] + "*" + m3.getEqS()[7] + ")-("
                + m3.getEqS()[2] + "*" + m3.getEqS()[4] + "*" + m3.getEqS()[6] + "+"
                + m3.getEqS()[0] + "*" + m3.getEqS()[5] + "*" + m3.getEqS()[7] + "+"
                + m3.getEqS()[1] + "*" + m3.getEqS()[3] + "*" + m3.getEqS()[8] + ")");

        System.out.println("det|A|=(" + m3.getEqS()[0] * m3.getEqS()[4] * m3.getEqS()[8] + "+"
                + m3.getEqS()[1] * m3.getEqS()[5] * m3.getEqS()[6] + "+"
                + m3.getEqS()[2] * m3.getEqS()[3] * m3.getEqS()[7] + ")-"
                + "(" + m3.getEqS()[2] * m3.getEqS()[4] * m3.getEqS()[6] + "+"
                + m3.getEqS()[0] * m3.getEqS()[5] * m3.getEqS()[7] + "+"
                + m3.getEqS()[1] * m3.getEqS()[3] * m3.getEqS()[8] + ")");
        
        System.out.print("det|A|=" + ((m3.getEqS()[0] * m3.getEqS()[4] * m3.getEqS()[8]) + (m3.getEqS()[1] * m3.getEqS()[5] * m3.getEqS()[6]) + (m3.getEqS()[2] * m3.getEqS()[3] * m3.getEqS()[7])) + "-(");
        System.out.println(((m3.getEqS()[2] * m3.getEqS()[4] * m3.getEqS()[6]) + (m3.getEqS()[0] * m3.getEqS()[5] * m3.getEqS()[7]) + (m3.getEqS()[1] * m3.getEqS()[3] * m3.getEqS()[8])) + ")");
        System.out.println("det|A|=" + (((m3.getEqS()[0] * m3.getEqS()[4] * m3.getEqS()[8]) + (m3.getEqS()[1] * m3.getEqS()[5] * m3.getEqS()[6]) + (m3.getEqS()[2] * m3.getEqS()[3] * m3.getEqS()[7])) - ((m3.getEqS()[2] * m3.getEqS()[4] * m3.getEqS()[6]) + (m3.getEqS()[0] * m3.getEqS()[5] * m3.getEqS()[7]) + (m3.getEqS()[1] * m3.getEqS()[3] * m3.getEqS()[8]))));
        this.setDet((((m3.getEqS()[0] * m3.getEqS()[4] * m3.getEqS()[8]) + (m3.getEqS()[1] * m3.getEqS()[5] * m3.getEqS()[6]) + (m3.getEqS()[2] * m3.getEqS()[3] * m3.getEqS()[7])) - ((m3.getEqS()[2] * m3.getEqS()[4] * m3.getEqS()[6]) + (m3.getEqS()[0] * m3.getEqS()[5] * m3.getEqS()[7]) + (m3.getEqS()[1] * m3.getEqS()[3] * m3.getEqS()[8]))));
        System.out.println("=================================================");
   
    
    }

    @Override
    public void findA() {
        
        System.out.println("Matrix A  ");
        System.out.println("| "+this.coefS[0]+" "+this.coefS[1]+" "+this.coefS[2]+" |");
        System.out.println("| "+this.coefS[3]+" "+this.coefS[4]+" "+this.coefS[5]+" |");
        System.out.println("| "+this.coefS[6]+" "+this.coefS[7]+" "+this.coefS[8]+" |");

    }

    @Override
    public void findX() {
        System.out.println("Matrix X  ");
        System.out.println("| "+this.getVar()[0]+" |");
        System.out.println("| "+this.getVar()[1]+" |");
        System.out.println("| "+this.getVar()[2]+" |");
        
    }

    @Override
    public void findB() {
        System.out.println("Matrix B  ");
        System.out.println("| "+m3.geteTot()[0]+" |");
        System.out.println("| "+m3.geteTot()[1]+" |");
        System.out.println("| "+m3.geteTot()[2]+" |");
    }

    @Override
    public void coFactors() {
        System.out.println("======================== CoFactors of A ======================================");
        System.out.println("Representation:");
        System.out.print(" + | "+"e f"+" |");
        System.out.print(" - | "+"d f"+" |");
        System.out.print(" + | "+"d e"+" |   = ");
        
        System.out.print(" + | "+this.coefS[4]+ " "+this.coefS[5]+" |");
        System.out.print(" - | "+this.coefS[3]+ " "+this.coefS[5]+" |");
        System.out.println(" + | "+this.coefS[3]+ " "+this.coefS[4]+" |   ");
        
        
        System.out.print("   | "+"h i"+" |");
        System.out.print("   | "+"g i"+" |");
        System.out.print("   | "+"g h"+" |");
        
        System.out.print("        | "+this.coefS[7]+ " "+this.coefS[8]+" |");
        System.out.print("   | "+this.coefS[6]+ " "+this.coefS[8]+" |");
        System.out.println("   | "+this.coefS[6]+ " "+this.coefS[7]+" |   ");  
        
        System.out.println("");
        
        System.out.print(" - | "+"b c"+" |");
        System.out.print(" + | "+"a c"+" |");
        System.out.print(" - | "+"a b"+" |   =" );
        
        System.out.print("  - | "+this.coefS[1]+ " "+this.coefS[2]+" |");
        System.out.print(" + | "+this.coefS[0]+ " "+this.coefS[2]+" |");
        System.out.println(" - | "+this.coefS[0]+ " "+this.coefS[1]+" |   "); 
        
        System.out.print("   | "+"h i"+" |");
        System.out.print("   | "+"g i"+" |");
        System.out.print("   | "+"g h"+" |");
        
        System.out.print("        | "+this.coefS[7]+ " "+this.coefS[8]+" |");
        System.out.print("   | "+this.coefS[6]+ " "+this.coefS[8]+" |");
        System.out.println("   | "+this.coefS[6]+ " "+this.coefS[7]+" |   "); 
        
        System.out.println("");
        
        System.out.print(" + | "+"b c"+" |");
        System.out.print(" - | "+"a c"+" |");
        System.out.print(" + | "+"a b"+" |   =" );
        
        System.out.print("  + | "+this.coefS[1]+ " "+this.coefS[2]+" |");
        System.out.print(" - | "+this.coefS[0]+ " "+this.coefS[2]+" |");
        System.out.println(" + | "+this.coefS[0]+ " "+this.coefS[1]+" |   "); 
        
        System.out.print("   | "+"e f"+" |");
        System.out.print("   | "+"d f"+" |");
        System.out.print("   | "+"d e"+" |");
        
        System.out.print("        | "+this.coefS[4]+ " "+this.coefS[7]+" |");
        System.out.print("   | "+this.coefS[3]+ " "+this.coefS[5]+" |");
        System.out.println("   | "+this.coefS[3]+ " "+this.coefS[4]+" |   ");
        
        System.out.println(" -------------------------------------------------------------------------------------------------------------------------------------------------- ");
        
        System.out.print(" + | "+this.coefS[4]+" * "+this.coefS[8]+"- ("+this.coefS[5]+" * "+this.coefS[7]+ " ) | " );
        System.out.print(" - | "+this.coefS[3]+" * "+this.coefS[8]+"- ("+this.coefS[5]+" * " +this.coefS[6]+ " ) |" );
        System.out.print(" + | "+this.coefS[3]+" * "+this.coefS[7]+"- ("+this.coefS[4]+" * " +this.coefS[6]+ " ) | = " );
        
        System.out.print(" + | "+(m3.getEqS()[4]*m3.getEqS()[8])+" - ("+(m3.getEqS()[5]*m3.getEqS()[7])+ " ) | " );
        System.out.print(" - | "+(m3.getEqS()[3]*m3.getEqS()[8])+" - ("+(m3.getEqS()[5]*m3.getEqS()[6])+ " ) | " );
        System.out.print(" + | "+(m3.getEqS()[3]*m3.getEqS()[7])+" - ("+(m3.getEqS()[4]*m3.getEqS()[6])+ " ) | " );
        System.out.println("");
        
        System.out.print(" - | "+this.coefS[1]+" * "+this.coefS[8]+"- ("+this.coefS[2]+" * "+this.coefS[7]+ " ) |" );
        System.out.print("  + | "+this.coefS[0]+" * "+this.coefS[8]+"- ("+this.coefS[2]+" * " +this.coefS[6]+ " ) |" );
        System.out.print(" - | "+this.coefS[0]+" * "+this.coefS[7]+"- ("+this.coefS[1]+" * " +this.coefS[6]+ " ) |" );
        
        System.out.print("    - | "+(m3.getEqS()[1]*m3.getEqS()[8])+" - ("+(m3.getEqS()[2]*m3.getEqS()[7])+ " ) | " );
        System.out.print(" + | "+(m3.getEqS()[0]*m3.getEqS()[8])+" - ("+(m3.getEqS()[2]*m3.getEqS()[6])+ " ) | " );
        System.out.println(" - | "+(m3.getEqS()[0]*m3.getEqS()[7])+" - ("+(m3.getEqS()[1]*m3.getEqS()[6])+ " ) | " );
        
        System.out.print(" + | "+this.coefS[1]+" * "+this.coefS[5]+"- ("+this.coefS[2]+" * "+this.coefS[4]+ " ) | " );
        System.out.print(" - | "+this.coefS[0]+" * "+this.coefS[5]+"- ("+this.coefS[2]+" * " +this.coefS[3]+ " ) |" );
        System.out.print(" + | "+this.coefS[0]+" * "+this.coefS[4]+"- ("+this.coefS[1]+" * " +this.coefS[3]+ " ) |   " );
        
        System.out.print(" + | "+(m3.getEqS()[1]*m3.getEqS()[5])+" - ("+(m3.getEqS()[2]*m3.getEqS()[4])+ " ) | " );
        System.out.print(" - | "+(m3.getEqS()[0]*m3.getEqS()[5])+" - ("+(m3.getEqS()[2]*m3.getEqS()[3])+ " ) | " );
        System.out.println(" + | "+(m3.getEqS()[0]*m3.getEqS()[4])+" - ("+(m3.getEqS()[1]*m3.getEqS()[3])+ " ) | " );
        
        System.out.println(" -------------------------------------------------------------------------------------------------------------------------------------------------- ");
        
//COFACTORS ROW 1
        System.out.print(" | +( "+((m3.getEqS()[4]*m3.getEqS()[8])-(m3.getEqS()[5]*m3.getEqS()[7])) +" )");
        System.out.print(" -( "+((m3.getEqS()[3]*m3.getEqS()[8])-(m3.getEqS()[5]*m3.getEqS()[6])) +" )");
        System.out.print(" +( "+((m3.getEqS()[3]*m3.getEqS()[7])-(m3.getEqS()[4]*m3.getEqS()[6])) +" ) |");
        
        
        
        this.coFactors[0] = ((m3.getEqS()[4]*m3.getEqS()[8])-(m3.getEqS()[5]*m3.getEqS()[7]));
        this.coFactors[1] = ((m3.getEqS()[3]*m3.getEqS()[8])-(m3.getEqS()[5]*m3.getEqS()[6]))*-1;
        this.coFactors[2] = ((m3.getEqS()[3]*m3.getEqS()[7])-(m3.getEqS()[4]*m3.getEqS()[6]));
        
        System.out.print("       | "+this.getCoFactors()[0]);
        System.out.print("  "+this.getCoFactors()[1]);
        System.out.print("  "+this.getCoFactors()[2]+ " |");
        
        
        
        System.out.println("");  
        
        //COFACTORS ROW 2
        
        System.out.print(" | -( "+((m3.getEqS()[1]*m3.getEqS()[8])-(m3.getEqS()[2]*m3.getEqS()[7])) +" )");
        System.out.print(" +( "+((m3.getEqS()[0]*m3.getEqS()[8])-(m3.getEqS()[2]*m3.getEqS()[6])) +" )");
        System.out.print(" -( "+((m3.getEqS()[0]*m3.getEqS()[7])-(m3.getEqS()[1]*m3.getEqS()[6])) +" ) |   =  ");
        
        this.coFactors[3] = (((m3.getEqS()[1]*m3.getEqS()[8])-(m3.getEqS()[2]*m3.getEqS()[7]))*-1);
        this.coFactors[4] = (((m3.getEqS()[0]*m3.getEqS()[8])-(m3.getEqS()[2]*m3.getEqS()[6])));
        this.coFactors[5] = (((m3.getEqS()[0]*m3.getEqS()[7])-(m3.getEqS()[1]*m3.getEqS()[6]))*-1);
        
        System.out.print("  | "+this.getCoFactors()[3]);
        System.out.print("  "+this.getCoFactors()[4]);
        System.out.println("  "+this.getCoFactors()[5]+ "   |");
        
        
        
        
        // COFACTORS ROW 3
        System.out.print(" | +( "+((m3.getEqS()[1]*m3.getEqS()[5])-(m3.getEqS()[2]*m3.getEqS()[4])) +" )");
        System.out.print(" -( "+((m3.getEqS()[0]*m3.getEqS()[5])-(m3.getEqS()[2]*m3.getEqS()[3])) +" )");
        System.out.print(" +( "+((m3.getEqS()[0]*m3.getEqS()[4])-(m3.getEqS()[1]*m3.getEqS()[3])) +" ) |");
        
        this.coFactors[6] = (((m3.getEqS()[1]*m3.getEqS()[5])-(m3.getEqS()[2]*m3.getEqS()[4])));
        this.coFactors[7] = (((m3.getEqS()[0]*m3.getEqS()[5])-(m3.getEqS()[2]*m3.getEqS()[3]))*-1);
        this.coFactors[8] = (((m3.getEqS()[0]*m3.getEqS()[4])-(m3.getEqS()[1]*m3.getEqS()[3])));
        
        System.out.print("          | "+this.getCoFactors()[6]);
        System.out.print("  "+this.getCoFactors()[7]);
        System.out.println("  "+this.getCoFactors()[8]+ "    |");
        
  
        
    }

    @Override
    public void transposeA() {
        System.out.println("\n=================== Tranposing CoFactors of A =============================\n");
        
        System.out.print("                | "+ this.getCoFactors()[0]+" "+this.getCoFactors()[1]+" "+this.getCoFactors()[2]+"   |");
        System.out.println("                                | "+ this.getCoFactors()[0]+" "+this.getCoFactors()[3]+" "+this.getCoFactors()[6]+"   |");
        System.out.print("CoFactors(A) = ");
        System.out.print(" | "+ this.getCoFactors()[3]+" "+this.getCoFactors()[4]+" "+this.getCoFactors()[5]+"   | = ");
        System.out.print("    Transpose CoFactors(A) = ");
        System.out.println("  | "+ this.getCoFactors()[1]+" "+this.getCoFactors()[4]+" "+this.getCoFactors()[7]+"   |");
        System.out.print("                | "+ this.getCoFactors()[6]+" "+this.getCoFactors()[7]+" "+this.getCoFactors()[8]+"   |");
        System.out.println("                                   | "+ this.getCoFactors()[2]+" "+this.getCoFactors()[5]+" "+this.getCoFactors()[8]+"   |");
        
       
    }

    @Override
    public void readFinalResult() {
        System.out.println("");
        System.out.println("===================================== Final Result ======================================================");
        System.out.println("");
        System.out.println("Formula : 1/det|A| *( Transpose Cofactor(A)  * B)\n");
        System.out.print("        |"+this.getCoFactors()[0]+" "+this.getCoFactors()[3]+" "+this.getCoFactors()[6]+" |");
                System.out.println("    | "+m3.geteTot()[0]+ " |");
        System.out.print("1/"+this.getDet()+" * ");
        System.out.print(" |"+this.getCoFactors()[1]+" "+this.getCoFactors()[4]+" "+this.getCoFactors()[7]+" |  *");
        System.out.println("  | "+m3.geteTot()[1]+ " |");

        System.out.print("        |"+this.getCoFactors()[2]+" "+this.getCoFactors()[5]+" "+this.getCoFactors()[8]+" |");
        System.out.println("     | "+m3.geteTot()[2]+ " |\n");
        
        
        System.out.print("1/"+this.getDet()+" * ");
        System.out.println("|"+(this.getCoFactors()[0]*m3.geteTot()[0])+" + ("+(this.getCoFactors()[3]*m3.geteTot()[1])+") + ("+(this.getCoFactors()[6]*m3.geteTot()[2])+") |");
        System.out.println("       |"+(this.getCoFactors()[1]*m3.geteTot()[0])+" + ("+(this.getCoFactors()[4]*m3.geteTot()[1])+") + ("+(this.getCoFactors()[7]*m3.geteTot()[2])+") |");
        System.out.println("       |"+(this.getCoFactors()[2]*m3.geteTot()[0])+" + ("+(this.getCoFactors()[5]*m3.geteTot()[1])+") + ("+(this.getCoFactors()[8]*m3.geteTot()[2])+") |");
        
        
        System.out.print("\n1/"+this.getDet()+" * ");
        this.setX((this.getCoFactors()[0]*m3.geteTot()[0])+(this.getCoFactors()[3]*m3.geteTot()[1])+(this.getCoFactors()[6]*m3.geteTot()[2]));
        this.setY(((this.getCoFactors()[1]*m3.geteTot()[0])+(this.getCoFactors()[4]*m3.geteTot()[1])+(this.getCoFactors()[7]*m3.geteTot()[2])));
        this.setZ(((this.getCoFactors()[2]*m3.geteTot()[0])+(this.getCoFactors()[5]*m3.geteTot()[1])+(this.getCoFactors()[8]*m3.geteTot()[2])));
        
        this.setDet1(((1f)/(this.getDet())));
        System.out.print("|"+this.getX()+" |");
        System.out.println("        X = | "+((this.getDet1())*(this.getX()))+"   |");
        System.out.print("       |"+(this.getY())+" |   = ");
        System.out.println("  Y = | "+((this.getDet1())*(this.getY()))+"   |");
        System.out.print("       |"+this.getZ()+" |");
        System.out.println("        Z = | "+((this.getDet1())*(this.getZ()))+"   |");
    }

}
