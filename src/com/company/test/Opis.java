package com.company.test;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;

import static com.company.test.Card.CLayout;
import static com.company.test.Card.Main_Panel;

/**
 *
 * @author Quinny
 */
public class Opis {
    
    JPanel panelopis;
    JLabel labelopisfilmu;
    JButton buttonop;
    JButton buttonbilet;
    JLabel labelimg;
    JLabel labeltytul;
    JLabel labelgatunek;
    JLabel labeldlugosc;
    JLabel labelprodukcja;
    JTextArea labelopis;
    
    
    Opis(){
        
        panelopis = new JPanel();
        panelopis.setBackground(Color.white);
        panelopis.setLayout(null);
        
        labelopisfilmu = new JLabel("Opis filmu");
        labelopisfilmu.setFont(new Font("Serif", Font.PLAIN, 40));
        labelopisfilmu.setBounds(450, 10, 200, 50);
        
        buttonop = new JButton("Przejdź do repertuaru");
        buttonop.setBounds(10, 10, 200, 40);
        
        buttonbilet = new JButton("Kup bilet");
        buttonbilet.setBounds(105, 520, 200, 40);
        
        labelimg = new JLabel();
        labelimg.setBounds(80,120,250,380);
        
        labeltytul = new JLabel();
        labeltytul.setBounds(350,140,400,40);
        labeltytul.setFont(new Font("Serif", Font.PLAIN, 24));
        
        labelgatunek = new JLabel();
        labelgatunek.setBounds(350,190,300,50);
        labelgatunek.setFont(new Font("Serif", Font.PLAIN, 20));
        
        labeldlugosc = new JLabel();
        labeldlugosc.setBounds(350,215,300,50);
        labeldlugosc.setFont(new Font("Serif", Font.PLAIN, 20));
        
        labelprodukcja = new JLabel();
        labelprodukcja.setBounds(350,240,300,50);
        labelprodukcja.setFont(new Font("Serif", Font.PLAIN, 20));
        
        labelopis = new JTextArea();
        labelopis.setBounds(350, 285, 500, 200);
        labelopis.setLineWrap(true);
        labelopis.setFont(new Font("Serif", Font.PLAIN, 18));
        
        panelopis.add(buttonbilet);
        panelopis.add(buttonop);
        panelopis.add(labelopisfilmu);
        panelopis.add(labelopis);
        panelopis.add(labelimg);
        panelopis.add(labeltytul);
        panelopis.add(labelgatunek);
        panelopis.add(labeldlugosc);
        panelopis.add(labelprodukcja);
        
        ///////////////////
        buttonop.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Biblioteka biblioteka = new Biblioteka();
            Main_Panel.add(new JScrollPane(biblioteka.frame), "2");
            CLayout.show(Main_Panel, "2");
        }
        });
        ///////////////////
        buttonbilet.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            CinemaNumbers cinemaNumbers = new CinemaNumbers();
            Main_Panel.add(cinemaNumbers.cinemaNumbersPanel, "6");
            CLayout.show(Main_Panel, "6");
        }
        });
    }
}
