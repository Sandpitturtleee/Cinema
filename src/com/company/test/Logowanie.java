
package com.company.test;

/**
 *
 * @author Quinny
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import static com.company.test.Card.CLayout;
import static com.company.test.Card.Main_Panel;
import static com.company.test.Card.Log_out;
import static com.company.test.Glowna.buttonlog;

import java.sql.Statement;

import javax.swing.*;

public class Logowanie {
	JPanel Okno;
	JTextField Login;
	JLabel Logowanie_label, Podaj_login, Podaj_passw;
	JPasswordField Password;
	JButton Submit;
	JLabel User,Passwd;
	JButton Main_Page_Button;
	static JTextArea Wynik;
	static boolean hasSpace(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(0)==' ' || str.charAt(i)==' '&&str.charAt(i+1)!=' ')
			{
				return true;
			}
		}
		return false;
	};
	static void log_user(String Login, String Password) {
		Connection c = null;
		Statement stmt = null;
		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager
					.getConnection("jdbc:postgresql://localhost/kino",
							"postgres", "root");
			c.setAutoCommit(false);
			// System.out.println("Opened database successfully");

			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery( "SELECT Count(*) FROM USERSS WHERE LOGIN = '" + Login + "' AND PASSWORD = '" + Password + "';" );
			rs.next();
			if(rs.getInt(1)==0)
			{
				//user didnt exist
				Wynik.setText("Taki użytkownik nie istnieje");
				Log_out.setEnabled(false);
				rs.close();
				stmt.close();
				c.close();
			}
			else {
				Wynik.setText("Zalogowano");
				Log_out.setEnabled(true);
				buttonlog.setEnabled(false);
				rs.close();
				stmt.close();
				c.close();

			};

		} catch ( Exception e ) {
			System.err.println( e.getClass().getName()+": "+ e.getMessage() );
			System.exit(0);
		}

	};
	Logowanie(){

		Okno = new JPanel();

		Logowanie_label = new JLabel("Logowanie");
		Logowanie_label.setBounds(310, 10, 250, 65);
		Logowanie_label.setFont(new Font("Serif", Font.PLAIN, 54));

		Main_Page_Button = new JButton("Strona Główna");
		Main_Page_Button.setBounds(330, 360, 200, 40);

		Podaj_login = new JLabel("Podaj Login");
		Podaj_login.setBounds(330, 170, 200, 20);
		Login= new JTextField(20);
		Login.setBounds(330,200,200,20);

		Podaj_passw = new JLabel("Podaj Hasło");
		Podaj_passw.setBounds(330, 230, 200, 20);
		Password= new JPasswordField(20);
		Password.setBounds(330,250,200,20);

		Submit = new JButton("Zaloguj");
		Submit.setBounds(330, 300, 200, 40);

		Wynik = new JTextArea();
		Wynik.setBounds(560, 150, 200, 60);
		Wynik.setDisabledTextColor(Color.black);
		Wynik.setOpaque(false);
		Wynik.setLineWrap(true);
		Wynik.setWrapStyleWord(true);
		Wynik.setFont(new Font("Serif", Font.PLAIN, 20));
		Wynik.setEnabled(false);






		Okno.add(Logowanie_label);
		Okno.add(Podaj_login);
		Okno.add(Login);
		Okno.add(Podaj_passw);
		Okno.add(Password);
		Okno.add(Submit);
		Okno.add(Wynik);
		Okno.add(Main_Page_Button);

		Okno.setLayout(null);
		Okno.setOpaque(true);
		Okno.setBounds(50, 190, 870, 550);
		//Okno.setBackground(Color.CYAN);
		Okno.setVisible(true);


		//Okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		Submit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {


				try{

					if(Login.getText().isEmpty()==true || Password.getText().isEmpty()==true) {
						Wynik.setText("Żadne pole nie może zawierac spacji");
					}
					else if(hasSpace(Login.getText())==true || hasSpace(Password.getText())==true ) {
						Wynik.setText("Żadne pole nie może zawierac spacji");
					}
					else {

						log_user(Login.getText(), Password.getText());
						CLayout.show(Main_Panel, "1");

					}
					Login.setText("");
					Password.setText("");

				}
				catch(Exception k ) {
					Wynik.setText("Unexpected error :( ");
				};
			}
		});
		Main_Page_Button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try{
					CLayout.show(Main_Panel, "1");
				}
				catch(Exception k ) {
					Wynik.setText("Unexpected error 😦 ");
				};

			}
		});
	};



}
