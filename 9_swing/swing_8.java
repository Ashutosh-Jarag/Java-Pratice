import java.awt.*;
public class swing_8 {
    swing_8(){
        Frame f=new Frame();
        Button b1=new Button("f");
        b1.setBounds(100,50,50,50);
        f.add(b1);

        Button b2=new Button("h");
        b2.setBounds(100,101,55,50);
        f.add(b2);

        Button b3=new Button("u");
        b3.setBounds(100,150,80,50);
        f.add(b3);

        f.setSize(500,500);
        f.setVisible(true);
        f.setLayout(null);
    }   
    public static void main(String[] args) {
        new swing_8();
    }

}
