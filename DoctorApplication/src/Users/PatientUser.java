/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

/**
 *
 * @author Zack
 */
public class PatientUser implements User{
    
    private String userID = "";
    private String name = "";
    private String address = "";
    private String sex = "";
    private String age;

    public PatientUser(String userID, String name, String address, String sex, String age){
        this.userID = userID;
        this.name = name;
        this.address = address;
        this.sex = sex;
        this.age = age;
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
