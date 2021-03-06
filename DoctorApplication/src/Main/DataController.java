/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Zack
 */
public class DataController {
    //public static ArrayList<User> Users = new ArrayList<User>();
    
    //public static ArrayList<User> Temp = new ArrayList<User>();
    
    
    //Gets the json data from the main json file.
    public static JSONArray getJSONData() {
        
        JSONParser parser = new JSONParser();
        JSONArray jsonArray = new JSONArray();
        
        try (Reader reader = new FileReader("./data/dataJSON.json")){
            
            jsonArray = (JSONArray) parser.parse(reader);
//            String user = (String) jsonObject.get("patients");
//            JSONArray Patients = (JSONArray) jsonObject.get("patients");

        
            
        }catch (IOException e){
            e.printStackTrace();
        }catch (ParseException e) {
            e.printStackTrace();
        }
        return jsonArray;
    }
    
    
    //Writes to the main json file.
    public static JSONArray WriteToFile(JSONArray array){
        
        JSONArray jsonArray = array;
        
        try (FileWriter file = new FileWriter("./data/dataJSON.json")){
            //file.flush();
            file.write(jsonArray.toJSONString());
            file.flush();
            
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return jsonArray;
    }
    
    //Gets the temp json file data.
    public static JSONArray getTEMPData() {
        
        JSONParser parser = new JSONParser();
        JSONArray tempArray = new JSONArray();
        
        try (Reader reader = new FileReader("./data/tempJSON.json")){
            
            tempArray = (JSONArray) parser.parse(reader);
//            String user = (String) jsonObject.get("patients");
//            JSONArray Patients = (JSONArray) jsonObject.get("patients");

        
            
        }catch (IOException e){
            e.printStackTrace();
        }catch (ParseException e) {
            e.printStackTrace();
        }
        return tempArray;
    }
    
    //Writes to the temp json file.
    public static JSONArray WriteToTempFile(JSONArray array){
        
        JSONArray tempArray = array;
        
        try (FileWriter file = new FileWriter("./data/tempJSON.json")){
            //file.flush();
            file.write(tempArray.toJSONString());
            file.flush();
            
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return tempArray;
    }
        
    
        
        

    
}
