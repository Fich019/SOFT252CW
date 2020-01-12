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
    
    public static JSONArray getJSONData() {
        
        JSONParser parser = new JSONParser();
        JSONArray jsonArray = new JSONArray();
        
        try (Reader reader = new FileReader("C:\\Users\\Zack\\Documents\\GitHub\\SOFT252CW\\DoctorApplication\\data\\dataJSON.json")){
            
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
    
    public static JSONArray WriteToFile(JSONArray array){
        
        JSONArray jsonArray = array;
        
        try (FileWriter file = new FileWriter("C:\\Users\\Zack\\Documents\\GitHub\\SOFT252CW\\DoctorApplication\\data\\dataJSON.json")){
            //file.flush();
            file.write(jsonArray.toJSONString());
            file.flush();
            
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return jsonArray;
    }
        
    
        
        
//        File file = new File("C:\\Users\\Zack\\Documents\\GitHub\\SOFT252CW\\DoctorApplication\\data\\dataJSON.json");
//        String result = "";
//        try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8.name())){
//            while(sc.hasNext()) {
//            result += sc.nextLine();
//            }
//        } catch (IOException e){
//            e.printStackTrace();
//        }
//        
//        return result;
    
}
