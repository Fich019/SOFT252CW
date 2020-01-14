/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users.userAdmin;

import Main.DataController;
import java.util.Objects;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Zack
 */
public class RemoveDoctor {
    
    //Removes a doctor account from the json file.
    public void removeAccount(String name){
        JSONArray jsonArray = DataController.getJSONData();
        
        for (int i = 0; i < jsonArray.size(); i++){
            try{
                JSONObject curUser = (JSONObject) jsonArray.get(i);
                JSONArray doctors = (JSONArray) curUser.get("doctors");
                
                for (int j = 0; j < doctors.size(); j++){
                    var currentPat = (JSONObject) doctors.get(j);
                    
                    if (Objects.equals(currentPat.get("name"),name)){
                        doctors.remove(j);
                        
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
