/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users.userPaitent;

import Main.DataController;
import Users.PatientUser;
import java.util.Objects;
//import org.json.JSONArray;
//import org.json.JSONObject;

/**
 *
 * @author Zack
 */
public class ViewAppointments {
    private String doctorID;
    private String patientID;
    private String date;
    
//    public String GetAppointment(){
//        String appString = "";
//        String data = DataController.getJSONData();
//        JSONArray array = new JSONArray(data);
//
//        String patientID = PatientUser.userID;
//        
//        //Using the same code to import the data into an JSON object, I am using
//        //it again to check through the array for appointments.
//        for (int i = 0; i < data.length(); i++){
//            try {
//                JSONObject curItem = array.getJSONObject(i);
//                JSONArray appointments = curItem.getJSONArray("appointments");
//                for (int j = 0; j < appointments.length(); j++){
//                    var currentApp = appointments.getJSONObject(j);
//                    String attended = currentApp.getString("attended");
//                    if (Objects.equals(attended, "false")){
//                        String patId = currentApp.getString("patientid");
//
//                        if(Objects.equals(patId, patientID)){
//                            doctorID = currentApp.getString("doctorid");
//                            patientID = currentApp.getString("patientid");
//                            date = currentApp.getString("date");
//                            appString += ("Doctor: "+doctorID+"\n To see: "+patientID+"\n On date: "+date+" \n\n");
//                        }
//                    }
//                }
//            }
//            catch(Exception e){
//                continue;
//            }
//        }
//        System.out.println("Returned string: "+appString);
//        return appString;
//    }
    

}
