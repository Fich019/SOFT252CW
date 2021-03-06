/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users.userSecretary;

import Main.DataController;
import java.util.Objects;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Zack
 */
public class ViewDeleteUser {
    private String address;
    private String name;
    private String id;
    private String age;
    private String gender;
    
    //Gets the data of a selected user to be printed as a 
    //string.
    public String getSelectedUser(String userID){
        
        String patientStr = "";
        
        JSONArray jsonArray = DataController.getJSONData();
        
        for (int i = 0; i < jsonArray.size(); i++){
                   
            try{
                JSONObject curUser = (JSONObject) jsonArray.get(i);
                JSONArray patients = (JSONArray) curUser.get("patients");
                
                //System.out.println(appointments);
            
                for (int j = 0; j < patients.size(); j++){
                    var currentPat = (JSONObject) patients.get(j);
                    //System.out.println(currentApp);
                    
                    String patID = (String) currentPat.get("id");
                        //System.out.println(currentApp);
                        
                    if(Objects.equals(patID, userID)){
                        address = (String) currentPat.get("address");
                        name = (String) currentPat.get("name");
                        id = (String) currentPat.get("id");
                        age = (String) currentPat.get("age");
                        gender = (String) currentPat.get("gender");
                            
                            
                        patientStr += ("UserID: "+id+
                            "\nName: "+name+"\nAge: "
                            +age+"\nGender: "+gender
                            +"\nAddress: "+address+"\n\n");
                            
                    }
                }
                     
            }
            catch(Exception e){
                continue;
            }            
                    
        }
        //System.out.println("Returned string: "+prescriptionStr);
        return patientStr;
    }
}
