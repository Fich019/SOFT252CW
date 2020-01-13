/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users.userSecretary;

import Main.DataController;
import java.util.ArrayList;
import java.util.Objects;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Zack
 */
public class RemoveAccount {
    
    public ArrayList <String> GetRemovePatients(){
        
        ArrayList<String> removePats = new ArrayList<String>();
        
        JSONArray jsonArray = DataController.getJSONData();
        
        for (int i = 0; i < jsonArray.size(); i++){
            try{
                JSONObject curUser = (JSONObject) jsonArray.get(i);
                JSONArray Paients = (JSONArray) curUser.get("patients");
                
                for (int j = 0; j < Paients.size(); j++){
                    
                    var currentPat = (JSONObject) Paients.get(j);
                    Boolean remove = (Boolean) currentPat.get("remove");
                    String patID = (String) currentPat.get("id");
                    
                    if (Objects.equals(remove, true)){
                        removePats.add(patID);
                    }
                }
            }
            catch(Exception e){
                continue;
            }     
        }
        return removePats;
    }
    
    
    public void removeAccount(String userID){
        JSONArray jsonArray = DataController.getJSONData();
        
        for (int i = 0; i < jsonArray.size(); i++){
            try{
                JSONObject curUser = (JSONObject) jsonArray.get(i);
                JSONArray Patients = (JSONArray) curUser.get("patients");
                
                for (int j = 0; j < Patients.size(); j++){
                    var currentPat = (JSONObject) Patients.get(j);
                    
                    if (Objects.equals(currentPat.get("id"),userID)){
                        Patients.remove(j);
                        
                    }
                }
            }
            catch(Exception e){
                continue;
            }     
        }
        DataController.WriteToFile(jsonArray);
    }
}
