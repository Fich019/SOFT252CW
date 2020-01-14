/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import java.util.concurrent.atomic.AtomicInteger;


/**
 *
 * @author Zack
 */
public interface User {
    
    public static final AtomicInteger count = new AtomicInteger(0); 
    
    //Main interface for all of the different users.
    String userID = "";
    String name = "";
    String address = "";
    
    public String getUserID();
   // public void setUserID();
    
    public String getName();
    //public void setName();
    
    public String getAddress();
    //public void setAddress();
}
