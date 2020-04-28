package gadgetly;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.jdbc.CallableStatement;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class paymentgateway extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					paymentgateway frame = new paymentgateway();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public paymentgateway() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1346, 645);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Card Number : ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(264, 127, 127, 16);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(413, 126, 301, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Card Expiry : ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(278, 175, 100, 22);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(413, 177, 110, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("CVV : ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(560, 178, 46, 16);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(611, 177, 103, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Name on card : ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(260, 230, 127, 16);
		contentPane.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(413, 229, 228, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(413, 278, 116, 22);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("PIN : ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_4.setBounds(340, 279, 56, 16);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String cardno=textField.getText();
				String cvv=textField_2.getText();
				String pin=textField_4.getText();
				String url="jdbc:mysql://localhost:3306/gadgetly";
				String query="select amount from payment where cardno = "+cardno+" AND pin="+pin+" AND cvv="+cvv;
				
				int flag=0,total=0;
				try {
					Connection con = DriverManager.getConnection(url,"root","");
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery(query);

					if(rs.next())
					{
						int amount=rs.getInt("amount");
						String query2="select sum(price) as tot from cart";
						Statement st2=con.createStatement();
						ResultSet rs2=st2.executeQuery(query2);
						if(rs2.next())
						{
							flag=1;
							total=rs2.getInt("tot");
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Cart Empty");
						}
						st.close();
						st2.close();
						rs.close();
						rs2.close();
					}
					
					
					else
					{
						JOptionPane.showMessageDialog(null, "Invalid card details");
					}
					if(flag==1)
					{
						String query3="update payment set amount=amount-"+total+" where cardno="+cardno;
						Statement st3=con.createStatement();
						Statement st4=con.createStatement();
						int count=st3.executeUpdate(query3);
						String query4="delete from cart";
						count=st4.executeUpdate(query4);
						JOptionPane.showMessageDialog(null, "Payment successful.");
						flag=0;
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(509, 337, 97, 25);
		contentPane.add(btnNewButton);
	}
}
