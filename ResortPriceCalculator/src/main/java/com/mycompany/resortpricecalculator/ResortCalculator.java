/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resortpricecalculator;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Student
 */
public class ResortCalculator extends JFrame {
    double total;
            
    JPanel mainPanel, calculate, price, inputName, checkBox, inputValue, result;
    JLabel title, choose, cost;
    JTextField nameField;
    JCheckBox box1, box2, box3;
    JComboBox<String> comboBox;
    JButton calculateButton;

    public ResortCalculator() {
        setTitle("This is my first Frame");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(2, 1));
        title = new JLabel("Resort Price Calculator", (int) CENTER_ALIGNMENT);
        Font font = new Font("Arial",Font.BOLD,24);
        title.setFont(font);
        add(title);

        mainPanel = new JPanel(new BorderLayout());
        price = new JPanel(new GridLayout(2, 1));
        cost = new JLabel("Base price for a room is $200", (int) CENTER_ALIGNMENT);
        choose = new JLabel("Choose obtions that you want", (int) CENTER_ALIGNMENT);
        price.add(cost);
        price.add(choose);
        mainPanel.add(price, BorderLayout.NORTH);

        inputValue = new JPanel(new GridLayout(3, 1));

        inputName = new JPanel(new GridLayout(1, 2));
        nameField = new JTextField();
        inputName.add(new Label("Guest Name: "));
        inputName.add(nameField);
        inputValue.add(inputName);

        checkBox = new JPanel(new GridLayout(1, 3));
        box1 = new JCheckBox("Breakfast$20");
        box2 = new JCheckBox("Gost$50");
        box3 = new JCheckBox("Pool$15");
        checkBox.add(box1);
        checkBox.add(box2);
        checkBox.add(box3);
        inputValue.add(checkBox);

        calculate = new JPanel(new GridLayout(1, 2, 25, 25));
        comboBox = new JComboBox<>();
        comboBox.addItem("Weekend(+30%)");
        comboBox.addItem("Week day(-10%)");
        calculateButton = new JButton("Calculate");
        calculate.add(comboBox);
        calculate.add(calculateButton);
        inputValue.add(calculate);
        mainPanel.add(inputValue, BorderLayout.CENTER);

        result = new JPanel();
        mainPanel.add(result, BorderLayout.SOUTH);

        add(mainPanel);
        calculateButton.addActionListener((e) -> {
        });
    }
    public void calculate(){
        
    }
        

}
