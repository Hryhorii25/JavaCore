package МережаJAVA2Аплети;
import java.applet.*;
import java.awt.*;
import javax.swing.*;

//Аплети використовуються щоб запустити в браузері JAVA код

//Даний блок коду показує як створити аплет
public class HelloWorldAplet extends  JApplet {
    @Override
    public void init() {
       add(new JButton(getParameter("buttonName")));
    }

    public void paint(Graphics graphics) {
        graphics.drawString("Hellow World",30,50);

    }


}
