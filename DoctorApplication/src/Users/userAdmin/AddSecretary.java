/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users.userAdmin;

import Main.DataController;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Zack
 */
public class AddSecretary {
    
    //Adds a new secretary to the main json data file.
    public void CreateNewSec(String password, String address, String name){
        
        int count = 0;
        
        JSONArray jsonArray = DataController.getJSONData();
        
        JSONObject newAccount = new JSONObject();
        JSONArray tempAcc = new JSONArray();
        
        for (int i = 0; i < jsonArray.size(); i++){
            
            try{
            JSONObject tempUser = (JSONObject) jsonArray.get(i);
            tempAcc = (JSONArray) tempUser.get("secretaries");
                
            count += tempAcc.size();
                
                
            String ID = String.format("S" + "%04d", count + 1);
            //System.out.println(ID);
            newAccount.put("password", password);
            newAccount.put("address", address);
            newAccount.put("name", name);
            newAccount.put("id", ID);
               
                
                
                tempAcc.add(newAccount);
                
        }
        catch(Exception e){
        }
        }
        
        //System.out.println(count);
        //System.out.println(newAccount);
        //jsonArray.add(doctorFeedback);
        //System.out.println(tempArray);
        DataController.WriteToFile(jsonArray);
        
        
    }
}
