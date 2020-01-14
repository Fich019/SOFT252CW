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
public class GiveMeds {
    public ArrayList <String> GetMeds(){
        
        ArrayList<String> meds = new ArrayList<String>();
        
        JSONArray jsonArray = DataController.getJSONData();
        
        for (int i = 0; i < jsonArray.size(); i++){
            try{
                JSONObject curUser = (JSONObject) jsonArray.get(i);
                JSONArray tempPaients = (JSONArray) curUser.get("prescriptions");
                
                for (int j = 0; j < tempPaients.size(); j++){
                    var currentPat = (JSONObject) tempPaients.get(j);
                    var given = currentPat.get("given");
                    
                    if (Objects.equals(given, false)){
                        String patID = (String) currentPat.get("patientid");
                    meds.add(patID);
                    }
                    
                }
            }
            catch(Exception e){
                continue;
            }     
        }
        return meds;
    }
    
    public void GiveMeds(String userID, String meds){
        
        JSONArray jsonArray = DataController.getJSONData();
        
        for (int i = 0; i < jsonArray.size(); i++){
                   
            try{
                JSONObject curUser = (JSONObject) jsonArray.get(i);
                JSONArray prescriptions = (JSONArray) curUser.get("prescriptions");
            
                for (int j = 0; j < prescriptions.size(); j++){
                    var currentPat = (JSONObject) prescriptions.get(j);
                    //System.out.println(currentPat);
                    String patID = (String) currentPat.get("patientid");
                    String medicine = (String) currentPat.get("medicine");
                    
                    if(Objects.equals(patID, userID) && Objects.equals(medicine, meds)){
                        currentPat.put("given", true);
                    }
                            
                }
                     
            }catch(Exception e){
            continue;
            }
                    
        }
        DataController.WriteToFile(jsonArray);
    }
}
