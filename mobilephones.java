package gadgetly;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.*;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;

public class mobilephones extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mobilephones frame = new mobilephones();
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
	public mobilephones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1357, 758);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image img1=new ImageIcon(this.getClass().getResource("/oneplus7t.jpg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img1));
		lblNewLabel_1.setBounds(79, 113, 132, 171);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("OnePlus 7T 8GB RAM, 1TB Storage");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(34, 297, 261, 25);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Add to Cart");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url="jdbc:mysql://localhost:3306/gadgetly";
				String query="select Availability from phone where prod_id=111";
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
					String query2="update phone set availability=availability-1 where prod_id=111";
					Statement st2=con.createStatement();
					int count=st2.executeUpdate(query2);
					st2.close();
					String query4="select Model_name, price from phone where prod_id=111";
					Statement st4=con.createStatement();
					rs=st4.executeQuery(query4);
					rs.next();
					String prod_id="111";
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
		btnNewButton.setBounds(100, 365, 97, 25);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		Image img2=new ImageIcon(this.getClass().getResource("/oneplus7.jpg")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img2));
		lblNewLabel_3.setBounds(429, 71, 82, 213);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("OnePlus 7 8GB RAM, 256 GB Storage");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(339, 301, 275, 16);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton_1 = new JButton("Add to Cart");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url="jdbc:mysql://localhost:3306/gadgetly";
				String query="select Availability from phone where prod_id=222";
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
					String query2="update phone set availability=availability-1 where prod_id=222";
					Statement st2=con.createStatement();
					int count=st2.executeUpdate(query2);
					st2.close();
					String query4="select Model_name, price from phone where prod_id=222";
					Statement st4=con.createStatement();
					rs=st4.executeQuery(query4);
					rs.next();
					String prod_id="222";
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
		btnNewButton_1.setBounds(429, 365, 97, 25);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		Image img3=new ImageIcon(this.getClass().getResource("/redminote8pro.jpg")).getImage();
		lblNewLabel_5.setIcon(new ImageIcon(img3));
		lblNewLabel_5.setBounds(699, 80, 159, 204);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Redmi Note 8 Pro 6GB RAM 64 GB Storage");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(641, 301, 314, 16);
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton_2 = new JButton("Add to Cart");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String url="jdbc:mysql://localhost:3306/gadgetly";
				String query="select Availability from phone where prod_id=333";
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
					String query2="update phone set availability=availability-1 where prod_id=333";
					Statement st2=con.createStatement();
					int count=st2.executeUpdate(query2);
					st2.close();
					String query4="select Model_name, price from phone where prod_id=333";
					Statement st4=con.createStatement();
					rs=st4.executeQuery(query4);
					rs.next();
					String prod_id="333";
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
		btnNewButton_2.setBounds(761, 365, 97, 25);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		Image img4=new ImageIcon(this.getClass().getResource("/redminote7pro.jpg")).getImage();
		lblNewLabel_7.setIcon(new ImageIcon(img4));
		lblNewLabel_7.setBounds(1077, 71, 104, 222);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Redmi Note 7 Pro 4GB RAM 64 GB Storage");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_8.setBounds(983, 301, 314, 16);
		contentPane.add(lblNewLabel_8);
		
		JButton btnNewButton_3 = new JButton("Add to Cart");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url="jdbc:mysql://localhost:3306/gadgetly";
				String query="select Availability from phone where prod_id=444";
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
					String query2="update phone set availability=availability-1 where prod_id=444";
					Statement st2=con.createStatement();
					int count=st2.executeUpdate(query2);
					st2.close();
					String query4="select Model_name, price from phone where prod_id=444";
					Statement st4=con.createStatement();
					rs=st4.executeQuery(query4);
					rs.next();
					String prod_id="444";
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
		btnNewButton_3.setBounds(1077, 365, 97, 25);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		Image img5=new ImageIcon(this.getClass().getResource("/galaxym30s.jpg")).getImage();
		lblNewLabel_9.setIcon(new ImageIcon(img5));
		lblNewLabel_9.setBounds(177, 403, 104, 213);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Samsung Galaxy M30s 4GB RAM 64 GB Storage");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_10.setBounds(71, 619, 338, 25);
		contentPane.add(lblNewLabel_10);
		
		JButton btnNewButton_4 = new JButton("Add to Cart");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url="jdbc:mysql://localhost:3306/gadgetly";
				String query="select Availability from phone where prod_id=555";
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
					String query2="update phone set availability=availability-1 where prod_id=555";
					Statement st2=con.createStatement();
					int count=st2.executeUpdate(query2);
					st2.close();
					String query4="select Model_name, price from phone where prod_id=555";
					Statement st4=con.createStatement();
					rs=st4.executeQuery(query4);
					rs.next();
					String prod_id="555";
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
		btnNewButton_4.setBounds(177, 673, 97, 25);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		Image img6=new ImageIcon(this.getClass().getResource("/galaxynote10plus.jpg")).getImage();
		lblNewLabel_11.setIcon(new ImageIcon(img6));
		lblNewLabel_11.setBounds(570, 403, 213, 213);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Samsung Galaxy Note 10+ 12 GB RAM 256 GB Storage");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_12.setBounds(474, 623, 401, 16);
		contentPane.add(lblNewLabel_12);
		
		JButton btnNewButton_5 = new JButton("Add to Cart");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url="jdbc:mysql://localhost:3306/gadgetly";
				String query="select Availability from phone where prod_id=666";
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
					String query2="update phone set availability=availability-1 where prod_id=666";
					Statement st2=con.createStatement();
					int count=st2.executeUpdate(query2);
					st2.close();
					String query4="select Model_name, price from phone where prod_id=666";
					Statement st4=con.createStatement();
					rs=st4.executeQuery(query4);
					rs.next();
					String prod_id="666";
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
		btnNewButton_5.setBounds(617, 673, 97, 25);
		contentPane.add(btnNewButton_5);
		
		JLabel lblNewLabel_13 = new JLabel("New label");
		Image img7=new ImageIcon(this.getClass().getResource("/iphonexs.jpg")).getImage();
		lblNewLabel_13.setIcon(new ImageIcon(img7));
		lblNewLabel_13.setBounds(1065, 398, 140, 222);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Apple iPhone XS 4GB RAM 256 GB Storage");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_14.setBounds(983, 623, 314, 16);
		contentPane.add(lblNewLabel_14);
		
		JButton btnNewButton_6 = new JButton("Add to Cart");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url="jdbc:mysql://localhost:3306/gadgetly";
				String query="select Availability from phone where prod_id=777";
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
					String query2="update phone set availability=availability-1 where prod_id=777";
					Statement st2=con.createStatement();
					int count=st2.executeUpdate(query2);
					st2.close();
					String query4="select Model_name, price from phone where prod_id=777";
					Statement st4=con.createStatement();
					rs=st4.executeQuery(query4);
					rs.next();
					String prod_id="777";
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
		btnNewButton_6.setBounds(1097, 673, 97, 25);
		contentPane.add(btnNewButton_6);
		
		JLabel lblNewLabel_15 = new JLabel("Rs. 18500");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_15.setBounds(185, 652, 73, 16);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Rs. 80000");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_16.setBounds(628, 652, 78, 16);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Rs. 52999");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_17.setBounds(1103, 648, 78, 25);
		contentPane.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Rs. 35400");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_18.setBounds(111, 336, 73, 16);
		contentPane.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("Rs. 32965");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_19.setBounds(429, 330, 82, 16);
		contentPane.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("Rs. 15494");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_20.setBounds(765, 330, 82, 16);
		contentPane.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("Rs. 11000");
		lblNewLabel_21.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_21.setBounds(1088, 330, 86, 16);
		contentPane.add(lblNewLabel_21);
		
		JButton btnNewButton_7 = new JButton("Go to Cart");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cart ct=new cart();
				setVisible(false);
				ct.setVisible(true);
			}
		});
		btnNewButton_7.setBounds(1176, 33, 97, 25);
		contentPane.add(btnNewButton_7);
	}
}
