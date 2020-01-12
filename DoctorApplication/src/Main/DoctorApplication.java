/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Users.PatientUser;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Objects;
import org.json.simple.JSONArray;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Zack
 */
public class DoctorApplication {

  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //JSONArray jsonArray = DataController.getJSONData();
        
//        if (id.charAt(0) == 'P'){
//                
//                for (int i = 0; i < jsonArray.size(); i++){
//                   
//                    try{
//                        JSONObject curUser = (JSONObject) jsonArray.get(i);
//                        JSONArray patients = (JSONArray) curUser.get("patients");
//            
//                        for (int j = 0; j < patients.size(); j++){
//                            var currentPat = (JSONObject) patients.get(j);
//                            //System.out.println(currentPat);
//                            String patID = (String) currentPat.get("id");
//                            String patPass = (String) currentPat.get("password");
//                    
//                            if(Objects.equals(patID, patID) && Objects.equals(patPass, patPass)){
//                                id = (String) currentPat.get("id");
//                                name = (String) currentPat.get("name");
//                                gender = (String) currentPat.get("gender");
//                                age = (String) currentPat.get("age");
//                                address = (String) currentPat.get("address");
//                                password = (String) currentPat.get("password");
//                            }
//                            System.out.println(currentPat);
//                            System.out.println(patID + patPass); 
//                        }
//                     
//                    }
//                    catch(Exception e){
//                        continue;
//                    }
//                    
//               }
//               PatientUser p = new PatientUser(id, name, gender, age, address, password);
//               //System.out.println("ID is: "+id+"Name: "+name+age+gender+"PASSWORD "+password);
//        }
        
       
    }
    
}
