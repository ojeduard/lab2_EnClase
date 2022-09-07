import javax.swing.*;
import java.awt.*;

public class EjemploJPanel {
    EjemploJPanel(){
        JFrame a = new JFrame("Ejemplo JPanel");
        JPanel p = new JPanel();
        p.setBounds(40, 70, 200, 200);
        JButton b = new JButton("click me");
        b.setBounds(60, 50, 80, 40);
        p.add(b);
        a.add(p);
        a.setSize(400, 400);
        a.setLayout(null);
        a.setVisible(true);
        a.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        p.setBackground(Color.blue);

    }

    public static void main(String[] args) {
        new EjemploJPanel();
    }
}
