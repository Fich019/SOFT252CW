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
public class GetPatientPrescriptions {
    
    //Gets a list of patient prescriptions
    public ArrayList <String> GetPatientPresc(String patientID){
        
        ArrayList<String> patientPresc = new ArrayList<String>();
        
        JSONArray jsonArray = DataController.getJSONData();
        
        for (int i = 0; i < jsonArray.size(); i++){
            try{
                JSONObject curUser = (JSONObject) jsonArray.get(i);
                JSONArray tempPaients = (JSONArray) curUser.get("prescriptions");
                
                for (int j = 0; j < tempPaients.size(); j++){
                    var currentPat = (JSONObject) tempPaients.get(j);
                    String patID = (String) currentPat.get("patientid");
                    
                    if (Objects.equals(patID, patientID)){
                        String medicine = (String) currentPat.get("medicine");
                        patientPresc.add(medicine);
                    }
                }
            }
            catch(Exception e){
                continue;
            }     
        }
        return patientPresc;
    }
}
