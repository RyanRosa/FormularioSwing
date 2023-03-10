package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Index extends JFrame {
	private JPanel pnlIndex;
	private JButton btnUserRegistration;
	private JButton btnProductRegistration;

	public Index() {
		initComponents();
		allComponents();
	}

	public void initComponents() {
		setTitle("Login");
		setSize(300, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(pnlIndex);
		setVisible(true);
	}

	public void allComponents() {
		btnUserRegistration.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FormUser fu = new FormUser();
				fu.setVisible(true);
			}
		});

		btnProductRegistration.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FormProduct fp = new FormProduct();
				fp.setVisible(true);
			}
		});
	}
}
