/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users.userAdmin;

import Main.DataController;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Zack
 */
public class NewDocFeedback {
    
    public void AppendDocFeedback(String docID, String rating, String notes){
        
        JSONObject newFeedback = new JSONObject();
        JSONArray doctorFeedback = new JSONArray();
        
        JSONArray jsonArray = DataController.getJSONData();
        
        
        for (int i = 0; i < jsonArray.size(); i++){
                   
            try{
                JSONObject curUser = (JSONObject) jsonArray.get(i);
                doctorFeedback = (JSONArray) curUser.get("docfeedback");
                
                
                newFeedback.put("doctorid", docID);
                newFeedback.put("rating", rating);
                newFeedback.put("notes", notes);
                
                doctorFeedback.add(newFeedback);
                
            
                break;
                     
            }
            catch(Exception e){
                continue;
            }            
                    
        }
        
        DataController.WriteToFile(jsonArray);
        
    }
}
