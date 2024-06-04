import java.awt.*;
public class awt_7 {
    awt_7(){
        Frame f= new Frame();
        Label l= new Label("id");
        Button b=new Button("CLICK ME");
        TextField t = new TextField();

        l.setBounds(20,80,80,30);
        t.setBounds(10,100,80,30);
        b.setBounds(100,100,80,30);

        f.add(t);
        f.add(l);
        f.add(b);

        f.setSize(400,500);
        f.setTitle("null");
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args){
        awt_7 a=new awt_7();
    }
}
