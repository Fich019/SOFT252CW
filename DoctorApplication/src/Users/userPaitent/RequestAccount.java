/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users.userPaitent;

import Main.DataController;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Zack
 */
public class RequestAccount {
    
    //Creates a new request for a patient account. This is stored in a temporary json file and will be
    //approved if the secretary wills it so. In order to make sure the id is different, it counts the array
    //of patients in both files and uses the combined number as a user id.
    public void CreateNewAccount(String password, String address, String gender, String name, String age){
        
        int count = 0;
        
        JSONArray jsonArray = DataController.getJSONData();
        
        for (int j = 0; j < jsonArray.size(); j++){
            JSONObject curUser = (JSONObject) jsonArray.get(j);
            //System.out.println(curUser);
            JSONArray patients = (JSONArray) curUser.get("patients");
            
            count += patients.size();
            break;
            //System.out.println(patients.size());
        }
        
        
        JSONArray tempArray = DataController.getTEMPData();
        JSONObject newAccount = new JSONObject();
        JSONArray tempAcc = new JSONArray();
        
        for (int i = 0; i < tempArray.size(); i++){
            
            try{
            JSONObject tempUser = (JSONObject) tempArray.get(i);
            tempAcc = (JSONArray) tempUser.get("patients");
                
            count += tempAcc.size();
                
                
            String ID = String.format("P" + "%04d", count + 1);
            //System.out.println(ID);
            newAccount.put("password", password);
            newAccount.put("address", address);
            newAccount.put("gender", gender);
            newAccount.put("name", name);
            newAccount.put("id", ID);
            newAccount.put("age", age);
            newAccount.put("remove", false);
               
                
                
                tempAcc.add(newAccount);
                
        }
        catch(Exception e){
        }
        }
        
        //System.out.println(count);
        //System.out.println(newAccount);
        //jsonArray.add(doctorFeedback);
        //System.out.println(tempArray);
        DataController.WriteToTempFile(tempArray);
        
        
    }
}
