//@sadam 
// !i have directly taken this program from book and executed for demonstration purpose only!
import java.util.*;
import java.awt.event.*;
public class HelloAWT extends Frame { 
Label contents;
Button dispbutton;
public HelloAWT() { 
setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
contents = new Label(" "); 
add(contents); 
dispbutton = new Button("Show"); 
dispbutton.addActionListener(new DispButtonListener()); 
add(dispbutton);
}
class DispButtonListener implements ActionListener { 
public void actionPerformed(ActionEvent e) {
contents.setText("Hello World!");
}
}
public static void main (String[] args) {
HelloAWT f = new HelloAWT();
f.setTitle("Hello!");
f.setSize(400,150);
f.setVisible(true);
}
}
