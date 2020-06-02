package com.fixitup.MainApp;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel_Newproject extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public Panel_Newproject() {
		setBounds(186,11,662,546);
		
		textField = new JTextField();
		add(textField);
		textField.setColumns(10);
	}

}
