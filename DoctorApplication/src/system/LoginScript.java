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
import org.json.*;

/**
 *
 * @author Zack
 */
public class LoginScript {
    protected String id;
    protected String password;
    protected String name;
    protected String address;
    protected String age;
    protected String gender;
    
    public LoginScript(String newID, String newPassword){
        String id = newID;
        String password = newPassword;
    }
    
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
    
    public void Login(String id, String userPass){
        String data = DataController.getJSONData();
        JSONArray array = new JSONArray(data);
        
        Boolean loginToken = false;
        
        //Used help online to get this code running as my previous attempts were 
        //unsuccessful
        
        if (id.charAt(0) == 'P'){
            for (int i = 0; i < data.length(); i++){
                try {
                    JSONObject curItem = array.getJSONObject(i);
                    JSONArray patients = curItem.getJSONArray("patients");

                    for (int j = 0; j < patients.length(); j++){
                        var currentPat = patients.getJSONObject(j);
                        String patId = currentPat.getString("id");
                        String patPass = currentPat.getString("password");

                        if(Objects.equals(patId, id) && Objects.equals(patPass, userPass)){
                            id = currentPat.getString("id");
                            name = currentPat.getString("name");
                            gender = currentPat.getString("gender");
                            age = currentPat.getString("age");
                            address = currentPat.getString("address");
                            password = currentPat.getString("password");
                            loginToken = true;
                        }
                    }
                }
                catch(Exception e){
                    continue;
                }
            }
            PatientUser p = new PatientUser(id, name, gender, age, address, password);
            System.out.println("ID is: "+id+"Name: "+name+age+gender+"PASSWORD "+password);
            
            if (loginToken == true){
                p.PatientLogin();            
            }
            else{
                loginFail();
            }

        }
        else if (id.charAt(0) == 'A'){
            for (int i = 0; i < data.length(); i++){
                try {
                    JSONObject curItem = array.getJSONObject(i);
                    JSONArray admins = curItem.getJSONArray("administrators");

                    for (int j = 0; j < admins.length(); j++){
                        var currentAdm = admins.getJSONObject(j);
                        String admId = currentAdm.getString("id");
                        String admPass = currentAdm.getString("password");
                        
                        if(Objects.equals(admId, id) && Objects.equals(admPass, userPass)){
                            id = currentAdm.getString("id");
                            name = currentAdm.getString("name");
                            address = currentAdm.getString("address");
                            password = currentAdm.getString("password");
                            loginToken = true;
                        }
                    }
                }
                catch(Exception e){
                    continue;
                }
            }
            AdminUser a = new AdminUser(id, name, address, password);
            System.out.println("ID is: "+id+"Name: "+name+address);
          
            if(loginToken == true){
                a.AdminLogin();
            }
            else{
                loginFail();
            }

        }
        else if (id.charAt(0) == 'D'){
            for (int i = 0; i < data.length(); i++){
                try {
                    JSONObject curItem = array.getJSONObject(i);
                    JSONArray doctors = curItem.getJSONArray("doctors");

                    for (int j = 0; j < doctors.length(); j++){
                        var currentDoc = doctors.getJSONObject(j);
                        String docId = currentDoc.getString("id");
                        String docPass = currentDoc.getString("password");
                        
                        if(Objects.equals(docId, id) && Objects.equals(docPass, userPass)){
                            id = currentDoc.getString("id");
                            name = currentDoc.getString("name");
                            address = currentDoc.getString("address");
                            password = currentDoc.getString("password");
                            loginToken = true;
                        }
                    }
                }
                catch(Exception e){
                    continue;
                }
            }
            DoctorUser d = new DoctorUser(id, name, address, password);
            System.out.println("ID: "+id+" Name: "+name+" Address: "+address);
            
            if (loginToken == true){
                d.DoctorLogin();
            }
            else{
                loginFail();
            }
        }
        else if (id.charAt(0) == 'S'){
            for (int i = 0; i < data.length(); i++){
                try {
                    JSONObject curItem = array.getJSONObject(i);
                    JSONArray secretaries = curItem.getJSONArray("secretaries");

                    for (int j = 0; j < secretaries.length(); j++){
                        var currentSec = secretaries.getJSONObject(j);
                        String secId = currentSec.getString("id");
                        String secPass = currentSec.getString("password");

                        if(Objects.equals(secId, id) && Objects.equals(secPass, userPass)){
                            id = currentSec.getString("id");
                            name = currentSec.getString("name");
                            address = currentSec.getString("address");
                            password = currentSec.getString("password");
                            loginToken = true;
                        }
                    }
                }
                catch(Exception e){
                    continue;
                }
            }
            SecretaryUser s = new SecretaryUser(id, name, address, password);
            System.out.println("ID: "+id+" Name: "+name+" Address: "+address);
            if (loginToken == true){
                s.SecretaryLogin();               
            }
            else{
                loginFail();
            }
        }
        else{
            loginFail();
        }
    }
    
    public void loginFail(){
        Login login = new Login();
        login.setVisible(true);
        JOptionPane.showMessageDialog(null, "Incorrect Username or Password, ", "Invalid login", JOptionPane.INFORMATION_MESSAGE);
    }
}
