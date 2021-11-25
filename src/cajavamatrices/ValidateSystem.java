/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajavamatrices;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ValidateSystem {
    Scanner myKb = new Scanner(System.in);
    UsersList service = new UsersList();
    
    Admin admin = new Admin();
    
    
    public void logInMenu(){
        
        String ans;
        
        System.out.println("Hello, Please type 'login' if you would like to log in or type 'signup' if you would like to create an account with us.");
        
        ans = myKb.nextLine();
        
        while(ans.equals("login") == false ||  ans.equals("signup")){
            
            if(ans.equals("login")){
                
            }
            
            else if(ans.equals("signup")){
                
            }
        }
    }
    
    
    public void loginMenu(){
        
        System.out.println("Please enter your username");
        String username = myKb.nextLine();
        
        
        
    }
    
    public void signupMenu(){
        
        
    }
    
    
    
}
