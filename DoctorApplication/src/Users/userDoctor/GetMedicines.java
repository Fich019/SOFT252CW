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
public class GetMedicines {
    
    
    public ArrayList <String> GetMeds(){
        
        ArrayList<String> meds = new ArrayList<String>();
        
        JSONArray jsonArray = DataController.getJSONData();
        
        for (int i = 0; i < jsonArray.size(); i++){
            try{
                JSONObject curUser = (JSONObject) jsonArray.get(i);
                JSONArray medicines = (JSONArray) curUser.get("Medicines");
                
                for (int j = 0; j < medicines.size(); j++){
                    var currentPat = (JSONObject) medicines.get(j);
                    String medName = (String) currentPat.get("name");
                    meds.add(medName);
                }
            }
            catch(Exception e){
                continue;
            }     
        }
        return meds;
    }
}
