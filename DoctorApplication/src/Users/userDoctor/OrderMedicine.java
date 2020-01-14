/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users.userDoctor;

import Main.DataController;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Zack
 */
public class OrderMedicine {
    
    //Creates a new medicine for the secretary to order.
    public void AppendMedsToFile(String quantity, String name){
        
        JSONObject newMedicine = new JSONObject();
        JSONArray medicines = new JSONArray();
        
        JSONArray jsonArray = DataController.getJSONData();
        
        
        for (int i = 0; i < jsonArray.size(); i++){
                   
            try{
                JSONObject curUser = (JSONObject) jsonArray.get(i);
                medicines = (JSONArray) curUser.get("Medicines");
                
                
                newMedicine.put("quantity", quantity);
                newMedicine.put("name", name);
                newMedicine.put("ordered", false);
                
                medicines.add(newMedicine);
                
            
                break;
                     
            }
            catch(Exception e){
                continue;
            }            
                    
        }
        //jsonArray.add(doctorFeedback);
        //System.out.println(jsonArray);
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
