/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users.userDoctor;

import Main.DataController;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Zack
 */
public class CreateAppointment {
    
    public void CreateNewAppointment(String doctorID, String patientID, String date){
        
        JSONArray jsonArray = DataController.getJSONData();
        
        JSONObject newAppointment = new JSONObject();
        JSONArray tempApp = new JSONArray();
        
        for (int i = 0; i < jsonArray.size(); i++){
            
            try{
            JSONObject tempUser = (JSONObject) jsonArray.get(i);
            tempApp = (JSONArray) tempUser.get("appointments");
            
            
            newAppointment.put("date", date);
            newAppointment.put("attended", "false");
            newAppointment.put("doctorid", doctorID);
            newAppointment.put("patientid", patientID);
               
                
                
                tempApp.add(newAppointment);
                
        }
        catch(Exception e){
        }
        }
        
        //System.out.println(count);
        //System.out.println(newAccount);
        //jsonArray.add(doctorFeedback);
        //System.out.println(tempArray);
        DataController.WriteToTempFile(jsonArray);
    }
}
