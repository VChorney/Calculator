package com.forms;
import lombok.Data;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public @Data class Form extends JFrame {
    private JButton button1 = new JButton("Матриці");
    private JButton button2 = new JButton("Вектори");
    private JButton button3 = new JButton("Множини");
    public Form(){
        super("Оберіть калькулятор");
        this.setBounds(375,275,320,75);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        Container container = this.getContentPane();
        container.setLayout(new FlowLayout());
        container.add(button1);
        container.add(button2);
        container.add(button3);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MatrixForm matrixForm = new MatrixForm();
                matrixForm.setVisible(true);
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VectorForm vectorForm = new VectorForm();
                vectorForm.setVisible(true);
            }
        });
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SetForm setForm = new SetForm();
                setForm.setVisible(true);
            }
        });
    }
}
