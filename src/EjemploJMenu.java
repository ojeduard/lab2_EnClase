import javax.swing.*;

public class EjemploJMenu {
    JMenu menu;
    JMenuItem a1, a2;

    EjemploJMenu(){
        JFrame a = new JFrame("Example");
        menu = new JMenu("options");
        JMenuBar m1 = new JMenuBar();
        a1 = new JMenuItem("example");
        a2 = new JMenuItem("example");
        menu.add(a1);
        menu.add(a2);
        m1.add(menu);
        a.setJMenuBar(m1);
        a.setSize(400, 400);
        a.setLayout(null);
        a.setVisible(true);
        a.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new EjemploJMenu();
    }
}
