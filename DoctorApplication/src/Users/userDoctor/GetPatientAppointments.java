/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users.userDoctor;

import Main.DataController;
import java.util.ArrayList;
import java.util.Objects;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Zack
 */
public class GetPatientAppointments {
    
    private String note;
    
    //Gets the appointment notes that match a certain date that has been
    //passed though from a form. Returns the notes to be viewed by 
    //the currently logged in user
    public String GetAppointments(String date){
        
        
        String noteStr = "";
        
        JSONArray jsonArray = DataController.getJSONData();
        
        for (int i = 0; i < jsonArray.size(); i++){
                   
            try{
                JSONObject curUser = (JSONObject) jsonArray.get(i);
                JSONArray appointments = (JSONArray) curUser.get("appointments");
                
                //System.out.println(appointments);
            
                for (int j = 0; j < appointments.size(); j++){
                    var currentApp = (JSONObject) appointments.get(j);
                    //System.out.println(currentApp);
                    String attended = (String) currentApp.get("attended");
                    
                    if (Objects.equals(attended, "false")){
                        
                        String appdate = (String) currentApp.get("date");
                        //System.out.println(currentApp);
                        
                        if(Objects.equals(appdate, date)){
                            note = (String) currentApp.get("notes");
                            noteStr += (note);
                            
                        }
                    }
                }
                     
            }
            catch(Exception e){
                continue;
            }            
                    
        }
        
    //System.out.println(historyStr);
    return noteStr;
        
    }
    
    
    public ArrayList <String> GetPatientAppointments(String selectedPatient){
        
        ArrayList<String> patientApps = new ArrayList<String>();
        
        JSONArray jsonArray = DataController.getJSONData();
        
        for (int i = 0; i < jsonArray.size(); i++){
            try{
                JSONObject curUser = (JSONObject) jsonArray.get(i);
                JSONArray tempPaients = (JSONArray) curUser.get("appointments");
                
                for (int j = 0; j < tempPaients.size(); j++){
                    var currentPat = (JSONObject) tempPaients.get(j);
                    String patID = (String) currentPat.get("patientid");
                    String attended = (String) currentPat.get("attended");
                    
                    if (Objects.equals(patID, selectedPatient) && Objects.equals(attended, "false")){
                        String date = (String) currentPat.get("date");
                        patientApps.add(date);
                    }
                }
            }
            catch(Exception e){
                continue;
            }     
        }
        return patientApps;
    }
}
