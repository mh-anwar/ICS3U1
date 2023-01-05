/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package custom.components;

import java.awt.GridBagConstraints;
import java.awt.Insets;

/**
 *
 * @author mohammad
 */
/* While it seems silly to extend GridBagConstraints and change nothing about it's implementation
 * This implementation, allows me to only have to pass 3 parameters. If the normal way was used, either 0 or 9 had to passed.
*/
public class GridConstraints extends GridBagConstraints{
    public GridConstraints(int gridX, int gridY, double weightX, int gridWidth, boolean inset){
        gridx = gridX;
        gridy = gridY;
        gridwidth = gridWidth;
        weightx = weightX;
        fill = GridConstraints.VERTICAL;
        if(inset == true){
            insets = new Insets(15,0,0,0);
        }
    }
    // what is this??
    @Override
    public Object clone() {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
