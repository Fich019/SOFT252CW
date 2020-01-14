/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import Main.DataController;
import Users.AdminUser;
import Users.DoctorUser;
import Users.PatientUser;
import Users.SecretaryUser;
import formsMain.Login;

import java.util.Objects;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;


/**
 *
 * @author Zack
 */
public class LoginScript {
    private String id;
    private String password;
    private String name;
    private String address;
    private String age;
    private String gender;
    
    //Stores the id and password of a logged in paitent.
    public LoginScript(String newID, String newPassword){
        String id = newID;
        String password = newPassword;
    }
    
    //Stores all of the data of a logged in user.
    public LoginScript(String newID, String newPass, String newName,
        String newAddress, String newAge, String newGender)
    {
        id = newID;
        password = newPass;
        name = newName;
        address = newAddress;
        age = newAge;
        gender = newGender;
    }
    
    //Checks through the loginID and password and decides if they are valid,
    //if they are it then checks to see which user logged in and creates a 
    //corrisponding user class to match. It is checked by seeing what the first
    //character is of the login as the defines which account is being logged in.
    //It then searches the json file for users that match the id that has been
    //given to it. If none match, the script calls a login fail and askes the
    //user to log in again. If it suceeds, the data is stored in the user class and
    //then takes them to the corrisponding home page.
    public void Login(String loginID, String loginPass){
        
        Boolean loginToken = false;
        
        //Used help online to get this code running as my previous attempts were 
        //unsuccessful
        
        
        JSONArray jsonArray = DataController.getJSONData();
        
        //Checks the first character of the username
        if (loginID.charAt(0) == 'P'){
                
            //Loops through the json array.
                for (int i = 0; i < jsonArray.size(); i++){
                   
                    //Trys to set a jsonobject as a curuser at position i,
                    //then creates gets the array of patients.
                    try{
                        JSONObject curUser = (JSONObject) jsonArray.get(i);
                        JSONArray patients = (JSONArray) curUser.get("patients");
            
                        //Searches through all of the patients in the file and set 
                        //one as currentPat. It gets the id and password of currentPat
                        //and checks to see if it matches the id and password passed
                        //into the method. If it matches, set the data as the variables
                        //given at the start of the class and sets login bool to true.
                        for (int j = 0; j < patients.size(); j++){
                            var currentPat = (JSONObject) patients.get(j);
                            //System.out.println(currentPat);
                            String patID = (String) currentPat.get("id");
                            String patPass = (String) currentPat.get("password");
                    
                            if(Objects.equals(patID, loginID) && Objects.equals(patPass, loginPass)){
                                id = (String) currentPat.get("id");
                                name = (String) currentPat.get("name");
                                gender = (String) currentPat.get("gender");
                                age = (String) currentPat.get("age");
                                address = (String) currentPat.get("address");
                                password = (String) currentPat.get("password");
                                loginToken = true;
                            }
                            //System.out.println(currentPat);
                            //System.out.println(patID + patPass); 
                        }
                     
                    }
                    catch(Exception e){
                        continue;
                    }
                    
               }
                //Creates a new user depending on who logged on (patient in this case) and 
                //stores the data in a new user.
               PatientUser p = new PatientUser(id, name, gender, age, address, password);
               
               //A simple if statement that checks to see if logintoken is true, if it is
               //proceed to log the current user in and take them to their homescreen,
               //if not run loging fail.
               if(loginToken == true){
                p.PatientLogin();
                }
                else{
                    LoginFail();
                }
        }
        else if (loginID.charAt(0) == 'D'){
                
                for (int i = 0; i < jsonArray.size(); i++){
                   
                    try{
                        JSONObject curUser = (JSONObject) jsonArray.get(i);
                        JSONArray doctor = (JSONArray) curUser.get("doctors");
            
                        for (int j = 0; j < doctor.size(); j++){
                            var currentPat = (JSONObject) doctor.get(j);
                            //System.out.println(currentPat);
                            String docID = (String) currentPat.get("id");
                            String docPass = (String) currentPat.get("password");
                    
                            if(Objects.equals(docID, loginID) && Objects.equals(docPass, loginPass)){
                                id = (String) currentPat.get("id");
                                name = (String) currentPat.get("name");
                                address = (String) currentPat.get("address");
                                password = (String) currentPat.get("password");
                                loginToken = true;
                            }
                            //System.out.println(currentPat);
                            //System.out.println(docID + docPass); 
                        }
                     
                    }
                    catch(Exception e){
                        continue;
                    }
                    
               }
               DoctorUser d = new DoctorUser(id, name, address, password);
               //System.out.println("ID is: "+id+"Name: "+name+age+gender+"PASSWORD "+password);
               
               if(loginToken == true){
                d.DoctorLogin();
                }
                else{
                    LoginFail();
                }
        }
        else if (loginID.charAt(0) == 'A'){
                
                for (int i = 0; i < jsonArray.size(); i++){
                   
                    try{
                        JSONObject curUser = (JSONObject) jsonArray.get(i);
                        JSONArray admin = (JSONArray) curUser.get("admins");
            
                        for (int j = 0; j < admin.size(); j++){
                            var currentPat = (JSONObject) admin.get(j);
                            //System.out.println(currentPat);
                            String adminID = (String) currentPat.get("id");
                            String adminPass = (String) currentPat.get("password");
                    
                            if(Objects.equals(adminID, loginID) && Objects.equals(adminPass, loginPass)){
                                id = (String) currentPat.get("id");
                                name = (String) currentPat.get("name");
                                address = (String) currentPat.get("address");
                                password = (String) currentPat.get("password");
                                loginToken = true;
                            }
                            //System.out.println(currentPat);
                            //System.out.println(adminID + adminPass); 
                        }
                     
                    }
                    catch(Exception e){
                        continue;
                    }
                    
               }
                AdminUser a = new AdminUser(id, name, address, password);
               //System.out.println("ID is: "+id+"Name: "+name+age+gender+"PASSWORD "+password);
               
               if(loginToken == true){
                a.AdminLogin();
                }
                else{
                    LoginFail();
                }
        }
        else if (loginID.charAt(0) == 'S'){
                
                for (int i = 0; i < jsonArray.size(); i++){
                   
                    try{
                        JSONObject curUser = (JSONObject) jsonArray.get(i);
                        JSONArray secretary = (JSONArray) curUser.get("secretaries");
            
                        for (int j = 0; j < secretary.size(); j++){
                            var currentPat = (JSONObject) secretary.get(j);
                            //System.out.println(currentPat);
                            String secID = (String) currentPat.get("id");
                            String secPass = (String) currentPat.get("password");
                    
                            if(Objects.equals(secID, loginID) && Objects.equals(secPass, loginPass)){
                                id = (String) currentPat.get("id");
                                name = (String) currentPat.get("name");
                                address = (String) currentPat.get("address");
                                password = (String) currentPat.get("password");
                                loginToken = true;
                            }
                            //System.out.println(currentPat);
                            //System.out.println(secID + secPass); 
                        }
                     
                    }
                    catch(Exception e){
                        continue;
                    }
                    
               }
                SecretaryUser s = new SecretaryUser(id, name, address, password);
               //System.out.println("ID is: "+id+"Name: "+name+age+gender+"PASSWORD "+password);
               
               if(loginToken == true){
                s.SecretaryLogin();
                }
                else{
                    LoginFail();
                }
        }
        else{
            LoginFail();
        }
        
    }  
    
    //Reloads the login page and opens a dialog box telling the user they have typed the incorrect username 
    //or password and gets them to input it again.
    public void LoginFail(){
        Login login = new Login();
        login.setVisible(true);
        JOptionPane.showMessageDialog(null, "Incorrect Username or Password, ", "Invalid login", JOptionPane.INFORMATION_MESSAGE);
    }
}
