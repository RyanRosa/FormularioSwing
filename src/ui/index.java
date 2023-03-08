package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class index extends JFrame{
    private JPanel pnlIndex;
    private JButton btnUserRegistration;
    private JButton btnProductRegistration;
public index() {
    initializationComponents();
    allComponents();
}
    public void initializationComponents(){
        setTitle("Tela de login");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(pnlIndex);
        setVisible(true);
    }

    public void allComponents(){
    btnUserRegistration.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            FormUser fu = new FormUser();
            fu.dispose();
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
