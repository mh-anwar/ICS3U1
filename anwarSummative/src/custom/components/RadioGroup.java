/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package custom.components;

import javax.swing.ButtonGroup;

/**
 *
 * @author mohammad
 */
public class RadioGroup extends javax.swing.JPanel{
    RadioBtn radFirstOption;
    RadioBtn radSecondOption ;
    public RadioGroup(String opt1, String opt2, String label) {
        setBackground(super.getBackground());
        setForeground(super.getForeground());
        setOpaque(false);
        
        Label lblRadioGroup = new Label(label );
        radFirstOption = new RadioBtn(opt1);
        radSecondOption = new RadioBtn(opt2);
        
        ButtonGroup radOptions = new ButtonGroup();
        radOptions.add(radFirstOption);
        radOptions.add(radSecondOption);
        
        radFirstOption.setSelected(true);
        
        this.add(lblRadioGroup);
        this.add(radFirstOption);
        this.add(radSecondOption);
      }
    public int getSelectedRadioButton(){
        if(radFirstOption.isSelected()){
            return 0;
        } else{
            return 1;
        }
    }
}
