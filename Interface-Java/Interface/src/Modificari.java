import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.ListSelectionModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Modificari extends JFrame {

	private JPanel contentPane;
	private JTextField Input_tabel;
	private JTable table;
	private JTextField Input_stergere;
	public String Tabel_Modificare="";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modificari frame = new Modificari();
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
	public Modificari() {
		setTitle("Meniu Baza de date");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel("Meniu Modificari");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel.setBounds(250, 10, 300, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("In ce tabel vrei sa modifici?");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(0, 71, 380, 20);
		contentPane.add(lblNewLabel_3);
		
		Input_tabel = new JTextField();
		Input_tabel.setColumns(10);
		Input_tabel.setBounds(10, 101, 209, 30);
		contentPane.add(Input_tabel);
		
		JButton btnRulare = new JButton("Afisare");
		btnRulare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String URL="jdbc:oracle:thin:@localhost:1521:xe";
				String username="CarCompany";
				String password="123456";
				Connection connection=null;
				try {
				connection=DriverManager.getConnection(URL,username,password);
				String afisare="select * from "+Input_tabel.getText();
				PreparedStatement statement=connection.prepareStatement(afisare);
				ResultSet result=statement.executeQuery();
				table.setModel(DbUtils.resultSetToTableModel(result));
				}
				catch (SQLException a)
				{a.printStackTrace();
				}
				finally {
			        try {
			            if (connection != null) {
			                connection.close();
			            }
			        } catch (SQLException sqlee) {
			            sqlee.printStackTrace();
			        }
			    }
			}
		});
		btnRulare.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRulare.setBounds(218, 101, 120, 30);
		contentPane.add(btnRulare);
		
		JScrollPane scrollPane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBounds(10, 141, 370, 320);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		if(Input_tabel.getText().equalsIgnoreCase("Lista_modele")==true||Input_tabel.getText().equalsIgnoreCase("Piesa")==true
				||Input_tabel.getText().equalsIgnoreCase("Lista_modeleMasinaFabrica")==false)
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		else 
			table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		scrollPane.setViewportView(table);
		JButton btnNewButton_1 = new JButton("Modificare");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Input_tabel.getText().equalsIgnoreCase("Lista_modele"))
				{Modificare_lista ml=new Modificare_lista();
				ml.setVisible(true);
				Tabel_Modificare=Input_tabel.getText();
				ml.tabel_initial=Tabel_Modificare;
				dispose();
				}
				else if(Input_tabel.getText().equalsIgnoreCase("Masina"))
				{Modificare_masina mm=new Modificare_masina();
				mm.setVisible(true);
				Tabel_Modificare=Input_tabel.getText();
				mm.tabel_initial=Tabel_Modificare;
				dispose();
				}
					else if(Input_tabel.getText().equalsIgnoreCase("Fabrica"))
					{Modificare_fabrica mf=new Modificare_fabrica();
					mf.setVisible(true);
					Tabel_Modificare=Input_tabel.getText();
					mf.tabel_initial=Tabel_Modificare;
					dispose();	
					}
						else if(Input_tabel.getText().equalsIgnoreCase("Furnizor"))
						{Modificare_furnizor mfu=new Modificare_furnizor();
						mfu.setVisible(true);	
						Tabel_Modificare=Input_tabel.getText();
						mfu.tabel_initial=Tabel_Modificare;
						dispose();
							
						}
							else if(Input_tabel.getText().equalsIgnoreCase("Piesa"))
							{Modificare_piesa mp=new Modificare_piesa();
							mp.setVisible(true);	
							Tabel_Modificare=Input_tabel.getText();
							mp.tabel_initial=Tabel_Modificare;
							dispose();
								
							}
								else if(Input_tabel.getText().equalsIgnoreCase("Locatie"))
								{Modificare_locatie mloc=new Modificare_locatie();
								mloc.setVisible(true);	
								Tabel_Modificare=Input_tabel.getText();
								mloc.tabel_initial=Tabel_Modificare;
								dispose();
									
								}
									else if(Input_tabel.getText().equalsIgnoreCase("Showroom"))
									{Modificare_showroom ms=new Modificare_showroom();
									ms.setVisible(true);
									Tabel_Modificare=Input_tabel.getText();
									ms.tabel_initial=Tabel_Modificare;
									dispose();	
										
									}
										else if(Input_tabel.getText().equalsIgnoreCase("Angajat"))
										{Modificare_angajat ma=new Modificare_angajat();
										ma.setVisible(true);
										Tabel_Modificare=Input_tabel.getText();
										ma.tabel_initial=Tabel_Modificare;
										dispose();
											
										}
											else if(Input_tabel.getText().equalsIgnoreCase("Client"))
											{Modificare_client mc=new Modificare_client();
											mc.setVisible(true);
											Tabel_Modificare=Input_tabel.getText();
											mc.tabel_initial=Tabel_Modificare;
											dispose();
											
											}
												else if(Input_tabel.getText().equalsIgnoreCase("Lista_modeleMasinaFabrica"))
												{Modificare_view nmv=new Modificare_view();
												nmv.setVisible(true);
												Tabel_Modificare=Input_tabel.getText();
												nmv.tabel_initial=Tabel_Modificare;
												dispose();}
					
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(418, 201, 120, 40);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Stergere");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String URL="jdbc:oracle:thin:@localhost:1521:xe";
				String username="CarCompany";
				String password="123456";
				Connection connection=null;
				try {
				connection=DriverManager.getConnection(URL,username,password);
				if(Input_tabel.getText().equalsIgnoreCase("Masina") || Input_tabel.getText().equalsIgnoreCase("Lista_modele"))
					JOptionPane.showMessageDialog(null,"Nu se poate efectua stergere pe tabelul selectat!");
				else {
				String cod_stergere="delete from "+Input_tabel.getText()+" where "+Input_stergere.getText();
				PreparedStatement statement=connection.prepareStatement(cod_stergere);
				statement.executeUpdate();
				JOptionPane.showMessageDialog(null,"Stergere efectuata cu succes!");}
				}
				catch (SQLException a)
				{a.printStackTrace();
				}
				finally {
			        try {
			            if (connection != null) {
			                connection.close();
			            }
			        } catch (SQLException sqlee) {
			            sqlee.printStackTrace();
			        }
			    }
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_1.setBounds(418, 141, 120, 40);
		contentPane.add(btnNewButton_1_1);
		
		Input_stergere = new JTextField();
		Input_stergere.setBounds(565, 161, 191, 20);
		contentPane.add(Input_stergere);
		Input_stergere.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Ce vrei sa stergi?");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(565, 141, 191, 20);
		contentPane.add(lblNewLabel_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Meniu_mare meniu_prin=new Meniu_mare();
				meniu_prin.setVisible(true);
				dispose();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBack.setBounds(418, 261, 120, 40);
		contentPane.add(btnBack);
	}
}
