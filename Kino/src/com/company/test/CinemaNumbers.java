package com.company.test;

/**
 *
 * @author Quinny
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static com.company.test.Card.CLayout;
import static com.company.test.Card.Main_Panel;
import static java.lang.String.valueOf;


public class CinemaNumbers {
    JPanel cinemaNumbersPanel;
    JPanel amountPanel1,amountPanel2,amountPanel3,amountPanel4,amountPanel5,amountPanel6,amountPanel7;
    JPanel blankPanel1,blankPanel2;
    JLabel typeLabel,priceLabel,amountLabel;
    JLabel amountPanel2typeLabel, amountPanel3typeLabel, amountPanel4typeLabel,amountPanel5typeLabel, amountPanel6typeLabel, amountPanel7typeLabel;
    JLabel amountPanel2priceLabel, amountPanel3priceLabel, amountPanel4priceLabel, amountPanel5priceLabel, amountPanel6priceLabel, amountPanel7priceLabel;
    JButton  choosePlacesButton;
    JComboBox jComboBox2,jComboBox3,jComboBox4,jComboBox5,jComboBox6;
    String s1[] = {"0","1", "2", "3", "4", "5", "6", "7", "8", "9" };
    int jCb2,jCb3,jCb4,jCb5,jCb6;
    public int numberOfTickets =0;

    CinemaNumbers() {
        cinemaNumbersPanel = new JPanel(new GridLayout(7, 1, 0, 00));

        amountPanel1 = new JPanel(new GridLayout(1, 3, 0, 50));
        typeLabel = new JLabel("Rodzaj biletu", SwingConstants.CENTER);
        priceLabel = new JLabel("Cena", SwingConstants.CENTER);
        amountLabel = new JLabel("Ilość", SwingConstants.CENTER);
        amountPanel1.add(typeLabel);
        amountPanel1.add(priceLabel);
        amountPanel1.add(amountLabel);


        amountPanel2 = new JPanel(new GridLayout(1, 3, 0, 50));
        amountPanel2typeLabel = new JLabel("Student", SwingConstants.CENTER);
        amountPanel2priceLabel = new JLabel("24,50 zł", SwingConstants.CENTER);
        jComboBox2 = new JComboBox(s1);
        amountPanel2.add(amountPanel2typeLabel);
        amountPanel2.add(amountPanel2priceLabel);
        amountPanel2.add(jComboBox2);

        amountPanel3 = new JPanel(new GridLayout(1, 3, 0, 50));
        amountPanel3typeLabel = new JLabel("Senior", SwingConstants.CENTER);
        amountPanel3priceLabel = new JLabel("24,50 zł", SwingConstants.CENTER);
        jComboBox3 = new JComboBox(s1);
        amountPanel3.add(amountPanel3typeLabel);
        amountPanel3.add(amountPanel3priceLabel);
        amountPanel3.add(jComboBox3);

        amountPanel4 = new JPanel(new GridLayout(1, 3, 0, 50));
        amountPanel4typeLabel = new JLabel("Normalny", SwingConstants.CENTER);
        amountPanel4priceLabel = new JLabel("28,50 zł", SwingConstants.CENTER);
        jComboBox4 = new JComboBox(s1);
        amountPanel4.add(amountPanel4typeLabel);
        amountPanel4.add(amountPanel4priceLabel);
        amountPanel4.add(jComboBox4);

        amountPanel5 = new JPanel(new GridLayout(1, 3, 0, 50));
        amountPanel5typeLabel = new JLabel("Ulgowy", SwingConstants.CENTER);
        amountPanel5priceLabel = new JLabel("24,50 zł", SwingConstants.CENTER);
        jComboBox5 = new JComboBox(s1);
        amountPanel5.add(amountPanel5typeLabel);
        amountPanel5.add(amountPanel5priceLabel);
        amountPanel5.add(jComboBox5);

        amountPanel6 = new JPanel(new GridLayout(1, 3, 0, 50));
        amountPanel6typeLabel = new JLabel("Weteran", SwingConstants.CENTER);
        amountPanel6priceLabel = new JLabel("24,50 zł", SwingConstants.CENTER);
        jComboBox6 = new JComboBox(s1);
        amountPanel6.add(amountPanel6typeLabel);
        amountPanel6.add(amountPanel6priceLabel);
        amountPanel6.add(jComboBox6);


        amountPanel7 = new JPanel(new GridLayout(1, 3, 0, 50));
        blankPanel1 = new JPanel();
        blankPanel2 = new JPanel();

        choosePlacesButton = new JButton("Wybierz miejsca");
        choosePlacesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int jCb2 = Integer.parseInt(valueOf(jComboBox2.getSelectedItem()));
                int jCb3 = Integer.parseInt(valueOf(jComboBox3.getSelectedItem()));
                int jCb4 = Integer.parseInt(valueOf(jComboBox4.getSelectedItem()));
                int jCb5 = Integer.parseInt(valueOf(jComboBox5.getSelectedItem()));
                int jCb6 = Integer.parseInt(valueOf(jComboBox6.getSelectedItem()));
                numberOfTickets = Integer.parseInt(valueOf(jComboBox2.getSelectedItem())) + Integer.parseInt(valueOf(jComboBox3.getSelectedItem())) + Integer.parseInt(valueOf(jComboBox4.getSelectedItem())) + Integer.parseInt(valueOf(jComboBox5.getSelectedItem())) + Integer.parseInt(valueOf(jComboBox6.getSelectedItem()));
                if (jCb2==0 && jCb3==0 && jCb4==0 && jCb5==0 && jCb6==0){
                    System.out.println("Blad");
                    JFrame errorJFrame = new JFrame();
                    errorJFrame.setSize(300,110);
                    errorJFrame.setResizable(false);
                    errorJFrame.setVisible(true);
                    errorJFrame.setLayout(null);
                    errorJFrame.setLocationRelativeTo(null);
                    //errorJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    JLabel errorText = new JLabel("Błąd wybierz liczbę miejsc: ");
                    errorText.setBounds(75,0,300,30);
                    JButton errorButton = new JButton("OK");
                    errorButton.setBounds(100,30,100,30);
                    errorButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            errorJFrame.setVisible(false);
                        }
                    });
                    errorJFrame.add(errorText);
                    errorJFrame.add(errorButton);
                }else {
                    try {
                        DBConnector conne = new DBConnector();
                        Connection conn = conne.connect();
                        Statement st = conn.createStatement();
                        String sql = "TRUNCATE tickets";
                        // Execute deletion
                        st.executeUpdate(sql);
                        // Use DELETE
                        sql = "DELETE FROM tickets";
                        // Execute deletion
                        st.executeUpdate(sql);
                        String insert="insert into tickets values('"+numberOfTickets+"')";
                        st.executeUpdate(insert);
                        st.close();

                    } catch (SQLException ex) {

                    }
                    try {
                        DBConnector conne = new DBConnector();
                        Connection conn = conne.connect();
                        Statement st = conn.createStatement();
                        String sql = "TRUNCATE tickets2";
                        // Execute deletion
                        st.executeUpdate(sql);
                        // Use DELETE
                        sql = "DELETE FROM tickets2";
                        // Execute deletion
                        st.executeUpdate(sql);
                        String insert="insert into tickets2 (student,senior,normalny,ulgowy,weteran) values('"+jCb2+"','"+jCb3+"','"+jCb4+"','"+jCb5+"','"+jCb6+"')";
                        st.executeUpdate(insert);
                        st.close();

                    } catch (SQLException ex) {

                    }
                    CinemaSeats cinemaSeats = new CinemaSeats();
                    Main_Panel.add(cinemaSeats.cinemaSeatsPanel, "7");
                    CLayout.show(Main_Panel, "7");
                    System.out.println(jCb2);
                    System.out.println(jCb3);
                    System.out.println(jCb4);
                    System.out.println(jCb5);
                    System.out.println(jCb6);
                }
            }

        });


        amountPanel7.add(blankPanel1);
        amountPanel7.add(blankPanel2);
        amountPanel7.add(choosePlacesButton);

        cinemaNumbersPanel.add(amountPanel1);
        cinemaNumbersPanel.add(amountPanel2);
        cinemaNumbersPanel.add(amountPanel3);
        cinemaNumbersPanel.add(amountPanel4);
        cinemaNumbersPanel.add(amountPanel5);
        cinemaNumbersPanel.add(amountPanel6);
        cinemaNumbersPanel.add(amountPanel7);

    }
    public int getNumberOfTickets(){
        return numberOfTickets;
    }
}
