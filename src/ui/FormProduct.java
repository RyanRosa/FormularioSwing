package ui;

import entities.Product;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormProduct extends JFrame{
    private JTextField txtNumberCode;
    private JPanel pnlFormProduct;
    private JTextField txtDescription;
    private JTextField txtPrice;
    private JTextField txtQuantity;
    private JButton btnConfirmar;
    private JLabel lblNumberCode;
    private JLabel lblDescription;
    private JLabel lblPrice;
    private JLabel lblQuantity;

    public FormProduct(){
        initializationComponents();
        allComponents();
    }
    public void initializationComponents(){
        setTitle("Tela de login");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(pnlFormProduct);
        setVisible(true);
    }
    public void allComponents(){
        btnConfirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Product product = new Product(txtNumberCode.getText(),txtDescription.getText(),txtPrice.getText(),txtQuantity.getText());
                JOptionPane.showMessageDialog(null, product.getAll());
            }
        });
    }
}
