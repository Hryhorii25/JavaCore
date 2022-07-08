package ГрафікаJAVA;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Гріша on 21.02.2018.
 */
public class Swing12Sliders {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);

        // Додавання елементу подібний до регулятора гучності (Sliders)
        JSlider jSlider = new JSlider(JSlider.HORIZONTAL,0,100,20);
        jPanel.add(jSlider);

        //Виставляє розмітку ділення регулятора(Sliders)
        jSlider.setMinorTickSpacing(10);
        jSlider.setMajorTickSpacing(20);
        jSlider.setPaintLabels(true);

//Даний метод задає стоге регулювання(тільки по значеннях)
        jSlider.setSnapToTicks(true);


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





