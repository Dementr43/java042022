package ru.gb.obalin.Homework8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Engine implements ActionListener {
    Calculator parent;

    char selectedAction = ' '; // + - * /
    double currentResult = 0;
    Engine(Calculator parent){
        this.parent = parent;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickButton = (JButton) e.getSource();
        String dispFieldText = parent.displayField.getText();
        double displayValue = 0;
        if(!"".equals(dispFieldText)){
            displayValue = Double.parseDouble(dispFieldText);
        }
        Object src = e.getSource();
        if (src == parent.buttonPlus) {
            selectedAction = '+' ;
            currentResult = displayValue;
            parent.displayField.setText("");
        } else if (src == parent.buttonMinus) {
            selectedAction = '-';
            currentResult = displayValue;
            parent.displayField.setText("");
        } else if (src == parent.buttonDivide) {
            selectedAction = '/';
            currentResult = displayValue;
            parent.displayField.setText("");
        } else if (src == parent.buttonMultiply) {
            selectedAction = '*';
            currentResult = displayValue;
            parent.displayField.setText("");
        } else if (src == parent.buttonEqual) {
            if (selectedAction == '+') {
                currentResult += displayValue;
                parent.displayField.setText("" + currentResult);
            } else if (selectedAction == '-') {
                currentResult -= displayValue;
                parent.displayField.setText("" + currentResult);
            } else if (selectedAction == '/') {
                currentResult /= displayValue;
                parent.displayField.setText("" + currentResult);
            } else if (selectedAction == '*') {
                currentResult *= displayValue;
                parent.displayField.setText("" + currentResult);
            }
        } else {
            String clickButtonLabel = clickButton.getText();
            parent.displayField.setText(dispFieldText = clickButtonLabel);
        }
    }
}
