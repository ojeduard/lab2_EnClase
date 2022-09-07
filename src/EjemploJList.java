import javax.swing.*;
import java.awt.*;

public class EjemploJList {
    EjemploJList(){
        JFrame a = new JFrame("Ejemplo List");
        DefaultListModel<String> l = new DefaultListModel<>();
        l.addElement("first item");
        l.addElement("second item");
        JList<String> b = new JList<>(l);
        b.setBackground(Color.blue);
        b.setBounds(100, 100, 75, 75);
        a.add(b);
        a.setSize(400, 400);
        a.setVisible(true);
        a.setLayout(null);
        a.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new EjemploJList();
    }
}
