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
public class RemoveSecretary {
    
    //Removes a secretary from the main json file.
    public void removeAccount(String name){
        
        JSONArray jsonArray = DataController.getJSONData();
        
        for (int i = 0; i < jsonArray.size(); i++){
            try{
                JSONObject curUser = (JSONObject) jsonArray.get(i);
                JSONArray secretaries = (JSONArray) curUser.get("secretaries");
                
                for (int j = 0; j < secretaries.size(); j++){
                    var currentSec = (JSONObject) secretaries.get(j);
                    
                    if (Objects.equals(currentSec.get("name"),name)){
                        secretaries.remove(j);
                        
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
