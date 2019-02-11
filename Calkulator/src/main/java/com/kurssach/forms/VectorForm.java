package com.kurssach.forms;

import com.kurssach.description.Vector;

import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class VectorForm extends JFrame {

    private JTextField textField27 = new JFormattedTextField();
    private JLabel label3 = new JLabel("X");
    private JLabel label5 = new JLabel("                                                           ");
    private JLabel label4 = new JLabel("Введіть число для множення");
    private String[] powersForBoth = {"", "1x1", "2x2", "3x3", "4x4", "5x5", "6x6", "7x7"};
    private String[] powers = {"", "1", "2", "3", "4", "5", "6", "7"};
    private String[] actionsForMatrix = {"", "Додавання", "Віднімання", "Множення", "Множення на число"
            , "Транспонування"};
    private JComboBox<String> comboBox = new JComboBox<>(actionsForMatrix);
    private JComboBox<String> comboBox1 = new JComboBox<>(powersForBoth);
    private JComboBox<String> comboBox2 = new JComboBox<>(powers);
    private JButton button = new JButton("Вирахувати");
    private JButton button1 = new JButton("Встановити");
    private JTextField[][] textFields = new JTextField[7][7];
    private JTextField[][] textFields0 = new JTextField[7][7];

    VectorForm() {
        this.setBounds(100, 85, 540, 475);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("Вектори");

        Container container = this.getContentPane();
        JPanel panel1 = new JPanel();
        container.add(panel1, BorderLayout.NORTH);
        JPanel panel2 = new JPanel();
        container.add(panel2);
        JPanel panel3 = new JPanel();
        container.add(panel3);
        JPanel panel4 = new JPanel();
        container.add(panel4);
        JPanel panel5 = new JPanel();
        container.add(panel5, BorderLayout.SOUTH);
        JPanel panel6 = new JPanel();
        container.add(panel6, BorderLayout.NORTH);
        JPanel panel7 = new JPanel();
        container.add(panel7, BorderLayout.NORTH);
        JTextField textField1 = new JFormattedTextField();
        JTextField textField2 = new JFormattedTextField();
        JTextField textField3 = new JFormattedTextField();
        JTextField textField4 = new JFormattedTextField();
        JTextField textField5 = new JFormattedTextField();
        JTextField textField6 = new JFormattedTextField();
        JTextField textField7 = new JFormattedTextField();
        JTextField textField8 = new JFormattedTextField();
        JTextField textField9 = new JFormattedTextField();
        JTextField textField10 = new JFormattedTextField();
        JTextField textField11 = new JFormattedTextField();
        JTextField textField12 = new JFormattedTextField();
        JTextField textField13 = new JFormattedTextField();
        JTextField textField14 = new JFormattedTextField();
        JTextField textField15 = new JFormattedTextField();
        JTextField textField16 = new JFormattedTextField();
        JTextField textField17 = new JFormattedTextField();
        JTextField textField18 = new JFormattedTextField();
        JTextField textField19 = new JFormattedTextField();
        JTextField textField20 = new JFormattedTextField();
        JTextField textField21 = new JFormattedTextField();
        JTextField textField22 = new JFormattedTextField();
        JTextField textField23 = new JFormattedTextField();
        JTextField textField24 = new JFormattedTextField();
        JTextField textField25 = new JFormattedTextField();
        JTextField textField26 = new JFormattedTextField();
        panel1.setLayout(new GridBagLayout());
        panel2.setLayout(new GridBagLayout());
        panel3.setLayout(new GridBagLayout());
        panel4.setLayout(new GridBagLayout());
        panel5.setLayout(new GridBagLayout());
        panel6.setLayout(new GridBagLayout());
        panel7.setLayout(new GridBagLayout());

        textFields0[0][0] = textField1;
        textFields0[0][1] = textField2;
        textFields0[0][2] = textField3;
        textFields0[0][3] = textField4;
        textFields0[0][4] = textField5;
        textFields0[0][5] = textField6;
        textFields0[0][6] = textField7;
        textFields0[1][0] = textField8;
        textFields0[2][0] = textField9;
        textFields0[3][0] = textField10;
        textFields0[4][0] = textField11;
        textFields0[5][0] = textField12;
        textFields0[6][0] = textField13;

        textFields[0][0] = textField14;
        textFields[0][1] = textField15;
        textFields[0][2] = textField16;
        textFields[0][3] = textField17;
        textFields[0][4] = textField18;
        textFields[0][5] = textField19;
        textFields[0][6] = textField20;
        textFields[1][0] = textField21;
        textFields[2][0] = textField22;
        textFields[3][0] = textField23;
        textFields[4][0] = textField24;
        textFields[5][0] = textField25;
        textFields[6][0] = textField26;

        GridBagConstraints gridBagLayout = new GridBagConstraints();
        GridBagConstraints gridBagLayout1 = new GridBagConstraints();

        for (int i = 0; i < 7; i++) {
            gridBagLayout.weightx = 0;
            gridBagLayout.weighty = 0;
            gridBagLayout.gridy = i;
            gridBagLayout.gridx = 0;
            gridBagLayout.ipadx = 50;
            gridBagLayout1.weightx = 0;
            gridBagLayout1.weighty = 0;
            gridBagLayout1.gridy = i;
            gridBagLayout1.gridx = 0;
            gridBagLayout1.ipadx = 50;
            panel3.add(textFields0[i][0], gridBagLayout1);
            panel2.add(textFields[i][0], gridBagLayout);
            textFields[i][0].addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    char c = e.getKeyChar();
                    if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) && (c != '.')) {
                        e.consume();
                    }
                }
            });
            textFields0[i][0].addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    char c = e.getKeyChar();
                    if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) && (c != '.')) {
                        e.consume();
                    }
                }
            });
        }
        for (int j = 1; j < 7; j++) {
            gridBagLayout.weightx = 0;
            gridBagLayout.weighty = 0;
            gridBagLayout.gridy = 0;
            gridBagLayout.gridx = j;
            gridBagLayout.ipadx = 50;
            gridBagLayout1.weightx = 0;
            gridBagLayout1.weighty = 0;
            gridBagLayout1.gridy = 0;
            gridBagLayout1.gridx = j;
            gridBagLayout1.ipadx = 50;
            panel3.add(textFields0[0][j], gridBagLayout1);
            panel2.add(textFields[0][j], gridBagLayout);
            textFields[0][j].setVisible(false);
            textFields0[0][j].setVisible(false);
            textFields[0][j].addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    char c = e.getKeyChar();
                    if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) && (c != '.')) {
                        e.consume();
                    }
                }
            });
            textFields0[0][j].addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    char c = e.getKeyChar();
                    if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) && (c != '.')) {
                        e.consume();
                    }
                }
            });
        }
        gridBagLayout1.gridx = 7;
        panel3.add(label5, gridBagLayout1);
        GridBagConstraints gridBagLayout2 = new GridBagConstraints();
        gridBagLayout2.weightx = 1;
        gridBagLayout2.weighty = 1;
        gridBagLayout2.gridy = 0;
        gridBagLayout2.gridx = 0;
        panel4.add(panel2, gridBagLayout2);
        gridBagLayout2.gridy = 0;
        gridBagLayout2.gridx = 1;
        panel4.add(panel3, gridBagLayout2);
        GridBagConstraints gridBaglayout3 = new GridBagConstraints();
        gridBaglayout3.weighty = 0;
        gridBaglayout3.weightx = 0;
        gridBaglayout3.gridy = 0;
        gridBaglayout3.gridx = 0;
        JLabel label1 = new JLabel("Oберіть дію  ");
        panel1.add(label1, gridBaglayout3);
        gridBaglayout3.gridy = 0;
        gridBaglayout3.gridx = 1;
        panel1.add(comboBox, gridBaglayout3);
        GridBagConstraints gridBaglayout4 = new GridBagConstraints();
        gridBaglayout4.gridy = 0;
        gridBaglayout4.gridx = 0;
        JLabel label2 = new JLabel("Oберіть розмірність ");
        panel6.add(label2, gridBaglayout4);
        gridBaglayout4.gridy = 0;
        gridBaglayout4.gridx = 1;
        panel6.add(comboBox1, gridBaglayout4);
        gridBaglayout4.gridy = 0;
        gridBaglayout4.gridx = 1;
        panel6.add(comboBox2, gridBaglayout4);
        gridBaglayout4.gridy = 0;
        gridBaglayout4.gridx = 2;
        panel6.add(label3, gridBaglayout4);
        gridBaglayout4.gridy = 1;
        gridBaglayout4.gridx = 0;
        panel6.add(label4, gridBaglayout4);
        gridBaglayout4.gridy = 2;
        gridBaglayout4.gridx = 0;
        panel6.add(button1, gridBaglayout4);
        gridBaglayout4.gridy = 1;
        gridBaglayout4.gridx = 1;
        gridBaglayout4.ipadx = 30;
        panel6.add(textField27, gridBaglayout4);
        textField27.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) && (c != '.')) {
                    e.consume();
                }
            }
        });
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.weighty = 0;
        gridBagConstraints.weightx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridx = 0;
        panel5.add(button, gridBagConstraints);
        comboBox1.setVisible(true);
        comboBox2.setVisible(false);
        textField27.setVisible(false);
        label3.setVisible(false);
        label4.setVisible(false);
        check();
        setPowerOfMatrix();
        GridBagConstraints gridBagLayout5 = new GridBagConstraints();
        gridBagLayout5.weighty = 0;
        gridBagLayout5.weightx = 0;
        gridBagLayout5.gridy = 0;
        gridBagLayout5.gridx = 0;
        panel7.add(panel1, gridBagLayout5);
        gridBagLayout5.gridy = 1;
        gridBagLayout5.gridx = 0;
        panel7.add(panel6, gridBagLayout5);
        solution();
    }

    private void check() {
        comboBox.addActionListener(e -> {
            setPowerOfMatrix();
            for (int i = 0; i < 7; i++) {
                textFields[i][0].setText("");
                textFields0[i][0].setText("");
            }
            for (int j = 1; j < 7; j++) {
                textFields[0][j].setText("");
                textFields0[0][j].setText("");
            }
            if ((comboBox.getSelectedIndex() == 1) || (comboBox.getSelectedIndex() == 2)) {
                textField27.setVisible(false);
                label4.setVisible(false);
                comboBox2.setVisible(false);
                label3.setVisible(false);
                comboBox1.setVisible(true);
                label5.setVisible(true);
                for (int i = 1; i < 7; i++) {
                    textFields[0][i].setVisible(false);
                    textFields0[0][i].setVisible(false);
                }
            }
            if ((comboBox.getSelectedIndex() == 3)) {
                textField27.setVisible(false);
                label4.setVisible(false);
                comboBox2.setVisible(false);
                label3.setVisible(false);
                comboBox1.setVisible(true);
                label5.setVisible(true);
                for (int i = 1; i < 7; i++) {
                    textFields[0][i].setVisible(false);
                    textFields0[0][i].setVisible(false);
                }
            }
            if ((comboBox.getSelectedIndex() == 4)) {
                textField27.setVisible(true);
                label4.setVisible(true);
                comboBox2.setVisible(false);
                label3.setVisible(false);
                comboBox1.setVisible(true);
                label5.setVisible(true);
                for (int i = 1; i < 7; i++) {
                    textFields[0][i].setVisible(false);
                    textFields0[0][i].setVisible(false);
                }
            }
            if ((comboBox.getSelectedIndex() == 5)) {
                textField27.setVisible(false);
                label4.setVisible(false);
                comboBox2.setVisible(true);
                label3.setVisible(false);
                comboBox1.setVisible(false);
            }
        });
    }

    private void setPowerOfMatrix() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                textFields[i][0].setVisible(true);
                textFields0[i][0].setVisible(true);
            }

        }
        comboBox2.addActionListener(e -> label5.setVisible(true));
        button1.addActionListener(e -> {
            if ((comboBox.getSelectedIndex() == 1) || (comboBox.getSelectedIndex() == 2)) {
                for (int i = 6; i > -1; i--) {
                    textFields[i][0].setVisible(false);

                }
                for (int j = 6; j > 0; j--) {
                    textFields[0][j].setVisible(false);
                }
                for (int i = 0; i < comboBox1.getSelectedIndex(); i++) {
                    textFields[i][0].setVisible(true);
                }
                for (int i = 6; i > -1; i--) {
                    textFields0[i][0].setVisible(false);

                }
                for (int j = 6; j > 0; j--) {
                    textFields0[0][j].setVisible(false);
                }
                for (int i = 0; i < comboBox1.getSelectedIndex(); i++) {
                    textFields0[i][0].setVisible(true);
                }
            }
            if (comboBox.getSelectedIndex() == 3) {
                for (int i = 6; i > -1; i--) {
                    textFields[i][0].setVisible(false);

                }
                for (int j = 6; j > 0; j--) {
                    textFields[0][j].setVisible(false);
                }
                for (int i = 0; i < comboBox1.getSelectedIndex(); i++) {
                    textFields[i][0].setVisible(true);
                }
                for (int i = 6; i > -1; i--) {
                    textFields0[i][0].setVisible(false);

                }
                for (int j = 6; j > 0; j--) {
                    textFields0[0][j].setVisible(false);
                }
                for (int i = 0; i < comboBox1.getSelectedIndex(); i++) {
                    textFields0[i][0].setVisible(true);
                }
            }
            if (comboBox.getSelectedIndex() == 4) {
                for (int i = 6; i > -1; i--) {
                    textFields[i][0].setVisible(false);

                }
                for (int j = 6; j > 0; j--) {
                    textFields[0][j].setVisible(false);
                }
                for (int i = 0; i < comboBox1.getSelectedIndex(); i++) {
                    textFields[i][0].setVisible(true);
                }
                for (int i = 6; i > -1; i--) {
                    textFields0[i][0].setVisible(false);

                }
                for (int j = 6; j > 0; j--) {
                    textFields0[0][j].setVisible(false);
                }
                for (int i = 0; i < comboBox1.getSelectedIndex(); i++) {
                    textFields0[i][0].setVisible(true);
                }
            }
            if (comboBox.getSelectedIndex() == 5) {
                label5.setVisible(false);
                for (int i = 6; i > -1; i--) {
                    textFields[i][0].setVisible(false);

                }
                for (int j = 6; j > 0; j--) {
                    textFields[0][j].setVisible(false);
                }
                for (int i = 0; i < comboBox2.getSelectedIndex(); i++) {
                    textFields[i][0].setVisible(true);
                }
                for (int j = 6; j > -1; j--) {
                    textFields0[j][0].setVisible(false);

                }
                for (int i = 6; i > 0; i--) {
                    textFields0[0][i].setVisible(false);
                }
                for (int j = 0; j < comboBox2.getSelectedIndex(); j++) {
                    textFields0[0][j].setVisible(true);
                }
            }
        });
    }

    private void solution() {
        button.addActionListener(e -> {
            Double[][] initializationOfVector = new Double[7][7];
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 7; j++) {
                    initializationOfVector[i][j] = 0.0;
                }
            }
            Vector vector = new Vector(initializationOfVector);
            if (comboBox.getSelectedIndex() == 1) {
                Double[][] buff0 = new Double[comboBox1.getSelectedIndex()][1];
                Double[][] buff1 = new Double[comboBox1.getSelectedIndex()][1];

                for (int j = 0; j < comboBox1.getSelectedIndex(); j++) {
                    if ((textFields[j][0].getText().equals(""))) {
                        JOptionPane.showMessageDialog(null, "Заповніть вектор повністю!");
                    }
                    vector.add(j, 0, Double.valueOf(textFields[j][0].getText()));
                    buff0[j][0] = Double.valueOf(vector.getList()[j][0].toString());
                }

                for (int i = 0; i < comboBox1.getSelectedIndex(); i++) {
                    if ((textFields0[i][0].getText().equals(""))) {
                        JOptionPane.showMessageDialog(null, "Заповніть вектор повністю!");
                    }
                    vector.add(i, 0, Double.valueOf(textFields0[i][0].getText()));
                    buff1[i][0] = Double.valueOf(vector.getList()[i][0].toString());

                }
                vector.plusAndMinus(comboBox1.getSelectedIndex(), 1, buff0, buff1, true);
                for (int i = 0; i < 7; i++) {
                    textFields0[i][0].setVisible(false);
                }
                for (int j = 1; j < 7; j++) {
                    textFields0[0][j].setVisible(false);
                }
                for (int i = 0; i < comboBox1.getSelectedIndex(); i++) {
                    textFields[i][0].setText(String.valueOf(vector.getList()[i][0]));
                }
            }
            if (comboBox.getSelectedIndex() == 2) {

                Double[][] buff0 = new Double[comboBox1.getSelectedIndex()][1];
                Double[][] buff1 = new Double[comboBox1.getSelectedIndex()][1];

                for (int j = 0; j < comboBox1.getSelectedIndex(); j++) {
                    if ((textFields[j][0].getText().equals(""))) {
                        JOptionPane.showMessageDialog(null, "Заповніть вектор повністю!");
                    }
                    vector.add(j, 0, Double.valueOf(textFields[j][0].getText()));
                    buff0[j][0] = Double.valueOf(vector.getList()[j][0].toString());
                }

                for (int i = 0; i < comboBox1.getSelectedIndex(); i++) {
                    if ((textFields0[i][0].getText().equals(""))) {
                        JOptionPane.showMessageDialog(null, "Заповніть вектор повністю!");
                    }
                    vector.add(i, 0, Double.valueOf(textFields0[i][0].getText()));
                    buff1[i][0] = Double.valueOf(vector.getList()[i][0].toString());

                }
                vector.plusAndMinus(comboBox1.getSelectedIndex(), 1, buff0, buff1, false);
                for (int i = 0; i < 7; i++) {
                    textFields0[i][0].setVisible(false);
                }
                for (int j = 1; j < 7; j++) {
                    textFields0[0][j].setVisible(false);
                }
                for (int i = 0; i < comboBox1.getSelectedIndex(); i++) {
                    textFields[i][0].setText(String.valueOf(vector.getList()[i][0]));
                }
            }
            if (comboBox.getSelectedIndex() == 3) {

                Double[][] buff0 = new Double[comboBox1.getSelectedIndex()][1];
                Double[][] buff1 = new Double[comboBox1.getSelectedIndex()][1];

                for (int j = 0; j < comboBox1.getSelectedIndex(); j++) {
                    if ((textFields[j][0].getText().equals(""))) {
                        JOptionPane.showMessageDialog(null, "Заповніть вектор повністю!");
                    }
                    vector.add(j, 0, Double.valueOf(textFields[j][0].getText()));
                    buff0[j][0] = Double.valueOf(vector.getList()[j][0].toString());
                }

                for (int i = 0; i < comboBox1.getSelectedIndex(); i++) {
                    if ((textFields0[i][0].getText().equals(""))) {
                        JOptionPane.showMessageDialog(null, "Заповніть вектор повністю!");
                    }
                    vector.add(i, 0, Double.valueOf(textFields0[i][0].getText()));
                    buff1[i][0] = Double.valueOf(vector.getList()[i][0].toString());

                }
                vector.multiplication(comboBox1.getSelectedIndex(), 1, comboBox1.getSelectedIndex(), 1, buff0, buff1);
                for (int i = 0; i < 7; i++) {
                    textFields0[i][0].setVisible(false);
                }
                for (int j = 1; j < 7; j++) {
                    textFields0[0][j].setVisible(false);
                }
                for (int j = 1; j < 7; j++) {
                    textFields0[j][0].setVisible(false);
                }
                for (int j = 0; j < 7; j++) {
                    textFields[j][0].setVisible(false);
                }
                textFields[0][0].setVisible(true);
                textFields[0][0].setText(String.valueOf(vector.getList()[0][0]));
            }
            if (comboBox.getSelectedIndex() == 4) {
                Double[][] buff0 = new Double[comboBox1.getSelectedIndex()][1];

                for (int j = 0; j < comboBox1.getSelectedIndex(); j++) {
                    if ((textFields[j][0].getText().equals(""))) {
                        JOptionPane.showMessageDialog(null, "Заповніть вектор повністю!");
                    }
                    vector.add(j, 0, Double.valueOf(textFields[j][0].getText()));
                    buff0[j][0] = Double.valueOf(vector.getList()[j][0].toString());
                }
                if ((textField27.getText().equals(""))) {
                    JOptionPane.showMessageDialog(null, "Введіть число!");
                }
                vector.multiplicationByNumber(comboBox1.getSelectedIndex(), 1, buff0, Double.valueOf(textField27.getText()));
                for (int i = 0; i < comboBox1.getSelectedIndex(); i++) {
                    textFields0[i][0].setText(String.valueOf(vector.getList()[i][0]));
                }
            }
            if (comboBox.getSelectedIndex() == 5) {

                for (int j = 0; j < comboBox2.getSelectedIndex(); j++) {
                    if ((textFields[j][0].getText().equals(""))) {
                        JOptionPane.showMessageDialog(null, "Заповніть вектор повністю!");
                    }
                    vector.add(j, 0, Double.valueOf(textFields[j][0].getText()));
                }

                for (int i = 0; i < comboBox2.getSelectedIndex(); i++) {
                    textFields0[0][i].setText(String.valueOf(vector.getList()[i][0]));
                }
            }
        });
    }
}