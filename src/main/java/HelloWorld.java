import javax.swing.*;

public class HelloWorld extends JFrame {
    private JPanel panel1;
    private JLabel IblMessagge;
    private JLabel IblMessagge2;

    public HelloWorld() {
        setContentPane(panel1);
        pack();
    }

    //Amelie here
    private JLabel IblMessagge3;

    public static void main(String[] args) {
        new HelloWorld().setVisible(true);
    }
}
