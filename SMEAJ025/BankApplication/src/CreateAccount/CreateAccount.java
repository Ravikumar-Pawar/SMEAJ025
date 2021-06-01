package CreateAccount;
import javax.swing.*;
import DAO.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateAccount extends JFrame{
    private JPanel createPanel;
    private JLabel Head;
    private JLabel nameLabel;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JTextField NameInput;
    private JTextField UsernameInput;
    private JPasswordField passwordInput;
    private JButton createButton;
    private JLabel msg;

    public CreateAccount(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(createPanel);
        this.pack();
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createAccountOnDB();

            }
        });
    }
    public void createAccountOnDB(){
            DAO dao=new DAO();
            boolean accountCreated=false;
            if(UsernameInput.getText().length()!=0) {
                dao.createAccount(UsernameInput.getText(), NameInput.getText(), new String(passwordInput.getPassword()));
                msg.setText("Message: Account Created Successfully");

            }

    }
}
