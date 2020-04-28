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

public class consoles extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					consoles frame = new consoles();
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
	public consoles() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1326, 780);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		Image img1=new ImageIcon(this.getClass().getResource("/ps4slim.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img1));
		lblNewLabel.setBounds(126, 78, 235, 213);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sony PlayStation4 Slim 1 TB 1000 GB (Black)");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(70, 319, 325, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Rs. 25555");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(195, 348, 72, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		Image img2=new ImageIcon(this.getClass().getResource("/ps4pro.jpg")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img2));
		lblNewLabel_3.setBounds(756, 84, 252, 201);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Add to Cart");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url="jdbc:mysql://localhost:3306/gadgetly";
				String query="select Availability from console where prod_id=11";
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
					String query2="update console set availability=availability-1 where prod_id=11";
					Statement st2=con.createStatement();
					int count=st2.executeUpdate(query2);
					st2.close();
					String query4="select Model_name, price from console where prod_id=11";
					Statement st4=con.createStatement();
					rs=st4.executeQuery(query4);
					rs.next();
					String prod_id="11";
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
		btnNewButton.setBounds(185, 369, 97, 25);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("Sony PS4 Pro 1 TB (Black)");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(791, 320, 196, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Rs. 36900");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(852, 349, 72, 16);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton_1 = new JButton("Add to Cart");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url="jdbc:mysql://localhost:3306/gadgetly";
				String query="select Availability from console where prod_id=22";
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
					String query2="update console set availability=availability-1 where prod_id=22";
					Statement st2=con.createStatement();
					int count=st2.executeUpdate(query2);
					st2.close();
					String query4="select Model_name, price from console where prod_id=22";
					Statement st4=con.createStatement();
					rs=st4.executeQuery(query4);
					rs.next();
					String prod_id="22";
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
		btnNewButton_1.setBounds(842, 369, 97, 25);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		Image img3=new ImageIcon(this.getClass().getResource("/xboxones.jpg")).getImage();
		lblNewLabel_6.setIcon(new ImageIcon(img3));
		lblNewLabel_6.setBounds(158, 441, 196, 179);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Microsoft Xbox One S 1 TB with Forza Horizon 4  (White)");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_7.setBounds(71, 619, 404, 16);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Rs. 22990");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_8.setBounds(211, 650, 81, 16);
		contentPane.add(lblNewLabel_8);
		
		JButton btnNewButton_2 = new JButton("Add to Cart");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url="jdbc:mysql://localhost:3306/gadgetly";
				String query="select Availability from console where prod_id=33";
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
					String query2="update console set availability=availability-1 where prod_id=33";
					Statement st2=con.createStatement();
					int count=st2.executeUpdate(query2);
					st2.close();
					String query4="select Model_name, price from console where prod_id=33";
					Statement st4=con.createStatement();
					rs=st4.executeQuery(query4);
					rs.next();
					String prod_id="33";
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
		btnNewButton_2.setBounds(195, 668, 97, 25);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		Image img4=new ImageIcon(this.getClass().getResource("/xboxonex.jpg")).getImage();
		lblNewLabel_9.setIcon(new ImageIcon(img4));
		lblNewLabel_9.setBounds(756, 407, 261, 213);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Microsoft Xbox One X 1 TB (Black)");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_10.setBounds(766, 620, 251, 16);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Rs. 34990");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_11.setBounds(857, 650, 82, 16);
		contentPane.add(lblNewLabel_11);
		
		JButton btnNewButton_3 = new JButton("Add to Cart");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url="jdbc:mysql://localhost:3306/gadgetly";
				String query="select Availability from console where prod_id=44";
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
					String query2="update console set availability=availability-1 where prod_id=44";
					Statement st2=con.createStatement();
					int count=st2.executeUpdate(query2);
					st2.close();
					String query4="select Model_name, price from console where prod_id=44";
					Statement st4=con.createStatement();
					rs=st4.executeQuery(query4);
					rs.next();
					String prod_id="44";
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
		btnNewButton_3.setBounds(842, 668, 97, 25);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Go to Cart");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cart c1=new cart();
				setVisible(false);
				c1.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(1131, 33, 97, 25);
		contentPane.add(btnNewButton_4);
	}
}
