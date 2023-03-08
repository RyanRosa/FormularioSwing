package ui;

import entities.User;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormUser extends JFrame{
    private JPanel pnlFormUser;
    private JTextField txtName;
    private JTextField txtLastName;
    private JTextField txtDepartment;
    private JTextField txtFunction;
    private JTextField txtLogin;
    private JButton btnEnviar;
    private JPasswordField pwdPassword;
    private JLabel lblName;
    private JLabel lblDepartment;
    private JLabel lblFunction;
    private JLabel lblLastName;
    private JLabel lblLogin;
    private JLabel lblPassword;
    public FormUser() {
        initializationComponents();
        allComponents();
}
    public void initializationComponents(){
        setTitle("Tela de login");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(pnlFormUser);
        setVisible(true);
    }
    public void allComponents(){
        btnEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                User user = new User(txtName.getText(), txtLastName.getText(), txtDepartment.getText(),txtFunction.getText(),txtLogin.getText(),new String(pwdPassword.getPassword()));

                JOptionPane.showMessageDialog(null,user.getAll());
            }
        });
    }
}
