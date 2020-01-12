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
public class ViewPrescription {
    protected String doctorID;
    protected String patientID;
    protected String doctorNotes;
    protected String medicine;
    protected String dosage;
    
    public String getPrescription(){
        String userID = PatientUser.userID;
        String prescriptionStr = "";
        
        JSONArray jsonArray = DataController.getJSONData();
        
        for (int i = 0; i < jsonArray.size(); i++){
                   
            try{
                JSONObject curUser = (JSONObject) jsonArray.get(i);
                JSONArray prescriptions = (JSONArray) curUser.get("prescriptions");
                
                //System.out.println(appointments);
            
                for (int j = 0; j < prescriptions.size(); j++){
                    var currentApp = (JSONObject) prescriptions.get(j);
                    //System.out.println(currentApp);
                    
                    String patID = (String) currentApp.get("patientid");
                        //System.out.println(currentApp);
                        
                    if(Objects.equals(patID, userID)){
                        doctorID = (String) currentApp.get("doctorid");
                        patientID = (String) currentApp.get("patientid");
                        doctorNotes = (String) currentApp.get("doctornotes");
                        medicine = (String) currentApp.get("medicine");
                        dosage = (String) currentApp.get("dosage");
                            
                            
                        prescriptionStr += ("Administered by Dr: "+doctorID+
                            "\n    for Patient: "+patientID+"\n    Notes: "
                            +doctorNotes+"\n    Medicine: "+medicine
                            +"\n    Dosage: "+dosage+"\n\n");
                            
                    }
                }
                     
            }
            catch(Exception e){
                continue;
            }            
                    
        }
        //System.out.println("Returned string: "+prescriptionStr);
        return prescriptionStr;
    }
}
