package com.java.GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import com.java.objects.Timer;
import com.java.objects.StopWatch;

public class ClockWindow implements ActionListener {

    JFrame mainFrame;
    JPanel panel;
    Font myFont = new Font("Lora", 1, 30);
    JButton resetButton, setButton, incrButton, dcrButton;
    JTextField textField;

    Timer timer;
    StopWatch stopWatch;

    public ClockWindow() {

        initUI();
    }

    public void initUI() {

        int xReset = 50;
        int yReset = 300;
        int buttonWidth = 300;
        int buttonHeight = 150;

        resetButton = new JButton("Reset");
        resetButton.setBackground(Color.GRAY);
        resetButton.setBounds(xReset, yReset, buttonWidth, buttonHeight);

        setButton = new JButton("Set");
        setButton.setBackground(Color.GRAY);
        setButton.setBounds(xReset*2+buttonWidth, yReset, buttonWidth, buttonHeight);

        panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setBounds(50, 50, 650, 200);

        textField = new JTextField();
        textField.setEditable(false);
        textField.setLayout(new GridLayout(1,2));
        textField.setSize(650, 200);
        textField.setFont(myFont);
        textField.setForeground(Color.WHITE);

        panel.add(textField);

        mainFrame = new JFrame();
        mainFrame.setTitle("That is your forever StopWatch");

        mainFrame.add(resetButton);
        mainFrame.add(setButton);
        mainFrame.add(panel);

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(null);;
        mainFrame.setVisible(true);
        mainFrame.setSize(800, 500);

    }

    public void actionPerformed(ActionEvent e) {


    }

}
