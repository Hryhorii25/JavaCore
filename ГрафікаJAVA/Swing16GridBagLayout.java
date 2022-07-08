package ГрафікаJAVA;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Гріша on 21.02.2018.
 */

//GridBagLayout це параметер який дозволяє розміщати елементи на формі за допомогою клітинок,
// розбити форму на клітинки і вказувати компонентам де вони будуть розміщені  скільки кліток займати
public class Swing16GridBagLayout {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
      GridBagLayout gridBagLayout = new GridBagLayout();
      jPanel.setLayout(gridBagLayout);

      //В даному блоці задаються елементи розміщення елемента та його розміри
      GridBagConstraints constraints1 = new GridBagConstraints();
      constraints1.weightx=0;
      constraints1.weighty=0;
      constraints1.gridx = 0;
      constraints1.gridy = 0;
      constraints1.gridheight = 2;
      constraints1.gridwidth = 2;
      jPanel.add(new JTextArea(4,20),constraints1);
      jPanel.revalidate();




        GridBagConstraints constraints2 = new GridBagConstraints();
        constraints2.weightx=0;
        constraints2.weighty=0;
        constraints2.gridx = 2;
        constraints2.gridy = 0;
        constraints2.gridheight = 1;
        constraints2.gridwidth = 2;
        jPanel.add(new JButton("Button component"),constraints2);
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


