package com.company.test;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import static com.company.test.Card.CLayout;
import static com.company.test.Card.Main_Panel;


public class Glowna {
    JPanel panelgl;
    JLabel label;
    JButton buttongl;
    static JButton buttonlog;
    JButton buttonrej;
    
    
    Glowna()
    {
        panelgl = new JPanel();
        panelgl.setLayout(null);
        
        label = new JLabel("Witaj na stronie kina!");
        label.setFont(new Font("Serif", Font.PLAIN, 44));
        label.setBounds(280,50,400,60);
        
        buttongl = new JButton("Przejdź do repertuaru");
        buttongl.setFont(new Font("Serif", Font.PLAIN, 24));
        buttongl.setBounds(345,150,260,50);
        
        buttonlog = new JButton("Zaloguj się");
        buttonlog.setFont(new Font("Serif", Font.PLAIN, 24));
        buttonlog.setBounds(345,250,260,50);
        
        buttonrej = new JButton("Zarejestruj się");
        buttonrej.setFont(new Font("Serif", Font.PLAIN, 24));
        buttonrej.setBounds(345,350,260,50);
        
        panelgl.add(label);
        panelgl.add(buttongl);
        panelgl.add(buttonlog);
        panelgl.add(buttonrej);

        buttongl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Miesiac czerwiec = new Miesiac();
                Main_Panel.add(czerwiec.panel, "9");
                CLayout.show(Main_Panel, "9");
            }
        });

  ///////////////////
        buttonlog.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Logowanie logowanie = new Logowanie();
            Main_Panel.add(logowanie.Okno, "4");
            CLayout.show(Main_Panel, "4");
        }
        });
  ///////////////////
        buttonrej.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Rejestracja rejestracja = new Rejestracja();
            Main_Panel.add(rejestracja.Rejestr_Form, "5");
            CLayout.show(Main_Panel, "5");
        }
        });
        
        
        
    }
}
