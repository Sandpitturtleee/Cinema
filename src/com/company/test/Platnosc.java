package com.company.test;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Platnosc extends JFrame implements ActionListener {
    CardLayout cardLayout;

    JPanel wyborPanel;
    // Karta elementy
    JButton kartaButton;
    JButton backButtonKarta;
    JButton confirmButtonKarta;
    JTextField nameTextField;
    JTextField cardNumberTextField;
    JSpinner dateMonthSpinner;
    JSpinner dateYearSpinner;
    JTextField cvcTextField;
    // Blik elementy
    JButton backButtonBlik;
    JButton blikButton;

    JButton confirmButtonBlik;
    JTextField textFieldBlik;

    private boolean succesfulPayment;

    // Succes elementy
    JButton confirmButtonSuccess;
    // Unsuccess elementy
    JButton confirmButtonUnsuccess;
    JButton tryAgainButton;

    Container container;

    Platnosc() {
        succesfulPayment = false;
        cardLayout = new CardLayout();


        container = getContentPane();
        container.setLayout(cardLayout);

        // Panel wyboru platnosci
        wyborPanel = new JPanel();
        wyborPanel.setLayout(null);

        JLabel wyborLabel = new JLabel();
        wyborLabel.setText("Wybierz sposób zapłaty: ");
        wyborLabel.setBounds(220, 100, 400, 50);
        wyborLabel.setFont(new Font("",Font.BOLD,  25));
        wyborPanel.add(wyborLabel);

        kartaButton = new JButton();
        kartaButton.addActionListener(this);
        kartaButton.setText("Karta Płatnicza");
        kartaButton.setBounds(175, 250, 200, 100);
        kartaButton.setBackground(Color.white);
        kartaButton.setFocusable(false);
        kartaButton.setIcon(new ImageIcon(scaleImage("./karta.png", 50, 50)));
        wyborPanel.add(kartaButton);


        blikButton = new JButton();
        blikButton.addActionListener(this);
        blikButton.setText("Blik");
        blikButton.setBounds(425, 250, 200, 100);
        blikButton.setBackground(Color.white);
        blikButton.setFocusable(false);
        blikButton.setIcon(new ImageIcon(scaleImage("./blik.png", 50, 30)));
        wyborPanel.add(blikButton);


        // Panel zaplaty karta
        JPanel kartaPanel = new JPanel();
        kartaPanel.setLayout(null);

        backButtonKarta = new JButton();
        backButtonKarta.addActionListener(this);
        backButtonKarta.setText("Powrót");
        backButtonKarta.setBounds(10, 485, 150, 75);
        backButtonKarta.setBackground(Color.white);
        backButtonKarta.setFocusable(false);
        kartaPanel.add(backButtonKarta);

        confirmButtonKarta = new JButton();
        confirmButtonKarta.addActionListener(this);
        confirmButtonKarta.setText("Zaakceptuj");
        confirmButtonKarta.setBounds(790 - 150, 485, 150, 75);
        confirmButtonKarta.setBackground(Color.white);
        confirmButtonKarta.setFocusable(false);
        kartaPanel.add(confirmButtonKarta);

        JLabel mainKartaLabel = new JLabel("Wpisz dane karty płatniczej");
        mainKartaLabel.setBounds(200, 100, 400, 50);
        mainKartaLabel.setFont(new Font("", Font.BOLD, 25));
        kartaPanel.add(mainKartaLabel);

        JLabel labelKartaIcon = new JLabel();
        labelKartaIcon.setBounds(10, 10, 100, 100);
        labelKartaIcon.setIcon(new ImageIcon(scaleImage("karta.png", labelKartaIcon.getWidth(), labelKartaIcon.getHeight())));
        kartaPanel.add(labelKartaIcon);


        JLabel nameKartaLabel = new JLabel("Imie i Nazwisko");
        nameKartaLabel.setBounds(250, 180, 300, 20);
        nameKartaLabel .setFont(new Font("", Font.PLAIN, 20));
        kartaPanel.add(nameKartaLabel);


        // Pole Imie i nazwisko
        LengthRestrictedDocument nameDoc = new LengthRestrictedDocument(40);
        nameTextField = new JTextField();
        nameTextField.setDocument(nameDoc);
        nameTextField.setBounds(250, 200, 300, 40);
        nameTextField.setFont(new Font("", Font.PLAIN, 20));
        kartaPanel.add(nameTextField);

        JLabel numerKartaLabel = new JLabel("Numer Karty");
        numerKartaLabel.setBounds(250, 250, 150, 20);
        numerKartaLabel.setFont(new Font("", Font.PLAIN, 20));
        kartaPanel.add(numerKartaLabel);

        // Pole numer karty
        PlainDocument cardNumberDoc = new PlainDocument();
        cardNumberDoc.setDocumentFilter(new IntDocumentFilter(16));
        cardNumberTextField = new JTextField(3);
        cardNumberTextField.setDocument(cardNumberDoc);
        cardNumberTextField.setBounds(250, 270, 300, 40);
        cardNumberTextField.setFont(new Font("", Font.PLAIN, 20));
        kartaPanel.add(cardNumberTextField);

        JLabel cvcKartaLabel = new JLabel("Kod CVC");
        cvcKartaLabel.setBounds(455, 320, 100, 20);
        cvcKartaLabel.setFont(new Font("", Font.PLAIN, 20));
        kartaPanel.add(cvcKartaLabel);


        //Pole kod CVC
        PlainDocument cvcCodeDoc = new PlainDocument();
        cvcCodeDoc.setDocumentFilter(new IntDocumentFilter(3));
        cvcTextField = new JTextField();
        cvcTextField.setDocument(cvcCodeDoc);
        cvcTextField.setBounds(450, 340, 100, 40);
        cvcTextField.setFont(new Font("", Font.PLAIN, 20));
        kartaPanel.add(cvcTextField);

        // Data Label
        JLabel dataKartaLabel = new JLabel("Data Ważności(MM/YY)");
        dataKartaLabel.setBounds(240, 320, 220, 20);
        dataKartaLabel.setFont(new Font("", Font.PLAIN, 18));
        kartaPanel.add(dataKartaLabel);


        //Pole data miesiac
        dateMonthSpinner = new JSpinner(new SpinnerNumberModel(1, 1, 12, 1));
        dateMonthSpinner.setEditor(new JSpinner.DefaultEditor(dateMonthSpinner));
        dateMonthSpinner.setBounds(250, 340, 80, 40);
        dateMonthSpinner.setFont(new Font("", Font.PLAIN, 20));
        dateMonthSpinner.setFocusable(false);
        kartaPanel.add(dateMonthSpinner);

        //Pole data rok
        dateYearSpinner = new JSpinner(new SpinnerNumberModel(22, 22, 32, 1));
        dateYearSpinner.setEditor(new JSpinner.DefaultEditor(dateYearSpinner));
        dateYearSpinner.setBounds(360, 340, 80, 40);
        dateYearSpinner.setFont(new Font("", Font.PLAIN, 20));
        dateYearSpinner.setFocusable(false);
        kartaPanel.add(dateYearSpinner);

        // Data separator
        JLabel separatorDataLabel = new JLabel("/");
        separatorDataLabel.setBounds(340, 340, 10, 40);
        separatorDataLabel.setFont(new Font("", Font.PLAIN, 30));
        kartaPanel.add(separatorDataLabel);

        // Panel zaplaty blikiem
        JPanel blikPanel = new JPanel();
        blikPanel.setLayout(null);


        JLabel labelBlik = new JLabel("Podaj kod BLIK");
        labelBlik.setBounds(265, 130, 400, 50);
        labelBlik.setFont(new Font("",Font.BOLD,  30));
        blikPanel.add(labelBlik);

        JLabel labelBlikIcon = new JLabel();
        labelBlikIcon.setBounds(10, 10, 100, 50);
        labelBlikIcon.setIcon(new ImageIcon(scaleImage("./blik.png", labelBlikIcon.getWidth(), labelBlikIcon.getHeight())));
        blikPanel.add(labelBlikIcon);


        // Ograniczenie wprowadzania do 6 liczb całkowitych
        PlainDocument blikDocument = new PlainDocument();
        blikDocument.setDocumentFilter(new IntDocumentFilter(6));

        textFieldBlik = new JTextField(6);
        textFieldBlik.setFont(new Font("", Font.BOLD, 50));
        textFieldBlik.setBounds(275, 225, 225, 100);
        textFieldBlik.setDocument(blikDocument);
        blikPanel.add(textFieldBlik);


        backButtonBlik = new JButton();
        backButtonBlik.addActionListener(this);
        backButtonBlik.setText("Powrót");
        backButtonBlik.setBounds(10, 485, 150, 75);
        backButtonBlik.setBackground(Color.white);
        backButtonBlik.setFocusable(false);
        blikPanel.add(backButtonBlik);

        confirmButtonBlik = new JButton();
        confirmButtonBlik.addActionListener(this);
        confirmButtonBlik.setText("Zaakceptuj");
        confirmButtonBlik.setBounds(790 - 150, 485, 150, 75);
        confirmButtonBlik.setBackground(Color.white);
        confirmButtonBlik.setFocusable(false);
        blikPanel.add(confirmButtonBlik);

        // Okno udanej płatności
        JPanel successPanel = new JPanel();
        successPanel.setLayout(null);

        JLabel successLabel = new JLabel("Transakcja przebiegła pomyślnie!");
        successLabel.setBounds(120, 120, 700, 300);
        successLabel.setFont(new Font("", Font.BOLD, 30));
        successLabel.setIcon(new ImageIcon(scaleImage("./succesful.png", 150, 150)));
        successLabel.setHorizontalTextPosition(JLabel.CENTER);
        successLabel.setVerticalTextPosition(JLabel.TOP);
        successLabel.setIconTextGap(40);
        successPanel.add(successLabel);

        confirmButtonSuccess = new JButton("Wyjdź");
        confirmButtonSuccess.addActionListener(this);
        confirmButtonSuccess.setBounds(790 - 150, 485, 150, 75);
        confirmButtonSuccess.setBackground(Color.white);
        confirmButtonSuccess.setFocusable(false);
        successPanel.add(confirmButtonSuccess);



        // Okno nieudanej płatności
        JPanel unsuccessPanel = new JPanel();
        unsuccessPanel.setLayout(null);

        JLabel unsuccessLabel = new JLabel("Transakcja przebiegła nieprawidłowo.");
        unsuccessLabel.setBounds(100, 120, 700, 300);
        unsuccessLabel.setFont(new Font("", Font.BOLD, 30));
        unsuccessLabel.setIcon(new ImageIcon(scaleImage("./unsuccesful.png", 150, 150)));
        unsuccessLabel.setHorizontalTextPosition(JLabel.CENTER);
        unsuccessLabel.setVerticalTextPosition(JLabel.TOP);
        unsuccessLabel.setIconTextGap(40);
        unsuccessPanel.add(unsuccessLabel);

        confirmButtonUnsuccess = new JButton("Wyjdź");
        confirmButtonUnsuccess.addActionListener(this);
        confirmButtonUnsuccess.setBounds(790 - 150, 485, 150, 75);
        confirmButtonUnsuccess.setBackground(Color.white);
        confirmButtonUnsuccess.setFocusable(false);
        unsuccessPanel.add(confirmButtonUnsuccess);

        tryAgainButton = new JButton("Spróbuj ponownie");
        tryAgainButton.addActionListener(this);
        tryAgainButton.setBounds(10, 485, 175, 75);
        tryAgainButton.setBackground(Color.white);
        tryAgainButton.setFocusable(false);
        unsuccessPanel.add(tryAgainButton);

        this.setTitle("Okno Platnosci");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(800, 600);
        this.setVisible(true);

        container.add("wybor", wyborPanel);
        container.add("karta", kartaPanel);
        container.add("blik", blikPanel);
        container.add("success", successPanel);
        container.add("unsuccess", unsuccessPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == kartaButton) {
            cardLayout.show(container, "karta");
        } else if (e.getSource() == blikButton) {
            cardLayout.show(container, "blik");
        } else if(e.getSource() == backButtonKarta) {
            cardLayout.show(container, "wybor");
            try {
                nameTextField.setText("");
                cardNumberTextField.getDocument().remove(0, cardNumberTextField.getText().length());
                cvcTextField.getDocument().remove(0, cvcTextField.getText().length());
                dateMonthSpinner.setValue(1);
                dateYearSpinner.setValue(22);
            } catch (BadLocationException ex) {
                throw new RuntimeException(ex);
            }
        } else if(e.getSource() == backButtonBlik) {
            cardLayout.show(container, "wybor");
                try {
                textFieldBlik.getDocument().remove(0, textFieldBlik.getText().length());
            } catch (BadLocationException ex) {
                throw new RuntimeException(ex);
            }
        } else if(e.getSource() == confirmButtonBlik) {
            if (textFieldBlik.getText().equals("123456")) {
                succesfulPayment = true;
                cardLayout.show(container, "success");
            } else {
                succesfulPayment = false;
                cardLayout.show(container, "unsuccess");
            }
        } else if(e.getSource() == confirmButtonKarta) {
            if(
                    nameTextField.getText().equals("Jan Kowalski") &&
                    cardNumberTextField.getText().equals("1234567890123456") &&
                    dateMonthSpinner.getValue().equals(10) && dateYearSpinner.getValue().equals(22) &&
                    cvcTextField.getText().equals("111")
            ) {
                succesfulPayment = true;
                cardLayout.show(container, "success");
            } else {
                succesfulPayment = false;
                cardLayout.show(container, "unsuccess");
            }
        } else if(e.getSource() == confirmButtonSuccess) {
            this.setVisible(false);
            this.dispose();
        } else if(e.getSource() == confirmButtonUnsuccess) {
            this.setVisible(false);
            this.dispose();
        } else if(e.getSource() == tryAgainButton) {
            cardLayout.show(container, "wybor");
            try {
                nameTextField.setText("");
                cardNumberTextField.getDocument().remove(0, cardNumberTextField.getText().length());
                cvcTextField.getDocument().remove(0, cvcTextField.getText().length());
                textFieldBlik.getDocument().remove(0, textFieldBlik.getText().length());
                dateMonthSpinner.setValue(1);
                dateYearSpinner.setValue(22);
            } catch (BadLocationException ex) {
                throw new RuntimeException(ex);
            }

        }
    }

    private Image scaleImage(String fileName, int width, int height) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Image scaledImage = img.getScaledInstance(width, height,
                Image.SCALE_SMOOTH);

        return scaledImage;
    }

    public boolean getPaymentInfo() {
        return succesfulPayment;
    }
}
