/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Users.User;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Zack
 */
public class DataController {
    //public static ArrayList<User> Users = new ArrayList<User>();
    
    //public static ArrayList<User> Temp = new ArrayList<User>();
    
    public static String getJSONData() {
        File file = new File("C:\\Users\\Zack\\Documents\\GitHub\\SOFT252CW\\DoctorApplication\\data\\dataJSON.json");
        String result = "";
        try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8.name())){
            while(sc.hasNext()) {
            result += sc.nextLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        
        return result;
    }
}
