import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.swing.JButton ;
import java.swing.JFrame ;
import java.swing.JButton ;

public class mainApp {

	 public static void main ( String[] argv){
	        JFrame f = new JFrame("Test3");
	        JButton b11 = new JButton("(1,1)");
	        JButton b12 = new JButton("(1,2)");
	        JButton b21 = new JButton("(2,1)");
	        JButton b22 = new JButton("(2,2)");
	        JButton b31= new JButton("(3,1)");
	        JButton b32 = new JButton("(3,2)");
	        JPanel P = new JPanel();
	        P.setLayout( new GridLayout(3,2));
	        f.pack();
	        f.setVisible(true);

	    }
}
