package ГрафікаJAVA;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Created by Гріша on 21.02.2018.
 */
public class Swing11КомпонентивиборуRadioButtonRadioGroupComponentBoxBorder {

    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        jPanel.add(new JCheckBox("box label"));
        JRadioButton jRadioButton1 = new JRadioButton("one");
        JRadioButton jRadioButton2 = new JRadioButton("two");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);
        jPanel.add(jRadioButton1);
        jPanel.add(jRadioButton2);

        Border border = BorderFactory.createEtchedBorder();

       JComboBox <String> jComboBox =new JComboBox();
       jComboBox.addItem("one");
       jComboBox.addItem("two");
       jComboBox.addItem("three");
       jPanel.add(jComboBox);
       jPanel.setBackground((Color) border);









    }

    static JFrame getFrame(){
        JFrame jFrame = new JFrame(){};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2-250,dimension.height/2-150,500,300);
        return jFrame;
    }}