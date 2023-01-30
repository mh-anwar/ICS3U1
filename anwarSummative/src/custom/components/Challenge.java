/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package custom.components;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JComboBox;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author mohammad
 */
public class Challenge extends javax.swing.JFrame{
    public Challenge(Container MainContainer, JSONArray leaderboardData){
        // Set size of JFrame, set layout type, center it and make it visible
        setSize(new Dimension(500,600));
        setLayout(new GridBagLayout());
        this.getContentPane().setBackground(MainContainer.getBackground());
        this.getContentPane().setForeground(MainContainer.getForeground());
        setLocationRelativeTo(null);
        initComponents(leaderboardData);
        setVisible(true);
    }
    private void initComponents(JSONArray leaderboardData){        
        // The next few lines: create an element given parameters and set it's pos. on the page with GBC
        String[] names = new String[leaderboardData.size()];
        for (int i = 0; i < leaderboardData.size(); i++) {
            JSONObject object = (JSONObject) leaderboardData.get(i);
            String name = object.get("key").toString();
            names[i] = name;
        }
        JComboBox<String> comboBoxChallenge = new JComboBox<>(names); 
        GridBagConstraints comboBoxChallengeConstraints = new GridConstraints(0, 1, 0, 1, false);
        
        Textfield txtGameResult = new Textfield("Enter Game Result");
        GridBagConstraints txtGameResultConstraints = new GridConstraints(0, 2, 0, 1, false);
        
        Label lblHelpMessage = new Label("");
        GridBagConstraints lblHelpMessageConstraints = new GridConstraints(0, 3, 0, 1, false);
        
        Button btnSubmit = new Button("Submit");
        GridBagConstraints btnSubmitConstraints = new GridConstraints(0, 4, 0, 1, true);
        
        Button btnReturn = new Button("Return", true);
        GridBagConstraints btnReturnConstraints = new GridConstraints(0, 5, 0, 1, false);

        // Add all created elements to page
        this.add(comboBoxChallenge, comboBoxChallengeConstraints);
        this.add(txtGameResult, txtGameResultConstraints);
        this.add(lblHelpMessage, lblHelpMessageConstraints);
        this.add(btnSubmit, btnSubmitConstraints);
        this.add(btnReturn, btnReturnConstraints );
        // Listen for click on on btnReturn to display Main Container
        btnReturn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                setVisible(false);
            }
        });
        // Listen for click on on btnReturn to display Main Container
        btnSubmit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String gameResult = txtGameResult.getText();
                String selectedPerson = (String) comboBoxChallenge.getSelectedItem();
                try {
                    validateData(gameResult);
                    submitData(selectedPerson, gameResult);
                } catch(Exception error){
                    lblHelpMessage.setText(error.getMessage());
                }
            }
        });    
    }
    private void validateData(String gameResult) throws Exception{
        if(gameResult.trim().isEmpty() ){
            // Ensure that password isn't empty by trimming whitespace
            throw new Exception("Result must not be empty!");
        } else if(!(gameResult.equals("won") || gameResult.equals("lost") ||gameResult.equals("draw"))){
            // Ensure that the password is between 8 and 20 characters
            throw new Exception("Result must be won, lost or draw.");
        } 
    }
    private boolean submitData(String selectedPerson, String gameResult){
        final String DATABASE_URL = "https://database.deta.sh/v1/b0jecxqg/javaAppLeaderboard/items/" + selectedPerson;
        JSONObject increment = new JSONObject();
        // Only update db for wins
        if(gameResult.equals("won")){
            increment.put("won", 1);
            JSONObject formattedPayload = new JSONObject();
            formattedPayload.put("increment", increment);
            String formattedPayloadString = formattedPayload.toString();
            try {
              URL url = new URL(DATABASE_URL);
              HttpURLConnection connection = (HttpURLConnection) url.openConnection();
              
              // Set headers
              connection.setRequestProperty("Content-Type", "application/json");
              connection.setRequestProperty("X-API-KEY", "b0jecxqg_S15M554iXHEDCegCNajfhj8wHwxeepFY");
              connection.setRequestProperty("X-HTTP-Method-Override", "PATCH");
              connection.setRequestMethod("POST");
              // I have come to a realization that patch HTTP methods dont work in Java
              connection.setDoOutput(true);
            byte[] payloadBytes = formattedPayloadString.getBytes();
            connection.setRequestProperty("Content-Length", Integer.toString(payloadBytes.length));
            connection.getOutputStream().write(payloadBytes);

              int status = connection.getResponseCode();
                System.out.println("here " + status);
              connection.disconnect();
                return true;
            } catch (Exception e) {
                System.out.println("EXCEPTION: " + e);
                return false;
            }
        }
        
        return false;
    }
}
