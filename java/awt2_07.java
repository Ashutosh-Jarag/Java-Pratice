import java.awt.*;

public class awt2_07 {
    awt2_07() {
        Frame f = new Frame();
        Label l = new Label("ID");
        TextField t = new TextField();
        Button b = new Button("CLICK ME");

        // Radio Button
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox radio1 = new Checkbox("Male", cbg, false);
        Checkbox radio2 = new Checkbox("Female", cbg, false);

        // Checkbox
        Checkbox checkbox = new Checkbox("Check Me!");

        l.setBounds(20, 80, 80, 30);
        t.setBounds(10, 100, 80, 30);
        b.setBounds(100, 100, 80, 30);
        radio1.setBounds(10, 150, 80, 30);
        radio2.setBounds(100, 150, 80, 30);
        checkbox.setBounds(10, 200, 100, 30);

        f.add(t);
        f.add(l);
        f.add(b);
        f.add(radio1);
        f.add(radio2);
        f.add(checkbox);

        f.setSize(400, 500);
        f.setTitle("AWT Example");
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        awt2_07 a = new awt2_07();
    }
}
