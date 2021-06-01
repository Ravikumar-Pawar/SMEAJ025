package Dashboard;

import javax.swing.*;

public class Dashboard extends JFrame {
    private JPanel dashboardPanel;
    private JTextField greetingLabel;
    private JLabel Name;
    private JLabel Balance;

    public Dashboard(String title,String name,float balance){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(dashboardPanel);
        this.pack();
        greetingLabel.setText("Welcome "+ name);
        Name.setText("Name:"+name);
        Balance.setText("Balance:"+balance);


    }
}
