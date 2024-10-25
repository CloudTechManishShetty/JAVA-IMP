import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class invalidPasswordException extends Exception
{}

class Slip_4Q2 extends JFrame implements ActionListener
{
    JLabel user,pass;
    JTextField userTextField;
    JPasswordField userPassField;
    JButton login,end;
    static int cnt=0;
    
    Slip_4Q2()
    {
        user=new JLabel("UserName: ");
        pass=new JLabel("Password: ");
        userTextField=new JTextField(20);
        userPassField=new JPasswordField(20); 
        login=new JButton("Login");
        end=new JButton("End");
        login.addActionListener(this);
        end.addActionListener(this);
        setLayout(new GridLayout(3,2));
        add(user);
        add(userTextField);
        add(pass);
        add(userPassField);
        add(login);
        add(end);
        setTitle("Login Check");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==end)
            System.exit(0);
        if(e.getSource()==login)
        {
            try{
                String name=userTextField.getText();
                String psw=new String(userPassField.getPassword());

                if(name.compareTo(psw)==0)
                {
                    JOptionPane.showMessageDialog(null,"Login Successfull","Login",JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }
                else
                    throw new invalidPasswordException();
            }
            catch(Exception e1)
            {
                cnt++;
                JOptionPane.showMessageDialog(null,"Login Failed","Login",JOptionPane.ERROR_MESSAGE);
                userTextField.setText("");
                userPassField.setText("");
                if(cnt==3)
                {
                    JOptionPane.showMessageDialog(null,"3 Attempts Over!","Login",JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                }
            }
        }
    }
    
    public static void main(String args[])
    {
         new Slip_4Q2();
    }
    
}