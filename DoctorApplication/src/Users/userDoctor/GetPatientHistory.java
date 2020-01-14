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
public class GetPatientHistory {
    
    private String doctorID;
    private String patientID;
    private String date;
    private String note;
    
    public String GetHistory(String userID){
        
        
        String historyStr = "";
        
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
                    
                    if (Objects.equals(attended, "true")){
                        
                        String patID = (String) currentApp.get("patientid");
                        //System.out.println(currentApp);
                        
                        if(Objects.equals(patID, userID)){
                            doctorID = (String) currentApp.get("doctorid");
                            patientID = (String) currentApp.get("patientid");
                            date = (String) currentApp.get("date");
                            note = (String) currentApp.get("notes");
                            historyStr += ("Doctor: "+doctorID+"\n Saw: "+patientID+"\n On date: "+date+" \n Notes: " +note+"\n\n");
                            
                        }
                    }
                }
                     
            }
            catch(Exception e){
                continue;
            }            
                    
        }
        
    //System.out.println(historyStr);
    return historyStr;
        
    }
}
