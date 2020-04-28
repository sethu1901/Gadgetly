package gadgetly;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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

public class fitnessbands extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fitnessbands frame = new fitnessbands();
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
	public fitnessbands() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1063, 775);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		Image img1=new ImageIcon(this.getClass().getResource("/samsmart.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img1));
		lblNewLabel.setBounds(169, 54, 123, 241);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Samsung Galaxy Fit e Smart Band  (Black Strap, Size : Regular)");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(12, 308, 447, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Rs. 2490");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(188, 337, 63, 16);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Add to Cart");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url="jdbc:mysql://localhost:3306/gadgetly";
				String query="select Availability from fitnessband where prod_id=8581";
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery(query);
					rs.next();
					String avail=rs.getString("Availability");
					if(avail.equals("0"))
					{
					JOptionPane.showMessageDialog(null, "Item out of stock");
					}
					else
					{
					String query2="update fitnessband set availability=availability-1 where prod_id=8581";
					Statement st2=con.createStatement();
					int count=st2.executeUpdate(query2);
					st2.close();
					String query4="select Model_name, price from fitnessband where prod_id=8581";
					Statement st4=con.createStatement();
					rs=st4.executeQuery(query4);
					rs.next();
					String prod_id="8581";
					String name=rs.getString("Model_name");
					String price=rs.getString("price");
					String query3="insert into cart values('" + prod_id + "','" + name + "','" + price + "')";
					Statement st3=con.createStatement();
					count=st3.executeUpdate(query3);
					st3.close();
					st4.close();
					}
					st.close();
					con.close();
					}
				catch(Exception e1)
				{e1.printStackTrace();}

			}
		});
		btnNewButton.setBounds(176, 366, 97, 25);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		Image img2=new ImageIcon(this.getClass().getResource("/miband.jpg")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img2));
		lblNewLabel_3.setBounds(747, 64, 142, 220);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Mi Band 3  (Black Strap, Size : Regular)");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(683, 308, 284, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Rs. 1799");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(792, 338, 74, 16);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton_1 = new JButton("Add to Cart");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url="jdbc:mysql://localhost:3306/gadgetly";
				String query="select Availability from fitnessband where prod_id=14948";
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery(query);
					rs.next();
					String avail=rs.getString("Availability");
					if(avail.equals("0"))
					{
					JOptionPane.showMessageDialog(null, "Item out of stock");
					}
					else
					{
					String query2="update fitnessband set availability=availability-1 where prod_id=14948";
					Statement st2=con.createStatement();
					int count=st2.executeUpdate(query2);
					st2.close();
					String query4="select Model_name, price from fitnessband where prod_id=14948";
					Statement st4=con.createStatement();
					rs=st4.executeQuery(query4);
					rs.next();
					String prod_id="14948";
					String name=rs.getString("Model_name");
					String price=rs.getString("price");
					String query3="insert into cart values('" + prod_id + "','" + name + "','" + price + "')";
					Statement st3=con.createStatement();
					count=st3.executeUpdate(query3);
					st3.close();
					st4.close();
					}
					st.close();
					con.close();
					}
				catch(Exception e1)
				{e1.printStackTrace();}
			}
		});
		btnNewButton_1.setBounds(769, 366, 97, 25);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		Image img3=new ImageIcon(this.getClass().getResource("/mismart.jpg")).getImage();
		lblNewLabel_6.setIcon(new ImageIcon(img3));
		lblNewLabel_6.setBounds(180, 404, 123, 227);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Mi Smart Band 3i  (Black Strap, Size : Regular)");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_7.setBounds(81, 629, 329, 16);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Rs. 1299");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_8.setBounds(188, 658, 74, 16);
		contentPane.add(lblNewLabel_8);
		
		JButton btnNewButton_2 = new JButton("Add to Cart");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url="jdbc:mysql://localhost:3306/gadgetly";
				String query="select Availability from fitnessband where prod_id=15747";
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery(query);
					rs.next();
					String avail=rs.getString("Availability");
					if(avail.equals("0"))
					{
					JOptionPane.showMessageDialog(null, "Item out of stock");
					}
					else
					{
					String query2="update fitnessband set availability=availability-1 where prod_id=15747";
					Statement st2=con.createStatement();
					int count=st2.executeUpdate(query2);
					st2.close();
					String query4="select Model_name, price from fitnessband where prod_id=15747";
					Statement st4=con.createStatement();
					rs=st4.executeQuery(query4);
					rs.next();
					String prod_id="15747";
					String name=rs.getString("Model_name");
					String price=rs.getString("price");
					String query3="insert into cart values('" + prod_id + "','" + name + "','" + price + "')";
					Statement st3=con.createStatement();
					count=st3.executeUpdate(query3);
					st3.close();
					st4.close();
					}
					st.close();
					con.close();
					}
				catch(Exception e1)
				{e1.printStackTrace();}

			}
		});
		btnNewButton_2.setBounds(176, 687, 97, 25);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		Image img4=new ImageIcon(this.getClass().getResource("/honorband.jpg")).getImage();
		lblNewLabel_9.setIcon(new ImageIcon(img4));
		lblNewLabel_9.setBounds(767, 442, 70, 189);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Honor Band 5  (Olive Green Strap, Size : Regular)");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_10.setBounds(630, 641, 353, 16);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Rs. 2299");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_11.setBounds(765, 670, 72, 16);
		contentPane.add(lblNewLabel_11);
		
		JButton btnNewButton_3 = new JButton("Add to Cart");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url="jdbc:mysql://localhost:3306/gadgetly";
				String query="select Availability from fitnessband where prod_id=47265";
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery(query);
					rs.next();
					String avail=rs.getString("Availability");
					if(avail.equals("0"))
					{
					JOptionPane.showMessageDialog(null, "Item out of stock");
					}
					else
					{
					String query2="update fitnessband set availability=availability-1 where prod_id=47265";
					Statement st2=con.createStatement();
					int count=st2.executeUpdate(query2);
					st2.close();
					String query4="select Model_name, price from fitnessband where prod_id=47265";
					Statement st4=con.createStatement();
					rs=st4.executeQuery(query4);
					rs.next();
					String prod_id="47265";
					String name=rs.getString("Model_name");
					String price=rs.getString("price");
					String query3="insert into cart values('" + prod_id + "','" + name + "','" + price + "')";
					Statement st3=con.createStatement();
					count=st3.executeUpdate(query3);
					st3.close();
					st4.close();
					}
					st.close();
					con.close();
					}
				catch(Exception e1)
				{e1.printStackTrace();}
			}
		});
		btnNewButton_3.setBounds(750, 699, 97, 25);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Go to Cart");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cart c1=new cart();
				setVisible(false);
				c1.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(888, 26, 97, 25);
		contentPane.add(btnNewButton_4);
	}
}
