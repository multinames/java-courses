package com.company.lesson23;

// GUI Swing JFrame

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame {
    private JButton button = new JButton("Press");
    private JTextField input = new JTextField("",5);
    private JLabel label = new JLabel("Input:");
    private JRadioButton radio1 = new JRadioButton("Select this");
    private JRadioButton radio2 = new JRadioButton("Select That");
    private JCheckBox check = new JCheckBox("Check", false);

    public SimpleGUI () {  // конструктор
        super ("Simple Example"); // конструктор класса JFrame
        this.setBounds(100,100,250,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2,2,2));
        container.add(label);
        container.add(input);

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);

        container.add(radio1);
        container.add(radio2);
        radio1.setSelected(true);
        container.add(radio2);
        container.add(check);

        button.addActionListener(new ButtonEvenetListener());
        container.add(button);

    }

    class ButtonEvenetListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            String message = "";
            message += "Button was pressed\n";
            message += "Text is "+ input.getText() + "\n";
            message += (radio1.isSelected()  ? "Radio #1" : "Radio #2") + " is selected!\n";
            message += "Checkbox is " + ((check.isSelected()) ? "checked" : "unchecked");
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);

        }
    }

}
