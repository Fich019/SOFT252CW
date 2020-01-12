/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users.userPaitent;

import Main.DataController;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Zack
 */
public class GiveFeedback {
    
    public void AppendToFile(String docID, String rating, String notes){
        
        JSONObject newFeedback = new JSONObject();
        JSONArray doctorFeedback = new JSONArray();
        
        JSONArray jsonArray = DataController.getJSONData();
        
        
        for (int i = 0; i < jsonArray.size(); i++){
                   
            try{
                JSONObject curUser = (JSONObject) jsonArray.get(i);
                doctorFeedback = (JSONArray) curUser.get("docfeedback");
                
                newFeedback.put("doctorid", docID);
                newFeedback.put("rating", rating);
                newFeedback.put("notes", notes);
                
                doctorFeedback.add(newFeedback);
                
            
                break;
                     
            }
            catch(Exception e){
                continue;
            }            
                    
        }
        //jsonArray.add(doctorFeedback);
        System.out.println(jsonArray);
        DataController.WriteToFile(jsonArray);
//        try (FileWriter file = new FileWriter("C:\\Users\\Zack\\Documents\\GitHub\\SOFT252CW\\DoctorApplication\\data\\dataJSON.json")){
//            //file.flush();
//            file.write(jsonArray.toJSONString());
//            file.flush();
//            
//        }
//        catch(IOException e){
//            e.printStackTrace();
//        }
        
        
    }
}
