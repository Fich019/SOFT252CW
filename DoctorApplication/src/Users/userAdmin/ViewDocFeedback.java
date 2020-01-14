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
public class ViewDocFeedback {
    
    private String note;
    
    //Gets the notes from the json object notes for the matching doctor
    //and sends them to a form to be displayed to the current user.
    public String GetNotes(String docID){
        String notesStr = "";
        
        JSONArray jsonArray = DataController.getJSONData();
        
        for (int i = 0; i < jsonArray.size(); i++){
                   
            try{
                JSONObject curUser = (JSONObject) jsonArray.get(i);
                JSONArray notes = (JSONArray) curUser.get("Notes");
                
                //System.out.println(appointments);
            
                for (int j = 0; j < notes.size(); j++){
                    var currentApp = (JSONObject) notes.get(j);
                    //System.out.println(currentApp);
                    
                    String doctorid = (String) currentApp.get("doctorid");
                        //System.out.println(currentApp);
                        
                        if(Objects.equals(doctorid, docID)){
                            
                            note = (String) currentApp.get("notes");
                            notesStr += ("Notes: "+note+"\n\n");
                            
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
