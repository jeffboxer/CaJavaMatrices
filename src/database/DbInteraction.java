/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import cajavamatrices.Matrix2by2;
import cajavamatrices.Matrix3x3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import cajavamatrices.Menu2;


/**
 *
 * @author Jefferson
 */
public class DbInteraction {


  
    
    private String name, lastname, username, password,eq1,eq2,eq3;
    private int id, type, equations;
    private float det,x,y,z;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getEquations() {
        return equations;
    }

    public void setEquations(int equations) {
        this.equations = equations;
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

    public float getDet() {
        return det;
    }

    public void setDet(float det) {
        this.det = det;
    }

    public String getEq1() {
        return eq1;
    }

    public void setEq1(String eq1) {
        this.eq1 = eq1;
    }

    public String getEq2() {
        return eq2;
    }

    public void setEq2(String eq2) {
        this.eq2 = eq2;
    }

    public String getEq3() {
        return eq3;
    }

    public void setEq3(String eq3) {
        this.eq3 = eq3;
    }
    
    
    
    
    

    Scanner s = new Scanner(System.in);



    

    // Connection between java and MySQL
    public Connection getConnection() throws Exception {

        try {

            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/ca_database";
            String username = "root";
            String password = "root";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("-----------------------------------------------");
            System.out.println("Database Updated!");
            System.out.println("-----------------------------------------------");
            return conn;

        } catch (Exception e) {
            System.out.println(e);
        }

        return null;

    }

    public void signInOut() throws Exception {

        System.out.println("-----------------------------------------------");
        System.out.println("Please select one of the following options :");
        System.out.println("-----------------------------------------------");
        System.out.println("1) Sign-in if you are already a user.");
        System.out.println("2) Sign-up if you create a new user.");
        System.out.println("3) Exit.");

        final int sign = s.nextInt();

        switch (sign) {
            case 1:
                userValidator();
                break;

            case 2:
                userCreation();
                break;

            case 3:
                break;

            default:
                System.out.println("That is not a valid option");
                System.out.println("-----------------------------------------------");
                signInOut();
        }

    }

    public void userValidator() throws Exception {
        try {

            Connection con = getConnection();
            PreparedStatement select = con.prepareStatement("SELECT user_username,user_password,user_type FROM users");
            ResultSet result = select.executeQuery();
            System.out.println("-----------------------------------------------");
            System.out.println("Please type your username: ");
            System.out.println("-----------------------------------------------");
            this.setUsername(s.next().toLowerCase());
            System.out.println("-----------------------------------------------");
            System.out.println("Now, please type your password: ");
            System.out.println("-----------------------------------------------");
            this.setPassword(s.next());

            while (result.next()) {

                if (result.getString("user_username").toLowerCase().equals(this.getUsername()) && result.getString("user_password").equals(this.getPassword())) {

                    this.setType(result.getInt("user_type"));
                    System.out.println("----------------------------------------------------");
                    System.out.println("Signed-In as " + this.getUsername() + " sucessfully!");
                    System.out.println(this.getType());

                } else {

                    System.out.println("Either the username or password is incorrect.");
                    signInOut();
                }

            }

            switch (this.getType()) {
                case 1:

                    menuAdmin();

                    break;

                case 2:

                    menuUser();

                    break;
                default:

            }

            con.close();
            select.close();
            result.close();

        } catch (Exception e) {
            System.out.println(e);

        }

    }

    public void userCreation() throws Exception {
        try {

            System.out.println("User Registration:");
            System.out.println("Please type your name:");
            String name = s.next();
            System.out.println("Would you like to confirm the name " + name + "? Type 1 if you want to continue and 0 if you want to cancel:");
            int cancel = s.nextInt();

            switch (cancel) {
                case 0:
                    signInOut();
                    break;
                case 1:
                    this.setName(name);
                    break;
                default:
                    System.out.println("Not a valid option.");

            }

            System.out.println("Please type your last name:");
            String lastName = s.next();
            System.out.println("Would you like to confirm the last name " + lastName + "? Type 1 if you want to continue and 0 if you want to cancel:");
            cancel = s.nextInt();

            switch (cancel) {
                case 0:
                    signInOut();
                    break;
                case 1:
                    this.setLastname(lastName);
                    break;
                default:
                    System.out.println("Not a valid option.");

            }

            System.out.println("Please type your username (this username will be used as your log-in.):");
            String username = s.next();
            System.out.println("Would you like to confirm the username " + username + "? Type 1 if you want to continue and 0 if you want to cancel:");
            cancel = s.nextInt();

            switch (cancel) {
                case 0:
                    signInOut();
                    break;
                case 1:
                    this.setUsername(username);
                    break;
                default:
                    System.out.println("Not a valid option.");

            }

            System.out.println("Please type your new password :");
            String password = s.next();
            System.out.println("Would you like to confirm the password " + password + "? Type 1 if you want to continue and 0 if you want to cancel:");
            cancel = s.nextInt();

            switch (cancel) {
                case 0:
                    signInOut();
                    break;
                case 1:
                    this.setPassword(password);
                    this.setType(2);
                    insertIntoUser();
                    break;
                default:
                    System.out.println("Not a valid option.");

            }

        } catch (Exception e) {
            System.out.println(e);

        }

    }

    public void insertIntoUser() throws Exception {

        try {

            Connection con = getConnection();
            String query = "INSERT INTO users(user_name,user_last_name,user_username,user_password,user_type )" + "values (?,?,?,?,?)";
            PreparedStatement insert = con.prepareStatement(query);
            insert.setString(1, this.getName());
            insert.setString(2, this.getLastname());
            insert.setString(3, this.getUsername());
            insert.setString(4, this.getPassword());
            insert.setInt(5, this.getType());
            insert.executeUpdate();

            con.close();
            insert.close();

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Registration Completed;");
            signInOut();
        }
    }

    public void menuAdmin() throws Exception {

        System.out.println("-----------------------------------------------");
        System.out.println("Admin Menu");
        System.out.println("-----------------------------------------------");
        System.out.println("1) Modify own profile: ");
        System.out.println("2) Solve Equations: ");
        System.out.println("3) Access all users list: ");
        System.out.println("4) See equation`s log: ");
        System.out.println("5) Remove users : ");
        System.out.println("6) Exit: ");
        int option = s.nextInt();

        switch (option) {

            case 1:
                allUsers();
                break;

            case 2:
                solveEquations();
                break;

            case 3:

                allUsers();

                break;

            case 4:
                getLog();
                break;

            case 5:

                break;

            case 6:
                break;

            default:
                throw new AssertionError();
        }
    }

    public void menuUser() {}

    public void allUsers() throws Exception {

        try {

            Connection con = getConnection();
            PreparedStatement select = con.prepareStatement("SELECT user_id,user_name FROM users");
            ResultSet result = select.executeQuery();
            System.out.println("-----------------------------------------------");
            System.out.println("ID| Name:");
            System.out.println("-----------------------------------------------");
            while (result.next()) {

                System.out.println(result.getString("user_id") + " | " + result.getString("user_name"));

            }
            
            con.close();
            select.close();
            result.close();
            
            goBackAdmin();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
    
    public void goBackAdmin() throws Exception{
        
            System.out.println("-----------------------------------------------");
            System.out.println("What Would you like to do next?");
            System.out.println("-----------------------------------------------");
            System.out.println("Type 1 to go back to Admin`s Menu:");
            System.out.println("Type 2 to go back to Login Menu:");
            System.out.println("Type 3 to Exit:");
            
         
            int option = s.nextInt();
            
            switch (option) {
                case 1:
                    menuAdmin();
                    break;

                case 2:
                    signInOut();
                    break;

                case 3:

                    break;

                default:
                    System.out.println("Invalid Option! Please Try again");
                    goBackAdmin();
            }
    
    
    }
    
    public void goBackUser() throws Exception{
        System.out.println("-----------------------------------------------");
        System.out.println("What Would you like to do next?");
        System.out.println("-----------------------------------------------");
            System.out.println("Type 1 to go back to User`s Menu:");
            System.out.println("Type 2 to go back to Login Menu:");
            System.out.println("Type 3 to Exit:");
            
         
            int option = s.nextInt();
            
            switch (option) {
                case 1:
                    menuUser();
                    break;

                case 2:
                    signInOut();
                    break;

                case 3:

                    break;

                default:
                    System.out.println("Invalid Option! Please Try again");
                    goBackUser();
    
    }

}

    public void solveEquations() throws Exception{
        
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Solve Simultaneous Equations:");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("1) Please type 1 if you want to solve Simultaneous Equations with 2 equations:");
        System.out.println("2) Please type 2 if you want to solve Simultaneous Equations with 3 equations:");
        System.out.println("3) Please type 3 if you want to go back to Admin`s Menu:");
        System.out.println("4) Please type 4 if you want to go back to Login Menu:");
        System.out.println("5) Please type 5 to Exit the program:");
        
        int option = s.nextInt();
        
        switch (option) {
                case 1:
                Matrix2by2 m1 = new Matrix2by2();
             
              m1.readLEq();
              m1.findA();
              m1.findX();
              m1.findB();
              m1.find2x2Determinant();
              m1.findInverseA(); 
              m1.readFinalResult();
              m1.storeEquationsTyped();
                 this.setEq1(m1.getEq1());
                 this.setEq2(m1.getEq2());
                 this.setEq3("N/A");
                 this.setDet(m1.getDet());
                 this.setX(m1.getX_res());
                 this.setY(m1.getY_res());
                 eq2ToDb();
                 goBackAdmin();
              

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
                m2.storeEquationsTyped();
                
                 this.setEq1(m2.getEq1());
                 this.setEq2(m2.getEq2());
                 this.setEq3(m2.getEq3());
                 this.setDet(m2.getDet1());
                 this.setX(m2.getX_res());
                 this.setY(m2.getY_res());
                 this.setZ(m2.getZ_res());
                 
                 eq3ToDb();
                 goBackAdmin();
                 
                
                
                break;
                
                case 3:
                    goBackAdmin();
                break; 
                
                case 4:
                    signInOut();
                break;
                
                case 5:
                    
                break;
            default:
                System.out.println("Option is not valid.");
                solveEquations();
                
        }
    
    }    
    
    public void eq2ToDb()throws Exception{
    
        try{
            
            Connection con = getConnection();
            PreparedStatement insert = con.prepareStatement("INSERT INTO equations(username,equation1,equation2,equation3,eq_det,eq_x,eq_y)" + "values (?,?,?,?,?,?,?) ");
            insert.setString(1, this.getUsername());
            insert.setString(2, this.getEq1());
            insert.setString(3, this.getEq2());
            insert.setString(4, this.getEq3());
            insert.setFloat(5,this.getDet() );
            insert.setFloat(6,this.getX() );
            insert.setFloat(7,this.getY() );
            insert.executeUpdate();
            
        
        }catch(Exception e){
            
            System.out.println(e);}
    
    }
    
    public void eq3ToDb()throws Exception{
    
   try{
            
            Connection con = getConnection();
            PreparedStatement insert = con.prepareStatement("INSERT INTO equations(username,equation1,equation2,equation3,eq_det,eq_x,eq_y,eq_z)" + "values (?,?,?,?,?,?,?,?) ");
            insert.setString(1, this.getUsername());
            insert.setString(2, this.getEq1());
            insert.setString(3, this.getEq2());
            insert.setString(4, this.getEq3());
            insert.setFloat(5,this.getDet() );
            insert.setFloat(6,this.getX() );
            insert.setFloat(7,this.getY() );
            insert.setFloat(8,this.getZ() );
            insert.executeUpdate();
            
            con.close();
            insert.close();
            
        }catch(Exception e){
            
            System.out.println(e);}
    
    }
    
    public void getLog() throws Exception{
        
    try {

            Connection con = getConnection();
            PreparedStatement select = con.prepareStatement("SELECT username,equation1,equation2,equation3,eq_det,eq_x,eq_y,eq_z FROM equations");
            ResultSet result = select.executeQuery();
            System.out.println("-----------------------------------------------");

            
            while (result.next()) {
                               
                System.out.println("----------------------------------------------------");
                System.out.println("User:"+result.getString("username") ); 
                System.out.println("First Equation Typed: "+result.getString("equation1") );
                System.out.println("Second Equation Typed: "+result.getString("equation2") );
                System.out.println("Third Equation Typed: "+result.getString("equation3") );
                System.out.println("Determinant: "+result.getString("eq_det") );
                System.out.println("X :"+result.getString("eq_x")  );
                System.out.println("Y :"+result.getString("eq_y")  );
                System.out.println("Z :"+result.getString("eq_z") );
            }
            
            con.close();
            select.close();
            result.close();
            
            goBackAdmin();

        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
    

    
    
}
    


    
    
    
    

