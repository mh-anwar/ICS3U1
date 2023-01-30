/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package containers;

import anwarSummative.GlobalData;
import custom.components.Button;
import custom.components.Challenge;
import custom.components.GridConstraints;
import custom.components.Label;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import javax.swing.JScrollPane;
import javax.swing.JTable;
/**
 *
 * @author mohammad
 */
public class LeaderboardContainer extends javax.swing.JPanel{
    public LeaderboardContainer(Dimension MAIN_DIMENSION, Container MainContainer){
        setBackground(MainContainer.getBackground());
        setForeground(MainContainer.getForeground());
        setFont(MainContainer.getFont());
        
        setSize(MAIN_DIMENSION);
        setLayout(new GridBagLayout());
        JSONArray leaderboardData = null;
        try {
            leaderboardData = getData();
        } catch (ProtocolException ex) {
            Logger.getLogger(LeaderboardContainer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LeaderboardContainer.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents(MainContainer, leaderboardData);
    }
    private void initComponents(Container MainContainer, JSONArray leaderboardData){
        // Create column label string array
        String[] columnLabels = {"Name",  "Won"};
        // Create column data object with length of leaderboardData
        Object[][] columnData = new Object[leaderboardData.size()][];   
        // Get each JSONObject from leaderboard array, get name and rank, add it to columnData
        for (int i = 0; i < leaderboardData.size(); i++) {
            JSONObject object = (JSONObject) leaderboardData.get(i);
            String name = object.get("key").toString();
            String won = object.get("won").toString();
            columnData[i] = new Object[] {name, won };
        }
        
        // Provide JTable with columnData and columnLabels in order to create a table
        JTable table = new JTable(columnData, columnLabels);
        
        // The next few lines: create an element given parameters and set it's pos. on the page with GBC
        
        // Add table (viewport to JScrollPane which can be customized to use scrollbars; set it's pos. on page with GBC
        JScrollPane tableScrollPane = new JScrollPane(table);
        GridBagConstraints tableScrollPaneConstraints = new GridConstraints(0, 1, 0, 1, false);
        
        Button btnChallenge = new Button("Challenge", true);
        GridBagConstraints btnChallengeConstraints = new GridConstraints(0, 2, 0, 1, false);
        
        Button btnReturn = new Button("Return", true);
        GridBagConstraints btnReturnConstraints = new GridConstraints(0, 3, 0, 1, false);
        
        Label lblInfoMessage = new Label("<html>Alas, I am writing this at 11:47 and I have found out that Java doesnt allow PATCH HTTP Methods"
                + "<br>If I had known this, I would have never used an external database"
                + "<br>therefore the challenge feature wont work, in theory my code will work.</html>");
        GridBagConstraints lblInfoMessageConstraints = new GridConstraints(0, 10, 0, 5, false);
        
        // Add all created elements to page
        this.add(tableScrollPane, tableScrollPaneConstraints);
        this.add(btnChallenge, btnChallengeConstraints);
        this.add(btnReturn, btnReturnConstraints);
        this.add(lblInfoMessage, lblInfoMessageConstraints );
        
        // Copied from LoginContainer - maybe this should be its own component
        // Listen for click on on btnReturn to display Main Container
        btnReturn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                setVisible(false);
                MainContainer.setVisible(true);
            }
        });    
        // Listen for click on combo box challenge and call function to handle it
        btnChallenge.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Challenge challengeUI = new Challenge(MainContainer, leaderboardData);
            }
        });
    }
    private JSONArray getData() throws MalformedURLException, ProtocolException, IOException{
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
        return leaderboard;
    }
}
