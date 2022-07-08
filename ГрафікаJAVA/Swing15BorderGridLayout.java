package ГрафікаJAVA;

import javax.swing.*;
import java.awt.*;

//При створенні графічних вікон в JAVA  елементи які є у них не можна переміщати як хочеш. Є строгі праметри розміщення компонентів вони називаються
// Layaut  це є параметер розміщення компонентів у вікні є декілька стандартних параметрів Layaut
// за замовчування втановлений FlouLayaut він розміщує елементи попорядку починаючи з верху вікна

public class Swing15BorderGridLayout {
    static JFrame jFrame = getFrame();


    public static void main(String[] args) {

        // BorderGrid Laout  це параметер при якому компоненти можна розміщувати по різних сторонах вікна
        //Даний блок прказує спосіб розташування елементів при BorderLaout

//       jFrame.add(new JButton("one"),BorderLayout.CENTER);
//       jFrame.add(new JButton("two"),BorderLayout.WEST);
//       jFrame.add(new JButton("three"),BorderLayout.NORTH);
//       jFrame.add(new JButton("four"),BorderLayout.EAST);
//       jFrame.add(new JButton("five"),BorderLayout.SOUTH);


  //Даний блок розбиває віно на таблицю  ділить компоненти так як цифри на калькуляторі
   JPanel jPanel =new JPanel();

   jFrame.add(jPanel);
   jPanel.setLayout(new GridLayout(2,2));
   jPanel.add(new JButton("one"));
   jPanel.add(new JButton("two"));
   jPanel.add(new JButton("three"));
   jPanel.add(new JButton("four"));



   //GridBagLayout це параметер який дозволяє розміщати елементи на формі за допомогою клітинок, розбити форму на клітинки і вказувати компонентам скільки кліток займати



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

