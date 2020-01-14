/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users.userPaitent;

import Main.DataController;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Zack
 */
public class RequestAppointment {
    
    public void CreateNewAppointment(String doctorID, String patientID, String date){
        JSONArray tempArray = DataController.getTEMPData();
        
        JSONObject newAppointment = new JSONObject();
        JSONArray tempApp = new JSONArray();
        
        for (int i = 0; i < tempArray.size(); i++){
            
            try{
            JSONObject tempUser = (JSONObject) tempArray.get(i);
            tempApp = (JSONArray) tempUser.get("appointments");
            
            
            newAppointment.put("date", date);
            newAppointment.put("attended", "false");
            newAppointment.put("notes", null);
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
        DataController.WriteToTempFile(tempArray);
    }
}
