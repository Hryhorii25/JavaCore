package ГрафікаJAVA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Створення і робота з менюшками
public class Swing13Menu {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
jFrame.add(jPanel);
        //Створення меню
        JMenuBar jMenuBar = new JMenuBar();
   JMenu jMenu = new JMenu("file");
   JMenu jMenu1 = new JMenu("edit");
   jMenuBar.add(jMenu);
   jMenuBar.add(jMenu1);

   jMenu.add(new JMenuItem("Open"));
   jMenu.add(new JMenuItem("Save"));
   jMenu.add(new JMenuItem("Copy"));
   jMenu.add(new JMenuItem("Delete"));

   //Створення вкладених меню
   JMenu options = new JMenu("options");
   jMenu.add(options);
   options.add("1");
        options.add("2");
        options.add("3");


        //Вкаладення в меню компонентів (вибору, управління)
        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButtonMenuItem radioButtonMenuItem1 = new JRadioButtonMenuItem("Radio1");
        JRadioButtonMenuItem radioButtonMenuItem2 = new JRadioButtonMenuItem("Radio2");
        buttonGroup.add(radioButtonMenuItem1);
        buttonGroup.add(radioButtonMenuItem2);
        jMenu.add(radioButtonMenuItem1);
        jMenu.add(radioButtonMenuItem2);

//Створення PopupMenu (меню при натисканні правої кнопки миші)
        JPopupMenu jPopupMenu =new JPopupMenu();
        jPopupMenu.add(new JMenuItem("one"));
        jPopupMenu.add(new JMenuItem("two"));
        jPanel.setComponentPopupMenu(jPopupMenu);
//
        jMenu.addSeparator();


        //Приклад прописання логіки на кнопку в меню
    jMenu.add(new JMenuItem("Exit")).addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
System.exit(0);
       }
   });


   jFrame.setJMenuBar(jMenuBar);
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




