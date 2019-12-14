package com.company.lesson23;

// GUI Swing JFrame

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame { // Класс наследуется от класса JFrame
    private JButton button = new JButton("Press");  // Элемент создания кнопки
    private JTextField input = new JTextField("",5); // Элемент создания текстовго поля
    private JLabel label = new JLabel("Input:"); // Элемент отображения текста подсказки
    private JRadioButton radio1 = new JRadioButton("Select this"); // Элемент создания кнопки выбора
    private JRadioButton radio2 = new JRadioButton("Select That"); // Элемент создания кнопки выбора
    private JCheckBox check = new JCheckBox("Check", false); // Элемент создания чекбокса

    public SimpleGUI () {  // конструктор
        super ("Simple Example"); // конструктор класса JFrame
        this.setBounds(100,100,250,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Используем контейнеры, чтлбы сгрупировать элементы в одну форму

        Container container = this.getContentPane();  // создаем обект на сонова класса Container c с методом getContentPane
        container.setLayout(new GridLayout(3,2,2,2));

        // Добавляем элементы в контейнер

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

        // Вызов нового класса в который будет помещено действи по кнопке

        button.addActionListener(new ButtonEvenetListener());
        container.add(button);

    }
        // Создаение класса ВuttonEvenetListener

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
