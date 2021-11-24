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
public class Menu {
    
 
    private Scanner r = new Scanner(System.in);
    private int eqS[]={0,0,0,0};
    private int eTot[]={0,0};
    private String var;

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
    
    
    
    public void Menu(){
    
        System.out.println("Please type your first equation : ");
        //var =r.next();
        var = "2x+3y=4";
        //var =var+r.toLowerCase();
        
        var=var.replaceAll("x",",");
        var=var.replaceAll("y",",");
        var=var.replaceAll("=",",");

        String [] e = var.split(",");
        this.eqS[0]=Integer.parseInt(e[0]);
       
        this.eqS[1]=Integer.parseInt(e[1]);

        this.eTot[0]=Integer.parseInt(e[3]);


        
        System.out.println("Please type your second equation : ");
      //var =r.next();
        var = "3x+4y=5";
        //var =var+r.toLowerCase();
        
        var=var.replaceAll("x",",");
        var=var.replaceAll("y",",");
        var=var.replaceAll("=",",");

        String [] f = var.split(",");
        this.eqS[2]=Integer.parseInt(f[0]);

        this.eqS[3]=Integer.parseInt(f[1]);

        this.eTot[1]=Integer.parseInt(f[3]);



//        

    
    
    }
    
    
}
