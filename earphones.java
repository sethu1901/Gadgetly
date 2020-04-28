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

public class earphones extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					earphones frame = new earphones();
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
	public earphones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1323, 780);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		Image img1=new ImageIcon(this.getClass().getResource("/jblc150si.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img1));
		lblNewLabel.setBounds(12, 27, 223, 241);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("JBL C150SI Wired Headset");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(22, 281, 194, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Rs. 749");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(88, 310, 56, 16);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Add to Cart");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url="jdbc:mysql://localhost:3306/gadgetly";
				String query="select Availability from earphone where prod_id=1";
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
					String query2="update earphone set availability=availability-1 where prod_id=1";
					Statement st2=con.createStatement();
					int count=st2.executeUpdate(query2);
					st2.close();
					String query4="select Model_name, price from earphone where prod_id=1";
					Statement st4=con.createStatement();
					rs=st4.executeQuery(query4);
					rs.next();
					String prod_id="1";
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
		btnNewButton.setBounds(70, 339, 97, 25);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		Image img2=new ImageIcon(this.getClass().getResource("/boat220.jpg")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img2));
		lblNewLabel_3.setBounds(324, 5, 186, 284);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("boAt BassHeads 220 Super Extra Bass Wired Headset");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(257, 294, 334, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Rs. 549");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(384, 323, 56, 16);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton_1 = new JButton("Add to Cart");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url="jdbc:mysql://localhost:3306/gadgetly";
				String query="select Availability from earphone where prod_id=2";
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
					String query2="update earphone set availability=availability-1 where prod_id=2";
					Statement st2=con.createStatement();
					int count=st2.executeUpdate(query2);
					st2.close();
					String query4="select Model_name, price from earphone where prod_id=2";
					Statement st4=con.createStatement();
					rs=st4.executeQuery(query4);
					rs.next();
					String prod_id="2";
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
		btnNewButton_1.setBounds(365, 339, 97, 25);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		Image img3=new ImageIcon(this.getClass().getResource("/boat255f.jpg")).getImage();
		lblNewLabel_6.setIcon(new ImageIcon(img3));
		lblNewLabel_6.setBounds(671, 57, 178, 211);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("boAt Rockerz 255F Bluetooth Headset");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_7.setBounds(635, 281, 267, 16);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Rs. 1499");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_8.setBounds(732, 311, 72, 16);
		contentPane.add(lblNewLabel_8);
		
		JButton btnNewButton_2 = new JButton("Add to Cart");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url="jdbc:mysql://localhost:3306/gadgetly";
				String query="select Availability from earphone where prod_id=3";
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
					String query2="update earphone set availability=availability-1 where prod_id=3";
					Statement st2=con.createStatement();
					int count=st2.executeUpdate(query2);
					st2.close();
					String query4="select Model_name, price from earphone where prod_id=3";
					Statement st4=con.createStatement();
					rs=st4.executeQuery(query4);
					rs.next();
					String prod_id="3";
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
		btnNewButton_2.setBounds(713, 339, 97, 25);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		Image img4=new ImageIcon(this.getClass().getResource("/realme.png")).getImage();
		lblNewLabel_9.setIcon(new ImageIcon(img4));
		lblNewLabel_9.setBounds(990, 57, 211, 211);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("realme Buds Wireless Bluetooth Headset");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_10.setBounds(955, 281, 289, 16);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Rs. 1799");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_11.setBounds(1048, 311, 72, 16);
		contentPane.add(lblNewLabel_11);
		
		JButton btnNewButton_3 = new JButton("Add to Cart");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url="jdbc:mysql://localhost:3306/gadgetly";
				String query="select Availability from earphone where prod_id=4";
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
					String query2="update earphone set availability=availability-1 where prod_id=4";
					Statement st2=con.createStatement();
					int count=st2.executeUpdate(query2);
					st2.close();
					String query4="select Model_name, price from earphone where prod_id=4";
					Statement st4=con.createStatement();
					rs=st4.executeQuery(query4);
					rs.next();
					String prod_id="4";
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
		btnNewButton_3.setBounds(1023, 339, 97, 25);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		Image img5=new ImageIcon(this.getClass().getResource("/jblt450bt.jpg")).getImage();
		lblNewLabel_12.setIcon(new ImageIcon(img5));
		lblNewLabel_12.setBounds(36, 398, 213, 217);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("JBL T450BT Extra Bass Bluetooth Headset");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_13.setBounds(12, 628, 267, 16);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Rs. 1949");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_14.setBounds(101, 655, 63, 16);
		contentPane.add(lblNewLabel_14);
		
		JButton btnNewButton_4 = new JButton("Add to Cart");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url="jdbc:mysql://localhost:3306/gadgetly";
				String query="select Availability from earphone where prod_id=5";
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
					String query2="update earphone set availability=availability-1 where prod_id=5";
					Statement st2=con.createStatement();
					int count=st2.executeUpdate(query2);
					st2.close();
					String query4="select Model_name, price from earphone where prod_id=5";
					Statement st4=con.createStatement();
					rs=st4.executeQuery(query4);
					rs.next();
					String prod_id="5";
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
		btnNewButton_4.setBounds(88, 684, 97, 25);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_15 = new JLabel("New label");
		Image img6=new ImageIcon(this.getClass().getResource("/sonyxb650bt.jpg")).getImage();
		lblNewLabel_15.setIcon(new ImageIcon(img6));
		lblNewLabel_15.setBounds(334, 375, 201, 269);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Sony XB650BT Bluetooth Headset");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_16.setBounds(312, 655, 255, 16);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Rs. 6399");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_17.setBounds(394, 684, 68, 16);
		contentPane.add(lblNewLabel_17);
		
		JButton btnNewButton_5 = new JButton("Add to Cart");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url="jdbc:mysql://localhost:3306/gadgetly";
				String query="select Availability from earphone where prod_id=6";
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
					String query2="update earphone set availability=availability-1 where prod_id=6";
					Statement st2=con.createStatement();
					int count=st2.executeUpdate(query2);
					st2.close();
					String query4="select Model_name, price from earphone where prod_id=6";
					Statement st4=con.createStatement();
					rs=st4.executeQuery(query4);
					rs.next();
					String prod_id="6";
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
		btnNewButton_5.setBounds(375, 708, 97, 25);
		contentPane.add(btnNewButton_5);
		
		JLabel lblNewLabel_18 = new JLabel("New label");
		Image img7=new ImageIcon(this.getClass().getResource("/sony310ap.jpg")).getImage();
		lblNewLabel_18.setIcon(new ImageIcon(img7));
		lblNewLabel_18.setBounds(671, 375, 178, 269);
		contentPane.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("Sony 310AP Wired Headset");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_19.setBounds(666, 655, 194, 16);
		contentPane.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("Rs. 949");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_20.setBounds(748, 684, 56, 16);
		contentPane.add(lblNewLabel_20);
		
		JButton btnNewButton_6 = new JButton("Add to Cart");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url="jdbc:mysql://localhost:3306/gadgetly";
				String query="select Availability from earphone where prod_id=7";
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
					String query2="update earphone set availability=availability-1 where prod_id=7";
					Statement st2=con.createStatement();
					int count=st2.executeUpdate(query2);
					st2.close();
					String query4="select Model_name, price from earphone where prod_id=7";
					Statement st4=con.createStatement();
					rs=st4.executeQuery(query4);
					rs.next();
					String prod_id="7";
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
		btnNewButton_6.setBounds(725, 708, 97, 25);
		contentPane.add(btnNewButton_6);
		
		JLabel lblNewLabel_21 = new JLabel("New label");
		Image img8=new ImageIcon(this.getClass().getResource("/skullcandy.jpg")).getImage();
		lblNewLabel_21.setIcon(new ImageIcon(img8));
		lblNewLabel_21.setBounds(990, 390, 194, 232);
		contentPane.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("Skullcandy Anti Headphone");
		lblNewLabel_22.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_22.setBounds(990, 635, 194, 16);
		contentPane.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("Rs. 899");
		lblNewLabel_23.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_23.setBounds(1064, 664, 56, 16);
		contentPane.add(lblNewLabel_23);
		
		JButton btnNewButton_7 = new JButton("Add to Cart");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url="jdbc:mysql://localhost:3306/gadgetly";
				String query="select Availability from earphone where prod_id=8";
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
					String query2="update earphone set availability=availability-1 where prod_id=8";
					Statement st2=con.createStatement();
					int count=st2.executeUpdate(query2);
					st2.close();
					String query4="select Model_name, price from earphone where prod_id=8";
					Statement st4=con.createStatement();
					rs=st4.executeQuery(query4);
					rs.next();
					String prod_id="8";
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
		btnNewButton_7.setBounds(1035, 684, 97, 25);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Go to Cart");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cart c1=new cart();
				setVisible(false);
				c1.setVisible(true);
			}
		});
		btnNewButton_8.setBounds(1147, 19, 97, 25);
		contentPane.add(btnNewButton_8);
	}

}
