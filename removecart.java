package gadgetly;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class removecart extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					removecart frame = new removecart();
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
	public removecart() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 738);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(582, 174, 246, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter product id of product you want to remove :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(235, 176, 335, 16);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Remove Product");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String prod_id=textField.getText();
				int count = 0,flag=0;
				try {
					String url="jdbc:mysql://localhost:3306/gadgetly";
					String query="select prod_id from cart";
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery(query);
					while(rs.next())
					{
						String prod_id2=rs.getString("prod_id");
						if(prod_id2.equals(prod_id))
						{
							flag=1;
						}
					}
					if(flag==1)
					{
						String query2="delete from cart where prod_id="+prod_id;
						count=st.executeUpdate(query2);
						if(prod_id.equals("111")||prod_id.equals("222")||prod_id.equals("333")||prod_id.equals("444")||prod_id.equals("555")||prod_id.equals("666")||prod_id.equals("777"))
						{
							String query3="update phone set availability=availability+"+count+" where prod_id="+prod_id;
							count=st.executeUpdate(query3);
						}
						else if(prod_id.equals("1390")||prod_id.equals("3232")||prod_id.equals("4343")||prod_id.equals("5566")||prod_id.equals("6784")||prod_id.equals("8888")||prod_id.equals("9090")||prod_id.equals("9494"))
						{
							String query4="update tv set availability=availability+"+count+" where prod_id="+prod_id;
							count=st.executeUpdate(query4);
						}
						else if(prod_id.equals("435")||prod_id.equals("534")||prod_id.equals("564")||prod_id.equals("639")||prod_id.equals("742")||prod_id.equals("867"))
						{
							String query5="update laptop set availability=availability+"+count+" where prod_id="+prod_id;
							count=st.executeUpdate(query5);
						}
						else if(prod_id.equals("11")||prod_id.equals("22")||prod_id.equals("33")||prod_id.equals("44"))
						{
							String query6="update console set availability=availability+"+count+" where prod_id="+prod_id;
							count=st.executeUpdate(query6);
						}
						else if(prod_id.equals("1")||prod_id.equals("2")||prod_id.equals("3")||prod_id.equals("4")||prod_id.equals("5")||prod_id.equals("6")||prod_id.equals("7")||prod_id.equals("8"))
						{
							String query7="update earphone set availability=availability+"+count+" where prod_id="+prod_id;
							count=st.executeUpdate(query7);
						}
						else if(prod_id.equals("8581")||prod_id.equals("14948")||prod_id.equals("15747")||prod_id.equals("47265"))
						{
							String query8="update fitnessband set availability=availability+"+count+" where prod_id="+prod_id;
							count=st.executeUpdate(query8);
						}
					}
					else
						JOptionPane.showMessageDialog(null, "Item not in your cart");
					
					flag=0;
					rs.close();
					st.close();
					con.close();
				}
				catch(Exception e1) {JOptionPane.showMessageDialog(null,e1);}
				
			}
		});
		btnNewButton.setBounds(371, 263, 143, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Go to Cart");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cart c1=new cart();
				setVisible(false);
				c1.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(650, 263, 143, 25);
		contentPane.add(btnNewButton_1);
	}
}
