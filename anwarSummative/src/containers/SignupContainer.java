/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package containers;

import custom.components.Button;
import custom.components.GridConstraints;
import custom.components.Label;
import custom.components.PasswordContainer;
import custom.components.RadioGroup;
import custom.components.Textfield;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Pattern;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;      
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JDialog;
import org.json.simple.JSONObject;

/**
 *
 * @author mohammad
 */
public class SignupContainer extends javax.swing.JPanel{
    public SignupContainer(Dimension MAIN_DIMENSION, Container MainContainer){
        // Set size, layout type of panel, then initialize components
        setBackground(MainContainer.getBackground());
        setForeground(MainContainer.getForeground());
        setFont(MainContainer.getFont());
        
        setSize(MAIN_DIMENSION);
        setLayout(new GridBagLayout());
        initComponents(MainContainer);
    }
    private void initComponents(Container MainContainer){
        // The next few lines: create an element given parameters and set it's pos.
        Label lblPageTitle = new Label("Signup for an Account", "h1");
        GridBagConstraints lblPageTitleConstraints = new GridConstraints(0, 0, 0, 2, false);
        
        Textfield txtFirstName = new Textfield("Enter your First Name");
        GridBagConstraints txtFirstNameConstraints = new GridConstraints(0, 1, 0, 2, false);
        
        Textfield txtLastName = new Textfield("Enter your Last Name");
        GridBagConstraints txtLastNameConstraints = new GridConstraints(0, 2, 0, 2, false);

        Textfield txtEmail = new Textfield("Enter your Email");
        GridBagConstraints txtEmailConstraints = new GridConstraints(0, 3, 0, 2, false);
      
        PasswordContainer txtPass = new PasswordContainer("Enter your Password");
        GridBagConstraints txtPassConstraints = new GridConstraints(0, 4, 0, 2, false);
        
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
        GridBagConstraints lblPassReqConstraints = new GridConstraints(0, 5, 0, 2, false);
        
        Label lblHelpMessage = new Label("");
        GridBagConstraints lblHelpMessageConstraints = new GridConstraints(0, 6, 0, 2, false);
        
        RadioGroup radThemeSelect = new RadioGroup("Light Mode", "Dark Mode", "Choose a theme:");
        GridBagConstraints radThemeSelectConstraints = new GridConstraints(0, 8, 0, 2, true);
        
        Button btnSignup = new Button("SignUp");
        GridBagConstraints btnSignupConstraints = new GridConstraints(0, 10, 0, 2, true);

        Button btnReturn = new Button("Return", true);
        GridBagConstraints btnReturnConstraints = new GridConstraints(0, 11, 0, 2, false);
        
        // Add all created elements to page
        this.add(lblPageTitle, lblPageTitleConstraints);
        this.add(txtFirstName, txtFirstNameConstraints);
        this.add(txtLastName, txtLastNameConstraints);
        this.add(txtEmail, txtEmailConstraints);
        this.add(txtPass, txtPassConstraints);
        this.add(lblPassReq, lblPassReqConstraints);
        this.add(lblHelpMessage, lblHelpMessageConstraints);
        this.add(radThemeSelect, radThemeSelectConstraints);
        this.add(btnSignup, btnSignupConstraints);
        this.add(btnReturn, btnReturnConstraints );
        
        // Copied from LoginContainer - maybe this should be its own component
        // Listen for click on on ReturnBtn to display Main Container
        btnReturn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                returnToMain( MainContainer);
            }
        });
        // Listen for click on on btnLogin to perform login action
        btnSignup.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                try{
                    // Get all the data
                    String emailInfo = txtEmail.getText();
                    char[] passArray = txtPass.getPassword();
                    String passString = new String(passArray);
                    String firstName = txtFirstName.getText();
                    String lastName = txtLastName.getText();
                    int mode = radThemeSelect.getSelectedRadioButton();
                    // Validate data
                    validateLoginData(emailInfo, passString);
                    // Sign the user up
                    boolean signUpSuccess = signUserUp( emailInfo, passString, firstName, lastName, mode);
                    // If successfull display success message and return to main page
                    if(signUpSuccess){
                        writeProgramData(mode, firstName);
                        JDialog dialog = new JDialog();
                        dialog.setTitle("Signup Success");
                        dialog.setSize(300, 200);
                        dialog.add(new Label("Signup Successfull!."));
                        dialog.setVisible(true);
                        returnToMain( MainContainer);
                    } else{
                        lblHelpMessage.setText("Sorry, you cannot sign up!");
                    }
                } catch(AddressException emailErr){
                    lblHelpMessage.setText("Email error: " + emailErr.getMessage());
                } catch(Exception error){
                    lblHelpMessage.setText(error.getMessage());
                }
            }
        });
    }
    private void returnToMain(Container MainContainer){
        setVisible(false);
        MainContainer.setVisible(true);
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
    private void writeProgramData(int mode, String firstName){
        try {
            File programDataFile = new File("src/programData.txt");
            FileWriter fileWriter = new FileWriter(programDataFile);
            BufferedWriter fileBuffer = new BufferedWriter(fileWriter);
            fileBuffer.write(Integer.toString(mode));
            fileBuffer.newLine();
            fileBuffer.write(firstName);
            fileBuffer.close();
        System.out.println("Done writing to file");
      } catch (IOException e) {
            e.printStackTrace();
      }
    }
    private boolean signUserUp(String email, String password, String firstName, String lastName, int mode){
        // Format first and last name to title case
        // Get the first letter of each string, convert to upper case then append the rest of the string, all lowercase
        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
        JSONObject item = new JSONObject();
        item.put("key", firstName);
        item.put("email", email);
        item.put("games", "");
        item.put("lost", 1);
        item.put("won", 1);
        item.put("mode", mode);
        item.put("move", 0);
        item.put("password", password);
        item.put("profileinfo", " ");

        final String DATABASE_URL = "https://database.deta.sh/v1/b0jecxqg/javaAppLeaderboard/items";
        
        JSONObject formattedPayload = new JSONObject();
        formattedPayload.put("item", item);
        String formattedPayloadString = formattedPayload.toString();
        try {
          URL url = new URL(DATABASE_URL);
          HttpURLConnection connection = (HttpURLConnection) url.openConnection();
          connection.setRequestMethod("POST");
          // Set headers
          connection.setRequestProperty("Content-Type", "application/json");
          connection.setRequestProperty("X-API-KEY", "b0jecxqg_S15M554iXHEDCegCNajfhj8wHwxeepFY");
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
}
