/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users.userPaitent;

import Main.DataController;
import Users.PatientUser;
import java.util.Objects;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Zack
 */
public class ViewHistory {
    private String doctorID;
    private String patientID;
    private String date;
    
    public String GetHistory(){
        
        String userID = PatientUser.userID;
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
                    
                    if (Objects.equals(attended, true)){
                        
                        String patID = (String) currentApp.get("patientid");
                        //System.out.println(currentApp);
                        
                        if(Objects.equals(patID, userID)){
                            doctorID = (String) currentApp.get("doctorid");
                            patientID = (String) currentApp.get("patientid");
                            date = (String) currentApp.get("date");
                            historyStr += ("Doctor: "+doctorID+"\n Saw: "+patientID+"\n On date: "+date+" \n\n");
                            
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
    
    
//    public String GetHistory(){
//    String historyStr = "";
//    String data = DataController.getJSONData();
//    JSONArray array = new JSONArray(data);
//
//    String patient = PatientUser.userID;
//    for (int i = 0; i < data.length(); i++){
//        try {
//            JSONObject curItem = array.getJSONObject(i);
//            JSONArray appointments = curItem.getJSONArray("appointments");
//            for (int j = 0; j < appointments.length(); j++){
//                var currentApp = appointments.getJSONObject(j);
//                String attended = currentApp.getString("attended");
//                if (Objects.equals(attended, "true")){
//                    String patId = currentApp.getString("patientid");
//
//                    if(Objects.equals(patId, patient)){
//                        doctorID = currentApp.getString("doctorid");
//                        patientID = currentApp.getString("patientid");
//                        date = currentApp.getString("date");
//                        historyStr += ("Doctor: "+doctorID+"\n Saw: "+patientID+"\n On date: "+date+" \n\n");
//                    }
//                }
//            }
//        }
//        catch(Exception e){
//            continue;
//        }
//    }
//    System.out.println("Returned string: "+historyStr);
//    return historyStr;
//    }
}
