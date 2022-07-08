package ГрафікаJAVA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//У даній програмі показано як запустити екшин на кнопці за допомогою комбінації клавіш
public class Swing7KeyStroke{
    static JFrame jFrame = getFrame();
    static  JPanel jPanel = new JPanel();
    public static void main(String[] args) {
       jFrame.add(jPanel);
        AbstractAction myAction = new MyAction();
       JButton jButton = new JButton(myAction);
       jButton.setText("submit");
       jPanel.add(jButton);

       KeyStroke keyStroke = KeyStroke.getKeyStroke("Ctrl b");//Даний запис використовується для запуску екшина на кнопці при нажатті на комбінацію клавіш
InputMap inputMap = jPanel.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
inputMap.put(keyStroke,"changeCorol");
ActionMap actionMap = jPanel.getActionMap();
actionMap.put("changeCorol",myAction);


    }

    static class MyAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e) {
            jPanel.setBackground(Color.BLUE);

        }
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
