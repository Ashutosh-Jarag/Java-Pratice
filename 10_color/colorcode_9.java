import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FrameColor implements ActionListener
{
 static JFrame frame;
static JButton button = new JButton("Change Color");
 //Driver function
 public static void main(String args[])
 {
//Create a frame
frame = new JFrame("Change Frame Background");
frame.setSize(400,400);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setBackground(Color.white);
frame.setLayout(new FlowLayout());
//Create an object
FrameColor obj = new FrameColor();
//Create a button
button.addActionListener(obj);
frame.add(button);
//Display the fame
frame.setVisible(true);
 }
 //Function to create color dialog box and change color
 public void actionPerformed(ActionEvent e)
 {
//Create a color dialog box
JColorChooser color_box= new JColorChooser();
Color color=color_box.showDialog(frame,"Select a Color",Color.white);
//Change background color of frame
 //button.setBackground(color);
frame.getContentPane().setBackground(color);
 }
}