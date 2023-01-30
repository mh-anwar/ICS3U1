/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package containers;

import custom.components.Button;
import custom.components.GridConstraints;
import custom.components.Label;
import custom.components.PasswordContainer;
import custom.components.Textfield;
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
import java.util.regex.Pattern;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import javax.mail.internet.*;
import javax.swing.JDialog;
/**
 *
 * @author mohammad
 */
public class LoginContainer extends javax.swing.JPanel{
    public LoginContainer(Dimension MAIN_DIMENSION, Container MainContainer){
        // Set size, layout type of panel, then initialize components
        setBackground(MainContainer.getBackground());
        setForeground(MainContainer.getForeground());
        setFont(MainContainer.getFont());
        
        setSize(MAIN_DIMENSION);
        setLayout(new GridBagLayout());
        initComponents(MainContainer);
    }    

    private void initComponents(Container MainContainer){
        // The next few lines: create an element given parameters and set it's pos. on the page with GBC
        Label lblPageTitle = new Label("Login to Your Account", "h1");
        GridBagConstraints lblPageTitleConstraints = new GridConstraints(0, 0, 0, 1, false);

        Textfield txtEmail = new Textfield("Enter your Email");
        GridBagConstraints txtEmailConstraints = new GridConstraints(0, 1, 0, 1, false);
        
        PasswordContainer txtPass = new PasswordContainer("Enter your Password");
        GridBagConstraints txtPassConstraints = new GridConstraints(0, 2, 0, 1, false);
        // Java recognizes some HTML in JLabels
        // Create an unordered list (ul) with list elements (li)
        Label lblPassReq = new Label(
                "<html>Password must contain:"
                + "<ul>\n"
                + "    <li>Between 8 and 20 characters</li>\n"
                + "    <li>1 uppercase and 1 lowercase letter</li>\n"
                + "    <li>1 special character</li>\n"
                + "    <li>Must not be 'admin' or 'password'</li>\n"
                + "  </ul>"
                + "</html>");
        GridBagConstraints lblPassReqConstraints = new GridConstraints(0, 4, 0, 1, false);
        
        Label lblHelpMessage = new Label("");
        GridBagConstraints lblHelpMessageConstraints = new GridConstraints(0, 5, 0, 1, false);
        
        Button btnLogin = new Button("Login");
        GridBagConstraints btnLoginConstraints = new GridConstraints(0, 6, 0, 1, true);

        Button btnReturn = new Button("Return", true);
        GridBagConstraints btnReturnConstraints = new GridConstraints(0, 7, 0, 1, false);
        
        // Add all created elements to page
        this.add(lblPageTitle, lblPageTitleConstraints);
        this.add(txtEmail, txtEmailConstraints);
        this.add(txtPass, txtPassConstraints);
        this.add(lblPassReq, lblPassReqConstraints);
        this.add(lblHelpMessage, lblHelpMessageConstraints);
        this.add(btnLogin, btnLoginConstraints);
        this.add(btnReturn, btnReturnConstraints );
        
        // Listen for click on on btnReturn to display Main Container
        btnReturn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                setVisible(false);
                MainContainer.setVisible(true);
            }
        });        
        // Listen for click on on btnLogin to perform login action
        btnLogin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                try{
                    String emailInfo = txtEmail.getText();
                    char[] passArray = txtPass.getPassword();
                    String passString = new String(passArray);
                    validateLoginData(emailInfo, passString);
                    JSONArray loginData = getLoginData();
                    boolean userExists = checkUserExists(loginData, emailInfo, passString);
                    if(userExists){
                        System.out.println("YES");
                        JDialog dialog = new JDialog();
                        dialog.setTitle("Login Success");
                        dialog.setSize(300, 200);
                        dialog.add(new Label("Login Successfull!."));
                        dialog.setVisible(true);
                        returnToMain(MainContainer);
                    } else{
                        lblHelpMessage.setText("User does not exist");
                    }
                } catch(AddressException emailErr){
                    lblHelpMessage.setText("Email error: " + emailErr.getMessage());
                } catch(Exception error){
                    lblHelpMessage.setText(error.getMessage());
                }
            }
        });
    }
    
    private void validateLoginData(String email, String passString) throws AddressException, Exception{
        // Develop and test regexes: https://regex101.com/ 
        // Docs: https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
        // Declare and initialize Regexes for special character and number detection
        final Pattern SPECIAL_CHAR_PATTERN = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        final Pattern NUMBER_PATTERN = Pattern.compile("[0-9 ]", Pattern.CASE_INSENSITIVE);
        final Pattern LOWERCASE_PATTERN = Pattern.compile("[a-z ]");
        final Pattern UPPERCASE_PATTERN = Pattern.compile("[A-Z ]");
        // Create an "internet address" (email address) and validate it with library
        InternetAddress emailAddress = new InternetAddress(email);
        // If the email address is invalid and AdressException will be thrown
        emailAddress.validate(); 
        
        if(passString.trim().isEmpty() ){
            // Ensure that password isn't empty by trimming whitespace
            throw new Exception("Password must not be empty!");
        } else if(passString.length() < 8 || passString.length() > 20){
            // Ensure that the password is between 8 and 20 characters
            throw new Exception("Password must be between 8 and 20 characters");
        } else if(!SPECIAL_CHAR_PATTERN.matcher(passString).find()){
            // Match the password string to the pattern and find if any special characters exist
            throw new Exception("Password must have a special character");
        } else if(!NUMBER_PATTERN.matcher(passString).find()){
            // Match the password string to the pattern and find if any number characters exist
            throw new Exception("Password must have a number character.");
        } else if(passString.equals("admin") || passString.equals("password")){
            // Check if password is "admin" or "password" which are rejected keywords
            throw new Exception("Password must not be 'admin' or 'password'.");
        } else if(!LOWERCASE_PATTERN.matcher(passString).find()){
            // Match the password string to the pattern and find if any lowercase characters exist
            throw new Exception("Password must have a lowercase character.");
        } else if(!UPPERCASE_PATTERN.matcher(passString).find()){
            // Match the password string to the pattern and find if any uppercase characters exist
            throw new Exception("Password must have a uppercase character.");
        }
            
    }
    private JSONArray getLoginData() throws MalformedURLException, ProtocolException, IOException{
        // This is an ACTUAL database, that contains real data
        // on https://nanwar.ca there are two separate DB's instead of a joint one, which was a big mistake
        // Here I use one database for leaderboard and user info
        URL url = new URL("https://database.deta.sh/v1/b0jecxqg/javaAppLeaderboard/query");
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setRequestMethod("POST"); // getting data

        // Set headers
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setRequestProperty("X-API-KEY", "b0jecxqg_S15M554iXHEDCegCNajfhj8wHwxeepFY");
        JSONObject userData = null;
        try (BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                userData = (JSONObject)JSONValue.parse(inputLine);
            }
        }
        /* I've tried for a long time to try and read JSON objects in Java
         * This is the first time I've manage to do it.
         */
        // Write data to a file (caching purposes)
        JSONArray leaderboard = (JSONArray) userData.get("items");
        /*
        Iterator itr = leaderboard.iterator();
        List<String> jsonValues = new ArrayList<String>();

        Collections.sort(jsonValues);
        JSONArray sortedJsonArray = new JSONArray(jsonValues);*/
        return leaderboard;
    }
    private boolean checkUserExists(JSONArray userData, String userEmail, String userPassword){
        // Get each JSONObject from user data array, get name and rank, add it to columnData
        for (int i = 0; i < userData.size(); i++) {
            JSONObject object = (JSONObject) userData.get(i);
            String email = object.get("email").toString();
            if(email.equals(userEmail)){
                String password = object.get("password").toString();
                if(password.equals(userPassword)){
                    return true;
                }
            }
        }
        // If there is no match for user and password, return that the user existence is false
        return false;
    }
    private void returnToMain(Container MainContainer){
        setVisible(false);
        MainContainer.setVisible(true);
    }
}
