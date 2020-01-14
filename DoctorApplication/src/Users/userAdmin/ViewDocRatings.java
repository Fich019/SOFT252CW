/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users.userAdmin;

import Main.DataController;
import java.util.Objects;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Zack
 */
public class ViewDocRatings {
    
    private String rating;
    
    public String GetRatings(String docID){
        String notesStr = "";
        
        JSONArray jsonArray = DataController.getJSONData();
        
        for (int i = 0; i < jsonArray.size(); i++){
                   
            try{
                JSONObject curUser = (JSONObject) jsonArray.get(i);
                JSONArray ratings = (JSONArray) curUser.get("Notes");
                
                //System.out.println(appointments);
            
                for (int j = 0; j < ratings.size(); j++){
                    var currentApp = (JSONObject) ratings.get(j);
                    //System.out.println(currentApp);
                    
                    String doctorid = (String) currentApp.get("doctorid");
                        //System.out.println(currentApp);
                        
                        if(Objects.equals(doctorid, docID)){
                            
                            rating = (String) currentApp.get("rating");
                            notesStr += ("Rating: "+rating+"\n\n");
                            
                        }
                }
                     
            }
            catch(Exception e){
                continue;
            }            
                    
        }
        //System.out.println("Returned string: "+appointmentStr);
        return notesStr;
    }
}
