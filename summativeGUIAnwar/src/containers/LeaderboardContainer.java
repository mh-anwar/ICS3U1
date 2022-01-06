/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package containers;

import java.awt.Container;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import java.util.Iterator;
import java.util.List;
/**
 *
 * @author mohammad
 */
public class LeaderboardContainer extends javax.swing.JPanel{
    public LeaderboardContainer(Dimension MAIN_DIMENSION, Container MainContainer){
        try {
            getData();
        } catch (ProtocolException ex) {
            Logger.getLogger(LeaderboardContainer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LeaderboardContainer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void getData() throws MalformedURLException, ProtocolException, IOException{
        // This is an ACTUAL database, that contains real data
        // on https://nanwar.ca there are two separate DB's instead of a joint one, which was a big mistake
        // Here I use one database for leaderboard and user info
        URL url = new URL("https://database.deta.sh/v1/b0jecxqg/javaAppLeaderboard/query");
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setRequestMethod("POST"); // getting data

        // Set headers
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setRequestProperty("X-API-KEY", "b0jecxqg_S15M554iXHEDCegCNajfhj8wHwxeepFY");
        JSONObject leaderboardData = null;
        try (BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                leaderboardData = (JSONObject)JSONValue.parse(inputLine);
            }
        }
        /* I've tried for a long time to try and read JSON objects in Java
         * This is the first time I've manage to do it.
         */
        // Write data to a file (caching purposes)
        JSONArray leaderboard = (JSONArray) leaderboardData.get("items");
        System.out.println(leaderboard);
        
        Iterator itr = leaderboard.iterator();
        List<String> jsonValues = new ArrayList<String>();
        while(itr.hasNext()){
            System.out.println(itr.next());
            jsonValues.add(itr.next().toString());

        }
        Collections.sort(jsonValues);
        JSONArray sortedJsonArray = new JSONArray(jsonValues);
        System.out.println(sortedJsonArray);
    }
}
