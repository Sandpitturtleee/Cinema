package com.company.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;

import static com.company.test.Card.CLayout;
import static com.company.test.Card.Main_Panel;
import static com.company.test.CinemaSeats.takenSeatsOccupation;

public class Tickets {
    JPanel ticketsPanel;
    JPanel ticketsPanel1,ticketsPanel2,ticketsPanel3,ticketsPanel4,ticketsPanel5,ticketsPanel6,ticketsPanel7;
    JPanel blankPanel1,blankPanel2;
    JLabel typeLabel,priceLabel,placesLabel;
    JLabel ticketsPanel2typeLabel, ticketsPanel3typeLabel, ticketsPanel4typeLabel,ticketsPanel5typeLabel, ticketsPanel6typeLabel;
    JLabel ticketsPanel2priceLabel, ticketsPanel3priceLabel, ticketsPanel4priceLabel, ticketsPanel5priceLabel, ticketsPanel6priceLabel;
    JLabel ticketsPanel2seatsLabel,ticketsPanel3seatsLabel,ticketsPanel4seatsLabel,ticketsPanel5seatsLabel,ticketsPanel6seatsLabel;
    JButton  buyTicketsButton,returnButton;
    JComboBox jComboBox2,jComboBox3,jComboBox4,jComboBox5,jComboBox6;
    String s1[] = {"0","1", "2", "3", "4", "5", "6", "7", "8", "9" };
    int jCb2,jCb3,jCb4,jCb5,jCb6;
    ArrayList <Integer> seats = new ArrayList<>();
    int number = 0;

    Tickets() {
        try {
            String query = "SELECT * FROM tickets2";
            DBConnector conne = new DBConnector();
            Connection conn = conne.connect();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                jCb2 = rs.getInt("student");
                jCb3 = rs.getInt("senior");
                jCb4 = rs.getInt("normalny");
                jCb5 = rs.getInt("ulgowy");
                jCb6 = rs.getInt("weteran");
                st.close();
            }
        } catch (SQLException ex) {

        }

        ticketsPanel = new JPanel(new GridLayout(7, 1, 0, 00));
        ticketsPanel1 = new JPanel(new GridLayout(1, 3, 0, 50));
        typeLabel = new JLabel("Rodzaj biletu", SwingConstants.CENTER);
        priceLabel = new JLabel("Ilość", SwingConstants.CENTER);
        placesLabel = new JLabel("Miejsca", SwingConstants.CENTER);
        ticketsPanel1.add(typeLabel);
        ticketsPanel1.add(priceLabel);
        ticketsPanel1.add(placesLabel);

        Collections.addAll(seats, 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);

        for (int i=0;i<takenSeatsOccupation.size();i++){
            if (takenSeatsOccupation.get(i)==1){
                seats.set(number,i+1);
                number++;
            }
        }
        System.out.println(seats.size());


        ticketsPanel2 = new JPanel(new GridLayout(1, 3, 0, 50));
        ticketsPanel2typeLabel = new JLabel("Student", SwingConstants.CENTER);
        ticketsPanel2priceLabel = new JLabel(jCb2+" x 24,50 zł", SwingConstants.CENTER);
        ticketsPanel2seatsLabel = new JLabel();

        switch(number) {
                case 1:
                    ticketsPanel2seatsLabel = new JLabel(""+seats.get(0),SwingConstants.CENTER);
                    break;
                case 2:
                    ticketsPanel2seatsLabel = new JLabel(seats.get(0)+", "+seats.get(1), SwingConstants.CENTER);
                    break;
                case 3:
                    ticketsPanel2seatsLabel = new JLabel(+seats.get(0)+", "+seats.get(1)+", "+seats.get(2), SwingConstants.CENTER);
                    break;
                case 4:
                    ticketsPanel2seatsLabel = new JLabel(+seats.get(0)+", "+seats.get(1)+", "+seats.get(2)+", "+seats.get(3), SwingConstants.CENTER);
                    break;
                case 5:
                    ticketsPanel2seatsLabel = new JLabel(+seats.get(0)+", "+seats.get(1)+", "+seats.get(2)+", "+seats.get(3)+", "+seats.get(4), SwingConstants.CENTER);
                    break;
                case 6:
                    ticketsPanel2seatsLabel = new JLabel(+seats.get(0)+", "+seats.get(1)+", "+seats.get(2)+", "+seats.get(3)+", "+seats.get(4)+", "+seats.get(5), SwingConstants.CENTER);
                    break;
                default:
                    ticketsPanel2seatsLabel = new JLabel(+seats.get(0)+", "+seats.get(1)+", "+seats.get(2)+", "+seats.get(3)+", "+seats.get(4)+", "+seats.get(5)+", "+seats.get(6), SwingConstants.CENTER);
            }

        ticketsPanel2.add(ticketsPanel2typeLabel);
        ticketsPanel2.add(ticketsPanel2priceLabel);
        ticketsPanel2.add(ticketsPanel2seatsLabel);

