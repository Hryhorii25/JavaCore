package ГрафікаJAVA;

import javax.swing.*;
import java.awt.*;

//Програма створення буферу обміну для копіювання строки у графічному вікні JAVA
public class AWT17DragAndDrop {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        JTextField jTextField = new JTextField(10);
        JTextField jTextField1 = new JTextField(10);
        jTextField.setDragEnabled(true);
        jTextField1.setDragEnabled(true);
        jPanel.add(jTextField);
        jPanel.add(jTextField1);
        jFrame.revalidate();
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