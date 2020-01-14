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
public class AverageRating {
    
    //Fetchess the rating from the notes if they have matching id to an id passsed
    //to it. If they do, it adds the rating to an integer that will eventually become
    //an average once the code has found all of the matching notes for that 
    //specific doctor.
    public String GetAverage(String docID){
        
        JSONArray jsonArray = DataController.getJSONData();
        int average = 0;
        int divisor = 0;
        String averageRating = "";
        
        for (int i = 0; i < jsonArray.size(); i++){
            try{
                JSONObject curUser = (JSONObject) jsonArray.get(i);
                JSONArray notes = (JSONArray) curUser.get("Notes");
                
                for (int j = 0; j < notes.size(); j++){
                    var currentNote = (JSONObject) notes.get(j);
                    String doctorID = (String) currentNote.get("doctorid");
                    System.out.println(doctorID);
                    
                    if (Objects.equals(docID, doctorID)){
                        String rating = (String) currentNote.get("rating");
                        //System.out.println(rating);
                        average += Integer.parseInt(rating);
                        divisor += 1;
                        //System.out.println(average);
                    }
                    
                    
                    
                }
                average = average / divisor;
                averageRating = Integer.toString(average);
            }
            catch(Exception e){
                continue;
            }     
        }
        return averageRating;
    }
}
