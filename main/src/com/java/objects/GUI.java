package com.java.objects;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GUI implements ActionListener {

    JFrame gui_frame;
    JFrame key_frame;
    JPanel gui_panel;
    JPanel key_panel;
    JTextField userLogin_text, userPass_text;
    JTextField enterVerKey_text;
    JLabel labelLogin, labelPass;
    JLabel labelEnterVerKey;
    Font myFont = new Font("Lora", 1, 30);
    JButton logIn, cancel;
    String name, password;
    String sql_url = "jdbc:mysql://127.0.0.1:3306", sql_user = "root", sql_password = "root";

    ResultSet resultSet = null;

    public GUI() {
        initUI();
        addActionEvent();
    }

    public void initUI() {

        gui_frame = new JFrame();
        gui_frame.setTitle("Sign in");
        gui_frame.setSize(500, 300);

        int buttonWidth = 100;
        int buttonHeight = 20;

        GridLayout gui_grid = new GridLayout(3, 2, 5, 10);

        gui_panel = new JPanel();
        gui_panel.setBackground(Color.LIGHT_GRAY);
        gui_panel.setSize(300, 200);
        gui_panel.setLayout(new GridLayout(3, 2, 5, 5));

        labelLogin = new JLabel();
        labelLogin.setText("user");
        labelLogin.setFont(myFont);

        labelPass = new JLabel();
        labelPass.setText("password");
        labelPass.setFont(myFont);

        userLogin_text = new JTextField();
        userLogin_text.setBackground(Color.WHITE);
        userLogin_text.setFont(myFont);
        userLogin_text.setSize(buttonWidth, buttonHeight);

        userPass_text = new JTextField();
        userPass_text.setBackground(Color.WHITE);
        userPass_text.setFont(myFont);
        userPass_text.setSize(buttonWidth, buttonHeight);

        logIn = new JButton("Log In");
        logIn.setFont(myFont);
        logIn.setBounds(50, 200, buttonWidth+50, buttonHeight + 30);

        cancel = new JButton("Cancel");
        cancel.setFont(myFont);
        cancel.setBounds(buttonWidth+150, 200, buttonWidth+50, buttonHeight + 30);

        gui_panel.add(labelLogin);
        gui_panel.add(userLogin_text);
        gui_panel.add(labelPass);
        gui_panel.add(userPass_text);

        gui_frame.add(logIn);
        gui_frame.add(cancel);
        gui_frame.add(gui_panel);


        gui_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui_frame.setBackground(Color.LIGHT_GRAY);

//        gui_frame.pack();
        gui_frame.setVisible(true);
    }

    public void addActionEvent() {
        logIn.addActionListener(this);
        cancel.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(logIn)) {

            userLogin_text.setEditable(false);
            userPass_text.setEditable(false);

            name = userLogin_text.getText();
            password = userPass_text.getText();

            /*try {
                Connection connection = DriverManager.getConnection(sql_url, sql_user, sql_password);
                Statement statement = connection.createStatement();

                String sqlResponse = "SELECT * FROM user_key WHERE name = '" + name + "'";
                resultSet = statement.executeQuery(sqlResponse);

                while (resultSet.next()) {

                }

            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }*/

            key_frame = new JFrame();
            key_frame.setTitle("Verification key");
            key_frame.setBackground(Color.PINK);
            key_frame.setSize(350, 150);

            key_panel = new JPanel();
            key_panel.setBackground(Color.LIGHT_GRAY);
            key_panel.setLayout(new GridLayout(2, 1, 5, 10));
            key_panel.setSize(350, 150);

            labelEnterVerKey = new JLabel();
            labelEnterVerKey.setText("Enter verification key");
            labelEnterVerKey.setSize(200, 70);
            labelEnterVerKey.setFont(myFont);

            enterVerKey_text = new JTextField();
            enterVerKey_text.setSize(200,70);
            enterVerKey_text.setFont(myFont);

            key_panel.add(labelEnterVerKey);
            key_panel.add(enterVerKey_text);

            key_frame.getContentPane().add(key_panel);

            key_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            key_frame.pack();
            key_frame.setVisible(true);
        }
    }
}
