import javax.swing.*;

public class HelloWorld extends JFrame {
    private JPanel panel1;
    private JLabel IblMessagge;
    private JLabel IblMessagge2;
    //Petra was here now

    public HelloWorld() {
        setContentPane(panel1);
        pack();
    }

    public static void main(String[] args) {
        new HelloWorld().setVisible(true);
    }
}
