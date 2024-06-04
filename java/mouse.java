import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mouse {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Click Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse clicked at: (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}
