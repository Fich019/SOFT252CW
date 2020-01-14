/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users.userPaitent;

import Main.DataController;
import java.util.Objects;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Zack
 */
public class RequestAccountTermination {
    
    //Changes a field in the patient json object to true. This value
    //states if the account is to be deleted or not.
    public void DeleteAccount(String userID, String password){
        
        JSONArray jsonArray = DataController.getJSONData();
        
        for (int i = 0; i < jsonArray.size(); i++){
                   
            try{
                JSONObject curUser = (JSONObject) jsonArray.get(i);
                JSONArray patients = (JSONArray) curUser.get("patients");
            
                for (int j = 0; j < patients.size(); j++){
                    var currentPat = (JSONObject) patients.get(j);
                    //System.out.println(currentPat);
                    String patID = (String) currentPat.get("id");
                    String patPass = (String) currentPat.get("password");
                    
                    if(Objects.equals(patID, userID) && Objects.equals(patPass, password)){
                        currentPat.put("remove", true);
                    }
                            
                }
                     
            }catch(Exception e){
            continue;
            }
                    
        }
        DataController.WriteToFile(jsonArray);
    }
}
