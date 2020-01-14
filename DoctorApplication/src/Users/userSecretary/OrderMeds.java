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
public class OrderMeds {
    
    public void addMeds(String medicine){
        
        JSONArray jsonArray = DataController.getJSONData();
        
        for (int i = 0; i < jsonArray.size(); i++){
                   
            try{
                JSONObject curUser = (JSONObject) jsonArray.get(i);
                JSONArray patients = (JSONArray) curUser.get("Medicines");
            
                for (int j = 0; j < patients.size(); j++){
                    var currentPat = (JSONObject) patients.get(j);
                    //System.out.println(currentPat);
                    String med = (String) currentPat.get("name");
                    String currentquan = (String) currentPat.get("quantity");
                    
                    if(Objects.equals(med, medicine)){
                        int newquan = Integer.parseInt(currentquan);
                        newquan = newquan + 20;
                        String finalquan = Integer.toString(newquan);
                        currentPat.put("quantity", finalquan);
                    }
                            
                }
                     
            }catch(Exception e){
            continue;
            }
                    
        }
        DataController.WriteToFile(jsonArray);
    }
}
