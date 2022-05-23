package ru.gb.obalin.Homework8;

import javax.swing.*;
import java.awt.*;

public class Calculator {
    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton buttonPoint = new JButton(".");
    JButton buttonEqual = new JButton("=");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonDivide = new JButton("/");
    JButton buttonMultiply = new JButton("*");
    JPanel windowContent = new JPanel();
    JTextField displayField = new JTextField(30);

    Calculator() {
        BorderLayout bl = new BorderLayout();
        windowContent.setLayout(bl);

        windowContent.add("North", displayField);

        JPanel p1 = new JPanel();
        GridLayout gl = new GridLayout(4,3);

        p1.setLayout(gl);
        p1.add(button1);
        p1.add(button2);
        p1.add(button3);
        p1.add(button4);
        p1.add(button5);
        p1.add(button6);
        p1.add(button7);
        p1.add(button8);
        p1.add(button9);
        p1.add(button0);
        p1.add(buttonPoint);
        p1.add(buttonEqual);

        windowContent.add("Center", p1);

        JPanel p2 = new JPanel();
        GridLayout gl2 = new GridLayout(4,1);

        p2.setLayout(gl2);
        p2.add(buttonPlus);
        p2.add(buttonMinus);
        p2.add(buttonMultiply);
        p2.add(buttonDivide);

        windowContent.add("East", p2);

        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(windowContent);

        frame.pack();
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Engine engine = new Engine(this);

        button0.addActionListener(engine);
        button1.addActionListener(engine);
        button2.addActionListener(engine);
        button3.addActionListener(engine);
        button4.addActionListener(engine);
        button5.addActionListener(engine);
        button6.addActionListener(engine);
        button7.addActionListener(engine);
        button8.addActionListener(engine);
        button9.addActionListener(engine);

        buttonPoint.addActionListener(engine);
        buttonEqual.addActionListener(engine);
        buttonPlus.addActionListener(engine);
        buttonMinus.addActionListener(engine);
        buttonMultiply.addActionListener(engine);
        buttonDivide.addActionListener(engine);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }


}
