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
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class laptops extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					laptops frame = new laptops();
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
	public laptops() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1330, 787);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		Image img1=new ImageIcon(this.getClass().getResource("/dell5000.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img1));
		lblNewLabel.setBounds(59, 112, 209, 141);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Dell Inspiron 15 5000 Core i5 8th Gen ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(57, 266, 234, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("(8 GB/2 TB HDD/Windows 10 Home/2 GB Graphics)");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(12, 302, 316, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Rs. 65990");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(126, 324, 80, 16);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Add to Cart");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url="jdbc:mysql://localhost:3306/gadgetly";
				String query="select Availability from laptop where prod_id=435";
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
					String query2="update laptop set availability=availability-1 where prod_id=435";
					Statement st2=con.createStatement();
					int count=st2.executeUpdate(query2);
					st2.close();
					String query4="select Model_name, price from laptop where prod_id=435";
					Statement st4=con.createStatement();
					rs=st4.executeQuery(query4);
					rs.next();
					String prod_id="435";
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
		btnNewButton.setBounds(126, 353, 97, 25);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		Image img2=new ImageIcon(this.getClass().getResource("/acer300.jpg")).getImage();
		lblNewLabel_4.setIcon(new ImageIcon(img2));
		lblNewLabel_4.setBounds(509, 60, 224, 199);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Acer Predator Helios 300 Core i5 9th Gen");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(499, 272, 256, 16);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("16 GB/1 TB HDD/256 GB SSD/Windows 10 Home/6 GB Graphics/NVIDIA Geforce GTX 1660 Ti)");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_6.setBounds(411, 304, 443, 16);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Rs. 99990");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_7.setBounds(575, 324, 80, 16);
		contentPane.add(lblNewLabel_7);
		
		JButton btnNewButton_1 = new JButton("Add to Cart");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url="jdbc:mysql://localhost:3306/gadgetly";
				String query="select Availability from laptop where prod_id=534";
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
					String query2="update laptop set availability=availability-1 where prod_id=534";
					Statement st2=con.createStatement();
					int count=st2.executeUpdate(query2);
					st2.close();
					String query4="select Model_name, price from laptop where prod_id=534";
					Statement st4=con.createStatement();
					rs=st4.executeQuery(query4);
					rs.next();
					String prod_id="534";
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
		btnNewButton_1.setBounds(575, 353, 97, 25);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		Image img3=new ImageIcon(this.getClass().getResource("/lenovos145.jpg")).getImage();
		lblNewLabel_8.setIcon(new ImageIcon(img3));
		lblNewLabel_8.setBounds(990, 83, 240, 170);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Lenovo Ideapad S145 Core i3 10th Gen");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_9.setBounds(990, 275, 250, 16);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("(4 GB/256 GB SSD/Windows 10 Home)");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10.setBounds(990, 302, 240, 16);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Rs. 32990");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_11.setBounds(1057, 324, 80, 16);
		contentPane.add(lblNewLabel_11);
		
		JButton btnNewButton_2 = new JButton("Add to Cart");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url="jdbc:mysql://localhost:3306/gadgetly";
				String query="select Availability from laptop where prod_id=564";
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
					String query2="update laptop set availability=availability-1 where prod_id=564";
					Statement st2=con.createStatement();
					int count=st2.executeUpdate(query2);
					st2.close();
					String query4="select Model_name, price from laptop where prod_id=564";
					Statement st4=con.createStatement();
					rs=st4.executeQuery(query4);
					rs.next();
					String prod_id="564";
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
		btnNewButton_2.setBounds(1057, 353, 97, 25);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		Image img4=new ImageIcon(this.getClass().getResource("/asus.jpg")).getImage();
		lblNewLabel_12.setIcon(new ImageIcon(img4));
		lblNewLabel_12.setBounds(59, 443, 220, 141);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Asus VivoBook S15 Core i7 8th Gen");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_13.setBounds(55, 597, 224, 16);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("(8 GB/1 TB HDD/Windows 10 Home/2 GB Graphics)");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_14.setBounds(12, 626, 316, 16);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Rs. 65690");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_15.setBounds(134, 655, 72, 16);
		contentPane.add(lblNewLabel_15);
		
		JButton btnNewButton_3 = new JButton("Add to Cart");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url="jdbc:mysql://localhost:3306/gadgetly";
				String query="select Availability from laptop where prod_id=639";
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
					String query2="update laptop set availability=availability-1 where prod_id=639";
					Statement st2=con.createStatement();
					int count=st2.executeUpdate(query2);
					st2.close();
					String query4="select Model_name, price from laptop where prod_id=639";
					Statement st4=con.createStatement();
					rs=st4.executeQuery(query4);
					rs.next();
					String prod_id="639";
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
		btnNewButton_3.setBounds(126, 684, 97, 25);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_16 = new JLabel("New label");
		Image img5=new ImageIcon(this.getClass().getResource("/msi.jpg")).getImage();
		lblNewLabel_16.setIcon(new ImageIcon(img5));
		lblNewLabel_16.setBounds(509, 454, 220, 141);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("MSI GL Series Core i5 8th Gen");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_17.setBounds(530, 601, 181, 16);
		contentPane.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("(8 GB/1 TB HDD/Windows 10 Home/4 GB Graphics/NVIDIA Geforce GTX 1050)");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_18.setBounds(411, 630, 435, 16);
		contentPane.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("Rs. 60990");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_19.setBounds(588, 655, 80, 16);
		contentPane.add(lblNewLabel_19);
		
		JButton btnNewButton_4 = new JButton("Add to Cart");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url="jdbc:mysql://localhost:3306/gadgetly";
				String query="select Availability from laptop where prod_id=742";
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
					String query2="update laptop set availability=availability-1 where prod_id=742";
					Statement st2=con.createStatement();
					int count=st2.executeUpdate(query2);
					st2.close();
					String query4="select Model_name, price from laptop where prod_id=742";
					Statement st4=con.createStatement();
					rs=st4.executeQuery(query4);
					rs.next();
					String prod_id="742";
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
		btnNewButton_4.setBounds(575, 684, 97, 25);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_20 = new JLabel("New label");
		Image img6=new ImageIcon(this.getClass().getResource("/acernitro5.jpg")).getImage();
		lblNewLabel_20.setIcon(new ImageIcon(img6));
		lblNewLabel_20.setBounds(992, 448, 200, 152);
		contentPane.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("Acer Nitro 5 Ryzen 5 Quad Core");
		lblNewLabel_21.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_21.setBounds(992, 606, 200, 16);
		contentPane.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("(8 GB/1 TB HDD/Windows 10 Home/4 GB Graphics/AMD Radeon RX 560X)");
		lblNewLabel_22.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_22.setBounds(920, 630, 361, 16);
		contentPane.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("Rs. 44990");
		lblNewLabel_23.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_23.setBounds(1050, 655, 87, 16);
		contentPane.add(lblNewLabel_23);
		
		JButton btnNewButton_5 = new JButton("Add to Cart");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url="jdbc:mysql://localhost:3306/gadgetly";
				String query="select Availability from laptop where prod_id=867";
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
					String query2="update laptop set availability=availability-1 where prod_id=867";
					Statement st2=con.createStatement();
					int count=st2.executeUpdate(query2);
					st2.close();
					String query4="select Model_name, price from laptop where prod_id=867";
					Statement st4=con.createStatement();
					rs=st4.executeQuery(query4);
					rs.next();
					String prod_id="867";
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
		btnNewButton_5.setBounds(1040, 684, 97, 25);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Go to Cart");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cart c1=new cart();
				setVisible(false);
				c1.setVisible(true);
			}
		});
		btnNewButton_6.setBounds(1111, 29, 97, 25);
		contentPane.add(btnNewButton_6);
	}
}
