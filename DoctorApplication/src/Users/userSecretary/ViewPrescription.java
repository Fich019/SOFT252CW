/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users.userSecretary;

import Main.DataController;
import java.util.Objects;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Zack
 */
public class ViewPrescription {
    private String dosage;
    private String doctorid;
    private String patientid;
    private String medicine;
    
    public String getprescription(String userID){
        
        String prescriptionStr = "";
        
        JSONArray jsonArray = DataController.getJSONData();
        
        for (int i = 0; i < jsonArray.size(); i++){
                   
            try{
                JSONObject curUser = (JSONObject) jsonArray.get(i);
                JSONArray patients = (JSONArray) curUser.get("prescriptions");
                
                //System.out.println(appointments);
            
                for (int j = 0; j < patients.size(); j++){
                    var currentPat = (JSONObject) patients.get(j);
                    //System.out.println(currentApp);
                    
                    String patID = (String) currentPat.get("patientid");
                        //System.out.println(currentApp);
                        
                    if(Objects.equals(patID, userID)){
                        dosage = (String) currentPat.get("dosage");
                        doctorid = (String) currentPat.get("doctorid");
                        patientid = (String) currentPat.get("patientid");
                        medicine = (String) currentPat.get("medicine");
                            
                            
                        prescriptionStr += ("Prescription given by: "+doctorid+
                            "\n to: "+patientid+" of: "+medicine
                            +"\nin amount: "+dosage
                            +"\n\n");
                            
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
