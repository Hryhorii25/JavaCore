package ГрафікаJAVA;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Гріша on 21.02.2018.
 */
//В даній програмі показано основні способи вводу тексту у графічне вікно
public class Swing10ТекстовіПоляJTextFieldJPasswordFieldJTextAreaScrollPane {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        JLabel jLabel = new JLabel("lable");
        jPanel.add(new TextField(20));
        jPanel.add(jLabel);

        jPanel.add(new JPasswordField(20));

        JTextArea jTextArea = new JTextArea(10,10);
        jTextArea.setLineWrap(true);
        jPanel.add(jTextArea);


        jPanel.revalidate();





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