/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users.userSecretary;

import Main.DataController;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Zack
 */
public class CreateAppointment {
    
    public ArrayList<String> GetDoctorIDs(){
        ArrayList<String> docIDs = new ArrayList<String>();
        
        JSONArray jsonArray = DataController.getJSONData();
        
        for (int i = 0; i < jsonArray.size(); i++){
            try{
                JSONObject curUser = (JSONObject) jsonArray.get(i);
                JSONArray doctors = (JSONArray) curUser.get("doctors");
                
                for (int j = 0; j < doctors.size(); j++){
                    var currentDoc = (JSONObject) doctors.get(j);
                    String docID = (String) currentDoc.get("id");
                    docIDs.add(docID);
                }
            }
            catch(Exception e){
                continue;
            }     
        }
        return docIDs;
    }
    
    public ArrayList<String> GetPatientIDs(){
        ArrayList<String> patIDs = new ArrayList<String>();
        
        JSONArray jsonArray = DataController.getJSONData();
        
        for (int i = 0; i < jsonArray.size(); i++){
            try{
                JSONObject curUser = (JSONObject) jsonArray.get(i);
                JSONArray patients = (JSONArray) curUser.get("patients");
                
                for (int j = 0; j < patients.size(); j++){
                    var currentDoc = (JSONObject) patients.get(j);
                    String docID = (String) currentDoc.get("id");
                    patIDs.add(docID);
                }
            }
            catch(Exception e){
                continue;
            }     
        }
        return patIDs;
    }
    
    public void AppendToFile(String date, String doctorID, String patientID){
        
        JSONObject newAppointment = new JSONObject();
        JSONArray appointments = new JSONArray();
        
        JSONArray jsonArray = DataController.getJSONData();
        
        
        for (int i = 0; i < jsonArray.size(); i++){
                   
            try{
                JSONObject curUser = (JSONObject) jsonArray.get(i);
                appointments = (JSONArray) curUser.get("appointments");
                
                
                newAppointment.put("date", date);
                newAppointment.put("attended", "false");
                newAppointment.put("doctorid", doctorID);
                newAppointment.put("patientid", patientID);
                
                appointments.add(newAppointment);
                
            
                break;
                     
            }
            catch(Exception e){
                continue;
            }            
                    
        }
        //jsonArray.add(doctorFeedback);
        //System.out.println(jsonArray);
        DataController.WriteToFile(jsonArray);
//        try (FileWriter file = new FileWriter("C:\\Users\\Zack\\Documents\\GitHub\\SOFT252CW\\DoctorApplication\\data\\dataJSON.json")){
//            //file.flush();
//            file.write(jsonArray.toJSONString());
//            file.flush();
//            
//        }
//        catch(IOException e){
//            e.printStackTrace();
//        }
        
        
    }
}
