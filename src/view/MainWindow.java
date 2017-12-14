package view;

import javax.swing.*;

public class MainWindow {
	private JPanel mainPanel;
	private JTabbedPane tabbedPane1;
	private JComboBox klassenAuswahl;
	private JComboBox typAuswahl;
	private JComboBox objektAuswahl;
	private JPanel valuesPanel;
	private JPanel middlePanel;
	private JPanel selectionPanel;
	private JPanel inventoryPanel;
	private JPanel buttonPanel;
	private JPanel auswahl;
	private JButton aktionButton;
	private JTable waffen;
	private JTable rüstung;
	private JTable inventar;

	public MainWindow(){
		setUp();
	}

	private void setUp(){
		JFrame frame = new JFrame("MainWindow");
		frame.setContentPane(mainPanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}


}
