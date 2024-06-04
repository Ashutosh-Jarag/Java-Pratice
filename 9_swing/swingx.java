import javax.swing.*;

public class swingx {
    swingx() {
        JFrame frame = new JFrame();
        JLabel label = new JLabel("ID");
        JTextField textField = new JTextField();
        JButton button = new JButton("CLICK ME");

        // Radio Buttons
        JRadioButton radio1 = new JRadioButton("Male");
        JRadioButton radio2 = new JRadioButton("Female");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radio1);
        buttonGroup.add(radio2);

        // Checkbox
        JCheckBox checkBox = new JCheckBox("Check Me!");

        label.setBounds(20, 80, 80, 30);
        textField.setBounds(10, 100, 80, 30);
        button.setBounds(100, 100, 100, 30);
        radio1.setBounds(10, 150, 80, 30);
        radio2.setBounds(100, 150, 80, 30);
        checkBox.setBounds(10, 200, 100, 30);

        frame.add(textField);
        frame.add(label);
        frame.add(button);
        frame.add(radio1);
        frame.add(radio2);
        frame.add(checkBox);

        frame.setSize(400, 500);
        frame.setTitle("Swing Example");
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        swingx s = new swingx();
    }
}
