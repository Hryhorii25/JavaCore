package ГрафікаJAVA;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Гріша on 21.02.2018.
 */
public class Swing14ToolBar {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        JToolBar jToolBar = new JToolBar("title");
     JButton one = new JButton("one");
     one.setToolTipText("first");
        jToolBar.add(one);
     jToolBar.add(new JButton("two"));
     jToolBar.add(new JButton("three"));
     jPanel.add(jToolBar);
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

