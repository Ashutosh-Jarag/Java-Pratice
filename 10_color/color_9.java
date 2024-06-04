import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class color_9 extends JFrame {

    public color_9() {
        super("Color Selection App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton selectColorButton = new JButton("Select Color");
        selectColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                Color selectedColor = JColorChooser.showDialog(null, "Select a Color", Color.WHITE);
                
                // If a color is selected, display it
                if (selectedColor != null) {
                    JOptionPane.showMessageDialog(null, "Selected Color: " + selectedColor, "Color Selected", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        JPanel panel = new JPanel();
        panel.add(selectColorButton);
        add(panel);

        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new color_9();
            }
        });
    }
}
