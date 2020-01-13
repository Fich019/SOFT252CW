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
public class ApproveAccounts {
    
    public ArrayList <String> GetTempPatientID(){
        
        ArrayList<String> patIDs = new ArrayList<String>();
        
        JSONArray tempArray = DataController.getTEMPData();
        
        for (int i = 0; i < tempArray.size(); i++){
            try{
                JSONObject curUser = (JSONObject) tempArray.get(i);
                JSONArray tempPaients = (JSONArray) curUser.get("patients");
                
                for (int j = 0; j < tempPaients.size(); j++){
                    var currentPat = (JSONObject) tempPaients.get(j);
                    String patID = (String) currentPat.get("id");
                    patIDs.add(patID);
                }
            }
            catch(Exception e){
                continue;
            }     
        }
        return patIDs;
    }
    
    public void RemoveTempAccount(String userID){
        JSONArray tempArray = DataController.getTEMPData();
        
        for (int i = 0; i < tempArray.size(); i++){
            try{
                JSONObject curUser = (JSONObject) tempArray.get(i);
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
        DataController.WriteToTempFile(tempArray);
    }
    
    public void AddTempAccount(String userID){
        
        JSONArray jsonArray = DataController.getJSONData();
        JSONObject approvedPat = GetPatient(userID);
        
        for (int i = 0; i < jsonArray.size(); i++){
            try{
                JSONObject curUser = (JSONObject) jsonArray.get(i);
                JSONArray Patients = (JSONArray) curUser.get("patients");
                
                Patients.add(approvedPat);
            }
            catch(Exception e){
                continue;
            }     
        }
        DataController.WriteToFile(jsonArray);
        RemoveTempAccount(approvedPat.get("id").toString());
    }
    
    public JSONObject GetPatient(String userID){
        JSONObject patientToApp = new JSONObject();
        JSONArray tempArray = DataController.getTEMPData();
        
        for (int i = 0; i < tempArray.size(); i++){
            try{
                JSONObject curUser = (JSONObject) tempArray.get(i);
                JSONArray tempPaients = (JSONArray) curUser.get("patients");
                
                for (int j = 0; j < tempPaients.size(); j++){
                    var currentPat = (JSONObject) tempPaients.get(j);
                    
                    if (Objects.equals(currentPat.get("id"),userID)){
                        patientToApp = currentPat;
                        
                    }
                }
            }
            catch(Exception e){
                continue;
            }     
        }
        
    return patientToApp;
    }
}
