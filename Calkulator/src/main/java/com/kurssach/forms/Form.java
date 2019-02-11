package com.kurssach.forms;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.FlowLayout;

@EqualsAndHashCode(callSuper = true)
public @Data
class Form extends JFrame {
    private JButton button1 = new JButton("Матриці");
    private JButton button2 = new JButton("Вектори");
    private JButton button3 = new JButton("Множини");

    public Form() {
        super("Оберіть калькулятор");
        this.setBounds(375, 275, 320, 75);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        Container container = this.getContentPane();
        container.setLayout(new FlowLayout());
        container.add(button1);
        container.add(button2);
        container.add(button3);

        button1.addActionListener(e -> {
            MatrixForm matrixForm = new MatrixForm();
            matrixForm.setVisible(true);
        });
        button2.addActionListener(e -> {
            VectorForm vectorForm = new VectorForm();
            vectorForm.setVisible(true);
        });
        button3.addActionListener(e -> {
            SetForm setForm = new SetForm();
            setForm.setVisible(true);
        });
    }
}