        ticketsPanel3 = new JPanel(new GridLayout(1, 3, 0, 50));
        ticketsPanel3typeLabel = new JLabel("Senior", SwingConstants.CENTER);
        ticketsPanel3priceLabel = new JLabel(jCb3+" x 24,50 zł", SwingConstants.CENTER);
        ticketsPanel3seatsLabel = new JLabel();
        int pom1=7;
        int pom = number-pom1;
        if (number>7){
            switch(pom) {
                case 1:
                    ticketsPanel3seatsLabel = new JLabel(""+seats.get(pom),SwingConstants.CENTER);
                    break;
                case 2:
                    ticketsPanel3seatsLabel = new JLabel(seats.get(pom)+", "+seats.get(1+pom), SwingConstants.CENTER);
                    break;
                case 3:
                    ticketsPanel3seatsLabel = new JLabel(+seats.get(pom)+", "+seats.get(1+pom)+", "+seats.get(2+pom), SwingConstants.CENTER);
                    break;
                case 4:
                    ticketsPanel3seatsLabel = new JLabel(+seats.get(pom)+", "+seats.get(1+pom)+", "+seats.get(2+pom)+", "+seats.get(3+pom), SwingConstants.CENTER);
                    break;
                case 5:
                    ticketsPanel3seatsLabel = new JLabel(+seats.get(pom)+", "+seats.get(1+pom)+", "+seats.get(2+pom)+", "+seats.get(3+pom)+", "+seats.get(4+pom), SwingConstants.CENTER);
                    break;
                case 6:
                    ticketsPanel3seatsLabel = new JLabel(+seats.get(pom)+", "+seats.get(1+pom)+", "+seats.get(2+pom)+", "+seats.get(3+pom)+", "+seats.get(4+pom)+", "+seats.get(5+pom), SwingConstants.CENTER);
                    break;
                default:
                    ticketsPanel3seatsLabel = new JLabel(+seats.get(pom)+", "+seats.get(1+pom)+", "+seats.get(2+pom)+", "+seats.get(3+pom)+", "+seats.get(4+pom)+", "+seats.get(5+pom)+", "+seats.get(6+pom), SwingConstants.CENTER);
            }
        }
        ticketsPanel3.add(ticketsPanel3typeLabel);
        ticketsPanel3.add(ticketsPanel3priceLabel);
        ticketsPanel3.add(ticketsPanel3seatsLabel);

        ticketsPanel4 = new JPanel(new GridLayout(1, 3, 0, 50));
        ticketsPanel4typeLabel = new JLabel("Normalny", SwingConstants.CENTER);
        ticketsPanel4priceLabel = new JLabel(jCb4+" x 28,50 zł", SwingConstants.CENTER);
        ticketsPanel4seatsLabel = new JLabel();
        pom1=14;
        pom = number-pom1;
        if (14<number){
            switch(pom) {
                case 1:
                    ticketsPanel4seatsLabel = new JLabel(""+seats.get(pom),SwingConstants.CENTER);
                    break;
                case 2:
                    ticketsPanel4seatsLabel = new JLabel(seats.get(pom)+", "+seats.get(1+pom), SwingConstants.CENTER);
                    break;
                case 3:
                    ticketsPanel4seatsLabel = new JLabel(+seats.get(pom)+", "+seats.get(1+pom)+", "+seats.get(2+pom), SwingConstants.CENTER);
                    break;
                case 4:
                    ticketsPanel4seatsLabel = new JLabel(+seats.get(pom)+", "+seats.get(1+pom)+", "+seats.get(2+pom)+", "+seats.get(3+pom), SwingConstants.CENTER);
                    break;
                case 5:
                    ticketsPanel4seatsLabel = new JLabel(+seats.get(pom)+", "+seats.get(1+pom)+", "+seats.get(2+pom)+", "+seats.get(3+pom)+", "+seats.get(4+pom), SwingConstants.CENTER);
                    break;
                case 6:
                    ticketsPanel4seatsLabel = new JLabel(+seats.get(pom)+", "+seats.get(1+pom)+", "+seats.get(2+pom)+", "+seats.get(3+pom)+", "+seats.get(4+pom)+", "+seats.get(5+pom), SwingConstants.CENTER);
                    break;
                default:
                    ticketsPanel4seatsLabel = new JLabel(+seats.get(pom)+", "+seats.get(1+pom)+", "+seats.get(2+pom)+", "+seats.get(3+pom)+", "+seats.get(4+pom)+", "+seats.get(5+pom)+", "+seats.get(6+pom), SwingConstants.CENTER);
            }
        }
        ticketsPanel4.add(ticketsPanel4typeLabel);
        ticketsPanel4.add(ticketsPanel4priceLabel);
        ticketsPanel4.add(ticketsPanel4seatsLabel);

