package _07_11_2024;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    private JTextField display;
    private double firstNum = 0;
    private String operator = "";
    private boolean readyForInput = true;

    public Calculator() {
        setTitle("Calculator");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setEnabled(false);
        display.setFont(new Font("Arial", Font.BOLD, 16)); //Шрифт
        add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 4, 4));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "c", "=", "+"
        };
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.PLAIN, 20));
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.matches("[0-9]")) {
            if (readyForInput) {
                display.setText(command);
                readyForInput = false;
            } else {
                display.setText(display.getText() + command);
            }
        } else if ("c".equals(command)) {
            display.setText("");
            firstNum = 0;
            operator = "";

        } else if ("=".equals(command)) {
            double secondNumber = Double.parseDouble(display.getText());
            double result = 0;

            switch (operator) {
                case "+":
                    result = firstNum + secondNumber;
                    break;
                case "-":
                    result = firstNum - secondNumber;
                    break;
                case "*":
                    result = firstNum * secondNumber;
                    break;
                case "/":
                    if (secondNumber != 0) {
                        result = firstNum / secondNumber;
                    } else {
                        display.setText("Cannot divide by zero");
                        readyForInput = true;
                        return;
                    }
                    break;
                default:
                    display.setText("Operation Error");
                    return;
            }
            display.setText(String.valueOf(result));
            readyForInput = true;
        } else {
            firstNum = Double.parseDouble(display.getText());
            operator = command;
            readyForInput = true;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Calculator calculator = new Calculator();
            calculator.setVisible(true);
        });
    }
}
