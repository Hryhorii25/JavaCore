package ГрафікаJAVA;

import javax.swing.*;
import java.awt.*;

//у даній програмі виключається параматер layout це дає можливість задавати розміщення компонентів на формі самостійно даний спосіб має ряд
// недоліків компоненти стають не адаптивні до форми вікна, текст в компонентах може некоректно виводитсь при зміні ромірів компонента
public class Swing17NoLayout {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
       jPanel.setLayout(null);//Виключення параметра layout
        JButton jButton = new JButton("submit");
        jButton.setBounds(50,50,100,50);//Данний код означає що буде створений компонент у місці кординат (x,y) розміри компонента ()
        jPanel.add(jButton);

    }



    static JFrame getFrame(){
        JFrame jFrame = new JFrame(){};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2-250,dimension.height/2-150,500,300);
        return jFrame;
    }
}
