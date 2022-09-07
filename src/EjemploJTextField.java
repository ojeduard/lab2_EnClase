import javax.swing.*;

public class EjemploJTextField {
    public static void main(String[] args) {
        JFrame a = new JFrame("EjemploJTextField");
        JTextField b = new JTextField("JTextField utilizando Swing");
        b.setBounds( 50, 100, 200, 30);
        a.add(b);
        a.setSize(300, 300);
        a.setLayout(null);
        a.setVisible(true);
        a.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
