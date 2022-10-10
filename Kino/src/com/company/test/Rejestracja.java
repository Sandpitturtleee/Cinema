/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.test;

/**
 *
 * @author Quinny
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Rejestracja {

	JPanel Rejestr_Form;
	
	JLabel Logowanie_label;
	JTextField Name, Surname, Login ;
	JButton Submit;
	JLabel User,Passwd, User_Name, Sur_Name;
	JPasswordField Password;
	static JTextArea Wynik;
	
	
	static void add_user(String name, String surname, String Login, String Password) {	
		  Connection c = null;
	      Statement stmt = null;
              Statement stmt2 = null;
	
		try {
	         Class.forName("org.postgresql.Driver");
	         c = DriverManager
	            .getConnection("jdbc:postgresql://localhost/kino",
	            "postgres", "root");
	         c.setAutoCommit(true);
	         stmt = c.createStatement();
	          ResultSet rs = stmt.executeQuery( "SELECT Count(*) FROM USERSS WHERE LOGIN = '" + Login +"';" );
	          rs.next();
	          if(rs.getInt(1)==0)
	          {
                      stmt2 = c.createStatement();
	              String sql = "INSERT INTO userss (name, surname, login, password) VALUES ('"+ name +"', '"+surname+"', '"+Login+"', '"+Password+"');";
	              stmt2.executeUpdate(sql); 
	              Wynik.setText("Użytkownik Dodany");
	              rs.close();
	              stmt2.close();
		          c.close(); 
	          }
	          else {
	        	  Wynik.setText("Taki użytkownik już istnieje");
	        	  rs.close();
		          stmt2.close();
		          c.close();   
	          };
	         
	 	} catch (Exception e) {
         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
         System.exit(0);
      }
		};
	Rejestracja(){
		
		Rejestr_Form = new JPanel();
		
		
		
		Logowanie_label = new JLabel("Rejestracja");
		Logowanie_label.setBounds(310, 10, 250, 65);;
		Logowanie_label.setFont(new Font("Serif", Font.PLAIN, 54));
		
		Name = new JTextField(20);
		Name.setBounds(330, 100, 200, 20);
		
		Surname = new JTextField(20);
		Surname.setBounds(330, 150, 200, 20);
		
		Login= new JTextField(20);
		Login.setBounds(330,200,200,20);
		
		Password= new JPasswordField(20);
		Password.setBounds(330,250,200,20);
		
		Submit = new JButton("Zarestruj");
		Submit.setBounds(330, 300, 200, 40);
		
		User = new JLabel("Login");
		Passwd = new JLabel("Has³o");
		User.setBounds(330, 180, 50, 20);
		Passwd.setBounds(330, 230, 50, 20);
		User_Name = new JLabel("Imiê");
		Sur_Name = new JLabel("Nazwisko");
		User_Name.setBounds(330, 80, 50, 20);
		Sur_Name.setBounds(330, 130, 60, 20);
		
		
		Wynik = new JTextArea();
		Wynik.setBounds(560, 150, 200, 60);
		Wynik.setDisabledTextColor(Color.black);
		Wynik.setOpaque(false);		
		Wynik.setLineWrap(true);
		Wynik.setWrapStyleWord(true);
		Wynik.setFont(new Font("Serif", Font.PLAIN, 20));
		Wynik.setEnabled(false); 
		
		Rejestr_Form.add(Login);
		Rejestr_Form.add(Logowanie_label);
		Rejestr_Form.add(Password);
		Rejestr_Form.add(Submit);
		Rejestr_Form.add(Passwd);
		Rejestr_Form.add(User);
		Rejestr_Form.add(Name);
		Rejestr_Form.add(Surname);
		Rejestr_Form.add(User_Name);
		Rejestr_Form.add(Sur_Name);
		Rejestr_Form.add(Wynik);
		
		Submit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try{
					if(Surname.getText().isEmpty()==true || Name.getText().isEmpty()==true  || Login.getText().isEmpty()==true || Password.getText().isEmpty()==true ) {
					System.out.println(Password.getText()+Name.getText()+Surname.getText());	
					Wynik.setText("¯adne pole nie mo¿e byæ puste");
					}
					else {
						add_user(Name.getText(), Surname.getText(), Login.getText(), Password.getText());
					}
				}
				catch(Exception k ) {
					Wynik.setText("Unexpected error :( ");
				};
			
			}
		});
		
		
		
		
		Rejestr_Form.setBounds(310, 10, 250, 60);
		Rejestr_Form.setLayout(null);
		//Rejestr_Form.setLocationRelativeTo(null);
		//Rejestr_Form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Rejestr_Form.setResizable(false); 
		
		Rejestr_Form.setVisible(true); 
		};
}

