/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import formsMain.formsAdmin.AdminHomeScreen;

/**
 *
 * @author Zack
 */
public class AdminUser implements User{
    private String userID = "";
    private String name = "";
    private String address = "";
    private String password = "";

    public void AdminLogin(){
        AdminHomeScreen adminHome = new AdminHomeScreen(); 
        adminHome.setVisible(true);
    }
    
    public AdminUser(String userID, String name, String address, String password){
        this.userID = userID;
        this.name = name;
        this.address = address;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
}
