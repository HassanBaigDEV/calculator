/*create a gui calculator */


//add sec csc and 

package com.mycompany.calculator_mid;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

@SuppressWarnings("unchecked")
public class calculator {
    static String numberSystem = "decimal";
    static String numberSystemAngle = "Radian";
    static String datatype = "double";

    static int first;
    static double first1;
    static long first2;
    static float first3;
    static short first4;

    String operation;
    String answer;

    public static void main(String[] args) {
        // create a 400x700 Jframe
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator().createAndShowGUI();
            }
        });

    }

    protected void createAndShowGUI() {
        // JFrame
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(472, 650);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());
        frame.getContentPane().setBackground(Color.decode("#343333"));

        // text field to display the result and for input and output
        JTextField textField = new JTextField();
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setFont(new Font("Arial", Font.BOLD, 30));
        textField.setEditable(false);
        textField.setBackground(Color.WHITE);
        textField.setBorder(new LineBorder(Color.BLACK, 1));
        frame.add(textField, BorderLayout.NORTH);
        textField.setForeground(Color.decode("#343333"));
        textField.setPreferredSize(new Dimension(380, 100));

        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton button0 = new JButton("0");
        JButton buttonAdd = new JButton("+");
        JButton buttonSub = new JButton("-");
        JButton buttonMul = new JButton("*");
        JButton buttonDiv = new JButton("/");
        JButton buttonEqual = new JButton("=");
        JButton buttonClear = new JButton("C");
        JButton buttonDec = new JButton(".");
        JButton buttonNeg = new JButton("+/-");
        JButton buttonSqrt = new JButton("sqrt");
        JButton buttonRemainder = new JButton("%");
        JButton buttonFact = new JButton("n!");
        JButton buttonMode = new JButton("mod");
        JButton buttonSci = new JButton("Scientific");
        JButton buttonA = new JButton("A");
        JButton buttonB = new JButton("B");
        JButton buttonC = new JButton("C");
        JButton buttonD = new JButton("D");
        JButton buttonE = new JButton("E");
        JButton buttonF = new JButton("F");

        // action listener for the buttons on main screen

        buttonFact.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // get the text from the text field and convert it to a double and take
                // factorial of it
                String input = textField.getText();
                double inputDouble = Double.parseDouble(input);
                double result = factorial(inputDouble);
                textField.setText(Double.toString(result));

            }

            private double factorial(double inputDouble) {
                // take factorial of the input
                double result = 1;
                for (int i = 1; i <= inputDouble; i++) {
                    result = result * i;
                }
                return result;

            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "1");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "2");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "3");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "4");
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "5");
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "6");
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "7");
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "8");
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "9");
            }
        });
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "0");
            }
        });
        buttonA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "A");
            }
        });
        buttonB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "B");
            }
        });
        buttonC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "C");
            }
        });
        buttonD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "D");
            }
        });
        buttonE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "E");
            }
        });
        buttonF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "F");
            }
        });
        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                switch (datatype) {

                    case "int":
                        switch (numberSystem) {
                            case "Decimal":
                                // throw exception in textField for bigger data type for NumberFormatExceptopn
                                try {
                                    first = Integer.parseInt(textField.getText(), 10);
                                    textField.setText("");
                                } catch (Exception ex) {
                                    String error = "Error: NumberFormatException";
                                    textField.setText(error);
                                }

                                break;
                            case "Binary":
                                try {
                                    first = Integer.parseInt(textField.getText(), 2);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }

                                break;
                            case "Octal":
                                try {
                                    first = Integer.parseInt(textField.getText(), 8);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }

                                break;
                            case "Hexadecimal":
                                try {
                                    first = Integer.parseInt(textField.getText(), 16);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {

                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                        }
                        operation = "+";

                        break;
                    case "double":
                        switch (numberSystem) {
                            case "Decimal":
                                try {
                                    first1 = Double.parseDouble(textField.getText());
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }

                                break;
                            case "Binary":
                                try {
                                    int intBits = (int) Long.parseLong(textField.getText(), 2);
                                    first1 = Double.longBitsToDouble(intBits);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }

                                break;
                            case "Octal":
                                try {
                                    int intBits = (int) Long.parseLong(textField.getText(), 8);
                                    first1 = Double.longBitsToDouble(intBits);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                            case "Hexadecimal":
                                try {
                                    int intBits = (int) Long.parseLong(textField.getText(), 16);
                                    first1 = Double.longBitsToDouble(intBits);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                        }
                        operation = "+";
                        break;
                    case "long":
                        switch (numberSystem) {
                            case "Decimal":
                                try {
                                    first2 = Long.parseLong(textField.getText());
                                    textField.setText("");
                                } catch (NumberFormatException e1) {

                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                            case "Binary":
                                try {
                                    first2 = Long.parseLong(textField.getText(), 2);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {

                                    textField.setText("Error: NumberFormatException");
                                }

                                break;
                            case "Octal":
                                try {
                                    first2 = Long.parseLong(textField.getText(), 8);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {

                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                            case "Hexadecimal":
                                try {
                                    first2 = Long.parseLong(textField.getText(), 16);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {

                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                        }
                        operation = "+";
                        break;
                    case "float":
                        switch (numberSystem) {
                            case "Decimal":
                                try {
                                    first3 = Float.parseFloat(textField.getText());
                                    textField.setText("");
                                } catch (NumberFormatException e1) {

                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                            case "Binary":
                                try {
                                    int intBits = (int) Long.parseLong(textField.getText(), 2);
                                    first3 = Float.intBitsToFloat(intBits);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {

                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                            case "Octal":
                                try {
                                    int intBits = (int) Long.parseLong(textField.getText(), 8);
                                    first3 = Float.intBitsToFloat(intBits);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {

                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                            case "Hexadecimal":
                                try {
                                    int intHex = (int) Long.parseLong(textField.getText(), 16);
                                    first3 = Float.intBitsToFloat(intHex);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                        }

                        operation = "+";
                        break;
                    case "short":
                        switch (numberSystem) {
                            case "Decimal":
                                try {
                                    first4 = Short.parseShort(textField.getText());
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }

                                break;
                            case "Binary":
                                try {
                                    first4 = Short.parseShort(textField.getText(), 2);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                            case "Octal":
                                try {
                                    first4 = Short.parseShort(textField.getText(), 8);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                            case "Hexadecimal":
                                try {
                                    first4 = Short.parseShort(textField.getText(), 16);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                        }
                        operation = "+";
                        break;
                }
            }
        });
        buttonSub.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                switch (datatype) {

                    case "int":
                        switch (numberSystem) {
                            case "Decimal":
                                // throw exception in textField for bigger data type for NUmberFOrmatExceptopn
                                try {
                                    first = Integer.parseInt(textField.getText(), 10);
                                    textField.setText("");
                                } catch (Exception ex) {
                                    String error = "Error: NumberFormatException";
                                    textField.setText(error);
                                }

                                break;
                            case "Binary":
                                try {
                                    first = Integer.parseInt(textField.getText(), 2);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }

                                break;
                            case "Octal":
                                try {
                                    first = Integer.parseInt(textField.getText(), 8);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }

                                break;
                            case "Hexadecimal":
                                try {
                                    first = Integer.parseInt(textField.getText(), 16);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {

                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                        }
                        operation = "-";

                        break;
                    case "double":
                        switch (numberSystem) {
                            case "Decimal":
                                try {
                                    first1 = Double.parseDouble(textField.getText());
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }

                                break;
                            case "Binary":
                                try {
                                    int intBits = (int) Long.parseLong(textField.getText(), 2);
                                    first1 = Double.longBitsToDouble(intBits);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }

                                break;
                            case "Octal":
                                try {
                                    int intBits = (int) Long.parseLong(textField.getText(), 8);
                                    first1 = Double.longBitsToDouble(intBits);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                            case "Hexadecimal":
                                try {
                                    int intBits = (int) Long.parseLong(textField.getText(), 16);
                                    first1 = Double.longBitsToDouble(intBits);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                        }
                        operation = "-";
                        break;
                    case "long":
                        switch (numberSystem) {
                            case "Decimal":
                                try {
                                    first2 = Long.parseLong(textField.getText());
                                    textField.setText("");
                                } catch (NumberFormatException e1) {

                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                            case "Binary":
                                try {
                                    first2 = Long.parseLong(textField.getText(), 2);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {

                                    textField.setText("Error: NumberFormatException");
                                }

                                break;
                            case "Octal":
                                try {
                                    first2 = Long.parseLong(textField.getText(), 8);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {

                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                            case "Hexadecimal":
                                try {
                                    first2 = Long.parseLong(textField.getText(), 16);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {

                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                        }
                        operation = "-";
                        break;
                    case "float":
                        switch (numberSystem) {
                            case "Decimal":
                                try {
                                    first3 = Float.parseFloat(textField.getText());
                                    textField.setText("");
                                } catch (NumberFormatException e1) {

                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                            case "Binary":
                                try {
                                    int intBits = (int) Long.parseLong(textField.getText(), 2);
                                    first3 = Float.intBitsToFloat(intBits);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {

                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                            case "Octal":
                                try {
                                    int intBits = (int) Long.parseLong(textField.getText(), 8);
                                    first3 = Float.intBitsToFloat(intBits);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {

                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                            case "Hexadecimal":
                                try {
                                    int intHex = (int) Long.parseLong(textField.getText(), 16);
                                    first3 = Float.intBitsToFloat(intHex);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                        }

                        operation = "-";
                        break;
                    case "short":
                        switch (numberSystem) {
                            case "Decimal":
                                try {
                                    first4 = Short.parseShort(textField.getText());
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }

                                break;
                            case "Binary":
                                try {
                                    first4 = Short.parseShort(textField.getText(), 2);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                            case "Octal":
                                try {
                                    first4 = Short.parseShort(textField.getText(), 8);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                            case "Hexadecimal":
                                try {
                                    first4 = Short.parseShort(textField.getText(), 16);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                        }
                        operation = "-";
                        break;
                }
            }

        });
        buttonMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (datatype) {

                    case "int":
                        switch (numberSystem) {
                            case "Decimal":
                                // throw exception in textField for bigger data type for NUmberFOrmatExceptopn
                                try {
                                    first = Integer.parseInt(textField.getText(), 10);
                                    textField.setText("");
                                } catch (Exception ex) {
                                    String error = "Error: NumberFormatException";
                                    textField.setText(error);
                                }

                                break;
                            case "Binary":
                                try {
                                    first = Integer.parseInt(textField.getText(), 2);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }

                                break;
                            case "Octal":
                                try {
                                    first = Integer.parseInt(textField.getText(), 8);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }

                                break;
                            case "Hexadecimal":
                                try {
                                    first = Integer.parseInt(textField.getText(), 16);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {

                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                        }
                        operation = "*";

                        break;
                    case "double":
                        switch (numberSystem) {
                            case "Decimal":
                                try {
                                    first1 = Double.parseDouble(textField.getText());
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }

                                break;
                            case "Binary":
                                try {
                                    int intBits = (int) Long.parseLong(textField.getText(), 2);
                                    first1 = Double.longBitsToDouble(intBits);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }

                                break;
                            case "Octal":
                                try {
                                    int intBits = (int) Long.parseLong(textField.getText(), 8);
                                    first1 = Double.longBitsToDouble(intBits);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                            case "Hexadecimal":
                                try {
                                    int intBits = (int) Long.parseLong(textField.getText(), 16);
                                    first1 = Double.longBitsToDouble(intBits);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                        }
                        operation = "*";
                        break;
                    case "long":
                        switch (numberSystem) {
                            case "Decimal":
                                try {
                                    first2 = Long.parseLong(textField.getText());
                                    textField.setText("");
                                } catch (NumberFormatException e1) {

                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                            case "Binary":
                                try {
                                    first2 = Long.parseLong(textField.getText(), 2);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {

                                    textField.setText("Error: NumberFormatException");
                                }

                                break;
                            case "Octal":
                                try {
                                    first2 = Long.parseLong(textField.getText(), 8);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {

                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                            case "Hexadecimal":
                                try {
                                    first2 = Long.parseLong(textField.getText(), 16);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {

                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                        }
                        operation = "*";
                        break;
                    case "float":
                        switch (numberSystem) {
                            case "Decimal":
                                try {
                                    first3 = Float.parseFloat(textField.getText());
                                    textField.setText("");
                                } catch (NumberFormatException e1) {

                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                            case "Binary":
                                try {
                                    int intBits = (int) Long.parseLong(textField.getText(), 2);
                                    first3 = Float.intBitsToFloat(intBits);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {

                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                            case "Octal":
                                try {
                                    int intBits = (int) Long.parseLong(textField.getText(), 8);
                                    first3 = Float.intBitsToFloat(intBits);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {

                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                            case "Hexadecimal":
                                try {
                                    int intHex = (int) Long.parseLong(textField.getText(), 16);
                                    first3 = Float.intBitsToFloat(intHex);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                        }

                        operation = "*";
                        break;
                    case "short":
                        switch (numberSystem) {
                            case "Decimal":
                                try {
                                    first4 = Short.parseShort(textField.getText());
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }

                                break;
                            case "Binary":
                                try {
                                    first4 = Short.parseShort(textField.getText(), 2);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                            case "Octal":
                                try {
                                    first4 = Short.parseShort(textField.getText(), 8);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                            case "Hexadecimal":
                                try {
                                    first4 = Short.parseShort(textField.getText(), 16);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                        }
                        operation = "*";
                        break;
                }
            }
        });
        buttonDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (datatype) {

                    case "int":
                        switch (numberSystem) {
                            case "Decimal":
                                // throw exception in textField for bigger data type for NUmberFOrmatExceptopn
                                try {
                                    first = Integer.parseInt(textField.getText(), 10);
                                    textField.setText("");
                                } catch (Exception ex) {
                                    String error = "Error: NumberFormatException";
                                    textField.setText(error);
                                }

                                break;
                            case "Binary":
                                try {
                                    first = Integer.parseInt(textField.getText(), 2);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }

                                break;
                            case "Octal":
                                try {
                                    first = Integer.parseInt(textField.getText(), 8);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }

                                break;
                            case "Hexadecimal":
                                try {
                                    first = Integer.parseInt(textField.getText(), 16);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {

                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                        }
                        operation = "/";

                        break;
                    case "double":
                        switch (numberSystem) {
                            case "Decimal":
                                try {
                                    first1 = Double.parseDouble(textField.getText());
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }

                                break;
                            case "Binary":
                                try {
                                    int intBits = (int) Long.parseLong(textField.getText(), 2);
                                    first1 = Double.longBitsToDouble(intBits);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }

                                break;
                            case "Octal":
                                try {
                                    int intBits = (int) Long.parseLong(textField.getText(), 8);
                                    first1 = Double.longBitsToDouble(intBits);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                            case "Hexadecimal":
                                try {
                                    int intBits = (int) Long.parseLong(textField.getText(), 16);
                                    first1 = Double.longBitsToDouble(intBits);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                        }
                        operation = "/";
                        break;
                    case "long":
                        switch (numberSystem) {
                            case "Decimal":
                                try {
                                    first2 = Long.parseLong(textField.getText());
                                    textField.setText("");
                                } catch (NumberFormatException e1) {

                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                            case "Binary":
                                try {
                                    first2 = Long.parseLong(textField.getText(), 2);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {

                                    textField.setText("Error: NumberFormatException");
                                }

                                break;
                            case "Octal":
                                try {
                                    first2 = Long.parseLong(textField.getText(), 8);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {

                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                            case "Hexadecimal":
                                try {
                                    first2 = Long.parseLong(textField.getText(), 16);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {

                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                        }
                        operation = "/";
                        break;
                    case "float":
                        switch (numberSystem) {
                            case "Decimal":
                                try {
                                    first3 = Float.parseFloat(textField.getText());
                                    textField.setText("");
                                } catch (NumberFormatException e1) {

                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                            case "Binary":
                                try {
                                    int intBits = (int) Long.parseLong(textField.getText(), 2);
                                    first3 = Float.intBitsToFloat(intBits);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {

                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                            case "Octal":
                                try {
                                    int intBits = (int) Long.parseLong(textField.getText(), 8);
                                    first3 = Float.intBitsToFloat(intBits);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {

                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                            case "Hexadecimal":
                                try {
                                    int intHex = (int) Long.parseLong(textField.getText(), 16);
                                    first3 = Float.intBitsToFloat(intHex);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                        }

                        operation = "/";
                        break;
                    case "short":
                        switch (numberSystem) {
                            case "Decimal":
                                try {
                                    first4 = Short.parseShort(textField.getText());
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }

                                break;
                            case "Binary":
                                try {
                                    first4 = Short.parseShort(textField.getText(), 2);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                            case "Octal":
                                try {
                                    first4 = Short.parseShort(textField.getText(), 8);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                            case "Hexadecimal":
                                try {
                                    first4 = Short.parseShort(textField.getText(), 16);
                                    textField.setText("");
                                } catch (NumberFormatException e1) {
                                    textField.setText("Error: NumberFormatException");
                                }
                                break;
                        }
                        operation = "/";
                        break;
                }
            }
        });
        buttonEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                switch (datatype) { // switch case for datatype

                    case "int":

                        switch (operation) {
                            case "+":
                                switch (numberSystem) {
                                    case "Decimal":
                                        try {
                                            int second = Integer.parseInt(textField.getText(), 10);
                                            int result = first + second;
                                            textField.setText(Integer.toString(result));
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Binary":
                                        try {
                                            int bin2 = Integer.parseInt(textField.getText(), 2);

                                            // add two binary numbers
                                            int result1 = first + bin2;
                                            // convert result to binary
                                            String binary = Integer.toBinaryString(result1);
                                            textField.setText(binary);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }

                                        break;

                                    case "Octal":
                                        try {
                                            int oct2 = Integer.parseInt(textField.getText(), 8);

                                            int result2 = first + oct2;

                                            // convert result to octal
                                            String octal = Integer.toOctalString(result2);
                                            textField.setText(octal);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }

                                        break;
                                    case "Hexadecimal":
                                        try {
                                            int hex2 = Integer.parseInt(textField.getText(), 16);

                                            int result3 = first + hex2;
                                            // convert result to hexadecimal
                                            String hex = Integer.toHexString(result3);
                                            textField.setText(hex);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");

                                            break;
                                        }
                                        break;
                                    case "-":
                                        switch (numberSystem) {

                                            case "Decimal":
                                                try {
                                                    int second = Integer.parseInt(textField.getText());
                                                    textField.setText(Integer.toString(first - second));
                                                } catch (NumberFormatException e1) {
                                                    textField.setText("Error: NumberFormatException");
                                                }
                                                break;
                                            case "Binary":
                                                try {
                                                    int bin2 = Integer.parseInt(textField.getText(), 2);

                                                    // subtract two binary numbers
                                                    int result = first - bin2;
                                                    // convert result to binary
                                                    String binary = Integer.toBinaryString(result);
                                                    textField.setText(binary);
                                                } catch (NumberFormatException e1) {
                                                    textField.setText("Error: NumberFormatException");
                                                }

                                                break;

                                            case "Octal":
                                                try {
                                                    int oct2 = Integer.parseInt(textField.getText(), 8);

                                                    int result1 = first - oct2;

                                                    // convert result to octal
                                                    String octal = Integer.toOctalString(result1);
                                                    textField.setText(octal);
                                                } catch (NumberFormatException e1) {
                                                    textField.setText("Error: NumberFormatException");
                                                }

                                                break;
                                            case "Hexadecimal":
                                                try {
                                                    int hex2 = Integer.parseInt(textField.getText(), 16);

                                                    int result2 = first - hex2;
                                                    // convert result to hexadecimal
                                                    String hex = Integer.toHexString(result2);
                                                    textField.setText(hex);
                                                } catch (NumberFormatException e1) {
                                                    textField.setText("Error: NumberFormatException");
                                                }
                                                break;
                                        }
                                        break;
                                    case "*":
                                        switch (numberSystem) {
                                            case "Decimal":
                                                try {
                                                    int second = Integer.parseInt(textField.getText());

                                                    System.out.println(first);
                                                    System.out.println(second);
                                                    int result = first * second;
                                                    textField.setText(Integer.toString(result));
                                                } catch (NumberFormatException e1) {
                                                    textField.setText("Error: NumberFormatException");
                                                }

                                                break;
                                            case "Binary":
                                                try {
                                                    int bin2 = Integer.parseInt(textField.getText(), 2);

                                                    // multiply two binary numbers
                                                    int result1 = first * bin2;
                                                    // convert result to binary
                                                    String binary = Integer.toBinaryString(result1);
                                                    textField.setText(binary);
                                                } catch (NumberFormatException e1) {
                                                    textField.setText("Error: NumberFormatException");
                                                }

                                                break;

                                            case "Octal":
                                                try {
                                                    int oct2 = Integer.parseInt(textField.getText(), 8);

                                                    int result2 = first * oct2;

                                                    // convert result to octal
                                                    String octal = Integer.toOctalString(result2);
                                                    textField.setText(octal);
                                                } catch (NumberFormatException e1) {
                                                    textField.setText("Error: NumberFormatException");
                                                }

                                                break;
                                            case "Hexadecimal":
                                                try {
                                                    int hex2 = Integer.parseInt(textField.getText(), 16);

                                                    int result3 = first * hex2;
                                                    // convert result to hexadecimal
                                                    String hex = Integer.toHexString(result3);
                                                    textField.setText(hex);
                                                } catch (NumberFormatException e1) {
                                                    textField.setText("Error: NumberFormatException");
                                                }

                                                break;
                                        }
                                        break;
                                    case "/":
                                        switch (numberSystem) {
                                            case "Decimal":
                                                try {
                                                    int second = Integer.parseInt(textField.getText());
                                                    textField.setText(Integer.toString(first / second));
                                                } catch (NumberFormatException e1) {
                                                    textField.setText("Error: NumberFormatException");
                                                }
                                                break;
                                            case "Binary":
                                                try {
                                                    int bin2 = Integer.parseInt(textField.getText(), 2);

                                                    // divide two binary numbers
                                                    int result = first / bin2;
                                                    // convert result to binary
                                                    String binary = Integer.toBinaryString(result);
                                                    textField.setText(binary);
                                                } catch (NumberFormatException e1) {
                                                    textField.setText("Error: NumberFormatException");
                                                }

                                                break;

                                            case "Octal":
                                                try {
                                                    int oct2 = Integer.parseInt(textField.getText(), 8);

                                                    int result1 = first / oct2;

                                                    // convert result to octal
                                                    String octal = Integer.toOctalString(result1);
                                                    textField.setText(octal);
                                                } catch (NumberFormatException e1) {
                                                    textField.setText("Error: NumberFormatException");
                                                }

                                                break;
                                            case "Hexadecimal":
                                                try {
                                                    System.out.println("Hexadecimal");
                                                    int hex2 = Integer.parseInt(textField.getText(), 16);

                                                    int result2 = first / hex2;
                                                    // convert result to hexadecimal
                                                    String hex = Integer.toHexString(result2);
                                                    textField.setText(hex);
                                                } catch (NumberFormatException e1) {
                                                    textField.setText("Error: NumberFormatException");
                                                }

                                                break;
                                        }
                                        break;

                                    case "%":

                                        switch (numberSystem) {
                                            case "Decimal":
                                                try {
                                                    int second = Integer.parseInt(textField.getText());
                                                    textField.setText(Integer.toString(first % second));
                                                } catch (NumberFormatException e1) {
                                                    textField.setText("Error: NumberFormatException");
                                                }
                                                break;
                                            case "Binary":
                                                try {
                                                    int bin2 = Integer.parseInt(textField.getText(), 2);

                                                    // divide two binary numbers
                                                    int result = first % bin2;
                                                    // convert result to binary
                                                    String binary = Integer.toBinaryString(result);
                                                    textField.setText(binary);
                                                } catch (NumberFormatException e1) {
                                                    textField.setText("Error: NumberFormatException");
                                                }

                                                break;

                                            case "Octal":
                                                try {
                                                    int oct2 = Integer.parseInt(textField.getText(), 8);

                                                    int result1 = first % oct2;

                                                    // convert result to octal
                                                    String octal = Integer.toOctalString(result1);
                                                    textField.setText(octal);
                                                } catch (NumberFormatException e1) {
                                                    textField.setText("Error: NumberFormatException");
                                                }

                                                break;
                                            case "Hexadecimal":
                                                try {
                                                    int hex2 = Integer.parseInt(textField.getText(), 16);

                                                    int result2 = first % hex2;
                                                    // convert result to hexadecimal
                                                    String hex = Integer.toHexString(result2);
                                                    textField.setText(hex);
                                                } catch (NumberFormatException e1) {
                                                    textField.setText("Error: NumberFormatException");
                                                }

                                                break;
                                        }

                                        break;
                                }
                                break;
                            case "^":
                                switch (numberSystem) {
                                    case "Decimal":
                                        try {
                                            int second = Integer.parseInt(textField.getText());
                                            int result = (int) Math.pow(first, second);
                                            textField.setText(Integer.toString(result));
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Binary":
                                        try {
                                            int bin2 = Integer.parseInt(textField.getText(), 2);

                                            // divide two binary numbers
                                            int result1 = (int) Math.pow(first, bin2);
                                            // convert result to binary
                                            String binary = Integer.toBinaryString(result1);
                                            textField.setText(binary);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }

                                        break;

                                    case "Octal":
                                        try {
                                            int oct2 = Integer.parseInt(textField.getText(), 8);

                                            int result2 = (int) Math.pow(first, oct2);

                                            // convert result to octal
                                            String octal = Integer.toOctalString(result2);
                                            textField.setText(octal);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }

                                        break;
                                    case "Hexadecimal":
                                        try {
                                            int hex2 = Integer.parseInt(textField.getText(), 16);

                                            int result3 = (int) Math.pow(first, hex2);
                                            // convert result to hexadecimal
                                            String hex = Integer.toHexString(result3);
                                            textField.setText(hex);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }

                                        break;
                                }
                                break;
                        }
                        break;
                    case "double":
                        switch (operation) {
                            case "+":
                                switch (numberSystem) {
                                    case "Decimal":
                                        try {
                                            double second = Double.parseDouble(textField.getText());
                                            textField.setText(Double.toString(first + second));
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }

                                        break;
                                    case "Binary":
                                        try {
                                            int intBits = (int) Long.parseLong(textField.getText(), 2);
                                            double bin2 = Double.longBitsToDouble(intBits);

                                            // add two binary numbers
                                            double result = first + bin2;
                                            // convert result to binary
                                            String binary = String.valueOf(result);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }

                                        break;
                                    case "Octal":
                                        try {
                                            int intBits1 = (int) Long.parseLong(textField.getText(), 8);
                                            double oct2 = Double.longBitsToDouble(intBits1);

                                            double result1 = first + oct2;
                                            // convert result to octal
                                            String octal = String.valueOf(result1);
                                            textField.setText(octal);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Hexadecimal":
                                        try {
                                            int intBits2 = (int) Long.parseLong(textField.getText(), 16);
                                            double hex2 = Double.longBitsToDouble(intBits2);

                                            double result2 = first + hex2;
                                            // convert result to hexadecimal
                                            String hex = String.valueOf(result2);
                                            textField.setText(hex);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                }
                                break;
                            case "-":
                                switch (numberSystem) {
                                    case "Decimal":
                                        try {
                                            double second = Double.parseDouble(textField.getText());
                                            textField.setText(Double.toString(first - second));
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Binary":
                                        try {
                                            int intBits = (int) Long.parseLong(textField.getText(), 2);
                                            double bin2 = Double.longBitsToDouble(intBits);

                                            // subtract two binary numbers
                                            double result = first - bin2;
                                            // convert result to binary
                                            String binary = String.valueOf(result);
                                            textField.setText(binary);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Octal":
                                        try {
                                            int intBits1 = (int) Long.parseLong(textField.getText(), 8);
                                            double oct2 = Double.longBitsToDouble(intBits1);

                                            double result1 = first - oct2;
                                            // convert result to octal
                                            String octal = String.valueOf(result1);
                                            textField.setText(octal);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Hexadecimal":
                                        try {
                                            int intBits2 = (int) Long.parseLong(textField.getText(), 16);
                                            double hex2 = Double.longBitsToDouble(intBits2);

                                            double result2 = first - hex2;
                                            // convert result to hexadecimal
                                            String hex = String.valueOf(result2);
                                            textField.setText(hex);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                }
                                break;
                            case "*":
                                switch (numberSystem) {
                                    case "Decimal":
                                        try {
                                            double second = Double.parseDouble(textField.getText());
                                            textField.setText(Double.toString(first * second));
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Binary":
                                        try {
                                            int intBits = (int) Long.parseLong(textField.getText(), 2);
                                            double bin2 = Double.longBitsToDouble(intBits);

                                            // multiply two binary numbers
                                            double result = first * bin2;
                                            // convert result to binary
                                            String binary = String.valueOf(result);
                                            textField.setText(binary);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Octal":
                                        try {
                                            int intBits1 = (int) Long.parseLong(textField.getText(), 8);
                                            double oct2 = Double.longBitsToDouble(intBits1);

                                            double result1 = first * oct2;
                                            // convert result to octal
                                            String octal = String.valueOf(result1);
                                            textField.setText(octal);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Hexadecimal":
                                        try {
                                            int intBits2 = (int) Long.parseLong(textField.getText(), 16);
                                            double hex2 = Double.longBitsToDouble(intBits2);

                                            double result2 = first * hex2;
                                            // convert result to hexadecimal
                                            String hex = String.valueOf(result2);
                                            textField.setText(hex);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                }
                                break;
                            case "/":
                                switch (numberSystem) {
                                    case "Decimal":
                                        try {
                                            double second = Double.parseDouble(textField.getText());
                                            textField.setText(Double.toString(first / second));
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Binary":
                                        try {
                                            int intBits = (int) Long.parseLong(textField.getText(), 2);
                                            double bin2 = Double.longBitsToDouble(intBits);

                                            // divide two binary numbers
                                            double result = first / bin2;
                                            // convert result to binary
                                            String binary = String.valueOf(result);
                                            textField.setText(binary);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Octal":
                                        try {
                                            int intBits1 = (int) Long.parseLong(textField.getText(), 8);
                                            double oct2 = Double.longBitsToDouble(intBits1);

                                            double result1 = first / oct2;
                                            // convert result to octal
                                            String octal = String.valueOf(result1);
                                            textField.setText(octal);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Hexadecimal":
                                        try {
                                            int intBits2 = (int) Long.parseLong(textField.getText(), 16);
                                            double hex2 = Double.longBitsToDouble(intBits2);

                                            double result2 = first / hex2;
                                            // convert result to hexadecimal
                                            String hex = String.valueOf(result2);
                                            textField.setText(hex);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                }
                                break;
                        }

                        break;
                    case "long":

                        switch (operation) {
                            case "+":
                                switch (numberSystem) {
                                    case "Decimal":
                                        try {
                                            long second = Long.parseLong(textField.getText());
                                            textField.setText(Long.toString(first2 + second));
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Binary":
                                        try {
                                            long bin2 = Long.parseLong(textField.getText(), 2);

                                            // add two binary numbers
                                            long result = first2 + bin2;
                                            // convert result to binary
                                            String binary = Long.toBinaryString(result);
                                            textField.setText(binary);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }

                                        break;
                                    case "Octal":
                                        try {
                                            long oct2 = Long.parseLong(textField.getText(), 8);

                                            long result1 = first2 + oct2;

                                            // convert result to octal
                                            String octal = Long.toOctalString(result1);
                                            textField.setText(octal);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }

                                        break;
                                    case "Hexadecimal":
                                        try {
                                            long hex2 = Long.parseLong(textField.getText(), 16);

                                            long result2 = first2 + hex2;
                                            // convert result to hexadecimal
                                            String hex = Long.toHexString(result2);
                                            textField.setText(hex);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                }

                                break;
                            case "-":
                                switch (numberSystem) {
                                    case "Decimal":
                                        try {
                                            long second = Long.parseLong(textField.getText());
                                            textField.setText(Long.toString(first2 - second));
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Binary":
                                        try {
                                            long bin2 = Long.parseLong(textField.getText(), 2);

                                            // subtract two binary numbers
                                            long result = first2 - bin2;
                                            // convert result to binary
                                            String binary = Long.toBinaryString(result);
                                            textField.setText(binary);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }

                                        break;
                                    case "Octal":
                                        try {
                                            long oct2 = Long.parseLong(textField.getText(), 8);

                                            long result1 = first2 - oct2;

                                            // convert result to octal
                                            String octal = Long.toOctalString(result1);
                                            textField.setText(octal);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }

                                        break;
                                    case "Hexadecimal":
                                        try {
                                            long hex2 = Long.parseLong(textField.getText(), 16);

                                            long result2 = first2 - hex2;
                                            // convert result to hexadecimal
                                            String hex = Long.toHexString(result2);
                                            textField.setText(hex);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }

                                        break;
                                }
                                break;
                            case "*":
                                switch (numberSystem) {
                                    case "Decimal":
                                        try {
                                            long second = Long.parseLong(textField.getText());
                                            textField.setText(Long.toString(first2 * second));
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Binary":
                                        try {
                                            long bin2 = Long.parseLong(textField.getText(), 2);

                                            // multiply two binary numbers
                                            long result = first2 * bin2;
                                            // convert result to binary
                                            String binary = Long.toBinaryString(result);
                                            textField.setText(binary);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }

                                        break;
                                    case "Octal":
                                        try {
                                            long oct2 = Long.parseLong(textField.getText(), 8);

                                            long result1 = first2 * oct2;

                                            // convert result to octal
                                            String octal = Long.toOctalString(result1);
                                            textField.setText(octal);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }

                                        break;
                                    case "Hexadecimal":
                                        try {
                                            long hex2 = Long.parseLong(textField.getText(), 16);

                                            long result2 = first2 * hex2;
                                            // convert result to hexadecimal
                                            String hex = Long.toHexString(result2);
                                            textField.setText(hex);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }

                                        break;
                                }

                                break;
                            case "/":
                                switch (numberSystem) {
                                    case "Decimal":
                                        try {
                                            long second = Long.parseLong(textField.getText());
                                            textField.setText(Long.toString(first2 / second));
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Binary":
                                        try {
                                            long bin2 = Long.parseLong(textField.getText(), 2);

                                            // divide two binary numbers
                                            long result = first2 / bin2;
                                            // convert result to binary
                                            String binary = Long.toBinaryString(result);
                                            textField.setText(binary);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }

                                        break;
                                    case "Octal":
                                        try {
                                            long oct2 = Long.parseLong(textField.getText(), 8);

                                            long result1 = first2 / oct2;

                                            // convert result to octal
                                            String octal = Long.toOctalString(result1);
                                            textField.setText(octal);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }

                                        break;
                                    case "Hexadecimal":
                                        try {
                                            long hex2 = Long.parseLong(textField.getText(), 16);

                                            long result2 = first2 / hex2;
                                            // convert result to hexadecimal
                                            String hex = Long.toHexString(result2);
                                            textField.setText(hex);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }

                                        break;
                                }

                                break;
                            case "%":
                                switch (numberSystem) {
                                    case "Decimal":
                                        try {
                                            long second = Long.parseLong(textField.getText());
                                            textField.setText(Long.toString(first2 % second));
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Binary":
                                        try {
                                            long bin2 = Long.parseLong(textField.getText(), 2);

                                            // divide two binary numbers
                                            long result = first2 % bin2;
                                            // convert result to binary
                                            String binary = Long.toBinaryString(result);
                                            textField.setText(binary);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }

                                        break;
                                    case "Octal":
                                        try {
                                            long oct2 = Long.parseLong(textField.getText(), 8);

                                            long result1 = first2 % oct2;

                                            // convert result to octal
                                            String octal = Long.toOctalString(result1);
                                            textField.setText(octal);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }

                                        break;
                                    case "Hexadecimal":
                                        try {
                                            long hex2 = Long.parseLong(textField.getText(), 16);

                                            long result2 = first2 % hex2;
                                            // convert result to hexadecimal
                                            String hex = Long.toHexString(result2);
                                            textField.setText(hex);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }

                                        break;
                                }
                                break;
                            case "^":
                                switch (numberSystem) {
                                    case "Decimal":
                                        try {
                                            long second = Long.parseLong(textField.getText());
                                            long result = (long) Math.pow(first2, second);
                                            textField.setText(Long.toString(result));
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Binary":
                                        try {
                                            long bin2 = Long.parseLong(textField.getText(), 2);
                                            long result1 = (long) Math.pow(first2, bin2);
                                            // convert result to binary
                                            String binary = Long.toBinaryString(result1);
                                            textField.setText(binary);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;

                                    case "Octal":
                                        try {
                                            long oct2 = Long.parseLong(textField.getText(), 8);
                                            long result2 = (long) Math.pow(first2, oct2);
                                            // convert result to octal
                                            String octal = Long.toOctalString(result2);
                                            textField.setText(octal);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }

                                        break;
                                    case "Hexadecimal":
                                        try {
                                            long hex2 = Long.parseLong(textField.getText(), 16);
                                            long result3 = (long) Math.pow(first2, hex2);
                                            // convert result to hexadecimal
                                            String hex = Long.toHexString(result3);
                                            textField.setText(hex);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }

                                        break;
                                }
                                break;
                        }
                        break;
                    case "float":

                        switch (operation) {
                            case "+":
                                switch (numberSystem) {
                                    case "Decimal":
                                        try {
                                            Float second = Float.parseFloat(textField.getText());
                                            textField.setText(String.valueOf(first + second));
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Binary":
                                        try {
                                            int intBits = (int) Long.parseLong(textField.getText(), 2);
                                            Float bin2 = Float.intBitsToFloat(intBits);

                                            // add two binary numbers
                                            Float result = first + bin2;
                                            // convert result to binary
                                            String binary = String.valueOf(result);
                                            textField.setText(binary);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }

                                        break;

                                    case "Octal":
                                        try {
                                            int intBits1 = (int) Long.parseLong(textField.getText(), 8);
                                            Float oct2 = Float.intBitsToFloat(intBits1);

                                            Float result1 = first + oct2;
                                            // convert result to octal
                                            String octal = String.valueOf(result1);
                                            textField.setText(octal);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Hexadecimal":
                                        try {
                                            int intBits2 = (int) Long.parseLong(textField.getText(), 16);
                                            Float hex2 = Float.intBitsToFloat(intBits2);

                                            Float result2 = first + hex2;
                                            // convert result to hexadecimal
                                            String hex = String.valueOf(result2);
                                            textField.setText(hex);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                }
                                break;
                            case "-":
                                switch (numberSystem) {
                                    case "Decimal":
                                        try {
                                            Float second = Float.parseFloat(textField.getText());
                                            textField.setText(Float.toString(first - second));
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }

                                        break;
                                    case "Binary":
                                        try {
                                            int intBits = (int) Long.parseLong(textField.getText(), 2);
                                            Float bin2 = Float.intBitsToFloat(intBits);

                                            // subtract two binary numbers
                                            Float result = first - bin2;
                                            // convert result to binary
                                            String binary = String.valueOf(result);
                                            textField.setText(binary);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Octal":
                                        try {
                                            int intBits1 = (int) Long.parseLong(textField.getText(), 8);
                                            Float oct2 = Float.intBitsToFloat(intBits1);

                                            Float result1 = first - oct2;
                                            // convert result to octal
                                            String octal = String.valueOf(result1);
                                            textField.setText(octal);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Hexadecimal":
                                        try {
                                            int intBits2 = (int) Long.parseLong(textField.getText(), 16);
                                            Float hex2 = Float.intBitsToFloat(intBits2);

                                            Float result2 = first - hex2;
                                            // convert result to hexadecimal
                                            String hex = String.valueOf(result2);
                                            textField.setText(hex);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                }
                                break;
                            case "*":
                                switch (numberSystem) {
                                    case "Decimal":
                                        try {
                                            Float second = Float.parseFloat(textField.getText());
                                            textField.setText(Float.toString(first * second));
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Binary":
                                        try {
                                            int intBits = (int) Long.parseLong(textField.getText(), 2);
                                            Float bin2 = Float.intBitsToFloat(intBits);

                                            // multiply two binary numbers
                                            Float result = first * bin2;
                                            // convert result to binary
                                            String binary = String.valueOf(result);
                                            textField.setText(binary);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }

                                        break;
                                    case "Octal":
                                        try {
                                            int intBits1 = (int) Long.parseLong(textField.getText(), 8);
                                            Float oct2 = Float.intBitsToFloat(intBits1);

                                            Float result1 = first * oct2;
                                            // convert result to octal
                                            String octal = String.valueOf(result1);
                                            textField.setText(octal);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Hexadecimal":
                                        try {
                                            int intBits2 = (int) Long.parseLong(textField.getText(), 16);
                                            Float hex2 = Float.intBitsToFloat(intBits2);

                                            Float result2 = first * hex2;
                                            // convert result to hexadecimal
                                            String hex = String.valueOf(result2);
                                            textField.setText(hex);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }

                                        break;
                                }
                                break;
                            case "/":
                                switch (numberSystem) {
                                    case "Decimal":
                                        try {
                                            Float second = Float.parseFloat(textField.getText());
                                            textField.setText(Float.toString(first / second));
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }

                                        break;
                                    case "Binary":
                                        try {
                                            int intBits = (int) Long.parseLong(textField.getText(), 2);
                                            Float bin2 = Float.intBitsToFloat(intBits);

                                            // divide two binary numbers
                                            Float result = first / bin2;
                                            // convert result to binary
                                            String binary = String.valueOf(result);
                                            textField.setText(binary);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Octal":
                                        try {
                                            int intBits1 = (int) Long.parseLong(textField.getText(), 8);
                                            Float oct2 = Float.intBitsToFloat(intBits1);

                                            Float result1 = first / oct2;
                                            // convert result to octal
                                            String octal = String.valueOf(result1);
                                            textField.setText(octal);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Hexadecimal":
                                        try {
                                            int intBits2 = (int) Long.parseLong(textField.getText(), 16);
                                            Float hex2 = Float.intBitsToFloat(intBits2);

                                            Float result2 = first / hex2;
                                            // convert result to hexadecimal
                                            String hex = String.valueOf(result2);
                                            textField.setText(hex);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                }
                                break;
                        }

                        break;
                    case "short":

                        switch (operation) {
                            case "+":
                                switch (numberSystem) {
                                    case "Decimal":
                                        try {
                                            short second = Short.parseShort(textField.getText());
                                            textField.setText(String.valueOf(first4 + second));
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Binary":
                                        try {
                                            short bin2 = Short.parseShort(textField.getText(), 2);

                                            // add two binary numbers
                                            short result = (short) (first4 + bin2);
                                            // convert result to binary
                                            String binary = Integer.toBinaryString(result);
                                            textField.setText(binary);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }

                                        break;
                                    case "Octal":
                                        try {
                                            short oct2 = Short.parseShort(textField.getText(), 8);

                                            short result1 = (short) (first4 + oct2);

                                            // convert result to octal
                                            String octal = Integer.toOctalString(result1);
                                            textField.setText(octal);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }

                                        break;
                                    case "Hexadecimal":
                                        try {
                                            short hex2 = Short.parseShort(textField.getText(), 16);

                                            short result2 = (short) (first4 + hex2);
                                            // convert result to hexadecimal
                                            String hex = Integer.toHexString(result2);
                                            textField.setText(hex);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }

                                        break;
                                }
                                break;
                            case "-":
                                switch (numberSystem) {
                                    case "Decimal":
                                        try {
                                            short second = Short.parseShort(textField.getText());
                                            textField.setText(String.valueOf(first4 - second));
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Binary":
                                        try {
                                            short bin2 = Short.parseShort(textField.getText(), 2);

                                            // subtract two binary numbers
                                            short result = (short) (first4 - bin2);
                                            // convert result to binary
                                            String binary = Integer.toBinaryString(result);
                                            textField.setText(binary);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }

                                        break;
                                    case "Octal":
                                        try {
                                            short oct2 = Short.parseShort(textField.getText(), 8);

                                            short result1 = (short) (first4 - oct2);

                                            // convert result to octal
                                            String octal = Integer.toOctalString(result1);
                                            textField.setText(octal);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }

                                        break;
                                    case "Hexadecimal":
                                        try {
                                            short hex2 = Short.parseShort(textField.getText(), 16);

                                            short result2 = (short) (first4 - hex2);
                                            // convert result to hexadecimal
                                            String hex = Integer.toHexString(result2);
                                            textField.setText(hex);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }

                                        break;
                                }
                                break;
                            case "*":
                                switch (numberSystem) {
                                    case "Decimal":
                                        try {
                                            short second = Short.parseShort(textField.getText());
                                            textField.setText(String.valueOf(first4 * second));
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Binary":
                                        try {
                                            short bin2 = Short.parseShort(textField.getText(), 2);

                                            // multiply two binary numbers
                                            short result = (short) (first4 * bin2);
                                            // convert result to binary
                                            String binary = Integer.toBinaryString(result);
                                            textField.setText(binary);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }

                                        break;
                                    case "Octal":
                                        try {
                                            short oct2 = Short.parseShort(textField.getText(), 8);

                                            short result1 = (short) (first4 * oct2);

                                            // convert result to octal
                                            String octal = Integer.toOctalString(result1);
                                            textField.setText(octal);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }

                                        break;
                                    case "Hexadecimal":
                                        try {
                                            short hex2 = Short.parseShort(textField.getText(), 16);

                                            short result2 = (short) (first4 * hex2);
                                            // convert result to hexadecimal
                                            String hex = Integer.toHexString(result2);
                                            textField.setText(hex);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }

                                        break;
                                }
                                break;
                            case "/":
                                switch (numberSystem) {
                                    case "Decimal":
                                        try {
                                            short second = Short.parseShort(textField.getText());
                                            textField.setText(String.valueOf(first4 / second));
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Binary":
                                        try {
                                            short bin2 = Short.parseShort(textField.getText(), 2);

                                            // divide two binary numbers
                                            short result = (short) (first4 / bin2);
                                            // convert result to binary
                                            String binary = Integer.toBinaryString(result);
                                            textField.setText(binary);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }

                                        break;
                                    case "Octal":
                                        try {
                                            short oct2 = Short.parseShort(textField.getText(), 8);

                                            short result1 = (short) (first4 / oct2);

                                            // convert result to octal
                                            String octal = Integer.toOctalString(result1);
                                            textField.setText(octal);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }

                                        break;
                                    case "Hexadecimal":
                                        try {
                                            short hex2 = Short.parseShort(textField.getText(), 16);

                                            short result2 = (short) (first4 / hex2);
                                            // convert result to hexadecimal
                                            String hex = Integer.toHexString(result2);
                                            textField.setText(hex);
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }

                                        break;
                                }
                                break;
                            case "^":
                                // power of two numbers
                                switch (numberSystem) {
                                    case "Decimal":
                                        try {
                                            short second = Short.parseShort(textField.getText());
                                            textField.setText(String.valueOf((short) Math.pow(first4, second)));
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Binary":
                                        try {
                                            short bin2 = Short.parseShort(textField.getText(), 2);
                                            textField.setText(String.valueOf((short) Math.pow(first4, bin2)));
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Octal":
                                        try {
                                            short oct2 = Short.parseShort(textField.getText(), 8);
                                            textField.setText(String.valueOf((short) Math.pow(first4, oct2)));
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Hexadecimal":
                                        try {
                                            short hex2 = Short.parseShort(textField.getText(), 16);
                                            textField.setText(String.valueOf((short) Math.pow(first4, hex2)));
                                        } catch (NumberFormatException e1) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
        });

        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });
        buttonDec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + ".");
            }
        });
        buttonNeg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(Integer.parseInt(textField.getText()) * -1 + "");
            }
        });
        buttonSqrt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(Math.sqrt(Double.parseDouble(textField.getText())) + "");
            }
        });
        buttonRemainder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first1 = Double.parseDouble(textField.getText());
                textField.setText("");
                operation = "%";
            }
        });
        // End of Buttons action listeners for main screen

        buttonMode.addActionListener(new ActionListener() { // Action listener mode and datatype settings
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame frame = new JFrame("Mode");
                frame.setSize(200, 200);
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setLayout(new GridLayout(3, 1));
                frame.setResizable(false);
                JPanel panel1 = new JPanel();
                JPanel panel2 = new JPanel();
                JPanel panel3 = new JPanel();
                JLabel label1 = new JLabel("Number System");
                JLabel label2 = new JLabel("Angle Number System");
                JLabel label3 = new JLabel("Data Type ");
                var comboBox1 = new JComboBox();
                var comboBox2 = new JComboBox();
                var comboBox3 = new JComboBox();
                // JButton modeClose = new JButton();
                comboBox1.addItem("Decimal");
                comboBox1.addItem("Binary");
                comboBox1.addItem("Octal");
                comboBox1.addItem("Hexadecimal");
                comboBox2.addItem("Degree");
                comboBox2.addItem("Radian");
                comboBox3.addItem("double");
                comboBox3.addItem("int");
                comboBox3.addItem("long");
                comboBox3.addItem("float");
                comboBox3.addItem("short");

                frame.add(panel1);
                frame.add(panel2);
                frame.add(panel3);
                panel1.add(label1);
                panel1.add(comboBox1);
                panel2.add(label2);
                panel2.add(comboBox2);
                panel3.add(label3);
                panel3.add(comboBox3);
                comboBox1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        numberSystem = comboBox1.getSelectedItem().toString();
                        if (numberSystem.equals("Binary")) {
                            numberSystem = "Binary";
                            buttonA.setEnabled(false);
                            buttonB.setEnabled(false);
                            buttonC.setEnabled(false);
                            buttonD.setEnabled(false);
                            buttonE.setEnabled(false);
                            buttonF.setEnabled(false);
                            button8.setEnabled(false);
                            button9.setEnabled(false);
                            button2.setEnabled(false);
                            button3.setEnabled(false);
                            button4.setEnabled(false);
                            button5.setEnabled(false);
                            button6.setEnabled(false);
                            button7.setEnabled(false);
                            button0.setEnabled(true);
                            button1.setEnabled(true);

                        } else if (numberSystem.equals("Octal")) {
                            numberSystem = "Octal";
                            buttonA.setEnabled(false);
                            buttonB.setEnabled(false);
                            buttonC.setEnabled(false);
                            buttonD.setEnabled(false);
                            buttonE.setEnabled(false);
                            buttonF.setEnabled(false);
                            button8.setEnabled(false);
                            button9.setEnabled(false);
                            button0.setEnabled(true);
                            button1.setEnabled(true);
                            button2.setEnabled(true);
                            button3.setEnabled(true);
                            button4.setEnabled(true);
                            button5.setEnabled(true);
                            button6.setEnabled(true);
                            button7.setEnabled(true);

                        } else if (numberSystem.equals("Decimal")) {
                            numberSystem = "Decimal";
                            buttonA.setEnabled(false);
                            buttonB.setEnabled(false);
                            buttonC.setEnabled(false);
                            buttonD.setEnabled(false);
                            buttonE.setEnabled(false);
                            buttonF.setEnabled(false);
                            button0.setEnabled(true);
                            button1.setEnabled(true);
                            button2.setEnabled(true);
                            button3.setEnabled(true);
                            button4.setEnabled(true);
                            button5.setEnabled(true);
                            button6.setEnabled(true);
                            button7.setEnabled(true);
                            button8.setEnabled(true);
                            button9.setEnabled(true);

                        } else if (numberSystem.equals("Hexadecimal")) {
                            numberSystem = "Hexadecimal";
                            buttonA.setEnabled(true);
                            buttonB.setEnabled(true);
                            buttonC.setEnabled(true);
                            buttonD.setEnabled(true);
                            buttonE.setEnabled(true);
                            buttonF.setEnabled(true);
                            button0.setEnabled(true);
                            button1.setEnabled(true);
                            button2.setEnabled(true);
                            button3.setEnabled(true);
                            button4.setEnabled(true);
                            button5.setEnabled(true);
                            button6.setEnabled(true);
                            button7.setEnabled(true);
                            button8.setEnabled(true);
                            button9.setEnabled(true);

                        }
                    }
                });
                comboBox2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        numberSystemAngle = comboBox2.getSelectedItem().toString();
                        if (numberSystemAngle.equals("Degree")) {
                            numberSystemAngle = "Degree";
                        } else if (numberSystemAngle.equals("Radian")) {
                            numberSystemAngle = "Radian";
                        }
                    }
                });
                comboBox3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        datatype = comboBox3.getSelectedItem().toString();
                        if (datatype.equals("int")) {
                            datatype = "int";
                        } else if (datatype.equals("long")) {
                            datatype = "long";
                        } else if (datatype.equals("float")) {
                            datatype = "float";
                        } else if (datatype.equals("double")) {
                            datatype = "double";
                        } else if (datatype.equals("short")) {
                            datatype = "short";
                        }
                    }
                });

            }
        });

        // SET the number buttons in the panel in a grid layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 4, 5, 5));
        frame.add(panel, BorderLayout.WEST);

        panel.add(buttonA);
        panel.add(buttonClear);
        panel.add(buttonSqrt);
        panel.add(buttonRemainder);
        panel.add(buttonDiv);
        panel.add(buttonB);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(buttonMul);
        panel.add(buttonC);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(buttonSub);
        panel.add(buttonD);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(buttonAdd);
        panel.add(buttonE);
        panel.add(button0);
        panel.add(buttonDec);
        panel.add(buttonFact);
        panel.add(buttonEqual);
        panel.add(buttonF);
        panel.add(buttonNeg);
        panel.add(buttonSci);
        panel.add(buttonMode);

        buttonSci.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                buttonSci.setEnabled(false);
                JFrame frame2 = new JFrame("Scientific Calculator");
                frame2.setSize(400, 400);
                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame2.setVisible(true);
                frame2.setResizable(false);
                frame2.setLayout(new GridLayout(6, 4, 5, 5));

                JButton buttonSin = new JButton("sin");
                JButton buttonCos = new JButton("cos");
                JButton buttonTan = new JButton("tan");
                JButton buttonLog = new JButton("log");
                JButton buttonLn = new JButton("ln");
                JButton buttonPow2 = new JButton("x^2");
                JButton buttonPow3 = new JButton("x^3");
                JButton buttonPownum1_num2 = new JButton("x^y");
                JButton buttonPi = new JButton("pi");
                JButton buttonE = new JButton("e");
                JButton buttonClose = new JButton("Close");
                JButton buttonSinInv = new JButton("sin-1");
                JButton buttonCosInv = new JButton("cos-1");
                JButton buttonTanInv = new JButton("tan-1");
                JButton buttonSinh = new JButton("sinh");
                JButton buttonCosh = new JButton("cosh");
                JButton buttonTanh = new JButton("tanh");

                frame2.add(buttonSin);
                frame2.add(buttonCos);
                frame2.add(buttonTan);
                frame2.add(buttonSinInv);
                frame2.add(buttonCosInv);
                frame2.add(buttonTanInv);
                frame2.add(buttonSinh);
                frame2.add(buttonCosh);
                frame2.add(buttonTanh);
                frame2.add(buttonLog);
                frame2.add(buttonLn);
                frame2.add(buttonPow2);
                frame2.add(buttonPow3);
                frame2.add(buttonPownum1_num2);
                frame2.add(buttonPi);
                frame2.add(buttonE);
                frame2.add(buttonClose);

                // Trignometric Functions
                buttonSin.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (numberSystem.equals("Decimal")) {
                            if (numberSystemAngle.equals("Degree")) {
                                switch (datatype) {
                                    case "int":
                                        int radian = (int) Math.toRadians(Double.parseDouble(textField.getText()));
                                        int resultA = (int) Math.sin(radian);
                                        textField.setText(String.valueOf(resultA));
                                        break;
                                    case "double":
                                        double radian1 = Math.toRadians(Double.parseDouble(textField.getText()));
                                        double resultA1 = Math.sin(radian1);
                                        textField.setText(String.valueOf(resultA1));
                                        break;
                                    case "long":
                                        long radian2 = (long) Math.toRadians(Double.parseDouble(textField.getText()));
                                        long resultA2 = (long) Math.sin(radian2);
                                        textField.setText(String.valueOf(resultA2));
                                        break;
                                    case "short":
                                        short radian3 = (short) Math.toRadians(Double.parseDouble(textField.getText()));
                                        short resultA3 = (short) Math.sin(radian3);
                                        textField.setText(String.valueOf(resultA3));
                                        break;
                                }
                            } else if (numberSystemAngle.equals("Radian")) {
                                switch (datatype) {
                                    case "double":
                                        textField.setText(
                                                Double.toString(Math.sin(Double.parseDouble(textField.getText()))));
                                        break;
                                    case "int":
                                        textField.setText(Integer
                                                .toString((int) Math.sin(Integer.parseInt(textField.getText()))));
                                        break;
                                    case "long":
                                        textField.setText(
                                                Long.toString((long) Math.sin(Long.parseLong(textField.getText()))));
                                        break;
                                    case "short":
                                        textField.setText(Short
                                                .toString((short) Math.sin(Short.parseShort(textField.getText()))));
                                        break;
                                }
                            }
                        } else {
                            textField.setText("Select Decimal");
                        }
                    }
                });
                buttonCos.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        ///////// cos///////
                        if (numberSystem.equals("Decimal")) {
                            if (numberSystemAngle.equals("Degree")) {
                                switch (datatype) {
                                    case "int":
                                        int radian = (int) Math.toRadians(Double.parseDouble(textField.getText()));
                                        int resultA = (int) Math.cos(radian);
                                        textField.setText(String.valueOf(resultA));
                                        break;
                                    case "double":
                                        double radian1 = Math.toRadians(Double.parseDouble(textField.getText()));
                                        double resultA1 = Math.cos(radian1);
                                        textField.setText(String.valueOf(resultA1));
                                        break;
                                    case "long":
                                        long radian2 = (long) Math.toRadians(Double.parseDouble(textField.getText()));
                                        long resultA2 = (long) Math.cos(radian2);
                                        textField.setText(String.valueOf(resultA2));
                                        break;
                                    case "short":
                                        short radian3 = (short) Math.toRadians(Double.parseDouble(textField.getText()));
                                        short resulA3 = (short) Math.cos(radian3);
                                        textField.setText(String.valueOf(resulA3));
                                        break;
                                }
                            } else if (numberSystemAngle.equals("Radian")) {
                                switch (datatype) {
                                    case "double":
                                        textField.setText(
                                                Double.toString(Math.cos(Double.parseDouble(textField.getText()))));
                                        break;
                                    case "int":
                                        textField.setText(Integer
                                                .toString((int) Math.cos(Integer.parseInt(textField.getText()))));
                                        break;
                                    case "long":
                                        textField.setText(
                                                Long.toString((long) Math.cos(Long.parseLong(textField.getText()))));
                                        break;
                                    case "short":
                                        textField.setText(Short
                                                .toString((short) Math.cos(Short.parseShort(textField.getText()))));
                                        break;
                                }
                            }
                        } else {
                            textField.setText("Select Decimal");
                        }
                    }
                });
                buttonTan.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //////// Tan/////////
                        if (numberSystem.equals("Decimal")) {
                            if (numberSystemAngle.equals("Degree")) {
                                switch (datatype) {
                                    case "int":
                                        int radian = (int) Math.toRadians(Double.parseDouble(textField.getText()));
                                        int resultA = (int) Math.tan(radian);
                                        textField.setText(String.valueOf(resultA));
                                        break;
                                    case "double":
                                        double radian1 = Math.toRadians(Double.parseDouble(textField.getText()));
                                        double resultA1 = Math.tan(radian1);
                                        textField.setText(String.valueOf(resultA1));
                                        break;
                                    case "long":
                                        long radian2 = (long) Math.toRadians(Double.parseDouble(textField.getText()));
                                        long resultA2 = (long) Math.tan(radian2);
                                        textField.setText(String.valueOf(resultA2));
                                        break;
                                    case "short":
                                        short radian3 = (short) Math.toRadians(Double.parseDouble(textField.getText()));
                                        short resultA3 = (short) Math.tan(radian3);
                                        textField.setText(String.valueOf(resultA3));
                                        break;
                                }

                            } else if (numberSystemAngle.equals("Radian")) {
                                switch (datatype) {
                                    case "double":
                                        textField.setText(
                                                Double.toString(Math.tan(Double.parseDouble(textField.getText()))));
                                        break;
                                    case "int":
                                        textField.setText(Integer
                                                .toString((int) Math.tan(Integer.parseInt(textField.getText()))));
                                        break;
                                    case "long":
                                        textField.setText(
                                                Long.toString((long) Math.tan(Long.parseLong(textField.getText()))));
                                        break;
                                    case "short":
                                        textField.setText(Short
                                                .toString((short) Math.tan(Short.parseShort(textField.getText()))));
                                        break;
                                }
                            }
                        } else {
                            textField.setText("Select Decimal");
                        }
                    }

                });
                buttonCosInv.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //////// cos-1/////////
                        if (numberSystem.equals("Decimal")) {
                            if (numberSystemAngle.equals("Degree")) {
                                switch (datatype) {
                                    case "int":
                                        int radian = (int) Math.toRadians(Double.parseDouble(textField.getText()));
                                        int resultA = (int) Math.acos(radian);
                                        textField.setText(String.valueOf(resultA));
                                        break;
                                    case "double":
                                        double radian1 = Math.toRadians(Double.parseDouble(textField.getText()));
                                        double resultA1 = Math.acos(radian1);
                                        textField.setText(String.valueOf(resultA1));
                                        break;
                                    case "long":
                                        long radian2 = (long) Math.toRadians(Double.parseDouble(textField.getText()));
                                        long resultA2 = (long) Math.acos(radian2);
                                        textField.setText(String.valueOf(resultA2));
                                        break;
                                    case "short":
                                        short radian3 = (short) Math.toRadians(Double.parseDouble(textField.getText()));
                                        short resultA3 = (short) Math.acos(radian3);
                                        textField.setText(String.valueOf(resultA3));
                                        break;
                                }
                            } else if (numberSystemAngle.equals("Radian")) {
                                switch (datatype) {
                                    case "double":
                                        textField.setText(
                                                Double.toString(Math.acos(Double.parseDouble(textField.getText()))));
                                        break;
                                    case "int":
                                        textField.setText(Integer
                                                .toString((int) Math.acos(Integer.parseInt(textField.getText()))));
                                        break;
                                    case "long":
                                        textField.setText(
                                                Long.toString((long) Math.acos(Long.parseLong(textField.getText()))));
                                        break;
                                    case "short":
                                        textField.setText(Short
                                                .toString((short) Math.acos(Short.parseShort(textField.getText()))));
                                        break;
                                }
                            }
                        } else {
                            textField.setText("Select Decimal");
                        }

                    }
                });
                buttonTanInv.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //////// Tan-1/////////
                        if (numberSystem.equals("Decimal")) {
                            if (numberSystemAngle.equals("Degree")) {
                                switch (datatype) {
                                    case "int":
                                        int radian = (int) Math.toRadians(Double.parseDouble(textField.getText()));
                                        int resultA = (int) Math.atan(radian);
                                        textField.setText(String.valueOf(resultA));
                                        break;
                                    case "double":
                                        double radian1 = Math.toRadians(Double.parseDouble(textField.getText()));
                                        double resultA1 = Math.atan(radian1);
                                        textField.setText(String.valueOf(resultA1));
                                        break;
                                    case "long":
                                        long radian2 = (long) Math.toRadians(Double.parseDouble(textField.getText()));
                                        long resultA2 = (long) Math.atan(radian2);
                                        textField.setText(String.valueOf(resultA2));
                                        break;
                                    case "short":
                                        short radian3 = (short) Math.toRadians(Double.parseDouble(textField.getText()));
                                        short resultA3 = (short) Math.atan(radian3);
                                        textField.setText(String.valueOf(resultA3));
                                        break;
                                }
                            } else if (numberSystemAngle.equals("Radian")) {
                                switch (datatype) {
                                    case "double":
                                        textField.setText(
                                                Double.toString(Math.atan(Double.parseDouble(textField.getText()))));
                                        break;
                                    case "int":
                                        textField.setText(Integer
                                                .toString((int) Math.atan(Integer.parseInt(textField.getText()))));
                                        break;
                                    case "long":
                                        textField.setText(Long
                                                .toString((long) Math.atan(Long.parseLong(textField.getText()))));
                                        break;
                                    case "short":
                                        textField.setText(Short
                                                .toString((short) Math.atan(Short.parseShort(textField.getText()))));
                                        break;
                                }
                            }
                        } else {
                            textField.setText("Select Decimal");
                        }
                    }

                });
                buttonSinh.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //////// sinh/////////
                        if (numberSystem.equals("Decimal")) {
                            if (numberSystemAngle.equals("Degree")) {
                                switch (datatype) {
                                    case "int":
                                        int radian = (int) Math.toRadians(Double.parseDouble(textField.getText()));
                                        int resultA = (int) Math.sinh(radian);
                                        textField.setText(String.valueOf(resultA));
                                        break;
                                    case "double":
                                        double radian1 = Math.toRadians(Double.parseDouble(textField.getText()));
                                        double resultA1 = Math.sinh(radian1);
                                        textField.setText(String.valueOf(resultA1));
                                        break;
                                    case "long":
                                        long radian2 = (long) Math.toRadians(Double.parseDouble(textField.getText()));
                                        long resultA2 = (long) Math.sinh(radian2);
                                        textField.setText(String.valueOf(resultA2));
                                        break;
                                    case "short":
                                        short radian3 = (short) Math.toRadians(Double.parseDouble(textField.getText()));
                                        short resultA3 = (short) Math.sinh(radian3);
                                        textField.setText(String.valueOf(resultA3));
                                        break;
                                }
                            } else if (numberSystemAngle.equals("Radian")) {
                                switch (datatype) {
                                    case "double":
                                        textField.setText(
                                                Double.toString(Math.sinh(Double.parseDouble(textField.getText()))));
                                        break;
                                    case "int":
                                        textField.setText(Integer
                                                .toString((int) Math.sinh(Integer.parseInt(textField.getText()))));
                                        break;
                                    case "long":
                                        textField.setText(Long
                                                .toString((long) Math.sinh(Long.parseLong(textField.getText()))));
                                        break;
                                    case "short":
                                        textField.setText(Short
                                                .toString((short) Math.sinh(Short.parseShort(textField.getText()))));
                                        break;
                                }
                            }

                        } else {
                            textField.setText("Select Decimal");
                        }
                    }

                });

                buttonCosh.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //////// cosh/////////
                        if (numberSystem.equals("Decimal")) {
                            if (numberSystemAngle.equals("Degree")) {
                                switch (datatype) {
                                    case "int":
                                        int radian = (int) Math.toRadians(Double.parseDouble(textField.getText()));
                                        int resultA = (int) Math.cosh(radian);
                                        textField.setText(String.valueOf(resultA));
                                        break;
                                    case "double":
                                        double radian1 = Math.toRadians(Double.parseDouble(textField.getText()));
                                        double resultA1 = Math.cosh(radian1);
                                        textField.setText(String.valueOf(resultA1));
                                        break;
                                    case "long":
                                        long radian2 = (long) Math.toRadians(Double.parseDouble(textField.getText()));
                                        long resultA2 = (long) Math.cosh(radian2);
                                        textField.setText(String.valueOf(resultA2));
                                        break;
                                    case "short":
                                        short radian3 = (short) Math.toRadians(Double.parseDouble(textField.getText()));
                                        short resultA3 = (short) Math.cosh(radian3);
                                        textField.setText(String.valueOf(resultA3));
                                        break;

                                }
                            } else if (numberSystemAngle.equals("Radian")) {
                                switch (datatype) {
                                    case "double":
                                        textField.setText(
                                                Double.toString(Math.cosh(Double.parseDouble(textField.getText()))));
                                        break;
                                    case "int":
                                        textField.setText(Integer
                                                .toString((int) Math.cosh(Integer.parseInt(textField.getText()))));
                                        break;
                                    case "long":
                                        textField.setText(Long
                                                .toString((long) Math.cosh(Long.parseLong(textField.getText()))));
                                        break;
                                    case "short":
                                        textField.setText(Short
                                                .toString((short) Math.cosh(Short.parseShort(textField.getText()))));
                                        break;
                                }
                            } else {
                                textField.setText("Select Decimal");
                            }
                        }
                    }

                });

                buttonTanh.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //////// tanh/////////
                        if (numberSystem.equals("Decimal")) {
                            if (numberSystemAngle.equals("Degree")) {
                                switch (datatype) {
                                    case "int":
                                        int radian = (int) Math.toRadians(Double.parseDouble(textField.getText()));
                                        int resultA = (int) Math.tanh(radian);
                                        textField.setText(String.valueOf(resultA));
                                        break;
                                    case "double":
                                        double radian1 = Math.toRadians(Double.parseDouble(textField.getText()));
                                        double resultA1 = Math.tanh(radian1);
                                        textField.setText(String.valueOf(resultA1));
                                        break;
                                    case "long":
                                        long radian2 = (long) Math.toRadians(Double.parseDouble(textField.getText()));
                                        long resultA2 = (long) Math.tanh(radian2);
                                        textField.setText(String.valueOf(resultA2));
                                        break;
                                    case "short":
                                        short radian3 = (short) Math.toRadians(Double.parseDouble(textField.getText()));
                                        short resultA3 = (short) Math.tanh(radian3);
                                        textField.setText(String.valueOf(resultA3));
                                        break;
                                }
                            } else if (numberSystemAngle.equals("Radian")) {
                                switch (datatype) {
                                    case "double":
                                        textField.setText(
                                                Double.toString(Math.tanh(Double.parseDouble(textField.getText()))));
                                        break;
                                    case "int":
                                        textField.setText(Integer
                                                .toString((int) Math.tanh(Integer.parseInt(textField.getText()))));
                                        break;
                                    case "long":
                                        textField.setText(Long
                                                .toString((long) Math.tanh(Long.parseLong(textField.getText()))));
                                        break;
                                    case "short":
                                        textField.setText(Short
                                                .toString((short) Math.tanh(Short.parseShort(textField.getText()))));
                                        break;
                                }
                            } else {
                                textField.setText("Select Decimal");
                            }
                        }
                    }
                });
                buttonLog.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // log with base 10
                        switch (datatype) {

                            case "int":
                                switch (numberSystem) {
                                    case "Binary":
                                        int num1 = Integer.parseInt(textField.getText(), 2);
                                        int num2 = (int) Math.log10(num1);
                                        textField.setText(String.valueOf(num2));
                                        break;
                                    case "Octal":
                                        int num3 = Integer.parseInt(textField.getText(), 8);
                                        int num4 = (int) Math.log10(num3);
                                        textField.setText(String.valueOf(num4));
                                        break;
                                    case "Decimal":
                                        int num5 = Integer.parseInt(textField.getText());
                                        int num6 = (int) Math.log10(num5);
                                        textField.setText(String.valueOf(num6));
                                        break;
                                    case "Hexadecimal":
                                        int num7 = Integer.parseInt(textField.getText(), 16);
                                        int num8 = (int) Math.log10(num7);
                                        textField.setText(String.valueOf(num8));
                                        break;
                                }
                        }
                    }
                });

                buttonLn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        switch (datatype) {
                            case "int":
                                switch (numberSystem) {
                                    case "Binary":
                                        int num1 = Integer.parseInt(textField.getText(), 2);
                                        int num2 = (int) Math.log(num1);
                                        textField.setText(String.valueOf(num2));
                                        break;
                                    case "Octal":
                                        int num3 = Integer.parseInt(textField.getText(), 8);
                                        int num4 = (int) Math.log(num3);
                                        textField.setText(String.valueOf(num4));
                                        break;
                                    case "Decimal":
                                        int num5 = Integer.parseInt(textField.getText());
                                        int num6 = (int) Math.log(num5);
                                        textField.setText(String.valueOf(num6));
                                        break;
                                    case "Hexadecimal":
                                        int num7 = Integer.parseInt(textField.getText(), 16);
                                        int num8 = (int) Math.log(num7);
                                        textField.setText(String.valueOf(num8));
                                        break;
                                }

                                break;
                            case "long":
                                switch (numberSystem) {
                                    case "Binary":
                                        long num1 = Long.parseLong(textField.getText(), 2);
                                        long num2 = (long) Math.log(num1);
                                        textField.setText(String.valueOf(num2));
                                        break;
                                    case "Octal":
                                        long num3 = Long.parseLong(textField.getText(), 8);
                                        long num4 = (long) Math.log(num3);
                                        textField.setText(String.valueOf(num4));
                                        break;
                                    case "Decimal":
                                        long num5 = Long.parseLong(textField.getText());
                                        long num6 = (long) Math.log(num5);
                                        textField.setText(String.valueOf(num6));
                                        break;
                                    case "Hexadecimal":
                                        long num7 = Long.parseLong(textField.getText(), 16);
                                        long num8 = (long) Math.log(num7);
                                        textField.setText(String.valueOf(num8));
                                        break;
                                }
                                break;
                            case "float":
                                switch (numberSystem) {
                                    case "Binary":
                                        int intBits = (int) Long.parseLong(textField.getText(), 2);
                                        float num1 = Float.intBitsToFloat(intBits);
                                        float num2 = (float) Math.log(num1);
                                        textField.setText(String.valueOf(num2));
                                        break;
                                    case "Octal":
                                        int intBits1 = (int) Long.parseLong(textField.getText(), 8);
                                        float num3 = Float.intBitsToFloat(intBits1);
                                        float num4 = (float) Math.log(num3);
                                        textField.setText(String.valueOf(num4));
                                        break;
                                    case "Decimal":
                                        float num5 = Float.parseFloat(textField.getText());
                                        float num6 = (float) Math.log(num5);
                                        textField.setText(String.valueOf(num6));
                                        break;
                                    case "Hexadecimal":
                                        int intBits2 = (int) Long.parseLong(textField.getText(), 16);
                                        float num7 = Float.intBitsToFloat(intBits2);
                                        float num8 = (float) Math.log(num7);
                                        textField.setText(String.valueOf(num8));
                                        break;
                                }
                                break;
                            case "double":
                                switch (numberSystem) {
                                    case "Binary":
                                        long longBits = Long.parseLong(textField.getText(), 2);
                                        double num1 = Double.longBitsToDouble(longBits);
                                        double num2 = (double) Math.log(num1);
                                        textField.setText(String.valueOf(num2));
                                        break;
                                    case "Octal":
                                        long longBits2 = Long.parseLong(textField.getText(), 8);
                                        double num3 = Double.longBitsToDouble(longBits2);
                                        double num4 = (double) Math.log(num3);
                                        textField.setText(String.valueOf(num4));
                                        break;
                                    case "Decimal":
                                        double num5 = Double.parseDouble(textField.getText());
                                        double num6 = (double) Math.log(num5);
                                        textField.setText(String.valueOf(num6));
                                        break;
                                    case "Hexadecimal":
                                        long longBits3 = Long.parseLong(textField.getText(), 16);
                                        double num7 = Double.longBitsToDouble(longBits3);
                                        double num8 = (double) Math.log(num7);
                                        textField.setText(String.valueOf(num8));
                                        break;
                                }
                                break;
                            case "short":
                                switch (numberSystem) {
                                    case "Binary":
                                        short num1 = Short.parseShort(textField.getText(), 2);
                                        short num2 = (short) Math.log(num1);
                                        textField.setText(String.valueOf(num2));
                                        break;
                                    case "Octal":
                                        short num3 = Short.parseShort(textField.getText(), 8);
                                        short num4 = (short) Math.log(num3);
                                        textField.setText(String.valueOf(num4));
                                        break;
                                    case "Decimal":
                                        short num5 = Short.parseShort(textField.getText());
                                        short num6 = (short) Math.log(num5);
                                        textField.setText(String.valueOf(num6));
                                        break;
                                    case "Hexadecimal":
                                        short num7 = Short.parseShort(textField.getText(), 16);
                                        short num8 = (short) Math.log(num7);
                                        textField.setText(String.valueOf(num8));
                                        break;
                                }

                                break;
                        }

                    }
                });

                buttonPow2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        switch (datatype) {
                            case "int":
                                int pow2 = (int) Math.pow(Integer.parseInt(textField.getText()), 2);
                                textField.setText(String.valueOf(pow2));
                                break;
                            case "long":
                                long pow22 = (long) Math.pow(Long.parseLong(textField.getText()), 2);
                                textField.setText(String.valueOf(pow22));
                                break;
                            case "float":
                                float pow23 = (float) Math.pow(Float.parseFloat(textField.getText()), 2);
                                textField.setText(String.valueOf(pow23));
                                break;
                            case "double":
                                double pow24 = (double) Math.pow(Double.parseDouble(textField.getText()), 2);
                                textField.setText(String.valueOf(pow24));
                                break;
                            case "short":
                                short pow25 = (short) Math.pow(Short.parseShort(textField.getText()), 2);
                                textField.setText(String.valueOf(pow25));
                                break;
                        }
                    }
                });
                buttonPow3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        switch (datatype) {
                            case "int":
                                switch (numberSystem) {
                                    case "Binary":
                                        int intBits = (int) Long.parseLong(textField.getText(), 2);
                                        int pow3 = (int) Math.pow(intBits, 3);
                                        textField.setText(String.valueOf(pow3));
                                        break;
                                    case "Octal":
                                        int intBits1 = (int) Long.parseLong(textField.getText(), 8);
                                        int pow33 = (int) Math.pow(intBits1, 3);
                                        textField.setText(String.valueOf(pow33));
                                        break;
                                    case "Decimal":
                                        int pow34 = (int) Math.pow(Integer.parseInt(textField.getText()), 3);
                                        textField.setText(String.valueOf(pow34));
                                        break;
                                    case "Hexadecimal":
                                        int intBits2 = (int) Long.parseLong(textField.getText(), 16);
                                        int pow35 = (int) Math.pow(intBits2, 3);
                                        textField.setText(String.valueOf(pow35));
                                        break;
                                }
                                break;
                            case "long":
                                switch (numberSystem) {
                                    case "Binary":
                                        long longBits = Long.parseLong(textField.getText(), 2);
                                        long pow3 = (long) Math.pow(longBits, 3);
                                        textField.setText(String.valueOf(pow3));
                                        break;
                                    case "Octal":
                                        long longBits1 = Long.parseLong(textField.getText(), 8);
                                        long pow33 = (long) Math.pow(longBits1, 3);
                                        textField.setText(String.valueOf(pow33));
                                        break;
                                    case "Decimal":
                                        long pow34 = (long) Math.pow(Long.parseLong(textField.getText()), 3);
                                        textField.setText(String.valueOf(pow34));
                                        break;
                                    case "Hexadecimal":
                                        long longBits2 = Long.parseLong(textField.getText(), 16);
                                        long pow35 = (long) Math.pow(longBits2, 3);
                                        textField.setText(String.valueOf(pow35));
                                        break;
                                }
                                break;
                            case "float":
                                switch (numberSystem) {
                                    case "Binary":
                                        int intBits = (int) Long.parseLong(textField.getText(), 2);
                                        float pow3 = (float) Math.pow(intBits, 3);
                                        textField.setText(String.valueOf(pow3));

                                        break;
                                    case "Octal":
                                        int intBits1 = (int) Long.parseLong(textField.getText(), 8);
                                        float pow33 = (float) Math.pow(intBits1, 3);
                                        textField.setText(String.valueOf(pow33));
                                        break;
                                    case "Decimal":
                                        float pow34 = (float) Math.pow(Float.parseFloat(textField.getText()), 3);
                                        textField.setText(String.valueOf(pow34));
                                        break;
                                    case "Hexadecimal":
                                        int intBits2 = (int) Long.parseLong(textField.getText(), 16);
                                        float pow35 = (float) Math.pow(intBits2, 3);
                                        textField.setText(String.valueOf(pow35));
                                        break;
                                }

                                break;
                            case "double":
                                switch (numberSystem) {
                                    case "Binary":
                                        int intBits = (int) Long.parseLong(textField.getText(), 2);
                                        double pow3 = (double) Math.pow(intBits, 3);
                                        textField.setText(String.valueOf(pow3));
                                        break;
                                    case "Octal":
                                        int intBits1 = (int) Long.parseLong(textField.getText(), 8);
                                        double pow33 = (double) Math.pow(intBits1, 3);
                                        textField.setText(String.valueOf(pow33));
                                        break;
                                    case "Decimal":
                                        double pow34 = (double) Math.pow(Double.parseDouble(textField.getText()), 3);
                                        textField.setText(String.valueOf(pow34));
                                        break;
                                    case "Hexadecimal":
                                        int intBits2 = (int) Long.parseLong(textField.getText(), 16);
                                        double pow35 = (double) Math.pow(intBits2, 3);
                                        textField.setText(String.valueOf(pow35));
                                        break;

                                }
                            case "short":
                                switch (numberSystem) {
                                    case "Binary":
                                        short shortBits = Short.parseShort(textField.getText(), 2);
                                        short pow3 = (short) Math.pow(shortBits, 3);
                                        textField.setText(String.valueOf(pow3));
                                        break;
                                    case "Octal":
                                        short shortBits1 = Short.parseShort(textField.getText(), 8);
                                        short pow33 = (short) Math.pow(shortBits1, 3);
                                        textField.setText(String.valueOf(pow33));
                                        break;
                                    case "Decimal":
                                        short pow34 = (short) Math.pow(Short.parseShort(textField.getText()), 3);
                                        textField.setText(String.valueOf(pow34));
                                        break;
                                    case "Hexadecimal":
                                        short shortBits2 = Short.parseShort(textField.getText(), 16);
                                        short pow35 = (short) Math.pow(shortBits2, 3);
                                        textField.setText(String.valueOf(pow35));
                                        break;
                                }
                                break;
                        }
                    }
                });

                buttonPownum1_num2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        switch (datatype) {

                            case "int":
                                switch (numberSystem) {
                                    case "Decimal":
                                        try {
                                            first = Integer.parseInt(textField.getText());
                                            textField.setText("");
                                        } catch (NumberFormatException ex) {
                                            textField.setText("Error: NumberFormatException");
                                        }

                                        break;
                                    case "Binary":
                                        try {
                                            first = Integer.parseInt(textField.getText(), 2);
                                            textField.setText("");
                                        } catch (NumberFormatException ex) {
                                            textField.setText("Error: NumberFormatException");
                                        }

                                        break;
                                    case "Octal":
                                        try {
                                            first = Integer.parseInt(textField.getText(), 8);
                                            textField.setText("");
                                        } catch (NumberFormatException ex) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Hexadecimal":
                                        try {
                                            first = Integer.parseInt(textField.getText(), 16);
                                            textField.setText("");
                                        } catch (NumberFormatException ex) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                }
                                operation = "^";

                                break;
                            case "double":
                                switch (numberSystem) {
                                    case "Decimal":
                                        try {
                                            first1 = Double.parseDouble(textField.getText());
                                            textField.setText("");
                                        } catch (NumberFormatException ex) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Binary":
                                        try {
                                            int intBits = (int) Long.parseLong(textField.getText(), 2);
                                            first1 = Double.longBitsToDouble(intBits);
                                            textField.setText("");
                                        } catch (NumberFormatException ex) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Octal":
                                        try {
                                            int intOctal = (int) Long.parseLong(textField.getText(), 8);
                                            first1 = Double.longBitsToDouble(intOctal);
                                            textField.setText("");
                                        } catch (NumberFormatException ex) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Hexadecimal":
                                        try {
                                            int intHex = (int) Long.parseLong(textField.getText(), 16);
                                            first1 = Double.longBitsToDouble(intHex);
                                            textField.setText("");
                                        } catch (NumberFormatException ex) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                }
                                operation = "^";
                                break;
                            case "long":
                                switch (numberSystem) {
                                    case "Decimal":
                                        try {
                                            first2 = Long.parseLong(textField.getText());
                                            textField.setText("");
                                        } catch (NumberFormatException ex) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Binary":
                                        try {
                                            first2 = Long.parseLong(textField.getText(), 2);
                                            textField.setText("");
                                        } catch (NumberFormatException ex) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Octal":
                                        try {
                                            first2 = Long.parseLong(textField.getText(), 8);
                                            textField.setText("");
                                        } catch (NumberFormatException ex) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Hexadecimal":
                                        try {
                                            first2 = Long.parseLong(textField.getText(), 16);
                                            textField.setText("");
                                        } catch (NumberFormatException ex) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                }
                                operation = "^";
                                break;
                            case "float":
                                switch (numberSystem) {
                                    case "Decimal":
                                        try {
                                            first3 = Float.parseFloat(textField.getText());
                                            textField.setText("");
                                        } catch (NumberFormatException ex) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Binary":
                                        try {
                                            int intBits1 = (int) Long.parseLong(textField.getText(), 2);
                                            first3 = Float.intBitsToFloat(intBits1);
                                            textField.setText("");
                                        } catch (NumberFormatException ex) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Octal":
                                        try {
                                            int intOctal = (int) Long.parseLong(textField.getText(), 8);
                                            first3 = Float.intBitsToFloat(intOctal);
                                            textField.setText("");
                                        } catch (NumberFormatException ex) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Hexadecimal":
                                        try {
                                            int intHex = (int) Long.parseLong(textField.getText(), 16);
                                            first3 = Float.intBitsToFloat(intHex);
                                            textField.setText("");
                                        } catch (NumberFormatException ex) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                }
                                operation = "^";
                                break;
                            case "short":
                                switch (numberSystem) {
                                    case "Decimal":
                                        try {
                                            first4 = Short.parseShort(textField.getText());
                                            textField.setText("");
                                        } catch (NumberFormatException ex) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Binary":
                                        try {
                                            first4 = Short.parseShort(textField.getText(), 2);
                                            textField.setText("");
                                        } catch (NumberFormatException ex) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Octal":
                                        try {
                                            first4 = Short.parseShort(textField.getText(), 8);
                                            textField.setText("");
                                        } catch (NumberFormatException ex) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                    case "Hexadecimal":
                                        try {
                                            first4 = Short.parseShort(textField.getText(), 16);
                                            textField.setText("");
                                        } catch (NumberFormatException ex) {
                                            textField.setText("Error: NumberFormatException");
                                        }
                                        break;
                                }
                                operation = "^";
                                break;
                        }

                    }
                });
                buttonPi.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        textField.setText(String.valueOf(Math.PI));

                    }

                });
                buttonE.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        textField.setText(String.valueOf(Math.E));

                    }
                });
                buttonClose.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame2.dispose();
                        buttonSci.setEnabled(true);

                    }
                });

            }

        });
    }// end of main
}// end of class