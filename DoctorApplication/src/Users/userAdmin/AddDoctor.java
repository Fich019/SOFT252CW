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
public class AddDoctor {
    
    //Adds a new doctor the main json data file.
    public void CreateNewAccount(String password, String address, String name){
        
        int count = 0;
        
        JSONArray jsonArray = DataController.getJSONData();
        
        JSONObject newAccount = new JSONObject();
        JSONArray tempAcc = new JSONArray();
        
        for (int i = 0; i < jsonArray.size(); i++){
            
            try{
            JSONObject tempUser = (JSONObject) jsonArray.get(i);
            tempAcc = (JSONArray) tempUser.get("doctors");
                
            count += tempAcc.size();
                
                
            String ID = String.format("D" + "%04d", count + 1);
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
