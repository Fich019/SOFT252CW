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

//main class for the user, in this case the admin user. All users are the same except for patient who has a couple more fields.
public class AdminUser implements User{
    private String userID = "";
    private String name = "";
    private String address = "";
    private String password = "";

    //Login for admin, if an admin has logged on to the site, it will take them to correct home page. This is done in all the other users as well
    public void AdminLogin(){
        AdminHomeScreen adminHome = new AdminHomeScreen(); 
        adminHome.setVisible(true);
    }
    
    //Constructor for admin
    public AdminUser(String userID, String name, String address, String password){
        this.userID = userID;
        this.name = name;
        this.address = address;
        this.password = password;
    }
    
    //Getters and setters
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
