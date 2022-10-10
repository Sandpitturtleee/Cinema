/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import static com.company.test.Card.CLayout;
import static com.company.test.Card.Main_Panel;

/**
 *
 * @author Quinny
 */
public class Biblioteka {

    JPanel frame;
    JPanel gora;
    JLabel label;
    JButton buttongl2;
    GridBagConstraints gbc;
    //////////////////////
    JButton buttontytul1;
    JLabel labeltytul1;
    JLabel labelgatunek1;
    JLabel labeldlugosc1;
    JLabel labelpuste1;

    JButton buttontytul2;
    JLabel labeltytul2;
    JLabel labelgatunek2;
    JLabel labeldlugosc2;
    JLabel labelpuste2;

    JButton buttontytul3;
    JLabel labeltytul3;
    JLabel labelgatunek3;
    JLabel labeldlugosc3;
    JLabel labelpuste3;

    JButton buttontytul4;
    JLabel labeltytul4;
    JLabel labelgatunek4;
    JLabel labeldlugosc4;
    JLabel labelpuste4;

    JButton buttontytul5;
    JLabel labeltytul5;
    JLabel labelgatunek5;
    JLabel labeldlugosc5;
    JLabel labelpuste5;

    JButton buttontytul6;
    JLabel labeltytul6;
    JLabel labelgatunek6;
    JLabel labeldlugosc6;

    JButton buttontytul7;
    JLabel labeltytul7;
    JLabel labelgatunek7;
    JLabel labeldlugosc7;

    JButton buttontytul8;
    JLabel labeltytul8;
    JLabel labelgatunek8;
    JLabel labeldlugosc8;

    JButton buttontytul9;
    JLabel labeltytul9;
    JLabel labelgatunek9;
    JLabel labeldlugosc9;

    JButton buttontytul10;
    JLabel labeltytul10;
    JLabel labelgatunek10;
    JLabel labeldlugosc10;

    ImageIcon image;

    JScrollPane scroll;

