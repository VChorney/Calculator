package com.forms;

import com.classes.Sets;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetForm extends JFrame{
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
    private JLabel label1 = new JLabel("Oберіть дію  ");
    private JLabel label2 = new JLabel("Oберіть потужність ");
    private JLabel label3 = new JLabel("X");
    private String[] powers = {"", "1", "2", "3", "4", "5", "6", "7"};
    private String[] actionsForMatrix = {"", "Об'єднання", "Перетин", "Різниця", "Симетрична різниця"
            ,"Доповнення"};
    private JComboBox comboBox = new JComboBox(actionsForMatrix);
    private JComboBox comboBox1 = new JComboBox(powers);
    private JComboBox comboBox2 = new JComboBox(powers);
    private JButton button = new JButton("Вирахувати");
    private JButton button1 = new JButton("Встановити");
    private JPanel panel1 = new JPanel();
    private JPanel panel2 = new JPanel();
    private JPanel panel3 = new JPanel();
    private JPanel panel4 = new JPanel();
    private JPanel panel5 = new JPanel();
    private JPanel panel6 = new JPanel();
    private JPanel panel7 = new JPanel();
    private JPanel panel8 = new JPanel();
    private JPanel panel9 = new JPanel();
    private JTextField[][] textFields = new JTextField[1][7];
    private JTextField[][] textFields0 = new JTextField[1][7];
    private JTextField[][] textFields1 = new JTextField[1][14];

    public SetForm() {
        this.setBounds(100, 85, 840, 275);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("Множини");
        Container container = this.getContentPane();
        container.add(panel1, BorderLayout.NORTH);
        container.add(panel2);
        container.add(panel3);
        container.add(panel4);
        container.add(panel5, BorderLayout.SOUTH);
        container.add(panel6, BorderLayout.NORTH);
        container.add(panel7, BorderLayout.NORTH);
        container.add(panel8, BorderLayout.SOUTH);
        container.add(panel9, BorderLayout.SOUTH);
        panel1.setLayout(new GridBagLayout());
        panel2.setLayout(new GridBagLayout());
        panel3.setLayout(new GridBagLayout());
        panel4.setLayout(new GridBagLayout());
        panel5.setLayout(new GridBagLayout());
        panel6.setLayout(new GridBagLayout());
        panel7.setLayout(new GridBagLayout());
        panel8.setLayout(new GridBagLayout());
        panel9.setLayout(new GridBagLayout());
        textFields0[0][0] = textField1;
        textFields0[0][1] = textField2;
        textFields0[0][2] = textField3;
        textFields0[0][3] = textField4;
        textFields0[0][4] = textField5;
        textFields0[0][5] = textField6;
        textFields0[0][6] = textField7;
        textFields[0][0] = textField8;
        textFields[0][1] = textField9;
        textFields[0][2] = textField10;
        textFields[0][3] = textField11;
        textFields[0][4] = textField12;
        textFields[0][5] = textField13;
        textFields[0][6] = textField14;
        textFields1[0][0] = textField15;
        textFields1[0][1] = textField16;
        textFields1[0][2] = textField17;
        textFields1[0][3] = textField18;
        textFields1[0][4] = textField19;
        textFields1[0][5] = textField20;
        textFields1[0][6] = textField21;
        textFields1[0][7] = textField22;
        textFields1[0][8] = textField23;
        textFields1[0][9] = textField24;
        textFields1[0][10] = textField25;
        textFields1[0][11] = textField26;
        textFields1[0][12] = textField27;
        textFields1[0][13] = textField28;
        GridBagConstraints grid = new GridBagConstraints();
        for (int i=0;i<14;i++){
            grid.weightx = 0;
            grid.weighty = 0;
            grid.gridy = 0;
            grid.gridx = i;
            grid.ipadx = 50;
            panel8.add(textFields1[0][i],grid);
        }
        GridBagConstraints gridBagLayout = new GridBagConstraints();
        GridBagConstraints gridBagLayout1 = new GridBagConstraints();
        for (int i = 0; i < 7; i++) {
            gridBagLayout.weightx = 0;
            gridBagLayout.weighty = 0;
            gridBagLayout.gridy = 0;
            gridBagLayout.gridx = i;
            gridBagLayout.ipadx = 50;
            gridBagLayout1.weightx = 0;
            gridBagLayout1.weighty = 0;
            gridBagLayout1.gridy = 0;
            gridBagLayout1.gridx = i;
            gridBagLayout1.ipadx = 50;
            panel3.add(textFields0[0][i], gridBagLayout1);
            panel2.add(textFields[0][i], gridBagLayout);
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
        gridBaglayout4.gridx = 2;
        panel6.add(label3, gridBaglayout4);
        gridBaglayout4.gridy = 0;
        gridBaglayout4.gridx = 3;
        panel6.add(comboBox2, gridBaglayout4);
        gridBaglayout4.gridy = 1;
        gridBaglayout4.gridx = 0;
        panel6.add(button1, gridBaglayout4);
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.weighty = 0;
        gridBagConstraints.weightx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridx = 0;
        panel5.add(button,gridBagConstraints);
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
        GridBagConstraints gridBagLayout6 = new GridBagConstraints();
        gridBagLayout6.weighty = 1;
        gridBagLayout6.weightx = 1;
        gridBagLayout6.gridy = 0;
        gridBagLayout6.gridx = 0;
        panel9.add(panel8,gridBagLayout6);
        gridBagLayout6.gridy = 1;
        gridBagLayout6.gridx = 0;
        panel9.add(panel5,gridBagLayout6);
        solution();
    }
    private void setPowerOfMatrix() {
        for (int i = 0; i < 7; i++) {
                textFields[0][i].setVisible(true);
                textFields0[0][i].setVisible(true);
        }

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (int i=0;i<7;i++){
                    textFields[0][i].setVisible(false);
                }
                for (int i=0;i<comboBox1.getSelectedIndex();i++){
                    textFields[0][i].setVisible(true);
                }
            for (int i=0;i<7;i++){
                textFields0[0][i].setVisible(false);
            }
                for (int i=0;i<comboBox2.getSelectedIndex();i++){
                textFields0[0][i].setVisible(true);
            }
        }
        });
    }
    private void solution(){
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Object[][] mat = new Object[1][comboBox1.getSelectedIndex()+comboBox2.getSelectedIndex()];
                for (int i = 0; i < comboBox1.getSelectedIndex()+comboBox2.getSelectedIndex(); i++) {
                        mat[0][i] = "";
                }
                int max,min;
                if (comboBox1.getSelectedIndex()>comboBox2.getSelectedIndex()){
                    max=comboBox1.getSelectedIndex();
                    min=comboBox2.getSelectedIndex();
                }else {max=comboBox2.getSelectedIndex();min=comboBox1.getSelectedIndex();}
                Sets sets = new Sets(mat, mat, mat);
                if (comboBox.getSelectedIndex() == 2) {
                    sets.setFirstColumn(comboBox1.getSelectedIndex());
                    sets.setFirstRow(1);
                    sets.setResultRow(1);
                    sets.setResultColumn(max);
                    sets.setSecondColumn(comboBox2.getSelectedIndex());
                    sets.setSecondRow(1);
                    Object[][] buff0 = new Object[1][comboBox1.getSelectedIndex()];
                    Object[][] buff1 = new Object[1][comboBox2.getSelectedIndex()];

                    for (int j = 0; j < comboBox1.getSelectedIndex(); j++) {
                        if ((textFields[0][j].getText().equals(""))||(textFields[0][j].getText().equals(null))){
                            JOptionPane.showMessageDialog(null,"Заповніть множину повністю!");
                        }
                        sets.add(0, j, textFields[0][j].getText(), 1);
                        buff0[0][j] = sets.getFirstList()[0][j].toString();
                    }

                    for (int i = 0; i < comboBox2.getSelectedIndex(); i++) {
                        if ((textFields0[0][i].getText().equals(""))||(textFields0[0][i].getText().equals(null))){
                            JOptionPane.showMessageDialog(null,"Заповніть множину повністю!");
                        }
                        sets.add(0, i, textFields0[0][i].getText(), 2);
                        buff1[0][i] = sets.getSecondList()[0][i];

                    }
                    sets.cross(comboBox1.getSelectedIndex(),comboBox2.getSelectedIndex(),buff0,buff1);

                    for (int i = 0; i < comboBox1.getSelectedIndex()+comboBox2.getSelectedIndex(); i++) {
                        textFields1[0][i].setText(String.valueOf(sets.getResultList()[0][i]));
                        if (textFields1[0][i].getText()==null){
                            textFields1[0][i].setText("");
                        }
                    }
                }
                if (comboBox.getSelectedIndex() == 1) {
                    sets.setFirstColumn(comboBox1.getSelectedIndex());
                    sets.setFirstRow(1);
                    sets.setResultRow(1);
                    sets.setResultColumn(comboBox1.getSelectedIndex()+comboBox2.getSelectedIndex());
                    sets.setSecondColumn(comboBox2.getSelectedIndex());
                    sets.setSecondRow(1);
                    Object[][] buff0 = new Object[1][comboBox1.getSelectedIndex()];
                    Object[][] buff1 = new Object[1][comboBox2.getSelectedIndex()];

                    for (int j = 0; j < comboBox1.getSelectedIndex(); j++) {
                        if ((textFields0[0][j].getText().equals(""))||(textFields0[0][j].getText().equals(null))){
                            JOptionPane.showMessageDialog(null,"Заповніть множину повністю!");
                        }
                        sets.add(0, j, textFields0[0][j].getText(), 1);
                        buff0[0][j] = sets.getFirstList()[0][j];
                    }

                    for (int i = 0; i < comboBox2.getSelectedIndex(); i++) {
                        if ((textFields[0][i].getText().equals(""))||(textFields[0][i].getText().equals(null))){
                            JOptionPane.showMessageDialog(null,"Заповніть множину повністю!");
                        }
                        sets.add(0, i, textFields[0][i].getText(), 2);
                        buff1[0][i] = sets.getSecondList()[0][i];

                    }
                    sets.merge(comboBox1.getSelectedIndex(),comboBox2.getSelectedIndex(),buff0,buff1);

                    for (int i = 0; i < comboBox2.getSelectedIndex()+comboBox1.getSelectedIndex(); i++) {
                        textFields1[0][i].setText(String.valueOf(sets.getResultList()[0][i]));
                        if (textFields1[0][i].getText()==null){
                            textFields1[0][i].setText("");
                        }
                    }
                }
                if (comboBox.getSelectedIndex()==3){
                    sets.setFirstColumn(comboBox1.getSelectedIndex());
                    sets.setFirstRow(1);
                    sets.setResultRow(1);
                    sets.setResultColumn(comboBox1.getSelectedIndex());
                    sets.setSecondColumn(comboBox2.getSelectedIndex());
                    sets.setSecondRow(1);
                    Object[][] buff0 = new Object[1][comboBox1.getSelectedIndex()];
                    Object[][] buff1 = new Object[1][comboBox2.getSelectedIndex()];

                    for (int j = 0; j < comboBox1.getSelectedIndex(); j++) {
                        if ((textFields[0][j].getText().equals(""))||(textFields[0][j].getText().equals(null))){
                            JOptionPane.showMessageDialog(null,"Заповніть множину повністю!");
                        }
                        sets.add(0, j, textFields[0][j].getText(), 1);
                        buff0[0][j] = sets.getFirstList()[0][j].toString();
                    }

                    for (int i = 0; i < comboBox2.getSelectedIndex(); i++) {
                        if ((textFields0[0][i].getText().equals(""))||(textFields0[0][i].getText().equals(null))){
                            JOptionPane.showMessageDialog(null,"Заповніть множину повністю!");
                        }
                        sets.add(0, i, textFields0[0][i].getText(), 2);
                        buff1[0][i] = sets.getSecondList()[0][i];

                    }
                    sets.difference(comboBox1.getSelectedIndex(),comboBox2.getSelectedIndex(),buff0,buff1);

                    for (int i = 0; i < comboBox1.getSelectedIndex(); i++) {
                        textFields1[0][i].setText(String.valueOf(sets.getResultList()[0][i]));
                        if (textFields1[0][i].getText()==null){
                            textFields1[0][i].setText("");
                        }
                    }
                }

                if (comboBox.getSelectedIndex()==4){
                    sets.setFirstColumn(comboBox1.getSelectedIndex());
                    sets.setFirstRow(1);
                    sets.setResultRow(1);
                    sets.setResultColumn(comboBox2.getSelectedIndex());
                    sets.setSecondColumn(comboBox2.getSelectedIndex());
                    sets.setSecondRow(1);
                    Object[][] buff0 = new Object[1][comboBox1.getSelectedIndex()];
                    Object[][] buff1 = new Object[1][comboBox2.getSelectedIndex()];

                    for (int j = 0; j < comboBox1.getSelectedIndex(); j++) {
                        if ((textFields[0][j].getText().equals(""))||(textFields[0][j].getText().equals(null))){
                            JOptionPane.showMessageDialog(null,"Заповніть множину повністю!");
                        }
                        sets.add(0, j, textFields[0][j].getText(), 1);
                        buff0[0][j] = sets.getFirstList()[0][j];
                    }

                    for (int i = 0; i < comboBox2.getSelectedIndex(); i++) {
                        if ((textFields0[0][i].getText().equals(""))||(textFields0[0][i].getText().equals(null))){
                            JOptionPane.showMessageDialog(null,"Заповніть множину повністю!");
                        }
                        sets.add(0, i, textFields0[0][i].getText(), 2);
                        buff1[0][i] = sets.getSecondList()[0][i];

                    }
                    sets.differentDifference(comboBox1.getSelectedIndex(),comboBox2.getSelectedIndex(),buff0,buff1);

                    for (int i = 0; i < comboBox2.getSelectedIndex(); i++) {
                        textFields1[0][i].setText(String.valueOf(sets.getResultList()[0][i]));
                        if (textFields1[0][i].getText()==null){
                            textFields1[0][i].setText("");
                        }
                    }
                }
                if(comboBox.getSelectedIndex()==5){
                    sets.setFirstColumn(comboBox1.getSelectedIndex());
                    sets.setFirstRow(1);
                    sets.setResultRow(1);
                    sets.setResultColumn(min);
                    sets.setSecondColumn(comboBox2.getSelectedIndex());
                    sets.setSecondRow(1);
                    Object[][] buff0 = new Object[1][comboBox1.getSelectedIndex()];
                    Object[][] buff1 = new Object[1][comboBox2.getSelectedIndex()];

                    for (int j = 0; j < comboBox1.getSelectedIndex(); j++) {
                        if ((textFields[0][j].getText().equals(""))||(textFields[0][j].getText().equals(null))){
                            JOptionPane.showMessageDialog(null,"Заповніть множину повністю!");
                        }
                        sets.add(0, j, textFields[0][j].getText(), 1);
                        buff0[0][j] = sets.getFirstList()[0][j];
                    }

                    for (int i = 0; i < comboBox2.getSelectedIndex(); i++) {
                        if ((textFields0[0][i].getText().equals(""))||(textFields0[0][i].getText().equals(null))){
                            JOptionPane.showMessageDialog(null,"Заповніть множину повністю!");
                        }
                        sets.add(0, i, textFields0[0][i].getText(), 2);
                        buff1[0][i] = sets.getSecondList()[0][i];

                    }
                    sets.addition(comboBox1.getSelectedIndex(),comboBox2.getSelectedIndex(),buff0,buff1);

                    for (int i = 0; i < min; i++) {
                        textFields1[0][i].setText(String.valueOf(sets.getResultList()[0][i]));
                        if (textFields1[0][i].getText()==null){
                            textFields1[0][i].setText("");
                        }
                    }
                }

            }
        });
    }
}
