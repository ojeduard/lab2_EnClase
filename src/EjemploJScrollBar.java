import javax.swing.*;

public class EjemploJScrollBar {
    EjemploJScrollBar (){
        JFrame a = new JFrame("Ejemplo JFrame");
        JScrollBar b = new JScrollBar();
        b.setBounds(90, 90, 40, 90);
        a.add(b);
        a.setSize(300, 300);
        a.setLayout(null);
        a.setVisible(true);
        a.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        new EjemploJScrollBar();
    }
}
