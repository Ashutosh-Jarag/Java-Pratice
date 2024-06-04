import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mevent {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Event Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JLabel label = new JLabel("Move the mouse here");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(label, BorderLayout.CENTER);

        label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse clicked at: (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse pressed at: (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("Mouse released at: (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse entered the label");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse exited the label");
            }
        });

        frame.setVisible(true);
    }
}
