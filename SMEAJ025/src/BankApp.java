import javax.swing.*;
import DAO.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import CreateAccount.CreateAccount;
public class BankApp extends JFrame{
    private JPanel mainPanel;

    private JLabel userNameLabel;
    private JTextField userNameInput;
    private JLabel passwordLabel;
    private JButton loginButton;
    private JPasswordField passwordInput;
    private JButton signUpButton;

    public BankApp(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userName=userNameInput.getText();
                String password=new String(passwordInput.getPassword());
                DAO dao=new DAO();
                dao.login(userName,password);


            }
        });
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //create account
                CreateAccount createAccount =new CreateAccount("Create");
                createAccount.setVisible(true);
                createAccount.createAccountOnDB();
                createAccount.setSize(400,400);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame=new BankApp("Login/SingUp");
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(400,200);

    }

}
