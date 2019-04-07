import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {
    private JTextField textField;
    private JLabel lblNewLabel;
    String name;

    public  MyFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setBounds(100, 100, 450, 300);
        getContentPane().setLayout(null);

        JButton btnOk = new JButton("OK");
        btnOk.addActionListener(this);

        btnOk.setBounds(335, 11, 89, 23);
        getContentPane().add(btnOk);

        textField = new JTextField();
        textField.setBounds(10, 12, 315, 20);
        getContentPane().add(textField);
        textField.setColumns(10);

        lblNewLabel = new JLabel("Ща посчитаем!");
        lblNewLabel.setBounds(10, 146, 315, 14);
        getContentPane().add(lblNewLabel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        name = textField.getText();
        //lblNewLabel.setText("привет " + name);
        //lblNewLabel.setText("привет " + Calcu.calc(name));
        lblNewLabel.setText("Ответ: " + Calcu.calc(Input.inputnorm(name)));
        //lblNewLabel.setText("Ответ: " + Input.inputnorm(name));
    }
}
