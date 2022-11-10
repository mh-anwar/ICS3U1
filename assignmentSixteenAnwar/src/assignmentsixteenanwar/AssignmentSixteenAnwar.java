/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentsixteenanwar;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.parser.ParseException;
/*
 *
 * @author s201076699
 */
public class AssignmentSixteenAnwar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        try {
            JSONObject jsonO = (JSONObject)jsonParser.parse(new FileReader("U:\\Documents\\NetBeansProjects\\assignmentSixteenAnwar\\src\\assignmentsixteenanwar\\data.json"));
            JSONArray alldata = (JSONArray) jsonO.get("ctRoot");
            System.out.println(alldata);
            for(int i = 0; i< jsonO.length(); i++){
                JSONObject explrObject = alldata.getJSONObject(i);
                System.out.println(explrObject);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AssignmentSixteenAnwar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
