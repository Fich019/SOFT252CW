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
public class GetQuantity {
    
    //Gets the quantity of the currently selected medicine and returns it 
    //to be printed.
    public String GetQuantity(String medicine){
        
        JSONArray jsonArray = DataController.getJSONData();
        
        String quantityStr = "";
        
        for (int i = 0; i < jsonArray.size(); i++){
            try{
                JSONObject curUser = (JSONObject) jsonArray.get(i);
                JSONArray notes = (JSONArray) curUser.get("Medicines");
                
                for (int j = 0; j < notes.size(); j++){
                    var currentMed = (JSONObject) notes.get(j);
                    String med = (String) currentMed.get("name");
                    
                    if (Objects.equals(medicine, med)){
                        String quantity = (String) currentMed.get("quantity");
                        //System.out.println(rating);
                        quantityStr = quantity;
                        
                        //System.out.println(average);
                    }
                    
                    
                    
                }
            
            }
            catch(Exception e){
                continue;
            }     
        }
        return quantityStr;
    }
}
