package OOPF;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Frame extends JFrame {

	
	
	public Frame() {
		getContentPane().setBackground(new Color(245, 245, 245));
		getContentPane().setLayout(null);
		
		JPanel pnlInput = new JPanel();
		pnlInput.setBackground(new Color(143, 188, 143));
		pnlInput.setBounds(6, 6, 292, 766);
		getContentPane().add(pnlInput);
		pnlInput.setLayout(null);
		
		Inputs inputs = new Inputs();
		pnlInput.add(inputs);
		
		JPanel pnlOutput = new JPanel();
		pnlOutput.setBackground(new Color(30, 144, 255));
		pnlOutput.setBounds(310, 6, 884, 766);
		getContentPane().add(pnlOutput);
		pnlOutput.setLayout(null);
		
		ActualView actualView = new ActualView();
		ClassView classView = new ClassView();
		
		JTabbedPane tabPnlOutput = new JTabbedPane(JTabbedPane.TOP);
		tabPnlOutput.setBounds(25, 25, 836, 720);
		pnlOutput.add(tabPnlOutput);
		setSize(1200, 800);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tabPnlOutput.addTab("Actual View", null, actualView, null);
		actualView.setLayout(null);
		tabPnlOutput.addTab("Class View", null, classView, null);
		classView.setLayout(null);
	}
}
