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
public class ViewPrescription {
    protected String doctorID;
    protected String patientID;
    protected String doctorNotes;
    protected String medicine;
    protected String dosage;
    
//    public String getPrescription(){
//        String prescriptionStr = "";
//        String data = DataController.getJSONData();
//        JSONArray dataArray = new JSONArray(data);
//
//        String patient = PatientUser.userID;
//        for (int i = 0; i < data.length(); i++){
//            try {
//                JSONObject curItem = dataArray.getJSONObject(i);
//                JSONArray prescriptions = curItem.getJSONArray("prescriptions");
//
//                for (int j = 0; j < prescriptions.length(); j++){
//                    var currentPre = prescriptions.getJSONObject(j);
//                    String patId = currentPre.getString("patientid");
//
//                    if(Objects.equals(patId, patient)){
//                        doctorID = currentPre.getString("doctorid");
//                        patientID = currentPre.getString("patientid");
//                        doctorNotes = currentPre.getString("doctornotes");
//                        medicine = currentPre.getString("medicine");
//                        dosage = currentPre.getString("dosage");
//                        
//                        prescriptionStr += ("Administered by Dr ID: "+doctorID+
//                                "\n for Patient ID: "+patientID+"\n Notes: "
//                                +doctorNotes+"\n Medicine: "+medicine
//                                +"\n Dosage: "+dosage+"\n\n");
//                    }
//                }
//            }
//            catch(Exception e){
//                continue;
//            }
//        }
//        System.out.println("Returned string: "+prescriptionStr);
//        return prescriptionStr;
//    }
}
