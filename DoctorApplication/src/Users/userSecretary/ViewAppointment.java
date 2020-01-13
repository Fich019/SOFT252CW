/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users.userSecretary;

import Main.DataController;
import Users.PatientUser;
import java.util.Objects;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Zack
 */
public class ViewAppointment {
    private String doctorID;
    private String patientID;
    private String date;
    
    public String GetAppointment(String date){
        String appointmentStr = "";
        
        JSONArray tempArray = DataController.getTEMPData();
        
        for (int i = 0; i < tempArray.size(); i++){
                   
            try{
                JSONObject curUser = (JSONObject) tempArray.get(i);
                JSONArray appointments = (JSONArray) curUser.get("appointments");
                
                //System.out.println(appointments);
            
                for (int j = 0; j < appointments.size(); j++){
                    var currentApp = (JSONObject) appointments.get(j);
                    //System.out.println(currentApp);
                    
                    String curDate = (String) currentApp.get("date");
                        //System.out.println(currentApp);
                        
                        if(Objects.equals(curDate, date)){
                            doctorID = (String) currentApp.get("doctorid");
                            patientID = (String) currentApp.get("patientid");
                            date = (String) currentApp.get("date");
                            appointmentStr += ("Doctor: "+doctorID+"\n Will see: "+patientID+"\n On date: "+date+" \n\n");
                            
                        }
                }
                     
            }
            catch(Exception e){
                continue;
            }            
                    
        }
        //System.out.println("Returned string: "+appointmentStr);
        return appointmentStr;
    }
}
