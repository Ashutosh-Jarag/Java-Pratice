import java.awt.*;
import java.awt.event.*;

public class AWTComponentsExample extends Frame implements ActionListener {
    // Components
    Button button;
    TextField textField;
    Checkbox checkbox;
    CheckboxGroup checkboxGroup;
    Checkbox checkbox1, checkbox2;
    Label label;

    // Constructor
    public AWTComponentsExample() {
        // Setting layout
        setLayout(new FlowLayout());

        // Adding components
        button = new Button("Click Me!");
        textField = new TextField(20);
        label = new Label("Select one:");
        checkboxGroup = new CheckboxGroup();
        checkbox1 = new Checkbox("Option 1", checkboxGroup, false);
        checkbox2 = new Checkbox("Option 2", checkboxGroup, false);
        checkbox = new Checkbox("Check Me!");

        add(button);
        add(textField);
        add(label);
        add(checkbox1);
        add(checkbox2);
        add(checkbox);

        // Adding action listener to button
        button.addActionListener(this);

        // Adding WindowListener to close the window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        // Setting frame properties
        setTitle("AWT Components Example");
        setSize(300, 200);
        setVisible(true);
    }

    // ActionListener implementation
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            // Displaying text from text field
            String text = textField.getText();
            System.out.println("Button Clicked! Text entered: " + text);

            // Checking the state of the checkbox
            if (checkbox.getState()) {
                System.out.println("Checkbox is checked!");
            } else {
                System.out.println("Checkbox is unchecked!");
            }

            // Getting selected checkbox from checkbox group
            Checkbox selectedCheckbox = checkboxGroup.getSelectedCheckbox();
            if (selectedCheckbox != null) {
                System.out.println("Selected option: " + selectedCheckbox.getLabel());
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        new AWTComponentsExample();
    }
}
