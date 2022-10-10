/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.test;

import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Quinny
 */
public class Card {
    
    static CardLayout CLayout;
    JButton nextButton;
    static JPanel Main_Panel;
    public static void nextPanel(){
        CLayout.next(Main_Panel);
    }
        Card(){
       
        JFrame mainframe = new JFrame();
        mainframe.setSize(1000,800);
        mainframe.setLayout(null);
        mainframe.setVisible(true);

        Main_Panel = new JPanel();
        CLayout = new CardLayout();
        Main_Panel.setLayout(CLayout);
        Main_Panel.setBounds(40, 30, 900, 700);

        Glowna glowna = new Glowna();
        Main_Panel.add(glowna.panelgl, "1");
        
        //Biblioteka biblioteka = new Biblioteka();
        //Main_Panel.add(new JScrollPane(biblioteka.frame), "2");
        
        //3 - panel opis
        
        //Logowanie logowanie = new Logowanie();
        //Main_Panel.add(logowanie.Okno, "4");
        
        //Rejestracja rejestracja = new Rejestracja();
        //Main_Panel.add(rejestracja.Rejestr_Form, "5");
        
        //CinemaNumbers cinemaNumbers = new CinemaNumbers();
        //Main_Panel.add(cinemaNumbers.cinemaNumbersPanel, "6");
        
        //CinemaSeats cinemaSeats = new CinemaSeats();
        //Main_Panel.add(cinemaSeats.cinemaSeatsPanel, "7");
        
        CLayout.show(Main_Panel, "1");

        mainframe.add(Main_Panel);
        mainframe.setVisible(true);
        mainframe.setResizable(false);
        mainframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mainframe.setLocationRelativeTo(null);

    }
    
}