    Biblioteka() {
        gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        ////////////////////
        image = new ImageIcon();

        buttontytul1 = new JButton();
        labeltytul1 = new JLabel();
        labelgatunek1 = new JLabel();
        labeldlugosc1 = new JLabel();
        labelpuste1 = new JLabel();

        buttontytul2 = new JButton();
        labeltytul2 = new JLabel();
        labelgatunek2 = new JLabel();
        labeldlugosc2 = new JLabel();
        labelpuste2 = new JLabel();

        buttontytul3 = new JButton();
        labeltytul3 = new JLabel();
        labelgatunek3 = new JLabel();
        labeldlugosc3 = new JLabel();
        labelpuste3 = new JLabel();

        buttontytul4 = new JButton();
        labeltytul4 = new JLabel();
        labelgatunek4 = new JLabel();
        labeldlugosc4 = new JLabel();
        labelpuste4 = new JLabel();

        buttontytul5 = new JButton();
        labeltytul5 = new JLabel();
        labelgatunek5 = new JLabel();
        labeldlugosc5 = new JLabel();
        labelpuste5 = new JLabel();

        buttontytul6 = new JButton();
        labeltytul6 = new JLabel();
        labelgatunek6 = new JLabel();
        labeldlugosc6 = new JLabel();

        buttontytul7 = new JButton();
        labeltytul7 = new JLabel();
        labelgatunek7 = new JLabel();
        labeldlugosc7 = new JLabel();

        buttontytul8 = new JButton();
        labeltytul8 = new JLabel();
        labelgatunek8 = new JLabel();
        labeldlugosc8 = new JLabel();

        buttontytul9 = new JButton();
        labeltytul9 = new JLabel();
        labelgatunek9 = new JLabel();
        labeldlugosc9 = new JLabel();

        buttontytul10 = new JButton();
        labeltytul10 = new JLabel();
        labelgatunek10 = new JLabel();
        labeldlugosc10 = new JLabel();
        ///////////////////////

        frame = new JPanel(new GridBagLayout());

        buttongl2 = new JButton("<html><pre>     <br>Przejdź do strony głównej <br>                  </pre></html>");

        label = new JLabel("                                                                                                                                                                                                                                                           ");

        gora = new JPanel();
        gora.add(buttongl2, gbc);
        gora.add(label, gbc);

        frame.add(gora, gbc);

        try {
            String query = "SELECT * FROM filmrep";
            DBConnector conne = new DBConnector();
            Connection conn = conne.connect();

            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("id");
                String tytul = rs.getString("tytul");
                String gatunek = rs.getString("gatunek");
                String dlugosc = rs.getString("dlugosc");
                String puste = rs.getString("puste");

                String zdjecie = rs.getString("zdjecie");

                if (id == 1) {

                    labeltytul1.setText(String.valueOf(tytul));
                    labeltytul1.setFont(new Font("Serif", Font.PLAIN, 24));
                    labelgatunek1.setText(String.valueOf(gatunek));
                    labelgatunek1.setFont(new Font("Serif", Font.PLAIN, 18));
                    labeldlugosc1.setText(String.valueOf(dlugosc));
                    labeldlugosc1.setFont(new Font("Serif", Font.PLAIN, 18));
                    labelpuste1.setText(String.valueOf(puste));

                    URL url = null;
                    try {
                        url = new URL(String.valueOf(zdjecie));
                    } catch (MalformedURLException ex) {
                        Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    BufferedImage c = null;
                    try {
                        c = ImageIO.read(url);
                    } catch (IOException ex) {
                        Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    image = new ImageIcon(c);
                    Image img = image.getImage();
                    Image newimg = img.getScaledInstance(200, 300, Image.SCALE_SMOOTH);
                    image = new ImageIcon(newimg);
                    buttontytul1.setIcon(image);

                    JPanel panelo1 = new JPanel();
                    JPanel panelol = new JPanel();
                    JPanel panelop = new JPanel(new GridLayout(4, 1));
                    panelol.add(buttontytul1);
                    panelop.add(labeltytul1, gbc);
                    panelop.add(labelgatunek1, gbc);
                    panelop.add(labeldlugosc1, gbc);
                    panelop.add(labelpuste1, gbc);

                    panelo1.add(panelol);
                    panelo1.add(panelop);

                    frame.add(panelo1, gbc);
                }
                if (id == 2) {

                    labeltytul2.setText(String.valueOf(tytul));
                    labeltytul2.setFont(new Font("Serif", Font.PLAIN, 24));
                    labelgatunek2.setText(String.valueOf(gatunek));
                    labelgatunek2.setFont(new Font("Serif", Font.PLAIN, 18));
                    labeldlugosc2.setText(String.valueOf(dlugosc));
                    labeldlugosc2.setFont(new Font("Serif", Font.PLAIN, 18));
                    labelpuste2.setText(String.valueOf(puste));

                    URL url = null;
                    try {
                        url = new URL(String.valueOf(zdjecie));
                    } catch (MalformedURLException ex) {
                        Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    BufferedImage c = null;
                    try {
                        c = ImageIO.read(url);
                    } catch (IOException ex) {
                        Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    image = new ImageIcon(c);
                    Image img = image.getImage();
                    Image newimg = img.getScaledInstance(200, 300, Image.SCALE_SMOOTH);
                    image = new ImageIcon(newimg);
                    buttontytul2.setIcon(image);

                    JPanel panelo1 = new JPanel();
                    JPanel panelol = new JPanel();
                    JPanel panelop = new JPanel(new GridLayout(4, 1));
                    panelol.add(buttontytul2);
                    panelop.add(labeltytul2, gbc);
                    panelop.add(labelgatunek2, gbc);
                    panelop.add(labeldlugosc2, gbc);
                    panelop.add(labelpuste2, gbc);

                    panelo1.add(panelol);
                    panelo1.add(panelop);

                    frame.add(panelo1, gbc);
                }
                if (id == 3) {

                    labeltytul3.setText(String.valueOf(tytul));
                    labeltytul3.setFont(new Font("Serif", Font.PLAIN, 24));
                    labelgatunek3.setText(String.valueOf(gatunek));
                    labelgatunek3.setFont(new Font("Serif", Font.PLAIN, 18));
                    labeldlugosc3.setText(String.valueOf(dlugosc));
                    labeldlugosc3.setFont(new Font("Serif", Font.PLAIN, 18));
                    labelpuste3.setText(String.valueOf(puste));

                    URL url = null;
                    try {
                        url = new URL(String.valueOf(zdjecie));
                    } catch (MalformedURLException ex) {
                        Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    BufferedImage c = null;
                    try {
                        c = ImageIO.read(url);
                    } catch (IOException ex) {
                        Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    image = new ImageIcon(c);
                    Image img = image.getImage();
                    Image newimg = img.getScaledInstance(200, 300, Image.SCALE_SMOOTH);
                    image = new ImageIcon(newimg);
                    buttontytul3.setIcon(image);

                    JPanel panelo1 = new JPanel();
                    JPanel panelol = new JPanel();
                    JPanel panelop = new JPanel(new GridLayout(4, 1));
                    panelol.add(buttontytul3);
                    panelop.add(labeltytul3, gbc);
                    panelop.add(labelgatunek3, gbc);
                    panelop.add(labeldlugosc3, gbc);
                    panelop.add(labelpuste3, gbc);

                    panelo1.add(panelol);
                    panelo1.add(panelop);

                    frame.add(panelo1, gbc);
                }
                if (id == 4) {

                    labeltytul4.setText(String.valueOf(tytul));
                    labeltytul4.setFont(new Font("Serif", Font.PLAIN, 24));
                    labelgatunek4.setText(String.valueOf(gatunek));
                    labelgatunek4.setFont(new Font("Serif", Font.PLAIN, 18));
                    labeldlugosc4.setText(String.valueOf(dlugosc));
                    labeldlugosc4.setFont(new Font("Serif", Font.PLAIN, 18));
                    labelpuste4.setText(String.valueOf(puste));

                    URL url = null;
                    try {
                        url = new URL(String.valueOf(zdjecie));
                    } catch (MalformedURLException ex) {
                        Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    BufferedImage c = null;
                    try {
                        c = ImageIO.read(url);
                    } catch (IOException ex) {
                        Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    image = new ImageIcon(c);
                    Image img = image.getImage();
                    Image newimg = img.getScaledInstance(200, 300, Image.SCALE_SMOOTH);
                    image = new ImageIcon(newimg);
                    buttontytul4.setIcon(image);

                    JPanel panelo1 = new JPanel();
                    JPanel panelol = new JPanel();
                    JPanel panelop = new JPanel(new GridLayout(4, 1));
                    panelol.add(buttontytul4);
                    panelop.add(labeltytul4, gbc);
                    panelop.add(labelgatunek4, gbc);
                    panelop.add(labeldlugosc4, gbc);
                    panelop.add(labelpuste4, gbc);

                    panelo1.add(panelol);
                    panelo1.add(panelop);

                    frame.add(panelo1, gbc);
                }
                if (id == 5) {

                    labeltytul5.setText(String.valueOf(tytul));
                    labeltytul5.setFont(new Font("Serif", Font.PLAIN, 24));
                    labelgatunek5.setText(String.valueOf(gatunek));
                    labelgatunek5.setFont(new Font("Serif", Font.PLAIN, 18));
                    labeldlugosc5.setText(String.valueOf(dlugosc));
                    labeldlugosc5.setFont(new Font("Serif", Font.PLAIN, 18));
                    labelpuste5.setText(String.valueOf(puste));

                    URL url = null;
                    try {
                        url = new URL(String.valueOf(zdjecie));
                    } catch (MalformedURLException ex) {
                        Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    BufferedImage c = null;
                    try {
                        c = ImageIO.read(url);
                    } catch (IOException ex) {
                        Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    image = new ImageIcon(c);
                    Image img = image.getImage();
                    Image newimg = img.getScaledInstance(200, 300, Image.SCALE_SMOOTH);
                    image = new ImageIcon(newimg);
                    buttontytul5.setIcon(image);

                    JPanel panelo1 = new JPanel();
                    JPanel panelol = new JPanel();
                    JPanel panelop = new JPanel(new GridLayout(4, 1));
                    panelol.add(buttontytul5);
                    panelop.add(labeltytul5, gbc);
                    panelop.add(labelgatunek5, gbc);
                    panelop.add(labeldlugosc5, gbc);
                    panelop.add(labelpuste5, gbc);

                    panelo1.add(panelol);
                    panelo1.add(panelop);

                    frame.add(panelo1, gbc);
                }

            }
            st.close();
        } catch (SQLException ex) {

        }

        ///////////////////
        buttongl2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CLayout.show(Main_Panel, "1");
            }
        });

        ///////////////////
        buttontytul1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    String query = "SELECT * FROM filmrep";
                    DBConnector conne = new DBConnector();
                    Connection conn = conne.connect();

                    Statement st = conn.createStatement();

                    ResultSet rs = st.executeQuery(query);

                    while (rs.next()) {
                        int id = rs.getInt("id");

                        if (id == 1) {
                            String zdjecie = rs.getString("zdjecie");
                            String tytul = rs.getString("tytul");
                            String gatunek = rs.getString("gatunek");
                            String dlugosc = rs.getString("dlugosc");
                            String opiscaly = rs.getString("opiscaly");
                            String produkcja = rs.getString("produkcja");

                            URL url = null;
                            try {
                                url = new URL(String.valueOf(zdjecie));
                            } catch (MalformedURLException ex) {
                                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            BufferedImage c = null;
                            try {
                                c = ImageIO.read(url);
                            } catch (IOException ex) {
                                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            ImageIcon image = new ImageIcon(c);
                            Image img = image.getImage();
                            Image newimg = img.getScaledInstance(250, 380, Image.SCALE_SMOOTH);
                            image = new ImageIcon(newimg);

                            Opis opis = new Opis();
                            opis.labelimg.setIcon(image);

                            opis.labelopis.setText(opiscaly);

                            opis.labeltytul.setText(String.valueOf(tytul));
                            opis.labelgatunek.setText(String.valueOf(gatunek));
                            opis.labeldlugosc.setText(String.valueOf(dlugosc));
                            opis.labelprodukcja.setText(String.valueOf(produkcja));
                            Main_Panel.add(opis.panelopis, "3");
                        }

                    }
                    st.close();
                } catch (SQLException ex) {

                }

                CLayout.show(Main_Panel, "3");
            }
        });
        ///////////////////
        buttontytul2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    String query = "SELECT * FROM filmrep";
                    DBConnector conne = new DBConnector();
                    Connection conn = conne.connect();

                    Statement st = conn.createStatement();

                    ResultSet rs = st.executeQuery(query);

                    while (rs.next()) {
                        int id = rs.getInt("id");

                        if (id == 2) {
                            String zdjecie = rs.getString("zdjecie");
                            String tytul = rs.getString("tytul");
                            String gatunek = rs.getString("gatunek");
                            String dlugosc = rs.getString("dlugosc");
                            String opiscaly = rs.getString("opiscaly");
                            String produkcja = rs.getString("produkcja");

                            URL url = null;
                            try {
                                url = new URL(String.valueOf(zdjecie));
                            } catch (MalformedURLException ex) {
                                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            BufferedImage c = null;
                            try {
                                c = ImageIO.read(url);
                            } catch (IOException ex) {
                                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            ImageIcon image = new ImageIcon(c);
                            Image img = image.getImage();
                            Image newimg = img.getScaledInstance(250, 380, Image.SCALE_SMOOTH);
                            image = new ImageIcon(newimg);

                            Opis opis = new Opis();
                            opis.labelimg.setIcon(image);

                            opis.labelopis.setText(opiscaly);

                            opis.labeltytul.setText(String.valueOf(tytul));
                            opis.labelgatunek.setText(String.valueOf(gatunek));
                            opis.labeldlugosc.setText(String.valueOf(dlugosc));
                            opis.labelprodukcja.setText(String.valueOf(produkcja));
                            Main_Panel.add(opis.panelopis, "3");
                        }

                    }
                    st.close();
                } catch (SQLException ex) {

                }

                CLayout.show(Main_Panel, "3");
            }
        });
        buttontytul3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    String query = "SELECT * FROM filmrep";
                    DBConnector conne = new DBConnector();
                    Connection conn = conne.connect();

                    Statement st = conn.createStatement();

                    ResultSet rs = st.executeQuery(query);

                    while (rs.next()) {
                        int id = rs.getInt("id");

                        if (id == 3) {
                            String zdjecie = rs.getString("zdjecie");
                            String tytul = rs.getString("tytul");
                            String gatunek = rs.getString("gatunek");
                            String dlugosc = rs.getString("dlugosc");
                            String opiscaly = rs.getString("opiscaly");
                            String produkcja = rs.getString("produkcja");

                            URL url = null;
                            try {
                                url = new URL(String.valueOf(zdjecie));
                            } catch (MalformedURLException ex) {
                                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            BufferedImage c = null;
                            try {
                                c = ImageIO.read(url);
                            } catch (IOException ex) {
                                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            ImageIcon image = new ImageIcon(c);
                            Image img = image.getImage();
                            Image newimg = img.getScaledInstance(250, 380, Image.SCALE_SMOOTH);
                            image = new ImageIcon(newimg);

                            Opis opis = new Opis();
                            opis.labelimg.setIcon(image);

                            opis.labelopis.setText(opiscaly);

                            opis.labeltytul.setText(String.valueOf(tytul));
                            opis.labelgatunek.setText(String.valueOf(gatunek));
                            opis.labeldlugosc.setText(String.valueOf(dlugosc));
                            opis.labelprodukcja.setText(String.valueOf(produkcja));
                            Main_Panel.add(opis.panelopis, "3");
                        }

                    }
                    st.close();
                } catch (SQLException ex) {

                }

                CLayout.show(Main_Panel, "3");
            }
        });
        buttontytul4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    String query = "SELECT * FROM filmrep";
                    DBConnector conne = new DBConnector();
                    Connection conn = conne.connect();

                    Statement st = conn.createStatement();

                    ResultSet rs = st.executeQuery(query);

                    while (rs.next()) {
                        int id = rs.getInt("id");

                        if (id == 4) {
                            String zdjecie = rs.getString("zdjecie");
                            String tytul = rs.getString("tytul");
                            String gatunek = rs.getString("gatunek");
                            String dlugosc = rs.getString("dlugosc");
                            String opiscaly = rs.getString("opiscaly");
                            String produkcja = rs.getString("produkcja");

                            URL url = null;
                            try {
                                url = new URL(String.valueOf(zdjecie));
                            } catch (MalformedURLException ex) {
                                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            BufferedImage c = null;
                            try {
                                c = ImageIO.read(url);
                            } catch (IOException ex) {
                                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            ImageIcon image = new ImageIcon(c);
                            Image img = image.getImage();
                            Image newimg = img.getScaledInstance(250, 380, Image.SCALE_SMOOTH);
                            image = new ImageIcon(newimg);

                            Opis opis = new Opis();
                            opis.labelimg.setIcon(image);

                            opis.labelopis.setText(opiscaly);

                            opis.labeltytul.setText(String.valueOf(tytul));
                            opis.labelgatunek.setText(String.valueOf(gatunek));
                            opis.labeldlugosc.setText(String.valueOf(dlugosc));
                            opis.labelprodukcja.setText(String.valueOf(produkcja));
                            Main_Panel.add(opis.panelopis, "3");
                        }

                    }
                    st.close();
                } catch (SQLException ex) {

                }

                CLayout.show(Main_Panel, "3");
            }
        });
        buttontytul5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    String query = "SELECT * FROM filmrep";
                    DBConnector conne = new DBConnector();
                    Connection conn = conne.connect();

                    Statement st = conn.createStatement();

                    ResultSet rs = st.executeQuery(query);

                    while (rs.next()) {
                        int id = rs.getInt("id");

                        if (id == 5) {
                            String zdjecie = rs.getString("zdjecie");
                            String tytul = rs.getString("tytul");
                            String gatunek = rs.getString("gatunek");
                            String dlugosc = rs.getString("dlugosc");
                            String opiscaly = rs.getString("opiscaly");
                            String produkcja = rs.getString("produkcja");

                            URL url = null;
                            try {
                                url = new URL(String.valueOf(zdjecie));
                            } catch (MalformedURLException ex) {
                                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            BufferedImage c = null;
                            try {
                                c = ImageIO.read(url);
                            } catch (IOException ex) {
                                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            ImageIcon image = new ImageIcon(c);
                            Image img = image.getImage();
                            Image newimg = img.getScaledInstance(250, 380, Image.SCALE_SMOOTH);
                            image = new ImageIcon(newimg);

                            Opis opis = new Opis();
                            opis.labelimg.setIcon(image);

                            opis.labelopis.setText(opiscaly);

                            opis.labeltytul.setText(String.valueOf(tytul));
                            opis.labelgatunek.setText(String.valueOf(gatunek));
                            opis.labeldlugosc.setText(String.valueOf(dlugosc));
                            opis.labelprodukcja.setText(String.valueOf(produkcja));
                            Main_Panel.add(opis.panelopis, "3");
                        }

                    }
                    st.close();
                } catch (SQLException ex) {

                }

                CLayout.show(Main_Panel, "3");
            }
        });
    }

}
