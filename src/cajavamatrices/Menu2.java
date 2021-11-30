/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajavamatrices;

import java.util.Scanner;

/**
 *
 * @author Jefferson
 */
public class Menu2 {
    
    
    private Scanner r = new Scanner(System.in);
    private int eqS[]={0,0,0,0,0,0,0,0,0};
    private int eTot[]={0,0,0};
    private String var,var1,var2,var3;

    public int[] getEqS() {
        return eqS;
    }

    public void setEqS(int[] eqS) {
        this.eqS = eqS;
    }

    public int[] geteTot() {
        return eTot;
    }

    public void seteTot(int[] eTot) {
        this.eTot = eTot;
    }

    public String getVar1() {
        return var1;
    }

    public String getVar2() {
        return var2;
    }

    public String getVar3() {
        return var3;
    }
    
    
    
    
    
    public void Menu2(){
    
        System.out.println("Please type your first equation ( example : -1x+3y-10z=15) : ");
         var1 ="1x+1y+1z=2";
         var1.toLowerCase();
        var = var1;
        var=var.replaceAll("x",",");
        var=var.replaceAll("y",",");
        var=var.replaceAll("z",",");
        var=var.replaceAll("=",",");
        


        String [] e = var.split(",");
        this.eqS[0]=Integer.parseInt(e[0]);
        this.eqS[1]=Integer.parseInt(e[1]);
        this.eqS[2]=Integer.parseInt(e[2]);
        this.eTot[0]=Integer.parseInt(e[4]);
        


        
       


        
        System.out.println("Please type your second equation ( example : -1x+3y-10z=15) : ");
        var2 ="2x+3y+5z=11";
        var2.toLowerCase();
        var = var2;
        var=var.replaceAll("x",",");
        var=var.replaceAll("y",",");
        var=var.replaceAll("z",",");
        var=var.replaceAll("=",",");

        String [] f = var.split(",");
        
        this.eqS[3]=Integer.parseInt(f[0]);
        this.eqS[4]=Integer.parseInt(f[1]);
        this.eqS[5]=Integer.parseInt(f[2]);
        this.eTot[1]=Integer.parseInt(f[4]);

        
        
         System.out.println("Please type your third equation ( example : -1x+3y-10z=15) : ");
        var3 = "1x-5y+6z=29";
        var3.toLowerCase();
        var = var3;
        var=var.replaceAll("x",",");
        var=var.replaceAll("y",",");
        var=var.replaceAll("z",",");
        var=var.replaceAll("=",",");

        String [] g = var.split(",");
        
        this.eqS[6]=Integer.parseInt(g[0]);
        this.eqS[7]=Integer.parseInt(g[1]);
        this.eqS[8]=Integer.parseInt(g[2]);
        this.eTot[2]=Integer.parseInt(g[4]);

     

    
    
    }
    
    
}

    
    
