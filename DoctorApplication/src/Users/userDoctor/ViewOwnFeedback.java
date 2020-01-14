/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users.userDoctor;

import Main.DataController;
import java.util.Objects;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Zack
 */
public class ViewOwnFeedback {
    
    private String note;
    private String rating;
    
    public String GetNotes(String docID){
        String notesStr = "";
        
        JSONArray jsonArray = DataController.getJSONData();
        
        for (int i = 0; i < jsonArray.size(); i++){
                   
            try{
                JSONObject curUser = (JSONObject) jsonArray.get(i);
                JSONArray notes = (JSONArray) curUser.get("docfeedback");
                
                //System.out.println(appointments);
            
                for (int j = 0; j < notes.size(); j++){
                    var currentApp = (JSONObject) notes.get(j);
                    //System.out.println(currentApp);
                    
                    String doctorid = (String) currentApp.get("doctorid");
                        //System.out.println(currentApp);
                        
                        if(Objects.equals(doctorid, docID)){
                            
                            note = (String) currentApp.get("notes");
                            rating = (String) currentApp.get("rating");
                            notesStr += ("Notes: "+note+"\n Rating: " + rating+ "\n\n");
                            
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
