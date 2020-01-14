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
    
    //Gets all the id's for the doctors in the main json array to be displayed
    //in a combo box.
    public ArrayList<String> GetDoctorIDs(){
        ArrayList<String> docIDs = new ArrayList<String>();
        
        JSONArray jsonArray = DataController.getJSONData();
        
        for (int i = 0; i < jsonArray.size(); i++){
            try{
                JSONObject curUser = (JSONObject) jsonArray.get(i);
                JSONArray doctors = (JSONArray) curUser.get("doctors");
                
                for (int j = 0; j < doctors.size(); j++){
                    var currentDoc = (JSONObject) doctors.get(j);
                    String docID = (String) currentDoc.get("id");
                    docIDs.add(docID);
                }
            }
            catch(Exception e){
                continue;
            }     
        }
        return docIDs;
    }
    
    //Adds the new feedback to the main json file.
    public void AppendToFile(String docID, String rating, String notes){
        
        JSONObject newFeedback = new JSONObject();
        JSONArray doctorFeedback = new JSONArray();
        
        JSONArray jsonArray = DataController.getJSONData();
        
        
        for (int i = 0; i < jsonArray.size(); i++){
                   
            try{
                JSONObject curUser = (JSONObject) jsonArray.get(i);
                doctorFeedback = (JSONArray) curUser.get("Notes");
                
                
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
        
        
    }
}