        ticketsPanel5 = new JPanel(new GridLayout(1, 3, 0, 50));
        ticketsPanel5typeLabel = new JLabel("Ulgowy", SwingConstants.CENTER);
        ticketsPanel5priceLabel = new JLabel(jCb5+" x 24,50 zł", SwingConstants.CENTER);
        ticketsPanel5seatsLabel = new JLabel();
        pom1=21;
        pom = number-pom1;
        if (21<number){
            switch(pom) {
                case 1:
                    ticketsPanel5seatsLabel = new JLabel(""+seats.get(pom),SwingConstants.CENTER);
                    break;
                case 2:
                    ticketsPanel5seatsLabel = new JLabel(seats.get(pom)+", "+seats.get(1+pom), SwingConstants.CENTER);
                    break;
                case 3:
                    ticketsPanel5seatsLabel = new JLabel(+seats.get(pom)+", "+seats.get(1+pom)+", "+seats.get(2+pom), SwingConstants.CENTER);
                    break;
                case 4:
                    ticketsPanel5seatsLabel = new JLabel(+seats.get(pom)+", "+seats.get(1+pom)+", "+seats.get(2+pom)+", "+seats.get(3+pom), SwingConstants.CENTER);
                    break;
                case 5:
                    ticketsPanel5seatsLabel = new JLabel(+seats.get(pom)+", "+seats.get(1+pom)+", "+seats.get(2+pom)+", "+seats.get(3+pom)+", "+seats.get(4+pom), SwingConstants.CENTER);
                    break;
                case 6:
                    ticketsPanel5seatsLabel = new JLabel(+seats.get(pom)+", "+seats.get(1+pom)+", "+seats.get(2+pom)+", "+seats.get(3+pom)+", "+seats.get(4+pom)+", "+seats.get(5+pom), SwingConstants.CENTER);
                    break;
                default:
                    ticketsPanel5seatsLabel = new JLabel(+seats.get(pom)+", "+seats.get(1+pom)+", "+seats.get(2+pom)+", "+seats.get(3+pom)+", "+seats.get(4+pom)+", "+seats.get(5+pom)+", "+seats.get(6+pom), SwingConstants.CENTER);
            }
        }
        ticketsPanel5.add(ticketsPanel5typeLabel);
        ticketsPanel5.add(ticketsPanel5priceLabel);
        ticketsPanel5.add(ticketsPanel5seatsLabel);

        ticketsPanel6 = new JPanel(new GridLayout(1, 3, 0, 50));
        ticketsPanel6typeLabel = new JLabel("Weteran", SwingConstants.CENTER);
        ticketsPanel6priceLabel = new JLabel(jCb6+" x 24,50 zł", SwingConstants.CENTER);
        ticketsPanel6seatsLabel = new JLabel();
        pom1=28;
        pom = number-pom1;
        if (28<number){
            switch(pom) {
                case 1:
                    ticketsPanel6seatsLabel = new JLabel(""+seats.get(pom),SwingConstants.CENTER);
                    break;
                case 2:
                    ticketsPanel6seatsLabel = new JLabel(seats.get(pom)+", "+seats.get(1+pom), SwingConstants.CENTER);
                    break;
                case 3:
                    ticketsPanel6seatsLabel = new JLabel(+seats.get(pom)+", "+seats.get(1+pom)+", "+seats.get(2+pom), SwingConstants.CENTER);
                    break;
                case 4:
                    ticketsPanel6seatsLabel = new JLabel(+seats.get(pom)+", "+seats.get(1+pom)+", "+seats.get(2+pom)+", "+seats.get(3+pom), SwingConstants.CENTER);
                    break;
                case 5:
                    ticketsPanel6seatsLabel = new JLabel(+seats.get(pom)+", "+seats.get(1+pom)+", "+seats.get(2+pom)+", "+seats.get(3+pom)+", "+seats.get(4+pom), SwingConstants.CENTER);
                    break;
                case 6:
                    ticketsPanel6seatsLabel = new JLabel(+seats.get(pom)+", "+seats.get(1+pom)+", "+seats.get(2+pom)+", "+seats.get(3+pom)+", "+seats.get(4+pom)+", "+seats.get(5+pom), SwingConstants.CENTER);
                    break;
                default:
                    ticketsPanel6seatsLabel = new JLabel(+seats.get(pom)+", "+seats.get(1+pom)+", "+seats.get(2+pom)+", "+seats.get(3+pom)+", "+seats.get(4+pom)+", "+seats.get(5+pom)+", "+seats.get(6+pom), SwingConstants.CENTER);
            }
        }
        ticketsPanel6.add(ticketsPanel6typeLabel);
        ticketsPanel6.add(ticketsPanel6priceLabel);
        ticketsPanel6.add(ticketsPanel6seatsLabel);


        ticketsPanel7 = new JPanel(new GridLayout(1, 3, 0, 50));
        blankPanel1 = new JPanel();
        blankPanel2 = new JPanel();


        buyTicketsButton = new JButton("Kup bilety");
        buyTicketsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Platnosc platnosc = new Platnosc();
                CLayout.show(Main_Panel,"2");
                }

        });

        ticketsPanel7.add(blankPanel1);
        ticketsPanel7.add(blankPanel2);
        ticketsPanel7.add(buyTicketsButton);

        ticketsPanel.add(ticketsPanel1);
        ticketsPanel.add(ticketsPanel2);
        ticketsPanel.add(ticketsPanel3);
        ticketsPanel.add(ticketsPanel4);
        ticketsPanel.add(ticketsPanel5);
        ticketsPanel.add(ticketsPanel6);
        ticketsPanel.add(ticketsPanel7);

    }
}
