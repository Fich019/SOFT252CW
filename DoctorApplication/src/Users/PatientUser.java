/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import formsMain.formsPatient.PatientHomeScreen;

/**
 *
 * @author Zack
 */
public class PatientUser implements User{
    
    public static String userID = "";
    private String name = "";
    private String address = "";
    private String sex = "";
    private String age;
    private String password = "";

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void PatientLogin(){
        PatientHomeScreen patientHome = new PatientHomeScreen(); 
        patientHome.setVisible(true);
    }
    
    public PatientUser(String userID, String name, String address, String sex, String age, String password){
        this.userID = userID;
        this.name = name;
        this.address = address;
        this.sex = sex;
        this.age = age;
        this.password = password;
    }
    
    @Override
    public String getUserID() {
        return userID;
    }

    
    public void setUserID(String userID) {
        this.userID = userID;
    }

    @Override
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    
    public void setAddress(String address) {
        this.address = address;
    }

    
    public String getSex() {
        return sex;
    }

    
    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
