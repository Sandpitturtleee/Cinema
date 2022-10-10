package com.company.test;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import static com.company.test.Card.CLayout;
import static com.company.test.Card.Main_Panel;


public class Miesiackolejny {

    GridBagConstraints gbc;

    JPanel panel;
    JLabel wybierz;
    JLabel label;
    JLabel miesiac;
    JButton cofnij;
    JButton nastepny;
    JLabel pon;JLabel wt;JLabel sr;JLabel czw;JLabel pt;JLabel so;JLabel nie;
    JButton button1;JButton button2;JButton button3;JButton button4;JButton button5;
    JButton button6;JButton button7;JButton button8;JButton button9;JButton button10;
    JButton button11;JButton button12;JButton button13;JButton button14;JButton button15;
    JButton button16;JButton button17;JButton button18;JButton button19;JButton button20;
    JButton button21;JButton button22;JButton button23;JButton button24;JButton button25;
    JButton button26;JButton button27;JButton button28;JButton button29;JButton button30;
    JButton button31;JButton button32;JButton button33;JButton button34;JButton button35;
    Miesiackolejny()
    {
        gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        ////////////
        ///////////////
        panel = new JPanel();
        panel.setLayout(null);

        cofnij = new JButton("Przejdź do strony głównej");
        nastepny = new JButton("Poprzedni miesiąc");
        wybierz = new JLabel("<html> Wybierz datę <br><br></html>");
        wybierz.setFont(new Font("Serif", Font.PLAIN, 40));


        button1=new JButton("26.09");button2=new JButton("27.09");button3=new JButton("28.08");button4=new JButton("29.09");button5=new JButton("30.09");
        button6=new JButton("01.10");button7=new JButton("02.10");button8=new JButton("03.10");button9=new JButton("04.10");button10=new JButton("05.10");
        button11=new JButton("06.10");button12=new JButton("07.10");button13=new JButton("08.10");button14=new JButton("09.10");button15=new JButton("10.10");
        button16=new JButton("11.10");button17=new JButton("12.10");button18=new JButton("13.10");button19=new JButton("14.10");button20=new JButton("15.10");
        button21=new JButton("16.10");button22=new JButton("17.10");button23=new JButton("18.10");button24=new JButton("19.10");button25=new JButton("20.10");
        button26=new JButton("21.10");button27=new JButton("22.10");button28=new JButton("23.10");button29=new JButton("24.10");button30=new JButton("25.10");
        button31=new JButton("26.10");button32=new JButton("27.10");button33=new JButton("28.10");button34=new JButton("29.10");button35=new JButton("30.10");

        pon = new JLabel("poniedziałek");wt = new JLabel("wtorek");sr = new JLabel("środa");czw = new JLabel("czwartek");pt = new JLabel("piątek");so = new JLabel("sobota");nie = new JLabel("niedziela");

        cofnij.setBounds(15,15,200,40);
        wybierz.setBounds(380,20,400,80);
        nastepny.setBounds(100,100,200,30);

        pon.setBounds(120,150,110,30);
        wt.setBounds(245,150,110,30);
        sr.setBounds(355,150,110,30);
        czw.setBounds(460,150,110,30);
        pt.setBounds(580,150,110,30);
        so.setBounds(685,150,110,30);
        nie.setBounds(790,150,110,30);

        button1.setBounds(100,180,110,60);
        button2.setBounds(210,180,110,60);
        button3.setBounds(320,180,110,60);
        button4.setBounds(430,180,110,60);
        button5.setBounds(540,180,110,60);
        button6.setBounds(650,180,110,60);
        button7.setBounds(760,180,110,60);

        button8.setBounds(100,240,110,60);
        button9.setBounds(210,240,110,60);
        button10.setBounds(320,240,110,60);
        button11.setBounds(430,240,110,60);
        button12.setBounds(540,240,110,60);
        button13.setBounds(650,240,110,60);
        button14.setBounds(760,240,110,60);

        button15.setBounds(100,300,110,60);
        button16.setBounds(210,300,110,60);
        button17.setBounds(320,300,110,60);
        button18.setBounds(430,300,110,60);
        button19.setBounds(540,300,110,60);
        button20.setBounds(650,300,110,60);
        button21.setBounds(760,300,110,60);

        button22.setBounds(100,360,110,60);
        button23.setBounds(210,360,110,60);
        button24.setBounds(320,360,110,60);
        button25.setBounds(430,360,110,60);
        button26.setBounds(540,360,110,60);
        button27.setBounds(650,360,110,60);
        button28.setBounds(760,360,110,60);

        button29.setBounds(100,420,110,60);
        button30.setBounds(210,420,110,60);
        button31.setBounds(320,420,110,60);
        button32.setBounds(430,420,110,60);
        button33.setBounds(540,420,110,60);
        button34.setBounds(650,420,110,60);
        button35.setBounds(760,420,110,60);

        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
        button10.setEnabled(false);
        button11.setEnabled(false);
        button12.setEnabled(false);
        button13.setEnabled(false);
        button14.setEnabled(false);
        button15.setEnabled(false);
        button16.setEnabled(false);
        button17.setEnabled(false);
        button18.setEnabled(false);
        button19.setEnabled(false);
        button20.setEnabled(false);
        button21.setEnabled(false);
        button22.setEnabled(false);
        button23.setEnabled(false);
        button24.setEnabled(false);
        button25.setEnabled(false);
        button26.setEnabled(false);
        button27.setEnabled(false);
        button28.setEnabled(false);
        button29.setEnabled(false);
        button30.setEnabled(false);
        button31.setEnabled(false);
        button32.setEnabled(false);
        button33.setEnabled(false);
        button34.setEnabled(false);
        button35.setEnabled(false);


        panel.add(cofnij);
        panel.add(wybierz);
        panel.add(nastepny);
        panel.add(pon);panel.add(wt);panel.add(sr);panel.add(czw);panel.add(pt);panel.add(so);panel.add(nie);
        panel.add(button1);panel.add(button2);panel.add(button3);panel.add(button4);panel.add(button5);
        panel.add(button6);panel.add(button7);panel.add(button8);panel.add(button9);panel.add(button10);
        panel.add(button11);panel.add(button12);panel.add(button13);panel.add(button14);panel.add(button15);
        panel.add(button16);panel.add(button17);panel.add(button18);panel.add(button19);panel.add(button20);
        panel.add(button21);panel.add(button22);panel.add(button23);panel.add(button24);panel.add(button25);
        panel.add(button26);panel.add(button27);panel.add(button28);panel.add(button29);panel.add(button30);
        panel.add(button31);panel.add(button32);panel.add(button33);panel.add(button34);panel.add(button35);
        ////////////////

        cofnij.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CLayout.show(Main_Panel, "1");
            }
        });
        nastepny.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CLayout.show(Main_Panel, "9");
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Biblioteka biblioteka = new Biblioteka();
                //Main_Panel.add(new JScrollPane(biblioteka.frame), "2");
                Main_Panel.add(new JScrollPane(biblioteka.frame,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER), "2");
                CLayout.show(Main_Panel, "2");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Biblioteka biblioteka = new Biblioteka();
                //Main_Panel.add(new JScrollPane(biblioteka.frame), "2");
                Main_Panel.add(new JScrollPane(biblioteka.frame,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER), "2");
                CLayout.show(Main_Panel, "2");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Biblioteka biblioteka = new Biblioteka();
                //Main_Panel.add(new JScrollPane(biblioteka.frame), "2");
                Main_Panel.add(new JScrollPane(biblioteka.frame,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER), "2");
                CLayout.show(Main_Panel, "2");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Biblioteka biblioteka = new Biblioteka();
                //Main_Panel.add(new JScrollPane(biblioteka.frame), "2");
                Main_Panel.add(new JScrollPane(biblioteka.frame,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER), "2");
                CLayout.show(Main_Panel, "2");
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Biblioteka biblioteka = new Biblioteka();
                //Main_Panel.add(new JScrollPane(biblioteka.frame), "2");
                Main_Panel.add(new JScrollPane(biblioteka.frame,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER), "2");
                CLayout.show(Main_Panel, "2");
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Biblioteka biblioteka = new Biblioteka();
                //Main_Panel.add(new JScrollPane(biblioteka.frame), "2");
                Main_Panel.add(new JScrollPane(biblioteka.frame,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER), "2");
                CLayout.show(Main_Panel, "2");
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Biblioteka biblioteka = new Biblioteka();
                //Main_Panel.add(new JScrollPane(biblioteka.frame), "2");
                Main_Panel.add(new JScrollPane(biblioteka.frame,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER), "2");
                CLayout.show(Main_Panel, "2");
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Biblioteka biblioteka = new Biblioteka();
                //Main_Panel.add(new JScrollPane(biblioteka.frame), "2");
                Main_Panel.add(new JScrollPane(biblioteka.frame,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER), "2");
                CLayout.show(Main_Panel, "2");
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Biblioteka biblioteka = new Biblioteka();
                //Main_Panel.add(new JScrollPane(biblioteka.frame), "2");
                Main_Panel.add(new JScrollPane(biblioteka.frame,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER), "2");
                CLayout.show(Main_Panel, "2");
            }
        });
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Biblioteka biblioteka = new Biblioteka();
                //Main_Panel.add(new JScrollPane(biblioteka.frame), "2");
                Main_Panel.add(new JScrollPane(biblioteka.frame,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER), "2");
                CLayout.show(Main_Panel, "2");
            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Biblioteka biblioteka = new Biblioteka();
                //Main_Panel.add(new JScrollPane(biblioteka.frame), "2");
                Main_Panel.add(new JScrollPane(biblioteka.frame,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER), "2");
                CLayout.show(Main_Panel, "2");
            }
        });
        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Biblioteka biblioteka = new Biblioteka();
                //Main_Panel.add(new JScrollPane(biblioteka.frame), "2");
                Main_Panel.add(new JScrollPane(biblioteka.frame,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER), "2");
                CLayout.show(Main_Panel, "2");
            }
        });
        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Biblioteka biblioteka = new Biblioteka();
                //Main_Panel.add(new JScrollPane(biblioteka.frame), "2");
                Main_Panel.add(new JScrollPane(biblioteka.frame,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER), "2");
                CLayout.show(Main_Panel, "2");
            }
        });
        button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Biblioteka biblioteka = new Biblioteka();
                //Main_Panel.add(new JScrollPane(biblioteka.frame), "2");
                Main_Panel.add(new JScrollPane(biblioteka.frame,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER), "2");
                CLayout.show(Main_Panel, "2");
            }
        });
        button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Biblioteka biblioteka = new Biblioteka();
                //Main_Panel.add(new JScrollPane(biblioteka.frame), "2");
                Main_Panel.add(new JScrollPane(biblioteka.frame,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER), "2");
                CLayout.show(Main_Panel, "2");
            }
        });
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Biblioteka biblioteka = new Biblioteka();
                //Main_Panel.add(new JScrollPane(biblioteka.frame), "2");
                Main_Panel.add(new JScrollPane(biblioteka.frame,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER), "2");
                CLayout.show(Main_Panel, "2");
            }
        });
        button17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Biblioteka biblioteka = new Biblioteka();
                //Main_Panel.add(new JScrollPane(biblioteka.frame), "2");
                Main_Panel.add(new JScrollPane(biblioteka.frame,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER), "2");
                CLayout.show(Main_Panel, "2");
            }
        });
        button18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Biblioteka biblioteka = new Biblioteka();
                //Main_Panel.add(new JScrollPane(biblioteka.frame), "2");
                Main_Panel.add(new JScrollPane(biblioteka.frame,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER), "2");
                CLayout.show(Main_Panel, "2");
            }
        });
        button19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Biblioteka biblioteka = new Biblioteka();
                //Main_Panel.add(new JScrollPane(biblioteka.frame), "2");
                Main_Panel.add(new JScrollPane(biblioteka.frame,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER), "2");
                CLayout.show(Main_Panel, "2");
            }
        });
        button20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Biblioteka biblioteka = new Biblioteka();
                //Main_Panel.add(new JScrollPane(biblioteka.frame), "2");
                Main_Panel.add(new JScrollPane(biblioteka.frame,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER), "2");
                CLayout.show(Main_Panel, "2");
            }
        });
        button21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Biblioteka biblioteka = new Biblioteka();
                //Main_Panel.add(new JScrollPane(biblioteka.frame), "2");
                Main_Panel.add(new JScrollPane(biblioteka.frame,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER), "2");
                CLayout.show(Main_Panel, "2");
            }
        });
        button22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Biblioteka biblioteka = new Biblioteka();
                //Main_Panel.add(new JScrollPane(biblioteka.frame), "2");
                Main_Panel.add(new JScrollPane(biblioteka.frame,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER), "2");
                CLayout.show(Main_Panel, "2");
            }
        });
        button23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Biblioteka biblioteka = new Biblioteka();
                //Main_Panel.add(new JScrollPane(biblioteka.frame), "2");
                Main_Panel.add(new JScrollPane(biblioteka.frame,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER), "2");
                CLayout.show(Main_Panel, "2");
            }
        });
        button24.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Biblioteka biblioteka = new Biblioteka();
                //Main_Panel.add(new JScrollPane(biblioteka.frame), "2");
                Main_Panel.add(new JScrollPane(biblioteka.frame,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER), "2");
                CLayout.show(Main_Panel, "2");
            }
        });
        button25.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Biblioteka biblioteka = new Biblioteka();
                //Main_Panel.add(new JScrollPane(biblioteka.frame), "2");
                Main_Panel.add(new JScrollPane(biblioteka.frame,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER), "2");
                CLayout.show(Main_Panel, "2");
            }
        });
        button26.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Biblioteka biblioteka = new Biblioteka();
                //Main_Panel.add(new JScrollPane(biblioteka.frame), "2");
                Main_Panel.add(new JScrollPane(biblioteka.frame,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER), "2");
                CLayout.show(Main_Panel, "2");
            }
        });
        button27.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Biblioteka biblioteka = new Biblioteka();
                //Main_Panel.add(new JScrollPane(biblioteka.frame), "2");
                Main_Panel.add(new JScrollPane(biblioteka.frame,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER), "2");
                CLayout.show(Main_Panel, "2");
            }
        });
        button28.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Biblioteka biblioteka = new Biblioteka();
                //Main_Panel.add(new JScrollPane(biblioteka.frame), "2");
                Main_Panel.add(new JScrollPane(biblioteka.frame,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER), "2");
                CLayout.show(Main_Panel, "2");
            }
        });
        button29.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Biblioteka biblioteka = new Biblioteka();
                //Main_Panel.add(new JScrollPane(biblioteka.frame), "2");
                Main_Panel.add(new JScrollPane(biblioteka.frame,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER), "2");
                CLayout.show(Main_Panel, "2");
            }
        });
        button30.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Biblioteka biblioteka = new Biblioteka();
                //Main_Panel.add(new JScrollPane(biblioteka.frame), "2");
                Main_Panel.add(new JScrollPane(biblioteka.frame,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER), "2");
                CLayout.show(Main_Panel, "2");
            }
        });
        button31.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Biblioteka biblioteka = new Biblioteka();
                //Main_Panel.add(new JScrollPane(biblioteka.frame), "2");
                Main_Panel.add(new JScrollPane(biblioteka.frame,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER), "2");
                CLayout.show(Main_Panel, "2");
            }
        });
        button32.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Biblioteka biblioteka = new Biblioteka();
                //Main_Panel.add(new JScrollPane(biblioteka.frame), "2");
                Main_Panel.add(new JScrollPane(biblioteka.frame,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER), "2");
                CLayout.show(Main_Panel, "2");
            }
        });
        button33.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Biblioteka biblioteka = new Biblioteka();
                //Main_Panel.add(new JScrollPane(biblioteka.frame), "2");
                Main_Panel.add(new JScrollPane(biblioteka.frame,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER), "2");
                CLayout.show(Main_Panel, "2");
            }
        });
        button34.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Biblioteka biblioteka = new Biblioteka();
                //Main_Panel.add(new JScrollPane(biblioteka.frame), "2");
                Main_Panel.add(new JScrollPane(biblioteka.frame,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER), "2");
                CLayout.show(Main_Panel, "2");
            }
        });
    }
}