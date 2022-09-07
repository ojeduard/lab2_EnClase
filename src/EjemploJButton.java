import javax.swing.*;

public class EjemploJButton {
    public static void main(String[] args) {
        JFrame a = new JFrame("EjemploJButton");
        JButton b = new JButton("click me");
        b.setBounds(90, 100, 85, 20);
        a.add(b);
        a.setSize(600, 600);
        a.setLayout(null);
        a.setVisible(true);
        a.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
