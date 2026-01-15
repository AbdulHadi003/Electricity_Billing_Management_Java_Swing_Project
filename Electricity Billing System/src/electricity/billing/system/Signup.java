
package electricity.billing.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Signup extends JFrame implements ActionListener {
    Choice loginASCho;
    TextField meterText,userNameText,nameText,passwordText;
    JButton create,back;
    
    Signup(){
        super("Signup Page");
        getContentPane().setBackground(new Color(168,203,255));
        
        JLabel createAs = new JLabel("Create Account As");
        createAs.setBounds(30,50,125,20);
        add(createAs);
        
        loginASCho = new Choice();
        loginASCho.add("Admin");
        loginASCho.add("Customer");
        loginASCho.setBounds(170,50,120,20);
        add(loginASCho);

        JLabel meterNo = new JLabel("Meter Number");
        meterNo.setBounds(30,100,125,20);
        meterNo.setVisible(false);
        add(meterNo);
        meterText = new TextField();
        meterText.setBounds(170,100,125,20);
        meterText.setVisible(false);
        add(meterText);

        JLabel userName = new JLabel("UserName");
        userName.setBounds(30,140,125,20);
        add(userName);
        userNameText = new TextField();
        userNameText.setBounds(170,140,125,20);
        add(userNameText);


        JLabel name = new JLabel("Name");
        name.setBounds(30,180,125,20);
        add(name);
        nameText = new TextField("");
        nameText.setBounds(170,180,125,20);
        add(nameText);
        
        meterText.addFocusListener(new FocusListener(){
            public void focusGained(FocusEvent fe){}
            
             public void focusLost(FocusEvent fe) {
                 
                try {
                    connection c  = new connection();
                    ResultSet rs = c.s.executeQuery("select * from login where meter_no = '"+meterText.getText()+"'");
                    while(rs.next()) {
                        nameText.setText(rs.getString("name"));
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
         }

        });

        JLabel password = new JLabel("Password");
        password.setBounds(30,220,125,20);
        add(password);

        passwordText = new TextField();
        passwordText.setBounds(170,220,125,20);
        add(passwordText);


        loginASCho.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String user = loginASCho.getSelectedItem();
                if (user.equals("Customer")){
                    nameText.setEditable(false);
                    meterNo.setVisible(true);
                    meterText.setVisible(true);
                }
                else {
                    meterNo.setVisible(false);
                    meterText.setVisible(false);
                    nameText.setEditable(true);
                }

            }
        });

        create = new JButton("Create");
        create.setBackground(new Color(66,127,219));
        create.setForeground(Color.black);
        create.setBounds(50,285,100,25);
        create.addActionListener(this);
        add(create);

        back = new JButton("Back");
        back.setBackground(new Color(66,127,219));
        back.setForeground(Color.black);
        back.setBounds(180,285,100,25);
        back.addActionListener(this);
        add(back);

        ImageIcon boyIcon = new ImageIcon(ClassLoader.getSystemResource("icon/signup.jpg"));
        Image boyImg = boyIcon.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon boyIcon2 = new ImageIcon(boyImg);
        JLabel boyLabel = new JLabel(boyIcon2);
        boyLabel.setBounds(320,30,250,250);
        add(boyLabel);


        setSize(600,380);
        setLocation(500,200);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== create) {
            String atype = loginASCho.getSelectedItem();
            String susername = userNameText.getText();
            String sname = nameText.getText();
            String spassword = passwordText.getText();
            String smeter = meterText.getText();
            try{
                String query = null;
                connection c =new connection();
                if(atype.equals("Admin")){
                query = "insert into login values('"+smeter+"', '"+susername+"',  '"+sname+"',  '"+spassword+"',  '"+atype+"')";
                }else{
                     if(sname.isEmpty()) {
                JOptionPane.showMessageDialog(null,"Meter number not found. Please enter a valid meter number.");
                return;
            }
                    query ="update login set username = '"+susername+"',password = '"+spassword+"', user = '"+atype+"' where meter_no = '"+smeter+"'";
                    int rowsAffected = c.s.executeUpdate(query);
            
            if(rowsAffected > 0) {
                JOptionPane.showMessageDialog(null,"Account created successfully");
            } else {
                JOptionPane.showMessageDialog(null,"Meter number not found!");
                return;
            }
                }                
                setVisible(false);
                new Login();
            }catch(Exception E){
                System.out.println(E.getMessage());
            }
        }
        else if (e.getSource()==back) {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}