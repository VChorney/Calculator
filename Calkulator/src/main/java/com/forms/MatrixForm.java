package com.forms;
import com.classes.Matrix;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MatrixForm extends JFrame {
    private JTextField textField1 = new JFormattedTextField();
    private JTextField textField2 = new JFormattedTextField();
    private JTextField textField3 = new JFormattedTextField();
    private JTextField textField4 = new JFormattedTextField();
    private JTextField textField5 = new JFormattedTextField();
    private JTextField textField6 = new JFormattedTextField();
    private JTextField textField7 = new JFormattedTextField();
    private JTextField textField8 = new JFormattedTextField();
    private JTextField textField9 = new JFormattedTextField();
    private JTextField textField10 = new JFormattedTextField();
    private JTextField textField11 = new JFormattedTextField();
    private JTextField textField12 = new JFormattedTextField();
    private JTextField textField13 = new JFormattedTextField();
    private JTextField textField14 = new JFormattedTextField();
    private JTextField textField15 = new JFormattedTextField();
    private JTextField textField16 = new JFormattedTextField();
    private JTextField textField17 = new JFormattedTextField();
    private JTextField textField18 = new JFormattedTextField();
    private JTextField textField19 = new JFormattedTextField();
    private JTextField textField20 = new JFormattedTextField();
    private JTextField textField21 = new JFormattedTextField();
    private JTextField textField22 = new JFormattedTextField();
    private JTextField textField23 = new JFormattedTextField();
    private JTextField textField24 = new JFormattedTextField();
    private JTextField textField25 = new JFormattedTextField();
    private JTextField textField26 = new JFormattedTextField();
    private JTextField textField27 = new JFormattedTextField();
    private JTextField textField28 = new JFormattedTextField();
    private JTextField textField29 = new JFormattedTextField();
    private JTextField textField30 = new JFormattedTextField();
    private JTextField textField31 = new JFormattedTextField();
    private JTextField textField32 = new JFormattedTextField();
    private JTextField textField33 = new JFormattedTextField();
    private JTextField textField34 = new JFormattedTextField();
    private JTextField textField35 = new JFormattedTextField();
    private JTextField textField36 = new JFormattedTextField();
    private JTextField textField37 = new JFormattedTextField();
    private JTextField textField38 = new JFormattedTextField();
    private JTextField textField39 = new JFormattedTextField();
    private JTextField textField40 = new JFormattedTextField();
    private JTextField textField41 = new JFormattedTextField();
    private JTextField textField42 = new JFormattedTextField();
    private JTextField textField43 = new JFormattedTextField();
    private JTextField textField44 = new JFormattedTextField();
    private JTextField textField45 = new JFormattedTextField();
    private JTextField textField46 = new JFormattedTextField();
    private JTextField textField47 = new JFormattedTextField();
    private JTextField textField48 = new JFormattedTextField();
    private JTextField textField49 = new JFormattedTextField();
    private JTextField textField50 = new JFormattedTextField();
    private JTextField textField51 = new JFormattedTextField();
    private JTextField textField52 = new JFormattedTextField();
    private JTextField textField53 = new JFormattedTextField();
    private JTextField textField54 = new JFormattedTextField();
    private JTextField textField55 = new JFormattedTextField();
    private JTextField textField56 = new JFormattedTextField();
    private JTextField textField57 = new JFormattedTextField();
    private JTextField textField58 = new JFormattedTextField();
    private JTextField textField59 = new JFormattedTextField();
    private JTextField textField60 = new JFormattedTextField();
    private JTextField textField61 = new JFormattedTextField();
    private JTextField textField62 = new JFormattedTextField();
    private JTextField textField63 = new JFormattedTextField();
    private JTextField textField64 = new JFormattedTextField();
    private JTextField textField65 = new JFormattedTextField();
    private JTextField textField66 = new JFormattedTextField();
    private JTextField textField67 = new JFormattedTextField();
    private JTextField textField68 = new JFormattedTextField();
    private JTextField textField69 = new JFormattedTextField();
    private JTextField textField70 = new JFormattedTextField();
    private JTextField textField71 = new JFormattedTextField();
    private JTextField textField72 = new JFormattedTextField();
    private JTextField textField73 = new JFormattedTextField();
    private JTextField textField74 = new JFormattedTextField();
    private JTextField textField75 = new JFormattedTextField();
    private JTextField textField76 = new JFormattedTextField();
    private JTextField textField77 = new JFormattedTextField();
    private JTextField textField78 = new JFormattedTextField();
    private JTextField textField79 = new JFormattedTextField();
    private JTextField textField80 = new JFormattedTextField();
    private JTextField textField81 = new JFormattedTextField();
    private JTextField textField82 = new JFormattedTextField();
    private JTextField textField83 = new JFormattedTextField();
    private JTextField textField84 = new JFormattedTextField();
    private JTextField textField85 = new JFormattedTextField();
    private JTextField textField86 = new JFormattedTextField();
    private JTextField textField87 = new JFormattedTextField();
    private JTextField textField88 = new JFormattedTextField();
    private JTextField textField89 = new JFormattedTextField();
    private JTextField textField90 = new JFormattedTextField();
    private JTextField textField91 = new JFormattedTextField();
    private JTextField textField92 = new JFormattedTextField();
    private JTextField textField93 = new JFormattedTextField();
    private JTextField textField94 = new JFormattedTextField();
    private JTextField textField95 = new JFormattedTextField();
    private JTextField textField96 = new JFormattedTextField();
    private JTextField textField97 = new JFormattedTextField();
    private JTextField textField98 = new JFormattedTextField();
    private JLabel label1 = new JLabel("Oберіть дію  ");
    private JLabel label2 = new JLabel("Oберіть розмірність ");
    private JLabel label3 = new JLabel("X");
    private JLabel label4 = new JLabel("X");
    private JLabel label5 = new JLabel("Оберіть степінь ");
    private String[] powersForSquare = {"", "2x2", "3x3", "4x4", "5x5", "6x6", "7x7"};
    private String[] powers = {"", "2", "3", "4", "5", "6", "7"};
    private String[] powers1 = {"", "1", "2", "3", "4", "5", "6", "7"};
    private String[] powers2 = {"", "1", "2", "3", "4", "5"};
    private String[] actionsForMatrix = {"", "Додавання", "Віднімання", "Множення", "Множення на число"
            , "Множення на вектор", "Транспонування", "Обернена матриця", "Детермінант", "Піднесення до степеня"};
    private JComboBox comboBox = new JComboBox(actionsForMatrix);
    private JComboBox comboBox1 = new JComboBox(powersForSquare);
    private JComboBox comboBox2 = new JComboBox(powers);
    private JComboBox comboBox3 = new JComboBox(powers);
    private JComboBox comboBox4 = new JComboBox(powers);
    private JComboBox comboBox5 = new JComboBox(powers);
    private JComboBox comboBox6 = new JComboBox(powers1);
    private JComboBox comboBox7 = new JComboBox(powers1);
    private JComboBox comboBox8 = new JComboBox(powers1);
    private JComboBox comboBox9 = new JComboBox(powers1);
    private JComboBox comboBox10 = new JComboBox(powers2);
    private JButton button = new JButton("Вирахувати");
    private JButton button1 = new JButton("Встановити");
    private JPanel panel1 = new JPanel();
    private JPanel panel2 = new JPanel();
    private JPanel panel3 = new JPanel();
    private JPanel panel4 = new JPanel();
    private JPanel panel5 = new JPanel();
    private JPanel panel6 = new JPanel();
    private JPanel panel7 = new JPanel();
    private JTextField[][] textFields = new JTextField[7][7];
    private JTextField[][] textFields0 = new JTextField[7][7];
    public MatrixForm() {
        this.setBounds(100, 85, 825, 475);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("Матриці");
        Container container = this.getContentPane();
        container.add(panel1, BorderLayout.NORTH);
        container.add(panel2);
        container.add(panel3);
        container.add(panel4);
        container.add(panel5, BorderLayout.SOUTH);
        container.add(panel6, BorderLayout.NORTH);
        container.add(panel7, BorderLayout.NORTH);
        panel1.setLayout(new GridBagLayout());
        panel2.setLayout(new GridBagLayout());
        panel3.setLayout(new GridBagLayout());
        panel4.setLayout(new GridBagLayout());
        panel5.setLayout(new GridBagLayout());
        panel6.setLayout(new GridBagLayout());
        panel7.setLayout(new GridBagLayout());
        textFields0[0][0] = textField50;
        textFields0[0][1] = textField51;
        textFields0[0][2] = textField52;
        textFields0[0][3] = textField53;
        textFields0[0][4] = textField54;
        textFields0[0][5] = textField55;
        textFields0[0][6] = textField56;
        textFields0[1][0] = textField57;
        textFields0[1][1] = textField58;
        textFields0[1][2] = textField59;
        textFields0[1][3] = textField60;
        textFields0[1][4] = textField61;
        textFields0[1][5] = textField62;
        textFields0[1][6] = textField63;
        textFields0[2][0] = textField64;
        textFields0[2][1] = textField65;
        textFields0[2][2] = textField66;
        textFields0[2][3] = textField67;
        textFields0[2][4] = textField68;
        textFields0[2][5] = textField69;
        textFields0[2][6] = textField70;
        textFields0[3][0] = textField71;
        textFields0[3][1] = textField72;
        textFields0[3][2] = textField73;
        textFields0[3][3] = textField74;
        textFields0[3][4] = textField75;
        textFields0[3][5] = textField76;
        textFields0[3][6] = textField77;
        textFields0[4][0] = textField78;
        textFields0[4][1] = textField79;
        textFields0[4][2] = textField80;
        textFields0[4][3] = textField81;
        textFields0[4][4] = textField82;
        textFields0[4][5] = textField83;
        textFields0[4][6] = textField84;
        textFields0[5][0] = textField85;
        textFields0[5][1] = textField86;
        textFields0[5][2] = textField87;
        textFields0[5][3] = textField88;
        textFields0[5][4] = textField89;
        textFields0[5][5] = textField90;
        textFields0[5][6] = textField91;
        textFields0[6][0] = textField92;
        textFields0[6][1] = textField93;
        textFields0[6][2] = textField94;
        textFields0[6][3] = textField95;
        textFields0[6][4] = textField96;
        textFields0[6][5] = textField97;
        textFields0[6][6] = textField98;
        textFields[0][0] = textField1;
        textFields[0][1] = textField2;
        textFields[0][2] = textField3;
        textFields[0][3] = textField4;
        textFields[0][4] = textField5;
        textFields[0][5] = textField6;
        textFields[0][6] = textField7;
        textFields[1][0] = textField8;
        textFields[1][1] = textField9;
        textFields[1][2] = textField10;
        textFields[1][3] = textField11;
        textFields[1][4] = textField12;
        textFields[1][5] = textField13;
        textFields[1][6] = textField14;
        textFields[2][0] = textField15;
        textFields[2][1] = textField16;
        textFields[2][2] = textField17;
        textFields[2][3] = textField18;
        textFields[2][4] = textField19;
        textFields[2][5] = textField20;
        textFields[2][6] = textField21;
        textFields[3][0] = textField22;
        textFields[3][1] = textField23;
        textFields[3][2] = textField24;
        textFields[3][3] = textField25;
        textFields[3][4] = textField26;
        textFields[3][5] = textField27;
        textFields[3][6] = textField28;
        textFields[4][0] = textField29;
        textFields[4][1] = textField30;
        textFields[4][2] = textField31;
        textFields[4][3] = textField32;
        textFields[4][4] = textField33;
        textFields[4][5] = textField34;
        textFields[4][6] = textField35;
        textFields[5][0] = textField36;
        textFields[5][1] = textField37;
        textFields[5][2] = textField38;
        textFields[5][3] = textField39;
        textFields[5][4] = textField40;
        textFields[5][5] = textField41;
        textFields[5][6] = textField42;
        textFields[6][0] = textField43;
        textFields[6][1] = textField44;
        textFields[6][2] = textField45;
        textFields[6][3] = textField46;
        textFields[6][4] = textField47;
        textFields[6][5] = textField48;
        textFields[6][6] = textField49;
        GridBagConstraints gridBagLayout = new GridBagConstraints();
        GridBagConstraints gridBagLayout1 = new GridBagConstraints();
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                gridBagLayout.weightx = 0;
                gridBagLayout.weighty = 0;
                gridBagLayout.gridy = i;
                gridBagLayout.gridx = j;
                gridBagLayout.ipadx = 50;
                gridBagLayout1.weightx = 0;
                gridBagLayout1.weighty = 0;
                gridBagLayout1.gridy = i;
                gridBagLayout1.gridx = j;
                gridBagLayout1.ipadx = 50;
                panel3.add(textFields0[i][j], gridBagLayout1);
                panel2.add(textFields[i][j], gridBagLayout);
                textFields[i][j].addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        char c = e.getKeyChar(); if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)&&(c!='.'))
                        { e.consume(); }
                    }
                });
                textFields0[i][j].addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        char c = e.getKeyChar(); if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)&&(c!='.'))
                        { e.consume();
                        }
                    }
                });
            }
        }
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
        panel1.add(label1, gridBaglayout3);
        gridBaglayout3.gridy = 0;
        gridBaglayout3.gridx = 1;
        panel1.add(comboBox, gridBaglayout3);
        GridBagConstraints gridBaglayout4 = new GridBagConstraints();
        gridBaglayout4.gridy = 0;
        gridBaglayout4.gridx = 0;
        panel6.add(label2, gridBaglayout4);
        gridBaglayout4.gridy = 0;
        gridBaglayout4.gridx = 1;
        panel6.add(comboBox1, gridBaglayout4);
        gridBaglayout4.gridy = 0;
        gridBaglayout4.gridx = 1;
        panel6.add(comboBox2, gridBaglayout4);
        gridBaglayout4.gridy = 0;
        gridBaglayout4.gridx = 1;
        panel6.add(comboBox6, gridBaglayout4);
        gridBaglayout4.gridy = 0;
        gridBaglayout4.gridx = 2;
        panel6.add(label3, gridBaglayout4);
        gridBaglayout4.gridy = 0;
        gridBaglayout4.gridx = 3;
        panel6.add(comboBox3, gridBaglayout4);
        gridBaglayout4.gridy = 0;
        gridBaglayout4.gridx = 3;
        panel6.add(comboBox7, gridBaglayout4);
        gridBaglayout4.gridy = 1;
        gridBaglayout4.gridx = 1;
        panel6.add(comboBox4, gridBaglayout4);
        gridBaglayout4.gridy = 1;
        gridBaglayout4.gridx = 1;
        panel6.add(comboBox8, gridBaglayout4);
        gridBaglayout4.gridy = 1;
        gridBaglayout4.gridx = 2;
        panel6.add(label4, gridBaglayout4);
        gridBaglayout4.gridy = 1;
        gridBaglayout4.gridx = 3;
        panel6.add(comboBox5, gridBaglayout4);
        gridBaglayout4.gridy = 1;
        gridBaglayout4.gridx = 3;
        panel6.add(comboBox9, gridBaglayout4);
        gridBaglayout4.gridy = 2;
        gridBaglayout4.gridx = 0;
        panel6.add(button1, gridBaglayout4);
        gridBaglayout4.gridy = 3;
        gridBaglayout4.gridx = 0;
        panel6.add(label5, gridBaglayout4);
        gridBaglayout4.gridy = 3;
        gridBaglayout4.gridx = 1;
        panel6.add(comboBox10, gridBaglayout4);
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.weighty = 0;
        gridBagConstraints.weightx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridx = 0;
        panel5.add(button,gridBagConstraints);
        comboBox1.setVisible(false);
        comboBox4.setVisible(false);
        comboBox5.setVisible(false);
        comboBox6.setVisible(false);
        comboBox7.setVisible(false);
        comboBox8.setVisible(false);
        comboBox9.setVisible(false);
        comboBox10.setVisible(false);
        label4.setVisible(false);
        label5.setVisible(false);
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
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setPowerOfMatrix();
                for (int i=0;i<7;i++){
                    for (int j=0;j<7;j++){
                        textFields[i][j].setText("");
                        textFields0[i][j].setText("");
                    }
                }
                if ((comboBox.getSelectedIndex() == 1) || (comboBox.getSelectedIndex() == 2)) {
                    comboBox3.setVisible(true);
                    comboBox2.setVisible(true);
                    label3.setVisible(true);
                    comboBox1.setVisible(false);
                    comboBox4.setVisible(false);
                    comboBox5.setVisible(false);
                    label4.setVisible(false);
                    comboBox6.setVisible(false);
                    comboBox7.setVisible(false);
                    comboBox8.setVisible(false);
                    comboBox9.setVisible(false);
                    comboBox10.setVisible(false);
                    label5.setVisible(false); }
                if ((comboBox.getSelectedIndex() == 6)) {
                    comboBox3.setVisible(false);
                    comboBox2.setVisible(false);
                    label3.setVisible(true);
                    comboBox1.setVisible(false);
                    comboBox4.setVisible(false);
                    comboBox5.setVisible(false);
                    label4.setVisible(false);
                    comboBox6.setVisible(true);
                    comboBox7.setVisible(true);
                    comboBox8.setVisible(false);
                    comboBox9.setVisible(false);
                    comboBox10.setVisible(false);
                    label5.setVisible(false); }
                if ((comboBox.getSelectedIndex() == 4)) {
                    comboBox3.setVisible(false);
                    comboBox2.setVisible(false);
                    label3.setVisible(true);
                    comboBox1.setVisible(false);
                    comboBox4.setVisible(false);
                    comboBox5.setVisible(false);
                    label4.setVisible(false);
                    comboBox6.setVisible(true);
                    comboBox7.setVisible(true);
                    comboBox8.setVisible(false);
                    comboBox9.setVisible(false);
                    comboBox10.setVisible(false);
                    label5.setVisible(false); }
                if ((comboBox.getSelectedIndex() == 3)) {
                    comboBox3.setVisible(false);
                    comboBox2.setVisible(false);
                    label3.setVisible(true);
                    comboBox1.setVisible(false);
                    comboBox4.setVisible(false);
                    comboBox5.setVisible(false);
                    label4.setVisible(true);
                    comboBox6.setVisible(true);
                    comboBox7.setVisible(true);
                    comboBox8.setVisible(true);
                    comboBox9.setVisible(true);
                    comboBox10.setVisible(false);
                    label5.setVisible(false); }
                if ((comboBox.getSelectedIndex() > 6)&&(comboBox.getSelectedIndex()<9)) {
                    comboBox3.setVisible(false);
                    comboBox2.setVisible(false);
                    label3.setVisible(false);
                    comboBox1.setVisible(true);
                    comboBox4.setVisible(false);
                    comboBox5.setVisible(false);
                    label4.setVisible(false);
                    comboBox6.setVisible(false);
                    comboBox7.setVisible(false);
                    comboBox8.setVisible(false);
                    comboBox9.setVisible(false);
                    comboBox10.setVisible(false);
                    label5.setVisible(false); }
                if ((comboBox.getSelectedIndex() == 5)) {
                    comboBox3.setVisible(false);
                    comboBox6.setVisible(false);
                    comboBox7.setVisible(false);
                    comboBox8.setVisible(false);
                    comboBox9.setVisible(false);
                    comboBox2.setVisible(false);
                    label3.setVisible(false);
                    comboBox1.setVisible(true);
                    comboBox4.setVisible(false);
                    comboBox5.setVisible(false);
                    label4.setVisible(false);
                    comboBox10.setVisible(false);
                    label5.setVisible(false); }
                if ((comboBox.getSelectedIndex() ==9)) {
                    comboBox3.setVisible(false);
                    comboBox2.setVisible(false);
                    label3.setVisible(false);
                    comboBox1.setVisible(true);
                    comboBox4.setVisible(false);
                    comboBox5.setVisible(false);
                    label4.setVisible(false);
                    comboBox6.setVisible(false);
                    comboBox7.setVisible(false);
                    comboBox8.setVisible(false);
                    comboBox9.setVisible(false);
                    comboBox10.setVisible(true);
                    label5.setVisible(true);
                }
            }
        });
    }
    private void setPowerOfMatrix() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                textFields[i][j].setVisible(true);
                textFields0[i][j].setVisible(true);
            }
        }
            button1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if ((comboBox.getSelectedIndex() == 3)) {
                        for (int i = 0; i < comboBox6.getSelectedIndex(); i++) {
                            for (int j = 0; j < comboBox7.getSelectedIndex(); j++) {
                                textFields[i][j].setVisible(true);
                                if (textFields[i][j].getText()==""||textFields[i][j].getText()==null){
                                    JOptionPane.showMessageDialog(null,"Заповніть матрцю повністю!");
                                }
                            }
                        }
                        for (int i = 6; i > -1; i--) {
                            for (int j = 6; j > comboBox7.getSelectedIndex()-1; j--) {
                                textFields[i][j].setVisible(false);
                            }
                        }
                        for (int i = 6; i > comboBox6.getSelectedIndex()-1; i--) {
                            for (int j = 6; j > -1; j--) {
                                textFields[i][j].setVisible(false);
                            }
                        }
                        for (int i = 0; i < comboBox8.getSelectedIndex(); i++) {
                            for (int j = 0; j < comboBox9.getSelectedIndex(); j++) {
                                textFields0[i][j].setVisible(true);
                                if (textFields[i][j].getText()==""||textFields[i][j].getText()==null){
                                    JOptionPane.showMessageDialog(null,"Заповніть матрцю повністю!");
                                }
                            }
                        }
                        for (int i = 6; i > -1; i--) {
                            for (int j = 6; j > comboBox9.getSelectedIndex()-1; j--) {
                                textFields0[i][j].setVisible(false);
                            }
                        }
                        for (int i = 6; i > comboBox8.getSelectedIndex()-1; i--) {
                            for (int j = 6; j > -1; j--) {
                                textFields0[i][j].setVisible(false);
                            }
                        }
                    }
                    if ((comboBox.getSelectedIndex() == 4)) {
                        for (int i = 0; i < comboBox6.getSelectedIndex(); i++) {
                            for (int j = 0; j < comboBox7.getSelectedIndex(); j++) {
                                if (textFields[i][j].getText()==""||textFields[i][j].getText()==null){
                                    JOptionPane.showMessageDialog(null,"Заповніть матрцю повністю!");
                                }
                                textFields[i][j].setVisible(true);
                            }
                        }
                        for (int i = 6; i > -1; i--) {
                            for (int j = 6; j > comboBox7.getSelectedIndex()-1; j--) {
                                textFields[i][j].setVisible(false);
                            }
                        }
                        for (int i = 6; i > comboBox6.getSelectedIndex()-1; i--) {
                            for (int j = 6; j > -1; j--) {
                                textFields[i][j].setVisible(false);
                            }
                        }
                                textFields0[0][0].setVisible(true);
                        for (int i = 6; i > -1; i--) {
                            for (int j = 6; j > 0; j--) {
                                textFields0[i][j].setVisible(false);
                            }
                        }
                        for (int i = 6; i > 0; i--) {
                            for (int j = 6; j > -1; j--) {
                                textFields0[i][j].setVisible(false);
                            }
                        }
                    }
                    if ((comboBox.getSelectedIndex() == 5)) {
                        for (int i = 0; i < comboBox1.getSelectedIndex()+1; i++) {
                            for (int j = 0; j < comboBox1.getSelectedIndex()+1; j++) {
                                textFields[i][j].setVisible(true);
                            }
                        }
                        for (int i = 6; i > -1; i--) {
                            for (int j = 6; j > comboBox1.getSelectedIndex(); j--) {
                                textFields[i][j].setVisible(false);
                            }
                        }
                        for (int i = 6; i > comboBox1.getSelectedIndex(); i--) {
                            for (int j = 6; j > -1; j--) {
                                textFields[i][j].setVisible(false);
                            }
                        }
                        for (int i = 0; i < comboBox1.getSelectedIndex()+1; i++) {
                                textFields0[i][0].setVisible(true);
                         }
                        for (int i = 6; i > -1; i--) {
                            for (int j = 6; j > 0; j--) {
                                textFields0[i][j].setVisible(false);
                            }
                        }
                        for (int i = 6; i > comboBox1.getSelectedIndex(); i--) {
                            for (int j = 6; j > -1; j--) {
                                textFields0[i][j].setVisible(false);
                            }
                        }
                    }
                    if ((comboBox.getSelectedIndex() == 6)) {
                        for (int i = 0; i < comboBox6.getSelectedIndex(); i++) {
                            for (int j = 0; j < comboBox7.getSelectedIndex(); j++) {
                                textFields[i][j].setVisible(true);
                            }
                        }
                        for (int i = 6; i > -1; i--) {
                            for (int j = 6; j > comboBox7.getSelectedIndex()-1; j--) {
                                textFields[i][j].setVisible(false);
                            }
                        }
                        for (int i = 6; i > comboBox6.getSelectedIndex()-1; i--) {
                            for (int j = 6; j > -1; j--) {
                                textFields[i][j].setVisible(false);
                            }
                        }
                        for (int i = 0; i < comboBox6.getSelectedIndex(); i++) {
                            for (int j = 0; j < comboBox7.getSelectedIndex(); j++) {
                                textFields0[i][j].setVisible(true);
                            }
                        }
                        for (int i = 6; i > -1; i--) {
                            for (int j = 6; j > comboBox7.getSelectedIndex()-1; j--) {
                                textFields0[i][j].setVisible(false);
                            }
                        }
                        for (int i = 6; i > comboBox6.getSelectedIndex()-1; i--) {
                            for (int j = 6; j > -1; j--) {
                                textFields0[i][j].setVisible(false);
                            }
                        }
                    }
                    if (comboBox.getSelectedIndex() > 6) {
                        for (int i = 0; i < comboBox1.getSelectedIndex() + 1; i++) {
                            for (int j = 0; j < comboBox1.getSelectedIndex() + 1; j++) {
                                textFields[i][j].setVisible(true);
                            }
                        }
                        for (int i = 6; i > -1; i--) {
                            for (int j = 6; j > comboBox1.getSelectedIndex(); j--) {
                                textFields[i][j].setVisible(false);
                            }
                        }
                        for (int i = 6; i > comboBox1.getSelectedIndex(); i--) {
                            for (int j = 6; j > -1; j--) {
                                textFields[i][j].setVisible(false);
                            }
                        }
                        for (int i = 0; i < comboBox1.getSelectedIndex() + 1; i++) {
                            for (int j = 0; j < comboBox1.getSelectedIndex() + 1; j++) {
                                textFields0[i][j].setVisible(true);
                            }
                        }
                        for (int i = 6; i > -1; i--) {
                            for (int j = 6; j > comboBox1.getSelectedIndex(); j--) {
                                textFields0[i][j].setVisible(false);
                            }
                        }
                        for (int i = 6; i > comboBox1.getSelectedIndex(); i--) {
                            for (int j = 6; j > -1; j--) {
                                textFields0[i][j].setVisible(false);
                            }
                        }
                    }
                    if ((comboBox.getSelectedIndex() == 1) || (comboBox.getSelectedIndex() == 2)) {
                        for (int i = 0; i < comboBox2.getSelectedIndex() + 1; i++) {
                            for (int j = 0; j < comboBox3.getSelectedIndex() + 1; j++) {
                                textFields[i][j].setVisible(true);
                            }
                        }
                        for (int i = 6; i > -1; i--) {
                            for (int j = 6; j > comboBox3.getSelectedIndex(); j--) {
                                textFields[i][j].setVisible(false);
                            }
                        }
                        for (int i = 6; i > comboBox2.getSelectedIndex(); i--) {
                            for (int j = 6; j > -1; j--) {
                                textFields[i][j].setVisible(false);
                            }
                        }
                        for (int i = 0; i < comboBox2.getSelectedIndex() + 1; i++) {
                            for (int j = 0; j < comboBox3.getSelectedIndex() + 1; j++) {
                                textFields0[i][j].setVisible(true);
                            }
                        }
                        for (int i = 6; i > -1; i--) {
                            for (int j = 6; j > comboBox3.getSelectedIndex(); j--) {
                                textFields0[i][j].setVisible(false);
                            }
                        }
                        for (int i = 6; i > comboBox2.getSelectedIndex(); i--) {
                            for (int j = 6; j > -1; j--) {
                                textFields0[i][j].setVisible(false);
                            }
                        }
                    }
                }
            });
     }
    private void solution(){
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Object[][] mat = new Object[7][7];
                for (int i = 0; i < 7; i++) {
                    for (int j = 0; j < 7; j++) {
                        mat[i][j] = "";
                    }
                }
                    Matrix matrix = new Matrix(mat, mat, mat);
                    if (comboBox.getSelectedIndex() == 1) {
                        matrix.setFirstColumn(comboBox3.getSelectedIndex()+1);
                        matrix.setFirstRow(comboBox2.getSelectedIndex()+1);
                        matrix.setSecondColumn(comboBox3.getSelectedIndex()+1);
                        matrix.setSecondRow(comboBox2.getSelectedIndex()+1);
                        matrix.setResultRow(comboBox2.getSelectedIndex()+1);
                        matrix.setResultColumn(comboBox3.getSelectedIndex()+1);
                        Double[][] buff0 = new Double[comboBox2.getSelectedIndex()+1][comboBox3.getSelectedIndex()+1];
                        Double[][] buff1 = new Double[comboBox2.getSelectedIndex()+1][comboBox3.getSelectedIndex()+1];
                        for (int i = 0; i < comboBox2.getSelectedIndex() + 1; i++) {
                            for (int j = 0; j < comboBox3.getSelectedIndex()+1; j++) {
                                if ((textFields[i][j].getText().equals(""))||(textFields[i][j].getText().equals(null))){
                                    JOptionPane.showMessageDialog(null,"Заповніть матрцю повністю!");
                                }
                                matrix.add(i, j, Double.valueOf(textFields[i][j].getText()), 1);
                                buff0[i][j] = Double.valueOf(matrix.getSecondList()[i][j].toString());
                            }
                        }
                        for (int i = 0; i < comboBox2.getSelectedIndex() + 1; i++) {
                            for (int j = 0; j < comboBox3.getSelectedIndex()+1; j++) {
                                if ((textFields0[i][j].getText().equals(""))||(textFields0[i][j].getText().equals(null))){
                                    JOptionPane.showMessageDialog(null,"Заповніть матрцю повністю!");
                                }
                                matrix.add(i, j, Double.valueOf(textFields0[i][j].getText()), 2);
                                buff1[i][j] = Double.valueOf(matrix.getSecondList()[i][j].toString());
                            }
                        }
                        matrix.plusAndMinus(comboBox3.getSelectedIndex()+1, comboBox2.getSelectedIndex()+1, buff0, buff1, true);
                        for (int i = 0; i < 7; i++) {
                            for (int j = 0; j < 7; j++) {
                                textFields0[i][j].setVisible(false);
                            }
                        }
                        for (int i = 0; i < comboBox2.getSelectedIndex() + 1; i++) {
                            for (int j = 0; j < comboBox3.getSelectedIndex() + 1; j++) {
                                textFields[i][j].setText(String.valueOf(matrix.getResultList()[i][j]));
                            }
                        }
                    }
                if (comboBox.getSelectedIndex() == 2) {
                    matrix.setFirstColumn(comboBox3.getSelectedIndex()+1);
                    matrix.setFirstRow(comboBox2.getSelectedIndex()+1);
                    matrix.setSecondColumn(comboBox3.getSelectedIndex()+1);
                    matrix.setSecondRow(comboBox2.getSelectedIndex()+1);
                    matrix.setResultRow(comboBox2.getSelectedIndex()+1);
                    matrix.setResultColumn(comboBox3.getSelectedIndex()+1);
                    Double[][] buff0 = new Double[comboBox2.getSelectedIndex()+1][comboBox3.getSelectedIndex()+1];
                    Double[][] buff1 = new Double[comboBox2.getSelectedIndex()+1][comboBox3.getSelectedIndex()+1];
                    for (int i = 0; i < comboBox2.getSelectedIndex() + 1; i++) {
                        for (int j = 0; j < comboBox3.getSelectedIndex()+1; j++) {
                            if ((textFields[i][j].getText().equals(""))||(textFields[i][j].getText().equals(null))){
                                JOptionPane.showMessageDialog(null,"Заповніть матрцю повністю!");
                            }
                            matrix.add(i, j, Double.valueOf(textFields[i][j].getText()), 1);
                            buff0[i][j] = Double.valueOf(matrix.getFirstList()[i][j].toString());
                        }
                    }
                    for (int i = 0; i < comboBox2.getSelectedIndex() + 1; i++) {
                        for (int j = 0; j < comboBox3.getSelectedIndex()+1; j++) {
                            if ((textFields0[i][j].getText().equals(""))||(textFields0[i][j].getText().equals(null))){
                                JOptionPane.showMessageDialog(null,"Заповніть матрцю повністю!");
                            }
                            matrix.add(i, j, Double.valueOf(textFields0[i][j].getText()), 2);
                            buff1[i][j] = Double.valueOf(matrix.getSecondList()[i][j].toString());
                        }
                    }
                    matrix.plusAndMinus(comboBox3.getSelectedIndex()+1, comboBox2.getSelectedIndex()+1, buff0, buff1, false);
                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < 7; j++) {
                            textFields0[i][j].setVisible(false);
                        }
                    }
                    for (int i = 0; i < comboBox2.getSelectedIndex() + 1; i++) {
                        for (int j = 0; j < comboBox3.getSelectedIndex() + 1; j++) {
                            textFields[i][j].setText(String.valueOf(matrix.getResultList()[i][j]));
                        }
                    }
                }
                if (comboBox.getSelectedIndex()==3){
                    if (comboBox7.getSelectedIndex()!=comboBox8.getSelectedIndex()){
                        JOptionPane.showMessageDialog(null,"Кількість стовпців поршої матриці повинен дорівнювати кількості рядків другої! ");
                    }
                    matrix.setFirstRow(comboBox6.getSelectedIndex());
                    matrix.setFirstColumn(comboBox7.getSelectedIndex());
                    matrix.setSecondRow(comboBox8.getSelectedIndex());
                    matrix.setSecondColumn(comboBox9.getSelectedIndex());
                    matrix.setResultRow(comboBox6.getSelectedIndex());
                    matrix.setResultColumn(comboBox9.getSelectedIndex());

                    Double[][] buff0 = new Double[comboBox6.getSelectedIndex()][comboBox7.getSelectedIndex()];
                    Double[][] buff1 = new Double[comboBox9.getSelectedIndex()][comboBox9.getSelectedIndex()];
                    for (int i = 0; i < comboBox6.getSelectedIndex(); i++) {
                        for (int j = 0; j < comboBox7.getSelectedIndex(); j++) {
                            if ((textFields[i][j].getText().equals(""))||(textFields[i][j].getText().equals(null))){
                                JOptionPane.showMessageDialog(null,"Заповніть матрцю повністю!");
                            }
                            matrix.add(i, j, Double.valueOf(textFields[i][j].getText()), 1);
                            buff0[i][j] = Double.valueOf(matrix.getFirstList()[i][j].toString());
                        }
                    }
                    for (int i = 0; i < comboBox8.getSelectedIndex(); i++) {
                        for (int j = 0; j < comboBox9.getSelectedIndex(); j++) {
                            if ((textFields0[i][j].getText().equals(""))||(textFields0[i][j].getText().equals(null))){
                                JOptionPane.showMessageDialog(null,"Заповніть матрцю повністю!");
                            }
                            matrix.add(i, j, Double.valueOf(textFields0[i][j].getText()), 2);
                            buff1[i][j] = Double.valueOf(matrix.getSecondList()[i][j].toString());
                        }
                    }
                    matrix.multiplication(comboBox7.getSelectedIndex(),comboBox6.getSelectedIndex(),comboBox9.getSelectedIndex(),comboBox8.getSelectedIndex(),buff0,buff1);
                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < 7; j++) {
                            textFields0[i][j].setVisible(false);
                        }
                    }
                    for (int i = 0; i < comboBox6.getSelectedIndex(); i++) {
                        for (int j = 0; j < comboBox9.getSelectedIndex(); j++) {
                            textFields[i][j].setText(String.valueOf(matrix.getResultList()[i][j]));
                        }
                    }
                    for (int i = 0; i < comboBox6.getSelectedIndex(); i++) {
                        for (int j = 0; j < comboBox9.getSelectedIndex(); j++) {
                            textFields[i][j].setVisible(true);
                        }
                    }
                }
                if (comboBox.getSelectedIndex()==4){
                    matrix.setFirstRow(comboBox6.getSelectedIndex());
                    matrix.setFirstColumn(comboBox7.getSelectedIndex());
                    matrix.setSecondRow(comboBox6.getSelectedIndex());
                    matrix.setSecondColumn(comboBox7.getSelectedIndex());
                    matrix.setResultRow(comboBox6.getSelectedIndex());
                    matrix.setResultColumn(comboBox7.getSelectedIndex());

                    Double[][] buff0 = new Double[comboBox6.getSelectedIndex()][comboBox7.getSelectedIndex()];
                    for (int i = 0; i < comboBox6.getSelectedIndex(); i++) {
                        for (int j = 0; j < comboBox7.getSelectedIndex(); j++) {
                            if ((textFields[i][j].getText().equals(""))||(textFields[i][j].getText().equals(null))){
                                JOptionPane.showMessageDialog(null,"Заповніть матрцю повністю!");
                            }
                            matrix.add(i, j, Double.valueOf(textFields[i][j].getText()), 1);
                            buff0[i][j] = Double.valueOf(matrix.getFirstList()[i][j].toString());
                        }
                    }
                    if ((textFields0[0][0].getText().equals(""))||(textFields0[0][0].getText().equals(null))){
                        JOptionPane.showMessageDialog(null,"Введіть число!");
                    }
                    matrix.multiplicationByNumber(comboBox7.getSelectedIndex(),comboBox6.getSelectedIndex(),buff0,Double.valueOf(textFields0[0][0].getText()));
                    for (int i = 0; i < comboBox6.getSelectedIndex(); i++) {
                        for (int j = 0; j < comboBox7.getSelectedIndex(); j++) {
                            textFields[i][j].setText(String.valueOf(matrix.getResultList()[i][j]));
                        }
                    }
                }if(comboBox.getSelectedIndex()==5){
                    matrix.setFirstRow(comboBox1.getSelectedIndex()+1);
                    matrix.setFirstColumn(comboBox1.getSelectedIndex()+1);
                    matrix.setSecondRow(comboBox1.getSelectedIndex()+1);
                    matrix.setSecondColumn(1);
                    matrix.setResultRow(comboBox1.getSelectedIndex()+1);
                    matrix.setResultColumn(comboBox1.getSelectedIndex()+1);

                    Double[][] buff0 = new Double[comboBox1.getSelectedIndex()+1][comboBox1.getSelectedIndex()+1];
                    Double[][] buff1 = new Double[comboBox1.getSelectedIndex()+1][1];
                    for (int i = 0; i < comboBox1.getSelectedIndex()+1; i++) {
                        for (int j = 0; j < comboBox1.getSelectedIndex()+1; j++) {
                            if ((textFields[i][j].getText().equals(""))||(textFields[i][j].getText().equals(null))){
                                JOptionPane.showMessageDialog(null,"Заповніть матрцю повністю!"); }
                            matrix.add(i, j, Double.valueOf(textFields[i][j].getText()), 1);
                            buff0[i][j] = Double.valueOf(matrix.getFirstList()[i][j].toString());
                        }
                    }
                    for (int i = 0; i < comboBox1.getSelectedIndex()+1; i++) {
                        if ((textFields0[i][0].getText().equals(""))||(textFields0[i][0].getText().equals(null))){
                            JOptionPane.showMessageDialog(null,"Заповніть вектор повністю!");
                        }
                            matrix.add(i, 0, Double.valueOf(textFields0[i][0].getText()), 2);
                            buff1[i][0] = Double.valueOf(matrix.getSecondList()[i][0].toString());
                    }
                    matrix.multiplicationByVector(comboBox1.getSelectedIndex()+1,comboBox1.getSelectedIndex()+1,buff0,buff1);
                    for (int i = 0; i < comboBox1.getSelectedIndex()+1; i++) {
                            textFields[i][0].setText(String.valueOf(matrix.getResultList()[i][0]));
                    }
                    for (int i = 6; i > -1; i--) {
                        for (int j = 6; j > 0; j--) {
                            textFields[i][j].setVisible(false);
                        }
                    }
                    for (int i = 6; i > comboBox1.getSelectedIndex(); i--) {
                        for (int j = 6; j > -1; j--) {
                            textFields[i][j].setVisible(false);
                        }
                    }
                }
                if (comboBox.getSelectedIndex()==6){
                    matrix.setFirstRow(comboBox6.getSelectedIndex());
                    matrix.setFirstColumn(comboBox7.getSelectedIndex());
                    matrix.setSecondRow(comboBox6.getSelectedIndex());
                    matrix.setSecondColumn(comboBox7.getSelectedIndex());
                    matrix.setResultRow(comboBox6.getSelectedIndex());
                    matrix.setResultColumn(comboBox7.getSelectedIndex());

                    Double[][] buff0 = new Double[comboBox6.getSelectedIndex()][comboBox7.getSelectedIndex()];
                    for (int i = 0; i < comboBox6.getSelectedIndex(); i++) {
                        for (int j = 0; j < comboBox7.getSelectedIndex(); j++) {
                            if ((textFields[i][j].getText().equals(""))||(textFields[i][j].getText().equals(null))){
                                JOptionPane.showMessageDialog(null,"Заповніть матрцю повністю!"); }
                            matrix.add(i, j, Double.valueOf(textFields[i][j].getText()), 1);
                            buff0[i][j] = Double.valueOf(matrix.getFirstList()[i][j].toString());
                        }
                    }
                    matrix.transposing(comboBox7.getSelectedIndex(),comboBox6.getSelectedIndex(),buff0);
                    for (int i = 0; i < comboBox7.getSelectedIndex(); i++) {
                        for (int j = 0; j < comboBox6.getSelectedIndex(); j++) {
                            textFields0[i][j].setVisible(true);
                        }
                    }
                    for (int i = 6; i > -1; i--) {
                        for (int j = 6; j > comboBox6.getSelectedIndex()-1; j--) {
                            textFields0[i][j].setVisible(false);
                        }
                    }
                    for (int i = 6; i > comboBox7.getSelectedIndex()-1; i--) {
                        for (int j = 6; j > -1; j--) {
                            textFields0[i][j].setVisible(false);
                        }
                    }
                    for (int i = 0; i < comboBox7.getSelectedIndex(); i++) {
                        for (int j = 0; j < comboBox6.getSelectedIndex(); j++) {
                            textFields0[i][j].setText(String.valueOf(matrix.getResultList()[i][j]));
                        }
                    }
                }   if (comboBox.getSelectedIndex()==7){
                    matrix.setFirstRow(comboBox1.getSelectedIndex()+1);
                    matrix.setFirstColumn(comboBox1.getSelectedIndex()+1);
                    matrix.setSecondRow(comboBox1.getSelectedIndex()+1);
                    matrix.setSecondColumn(comboBox1.getSelectedIndex()+1);
                    matrix.setResultRow(comboBox1.getSelectedIndex()+1);
                    matrix.setResultColumn(comboBox1.getSelectedIndex()+1);

                    Double[][] buff0 = new Double[comboBox1.getSelectedIndex()+1][comboBox1.getSelectedIndex()+1];
                    for (int i = 0; i < comboBox1.getSelectedIndex()+1; i++) {
                        for (int j = 0; j < comboBox1.getSelectedIndex()+1; j++) {
                            if ((textFields[i][j].getText().equals(""))||(textFields[i][j].getText().equals(null))){
                                JOptionPane.showMessageDialog(null,"Заповніть матрцю повністю!"); }
                            matrix.add(i, j, Double.valueOf(textFields[i][j].getText()), 1);
                            buff0[i][j] = Double.valueOf(matrix.getFirstList()[i][j].toString());
                        }
                    }
                    if (matrix.determinate(comboBox1.getSelectedIndex()+1,buff0)==0){
                        JOptionPane.showMessageDialog(null,"Обернена матриця не може бути знайдена, бо детермінант иатриці дорівнює 0!"); }
                    matrix.revers(comboBox1.getSelectedIndex()+1,buff0);
                    for (int i = 0; i < comboBox1.getSelectedIndex()+1; i++) {
                        for (int j = 0; j < comboBox1.getSelectedIndex()+1; j++) {
                            textFields0[i][j].setText(String.valueOf(matrix.getResultList()[i][j]));
                        }
                    }
                }   if (comboBox.getSelectedIndex()==8){
                    matrix.setFirstRow(comboBox1.getSelectedIndex()+1);
                    matrix.setFirstColumn(comboBox1.getSelectedIndex()+1);
                    matrix.setSecondRow(comboBox1.getSelectedIndex()+1);
                    matrix.setSecondColumn(comboBox1.getSelectedIndex()+1);
                    matrix.setResultRow(comboBox1.getSelectedIndex()+1);
                    matrix.setResultColumn(comboBox1.getSelectedIndex()+1);

                    Double[][] buff0 = new Double[comboBox1.getSelectedIndex()+1][comboBox1.getSelectedIndex()+1];

                    for (int i = 0; i < comboBox1.getSelectedIndex()+1; i++) {
                        for (int j = 0; j < comboBox1.getSelectedIndex()+1; j++) {
                            if ((textFields[i][j].getText().equals(""))||(textFields[i][j].getText().equals(null))){
                                JOptionPane.showMessageDialog(null,"Заповніть матрцю повністю!"); }
                            matrix.add(i, j, Double.valueOf(textFields[i][j].getText()), 1);
                            buff0[i][j] = Double.valueOf(matrix.getFirstList()[i][j].toString()); }
                    }
                    textFields0[0][0].setVisible(true);
                    textFields0[0][0].setText(String.valueOf(matrix.determinate(comboBox1.getSelectedIndex()+1,buff0)));
                    for (int i = 6; i > -1; i--) {
                        for (int j = 6; j > 0; j--) {
                            textFields0[i][j].setVisible(false); }
                    }
                    for (int i = 6; i > 0; i--) {
                        for (int j = 6; j > -1; j--) {
                            textFields0[i][j].setVisible(false); }
                    }
                } if(comboBox.getSelectedIndex()==9){
                    matrix.setFirstRow(comboBox1.getSelectedIndex()+1);
                    matrix.setFirstColumn(comboBox1.getSelectedIndex()+1);
                    matrix.setSecondColumn(comboBox1.getSelectedIndex()+1);
                    matrix.setSecondRow(comboBox1.getSelectedIndex()+1);
                    matrix.setResultRow(comboBox1.getSelectedIndex()+1);
                    matrix.setResultColumn(comboBox1.getSelectedIndex()+1);
                    Double[][] buff0 = new Double[comboBox1.getSelectedIndex()+1][comboBox1.getSelectedIndex()+1];
                    for (int i = 0; i < comboBox1.getSelectedIndex()+1; i++) {
                        for (int j = 0; j < comboBox1.getSelectedIndex()+1; j++) {
                            if ((textFields[i][j].getText().equals(""))||(textFields[i][j].getText().equals(null))){
                                JOptionPane.showMessageDialog(null,"Заповніть матрцю повністю!"); }
                            matrix.add(i, j, Double.valueOf(textFields[i][j].getText()), 1);
                            buff0[i][j] = Double.valueOf(matrix.getFirstList()[i][j].toString());
                        }
                    }
                    matrix.expoonent(comboBox10.getSelectedIndex(),buff0);
                    for (int i = 0; i < comboBox1.getSelectedIndex()+1; i++) {
                        for (int j = 0; j < comboBox1.getSelectedIndex()+1; j++) {
                            textFields0[i][j].setText(String.valueOf(matrix.getResultList()[i][j]));
                        }
                    }
                }
            }
        });
    }
}