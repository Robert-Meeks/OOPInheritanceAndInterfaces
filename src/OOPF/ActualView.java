package OOPF;

import java.awt.Color;

import javax.swing.JPanel;

public class ActualView extends JPanel {

	public ActualView() {
		setBackground(new Color(147, 75, 75));
		setBounds(6, 6, 230, 200);
		setLayout(null);
	}
}

// need to think about the outputs - I want 3-6 areas where instances can be added each there own panel. My innitial thought
// is to make the panels by default and then the program will add the instances. I guess the panel will be kept in a collection 
// i need to think about what iam going to show in each panel (ie when the user makes an instance of a computer what will they see)
// which comes down to what will they be able to do. the basics is i need a abstract class for the generic computer and then inheritance 
// and then for the printers use interfaces. I guess on/off connect/disconnet print 
