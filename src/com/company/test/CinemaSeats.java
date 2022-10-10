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

public class CinemaSeats extends CinemaNumbers{
    static JPanel cinemaSeatsPanel;
    JPanel cinemaHallPanel1;
    JPanel cinemaHallPanel2;
    JPanel cinemaHallPanel3;
    JPanel cinemaHallPanel4;
    JPanel cinemaHallPanel5;
    JPanel cinemaHallPanel6;
    JPanel cinemaHallPanel7;
    JButton  choosePlacesButton;
    static ArrayList<JButton> seats = new ArrayList<>();
    static ArrayList<Integer> seatsOccupation = new ArrayList<>();
    static ArrayList<Integer> newSeatsOccupation = new ArrayList<>();
    static ArrayList<Integer> takenSeatsOccupation = new ArrayList<>();
    void setSeats(){
        for (int i=0;i<seats.size();i++){
            if (seatsOccupation.get(i)==1){
                seats.get(i).setBackground(Color.GRAY);
            }else{
                seats.get(i).setBackground(Color.GREEN);
            }
        }
    }
    public int number =0;
    String seatsOccupationString = "";

    CinemaSeats() {
        try {
            DBConnector conne = new DBConnector();
            Connection conn = conne.connect();
            Statement st = conn.createStatement();
            String sql1 = "Select * from tickets";
            ResultSet result  = st.executeQuery(sql1);
            while(result.next()){
                numberOfTickets = result.getInt("value");
            }
            st.close();

        } catch (SQLException ex) {

        }

        cinemaSeatsPanel = new JPanel(new GridLayout(7, 1, 10, 10));
        cinemaHallPanel1 = new JPanel(new GridLayout(3, 10, 10, 10));

        cinemaHallPanel2 = new JPanel(new GridLayout(3, 10, 10, 10));
        JButton cinemaHallPanel2Button1 = new JButton("1");JButton cinemaHallPanel2Button2 = new JButton("2"); JButton cinemaHallPanel2Button3 = new JButton("3");
        JButton cinemaHallPanel2Button4 = new JButton("4");JButton cinemaHallPanel2Button5 = new JButton("5");JButton cinemaHallPanel2Button6 = new JButton("6");
        JButton cinemaHallPanel2Button7 = new JButton("7");JButton cinemaHallPanel2Button8 = new JButton("8");JButton cinemaHallPanel2Button9 = new JButton("9");
        JButton cinemaHallPanel2Button10 = new JButton("10");JButton cinemaHallPanel2Button11 = new JButton("11");JButton cinemaHallPanel2Button12 = new JButton("12");
        JButton cinemaHallPanel2Button13 = new JButton("13");JButton cinemaHallPanel2Button14 = new JButton("14");JButton cinemaHallPanel2Button15 = new JButton("15");
        JButton cinemaHallPanel2Button16 = new JButton("16");JButton cinemaHallPanel2Button17 = new JButton("17");JButton cinemaHallPanel2Button18 = new JButton("18");
        JButton cinemaHallPanel2Button19 = new JButton("19");JButton cinemaHallPanel2Button20 = new JButton("20");JButton cinemaHallPanel2Button21 = new JButton("21");
        JButton cinemaHallPanel2Button22 = new JButton("22");JButton cinemaHallPanel2Button23 = new JButton("23");JButton cinemaHallPanel2Button24 = new JButton("24");
        JButton cinemaHallPanel2Button25 = new JButton("25");JButton cinemaHallPanel2Button26 = new JButton("26");JButton cinemaHallPanel2Button27 = new JButton("27");
        JButton cinemaHallPanel2Button28 = new JButton("28");JButton cinemaHallPanel2Button29 = new JButton("29");JButton cinemaHallPanel2Button30 = new JButton("30");
        cinemaHallPanel2.add(cinemaHallPanel2Button1);cinemaHallPanel2.add(cinemaHallPanel2Button2);cinemaHallPanel2.add(cinemaHallPanel2Button3);
        cinemaHallPanel2.add(cinemaHallPanel2Button4);cinemaHallPanel2.add(cinemaHallPanel2Button5);cinemaHallPanel2.add(cinemaHallPanel2Button6);
        cinemaHallPanel2.add(cinemaHallPanel2Button7);cinemaHallPanel2.add(cinemaHallPanel2Button8);cinemaHallPanel2.add(cinemaHallPanel2Button9);
        cinemaHallPanel2.add(cinemaHallPanel2Button10);cinemaHallPanel2.add(cinemaHallPanel2Button11);cinemaHallPanel2.add(cinemaHallPanel2Button12);
        cinemaHallPanel2.add(cinemaHallPanel2Button13);cinemaHallPanel2.add(cinemaHallPanel2Button14);cinemaHallPanel2.add(cinemaHallPanel2Button15);
        cinemaHallPanel2.add(cinemaHallPanel2Button16);cinemaHallPanel2.add(cinemaHallPanel2Button17);cinemaHallPanel2.add(cinemaHallPanel2Button18);
        cinemaHallPanel2.add(cinemaHallPanel2Button19);cinemaHallPanel2.add(cinemaHallPanel2Button20);cinemaHallPanel2.add(cinemaHallPanel2Button21);
        cinemaHallPanel2.add(cinemaHallPanel2Button22);cinemaHallPanel2.add(cinemaHallPanel2Button23);cinemaHallPanel2.add(cinemaHallPanel2Button24);
        cinemaHallPanel2.add(cinemaHallPanel2Button25);cinemaHallPanel2.add(cinemaHallPanel2Button26);cinemaHallPanel2.add(cinemaHallPanel2Button27);
        cinemaHallPanel2.add(cinemaHallPanel2Button28);cinemaHallPanel2.add(cinemaHallPanel2Button29);cinemaHallPanel2.add(cinemaHallPanel2Button30);

        cinemaHallPanel3 = new JPanel(new GridLayout(3, 10, 10, 10));
        JButton cinemaHallPanel3Button1 = new JButton("31");JButton cinemaHallPanel3Button2 = new JButton("32"); JButton cinemaHallPanel3Button3 = new JButton("33");
        JButton cinemaHallPanel3Button4 = new JButton("34");JButton cinemaHallPanel3Button5 = new JButton("35");JButton cinemaHallPanel3Button6 = new JButton("36");
        JButton cinemaHallPanel3Button7 = new JButton("37");JButton cinemaHallPanel3Button8 = new JButton("38");JButton cinemaHallPanel3Button9 = new JButton("39");
        JButton cinemaHallPanel3Button10 = new JButton("40");JButton cinemaHallPanel3Button11 = new JButton("41");JButton cinemaHallPanel3Button12 = new JButton("42");
        JButton cinemaHallPanel3Button13 = new JButton("43");JButton cinemaHallPanel3Button14 = new JButton("44");JButton cinemaHallPanel3Button15 = new JButton("45");
        JButton cinemaHallPanel3Button16 = new JButton("46");JButton cinemaHallPanel3Button17 = new JButton("47");JButton cinemaHallPanel3Button18 = new JButton("48");
        JButton cinemaHallPanel3Button19 = new JButton("49");JButton cinemaHallPanel3Button20 = new JButton("50");JButton cinemaHallPanel3Button21 = new JButton("51");
        JButton cinemaHallPanel3Button22 = new JButton("52");JButton cinemaHallPanel3Button23 = new JButton("53");JButton cinemaHallPanel3Button24 = new JButton("54");
        JButton cinemaHallPanel3Button25 = new JButton("55");JButton cinemaHallPanel3Button26 = new JButton("56");JButton cinemaHallPanel3Button27 = new JButton("57");
        JButton cinemaHallPanel3Button28 = new JButton("58");JButton cinemaHallPanel3Button29 = new JButton("59");JButton cinemaHallPanel3Button30 = new JButton("60");
        cinemaHallPanel3.add(cinemaHallPanel3Button1);cinemaHallPanel3.add(cinemaHallPanel3Button2);cinemaHallPanel3.add(cinemaHallPanel3Button3);
        cinemaHallPanel3.add(cinemaHallPanel3Button4);cinemaHallPanel3.add(cinemaHallPanel3Button5);cinemaHallPanel3.add(cinemaHallPanel3Button6);
        cinemaHallPanel3.add(cinemaHallPanel3Button7);cinemaHallPanel3.add(cinemaHallPanel3Button8);cinemaHallPanel3.add(cinemaHallPanel3Button9);
        cinemaHallPanel3.add(cinemaHallPanel3Button10);cinemaHallPanel3.add(cinemaHallPanel3Button11);cinemaHallPanel3.add(cinemaHallPanel3Button12);
        cinemaHallPanel3.add(cinemaHallPanel3Button13);cinemaHallPanel3.add(cinemaHallPanel3Button14);cinemaHallPanel3.add(cinemaHallPanel3Button15);
        cinemaHallPanel3.add(cinemaHallPanel3Button16);cinemaHallPanel3.add(cinemaHallPanel3Button17);cinemaHallPanel3.add(cinemaHallPanel3Button18);
        cinemaHallPanel3.add(cinemaHallPanel3Button19);cinemaHallPanel3.add(cinemaHallPanel3Button20);cinemaHallPanel3.add(cinemaHallPanel3Button21);
        cinemaHallPanel3.add(cinemaHallPanel3Button22);cinemaHallPanel3.add(cinemaHallPanel3Button23);cinemaHallPanel3.add(cinemaHallPanel3Button24);
        cinemaHallPanel3.add(cinemaHallPanel3Button25);cinemaHallPanel3.add(cinemaHallPanel3Button26);cinemaHallPanel3.add(cinemaHallPanel3Button27);
        cinemaHallPanel3.add(cinemaHallPanel3Button28);cinemaHallPanel3.add(cinemaHallPanel3Button29);cinemaHallPanel3.add(cinemaHallPanel3Button30);

        cinemaHallPanel4 = new JPanel(new GridLayout(3, 10, 10, 10));
        JButton cinemaHallPanel4Button1 = new JButton("61");JButton cinemaHallPanel4Button2 = new JButton("62"); JButton cinemaHallPanel4Button3 = new JButton("63");
        JButton cinemaHallPanel4Button4 = new JButton("64");JButton cinemaHallPanel4Button5 = new JButton("65");JButton cinemaHallPanel4Button6 = new JButton("66");
        JButton cinemaHallPanel4Button7 = new JButton("67");JButton cinemaHallPanel4Button8 = new JButton("68");JButton cinemaHallPanel4Button9 = new JButton("69");
        JButton cinemaHallPanel4Button10 = new JButton("70");JButton cinemaHallPanel4Button11 = new JButton("71");JButton cinemaHallPanel4Button12 = new JButton("72");
        JButton cinemaHallPanel4Button13 = new JButton("73");JButton cinemaHallPanel4Button14 = new JButton("74");JButton cinemaHallPanel4Button15 = new JButton("75");
        JButton cinemaHallPanel4Button16 = new JButton("76");JButton cinemaHallPanel4Button17 = new JButton("77");JButton cinemaHallPanel4Button18 = new JButton("78");
        JButton cinemaHallPanel4Button19 = new JButton("79");JButton cinemaHallPanel4Button20 = new JButton("80");JButton cinemaHallPanel4Button21 = new JButton("81");
        JButton cinemaHallPanel4Button22 = new JButton("82");JButton cinemaHallPanel4Button23 = new JButton("83");JButton cinemaHallPanel4Button24 = new JButton("84");
        JButton cinemaHallPanel4Button25 = new JButton("85");JButton cinemaHallPanel4Button26 = new JButton("86");JButton cinemaHallPanel4Button27 = new JButton("87");
        JButton cinemaHallPanel4Button28 = new JButton("88");JButton cinemaHallPanel4Button29 = new JButton("89");JButton cinemaHallPanel4Button30 = new JButton("90");
        cinemaHallPanel4.add(cinemaHallPanel4Button1);cinemaHallPanel4.add(cinemaHallPanel4Button2);cinemaHallPanel4.add(cinemaHallPanel4Button3);
        cinemaHallPanel4.add(cinemaHallPanel4Button4);cinemaHallPanel4.add(cinemaHallPanel4Button5);cinemaHallPanel4.add(cinemaHallPanel4Button6);
        cinemaHallPanel4.add(cinemaHallPanel4Button7);cinemaHallPanel4.add(cinemaHallPanel4Button8);cinemaHallPanel4.add(cinemaHallPanel4Button9);
        cinemaHallPanel4.add(cinemaHallPanel4Button10);cinemaHallPanel4.add(cinemaHallPanel4Button11);cinemaHallPanel4.add(cinemaHallPanel4Button12);
        cinemaHallPanel4.add(cinemaHallPanel4Button13);cinemaHallPanel4.add(cinemaHallPanel4Button14);cinemaHallPanel4.add(cinemaHallPanel4Button15);
        cinemaHallPanel4.add(cinemaHallPanel4Button16);cinemaHallPanel4.add(cinemaHallPanel4Button17);cinemaHallPanel4.add(cinemaHallPanel4Button18);
        cinemaHallPanel4.add(cinemaHallPanel4Button19);cinemaHallPanel4.add(cinemaHallPanel4Button20);cinemaHallPanel4.add(cinemaHallPanel4Button21);
        cinemaHallPanel4.add(cinemaHallPanel4Button22);cinemaHallPanel4.add(cinemaHallPanel4Button23);cinemaHallPanel4.add(cinemaHallPanel4Button24);
        cinemaHallPanel4.add(cinemaHallPanel4Button25);cinemaHallPanel4.add(cinemaHallPanel4Button26);cinemaHallPanel4.add(cinemaHallPanel4Button27);
        cinemaHallPanel4.add(cinemaHallPanel4Button28);cinemaHallPanel4.add(cinemaHallPanel4Button29);cinemaHallPanel4.add(cinemaHallPanel4Button30);

        cinemaHallPanel5 = new JPanel(new GridLayout(1, 3, 10, 10));
        choosePlacesButton = new JButton("Wybierz miejsca");
        choosePlacesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (number == numberOfTickets){
                    String seatsOccupationStringPom="";
                    for (int i=0;i<90;i++){
                        seatsOccupationStringPom += newSeatsOccupation.get(i);
                    }
                    try {
                        DBConnector conne = new DBConnector();
                        Connection conn = conne.connect();
                        Statement st = conn.createStatement();
                        String sql = "TRUNCATE seats";
                        // Execute deletion
                        st.executeUpdate(sql);
                        // Use DELETE
                        sql = "DELETE FROM seats";
                        // Execute deletion
                        st.executeUpdate(sql);
                        String insert="insert into seats values('"+seatsOccupationStringPom+"')";
                        st.executeUpdate(insert);
                        st.close();

                    } catch (SQLException ex) {

                    }
                    Tickets tickets = new Tickets();
                    Main_Panel.add(tickets.ticketsPanel, "8");
                    CLayout.show(Main_Panel, "8");
                }
                else{
                    System.out.println("Blad");
                    JFrame errorJFrame = new JFrame();
                    errorJFrame.setSize(300,110);
                    errorJFrame.setResizable(false);
                    errorJFrame.setVisible(true);
                    errorJFrame.setLayout(null);
                    errorJFrame.setLocationRelativeTo(null);
                    //errorJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    JLabel errorText = new JLabel("Błąd wybierz miejsca: ");
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
                }
            }
        });
        JPanel blankPanel3 = new JPanel();
        JPanel blankPanle4 = new JPanel();
        cinemaHallPanel5.add(blankPanel3);
        cinemaHallPanel5.add(blankPanle4);
        cinemaHallPanel5.add(choosePlacesButton);

        cinemaHallPanel6 = new JPanel(new GridLayout(10, 5, 10, 10));
        cinemaHallPanel7 = new JPanel(new GridLayout(1, 3, 10, 10));

        seats.add(cinemaHallPanel2Button1);seats.add(cinemaHallPanel2Button2);seats.add(cinemaHallPanel2Button3);seats.add(cinemaHallPanel2Button4);
        seats.add(cinemaHallPanel2Button5);seats.add(cinemaHallPanel2Button6);seats.add(cinemaHallPanel2Button7);seats.add(cinemaHallPanel2Button8);
        seats.add(cinemaHallPanel2Button9);seats.add(cinemaHallPanel2Button10);seats.add(cinemaHallPanel2Button11);seats.add(cinemaHallPanel2Button12);
        seats.add(cinemaHallPanel2Button13);seats.add(cinemaHallPanel2Button14);seats.add(cinemaHallPanel2Button15);seats.add(cinemaHallPanel2Button16);
        seats.add(cinemaHallPanel2Button17);seats.add(cinemaHallPanel2Button18);seats.add(cinemaHallPanel2Button19);seats.add(cinemaHallPanel2Button20);
        seats.add(cinemaHallPanel2Button21);seats.add(cinemaHallPanel2Button22);seats.add(cinemaHallPanel2Button23);seats.add(cinemaHallPanel2Button24);
        seats.add(cinemaHallPanel2Button25);seats.add(cinemaHallPanel2Button26);seats.add(cinemaHallPanel2Button27);seats.add(cinemaHallPanel2Button28);
        seats.add(cinemaHallPanel2Button29);seats.add(cinemaHallPanel2Button30);

        seats.add(cinemaHallPanel3Button1);seats.add(cinemaHallPanel3Button2);seats.add(cinemaHallPanel3Button3);seats.add(cinemaHallPanel3Button4);
        seats.add(cinemaHallPanel3Button5);seats.add(cinemaHallPanel3Button6);seats.add(cinemaHallPanel3Button7);seats.add(cinemaHallPanel3Button8);
        seats.add(cinemaHallPanel3Button9);seats.add(cinemaHallPanel3Button10);seats.add(cinemaHallPanel3Button11);seats.add(cinemaHallPanel3Button12);
        seats.add(cinemaHallPanel3Button13);seats.add(cinemaHallPanel3Button14);seats.add(cinemaHallPanel3Button15);seats.add(cinemaHallPanel3Button16);
        seats.add(cinemaHallPanel3Button17);seats.add(cinemaHallPanel3Button18);seats.add(cinemaHallPanel3Button19);seats.add(cinemaHallPanel3Button20);
        seats.add(cinemaHallPanel3Button21);seats.add(cinemaHallPanel3Button22);seats.add(cinemaHallPanel3Button23);seats.add(cinemaHallPanel3Button24);
        seats.add(cinemaHallPanel3Button25);seats.add(cinemaHallPanel3Button26);seats.add(cinemaHallPanel3Button27);seats.add(cinemaHallPanel3Button28);
        seats.add(cinemaHallPanel3Button29);seats.add(cinemaHallPanel3Button30);

        seats.add(cinemaHallPanel4Button1);seats.add(cinemaHallPanel4Button2);seats.add(cinemaHallPanel4Button3);seats.add(cinemaHallPanel4Button4);
        seats.add(cinemaHallPanel4Button5);seats.add(cinemaHallPanel4Button6);seats.add(cinemaHallPanel4Button7);seats.add(cinemaHallPanel4Button8);
        seats.add(cinemaHallPanel4Button9);seats.add(cinemaHallPanel4Button10);seats.add(cinemaHallPanel4Button11);seats.add(cinemaHallPanel4Button12);
        seats.add(cinemaHallPanel4Button13);seats.add(cinemaHallPanel4Button14);seats.add(cinemaHallPanel4Button15);seats.add(cinemaHallPanel4Button16);
        seats.add(cinemaHallPanel4Button17);seats.add(cinemaHallPanel4Button18);seats.add(cinemaHallPanel4Button19);seats.add(cinemaHallPanel4Button20);
        seats.add(cinemaHallPanel4Button21);seats.add(cinemaHallPanel4Button22);seats.add(cinemaHallPanel4Button23);seats.add(cinemaHallPanel4Button24);
        seats.add(cinemaHallPanel4Button25);seats.add(cinemaHallPanel4Button26);seats.add(cinemaHallPanel4Button27);seats.add(cinemaHallPanel4Button28);
        seats.add(cinemaHallPanel4Button29);seats.add(cinemaHallPanel4Button30);

        Collections.addAll(takenSeatsOccupation, 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);

        /*

        String seatsOccupationString = "110000010001000000000000001000000100000000000010000000000000000000010000100000000010001000";
        try {

            DBConnector conne = new DBConnector();
            Connection conn = conne.connect();
            Statement st = conn.createStatement();
            String sql = "TRUNCATE seats";
            // Execute deletion
            st.executeUpdate(sql);
            // Use DELETE
            sql = "DELETE FROM seats";
            // Execute deletion
            st.executeUpdate(sql);
            String insert="insert into seats values('"+seatsOccupationString+"')";
            st.executeUpdate(insert);
            st.close();

        } catch (SQLException ex) {

        }*/

        seatsOccupationString = "";
        //newseatsOccupation.clear();
        //seatsOccupation.clear();

        try {
            DBConnector conne = new DBConnector();
            Connection conn = conne.connect();
            Statement st = conn.createStatement();
            String sql1 = "Select * from seats";
            ResultSet result  = st.executeQuery(sql1);
            while(result.next()){
                seatsOccupationString = result.getString("seats");
            }
            st.close();

        } catch (SQLException ex) {

        }
        for (int i = 0; i < seatsOccupationString.length(); i++) {
            seatsOccupation.add(Integer.parseInt(String.valueOf(seatsOccupationString.charAt(i))));
            newSeatsOccupation.add(Integer.parseInt(String.valueOf(seatsOccupationString.charAt(i))));
        }

        for (int i=0;i<seats.size();i++){
            int num = i;
            setSeats();
            seats.get(i).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (seatsOccupation.get(num)!=1&&newSeatsOccupation.get(num)!=1){
                        if (number<numberOfTickets){
                            newSeatsOccupation.set(num,1);
                            takenSeatsOccupation.set(num,1);
                            seats.get(num).setBackground(Color.ORANGE);
                            number++;
                        }
                        else{
                            newSeatsOccupation.clear();
                            newSeatsOccupation.addAll(seatsOccupation);
                            takenSeatsOccupation.clear();
                            Collections.addAll(takenSeatsOccupation, 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
                            setSeats();
                            number =0;
                        }
                    }
                }
            });
        }
        cinemaSeatsPanel.add(cinemaHallPanel1);
        cinemaSeatsPanel.add(cinemaHallPanel7);
        cinemaSeatsPanel.add(cinemaHallPanel2);
        cinemaSeatsPanel.add(cinemaHallPanel3);
        cinemaSeatsPanel.add(cinemaHallPanel4);
        cinemaSeatsPanel.add(cinemaHallPanel5);
        cinemaSeatsPanel.add(cinemaHallPanel6);

    }
}
