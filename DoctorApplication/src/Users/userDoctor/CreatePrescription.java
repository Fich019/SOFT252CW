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
public class CreatePrescription {
    
    public void AddPrescription(String dosage, String doctorID, String patientID, String medicine){
        
        JSONObject newPrescription = new JSONObject();
        JSONArray prescriptions = new JSONArray();
        
        JSONArray jsonArray = DataController.getJSONData();
        
        
        for (int i = 0; i < jsonArray.size(); i++){
                   
            try{
                JSONObject curUser = (JSONObject) jsonArray.get(i);
                prescriptions = (JSONArray) curUser.get("prescriptions");
                
                
                newPrescription.put("dosage", dosage);
                newPrescription.put("given", false);
                newPrescription.put("doctorid", doctorID);
                newPrescription.put("patientid", patientID);
                newPrescription.put("medicine", medicine);
                
                
                prescriptions.add(newPrescription);
                
            
                break;
                     
            }
            catch(Exception e){
                continue;
            }            
                    
        }
        DataController.WriteToFile(jsonArray);
    }
}
