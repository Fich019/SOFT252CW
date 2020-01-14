/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users.userDoctor;

import Main.DataController;
import java.util.Objects;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Zack
 */
public class MarkAsAttended {
    
    public void Attended(String date, String patientID){
        
        JSONArray jsonArray = DataController.getJSONData();
        
        for (int i = 0; i < jsonArray.size(); i++){
                   
            try{
                JSONObject curUser = (JSONObject) jsonArray.get(i);
                JSONArray appointments = (JSONArray) curUser.get("appointments");
            
                for (int j = 0; j < appointments.size(); j++){
                    var currentApp = (JSONObject) appointments.get(j);
                    //System.out.println(currentPat);
                    String appDate = (String) currentApp.get("date");
                    String patID = (String) currentApp.get("patientid");
                    
                    if(Objects.equals(appDate, date) && Objects.equals(patID, patientID)){
                        currentApp.put("attended", "true");
                    }
                            
                }
                     
            }catch(Exception e){
            continue;
            }
                    
        }
        DataController.WriteToFile(jsonArray);
    }
}
