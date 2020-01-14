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
public class ApproveAppointment {
    
    //Gets list of appointments to be approved from the temp json file.
    public ArrayList <String> GetAppointments(){
        
        ArrayList<String> Apointments = new ArrayList<String>();
        
        JSONArray tempArray = DataController.getTEMPData();
        
        for (int i = 0; i < tempArray.size(); i++){
            try{
                JSONObject curUser = (JSONObject) tempArray.get(i);
                JSONArray appointments = (JSONArray) curUser.get("appointments");
                
                
                for(int j = 0; j < appointments.size(); j++){
                    var currentAppointment = (JSONObject) appointments.get(j);
                    String date = (String) currentAppointment.get("date");
                    Apointments.add(date);
                    
                }
                
            }
            catch(Exception e){
                continue;
            }     
        }
        return Apointments;
    }
    
    //Removes the appointments from the temp json file.
    public void RemoveAppointment(String date){
        JSONArray tempArray = DataController.getTEMPData();
        
        for (int i = 0; i < tempArray.size(); i++){
            try{
                JSONObject curUser = (JSONObject) tempArray.get(i);
                JSONArray Appointments = (JSONArray) curUser.get("appointments");
                
                for (int j = 0; j < Appointments.size(); j++){
                    var currentPat = (JSONObject) Appointments.get(j);
                    
                    if (Objects.equals(currentPat.get("date"),date)){
                        Appointments.remove(j);
                        
                    }
                }
            }
            catch(Exception e){
                continue;
            }     
        }
        DataController.WriteToTempFile(tempArray);
    }
    
    //Adds appointment from the temp file to the main json file, the 
    //calls the remove appointment method.
    public void AddAppointment(String date){
        
        JSONArray jsonArray = DataController.getJSONData();
        JSONObject approvedPat = GetAppointment(date);
        
        for (int i = 0; i < jsonArray.size(); i++){
            try{
                JSONObject curUser = (JSONObject) jsonArray.get(i);
                JSONArray Appointments = (JSONArray) curUser.get("appointments");
                
                Appointments.add(approvedPat);
            }
            catch(Exception e){
                continue;
            }     
        }
        DataController.WriteToFile(jsonArray);
        RemoveAppointment(approvedPat.get("date").toString());
    }
    
    //Gets the date of an appointment object and returns it to
    //be displayed.
    public JSONObject GetAppointment(String date){
        JSONObject appointmentToApp = new JSONObject();
        JSONArray tempArray = DataController.getTEMPData();
        
        for (int i = 0; i < tempArray.size(); i++){
            try{
                JSONObject curUser = (JSONObject) tempArray.get(i);
                JSONArray tempAppointments = (JSONArray) curUser.get("appointments");
                
                for (int j = 0; j < tempAppointments.size(); j++){
                    var currentApp = (JSONObject) tempAppointments.get(j);
                    
                    if (Objects.equals(currentApp.get("date"),date)){
                        appointmentToApp = currentApp;
                        
                    }
                }
            }
            catch(Exception e){
                continue;
            }     
        }
        
    return appointmentToApp;
    }
}
