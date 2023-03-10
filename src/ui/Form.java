package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form extends JFrame {
	private JPanel PnlForm;
	private JPasswordField pswPassword;
	private JTextField txtLogin;
	private JButton btnOk;
	private JLabel lblLogin;
	private JLabel lblPassword;

	public Form() {
		initComponents();
		allListeners();
	}

	public void initComponents() {
		setTitle("Welcome!");
		setSize(300, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(PnlForm);
		setVisible(true);
	}

	public void allListeners() {
		btnOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				validationLogin();
			}
		});
	}

	public void validationLogin() {
		String user = txtLogin.getText();
		String password = new String(pswPassword.getPassword());
		if (user.equals("admin") && password.equals("admin")) {
			Index index = new Index();
			index.setVisible(true);
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
	}
}
