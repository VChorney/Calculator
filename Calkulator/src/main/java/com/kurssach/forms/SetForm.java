package com.kurssach.forms;

import com.kurssach.description.Sets;
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

class SetForm extends JFrame{
    private String[] powers = {"", "1", "2", "3", "4", "5", "6", "7"};
    private String[] actionsForMatrix = {"", "Об'єднання", "Перетин", "Різниця", "Симетрична різниця"
            ,"Доповнення"};
    private JComboBox<String> comboBox = new JComboBox<>(actionsForMatrix);
    private JComboBox<String> comboBox1 = new JComboBox<>(powers);
    private JComboBox<String> comboBox2 = new JComboBox<>(powers);
    private JButton button = new JButton("Вирахувати");
    private JButton button1 = new JButton("Встановити");
    private JTextField[][] textFields = new JTextField[1][7];
    private JTextField[][] textFields0 = new JTextField[1][7];
    private JTextField[][] textFields1 = new JTextField[1][14];

    SetForm() {
        this.setBounds(100, 85, 840, 275);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("Множини");

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
        JPanel panel8 = new JPanel();
        container.add(panel8, BorderLayout.SOUTH);
        JPanel panel9 = new JPanel();
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
        JTextField textField27 = new JFormattedTextField();
        JTextField textField28 = new JFormattedTextField();

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
        JLabel label1 = new JLabel("Oберіть дію  ");
        panel1.add(label1, gridBaglayout3);
        gridBaglayout3.gridy = 0;
        gridBaglayout3.gridx = 1;
        panel1.add(comboBox, gridBaglayout3);
        GridBagConstraints gridBaglayout4 = new GridBagConstraints();
        gridBaglayout4.gridy = 0;
        gridBaglayout4.gridx = 0;
        JLabel label2 = new JLabel("Oберіть потужність ");
        panel6.add(label2, gridBaglayout4);
        gridBaglayout4.gridy = 0;
        gridBaglayout4.gridx = 1;
        panel6.add(comboBox1, gridBaglayout4);
        gridBaglayout4.gridy = 0;
        gridBaglayout4.gridx = 2;
        JLabel label3 = new JLabel("X");
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

        button1.addActionListener(e -> {
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
            for (int i = 0; i < comboBox1.getSelectedIndex()+comboBox2.getSelectedIndex(); i++) {
                textFields0[0][i].setText("");
                textFields[0][i].setText("");
                textFields1[0][i].setText("");
            }
    });
    }
    private void solution(){
        button.addActionListener(e -> {
            String[][] set = new String[1][comboBox1.getSelectedIndex()+comboBox2.getSelectedIndex()];
            for (int i = 0; i < comboBox1.getSelectedIndex()+comboBox2.getSelectedIndex(); i++) {
                    set[0][i] = "";
            }

            Sets sets = new Sets(set, set, set);
            if (comboBox.getSelectedIndex() == 2) {

                String[][] buff0 = new String[1][comboBox1.getSelectedIndex()];
                String[][] buff1 = new String[1][comboBox2.getSelectedIndex()];

                for (int j = 0; j < comboBox1.getSelectedIndex(); j++) {
                    if ((textFields[0][j].getText().equals(""))){
                        JOptionPane.showMessageDialog(null,"Заповніть множину повністю!");
                    }
                    sets.add(0, j, textFields[0][j].getText(), 1);
                    buff0[0][j] = sets.getFirstList()[0][j];
                }

                for (int i = 0; i < comboBox2.getSelectedIndex(); i++) {
                    if ((textFields0[0][i].getText().equals(""))){
                        JOptionPane.showMessageDialog(null,"Заповніть множину повністю!");
                    }
                    sets.add(0, i, textFields0[0][i].getText(), 2);
                    buff1[0][i] = sets.getSecondList()[0][i];

                }
                sets.cross(comboBox1.getSelectedIndex(),comboBox2.getSelectedIndex(),buff0,buff1);

                for (int i = 0; i < comboBox1.getSelectedIndex()+comboBox2.getSelectedIndex(); i++) {
                    textFields1[0][i].setText(sets.getResultList()[0][i]);
                    if (textFields1[0][i].getText()==null){
                        textFields1[0][i].setText("");
                    }
                }
            }
            if (comboBox.getSelectedIndex() == 1) {

                String[][] buff0 = new String[1][comboBox1.getSelectedIndex()];
                String[][] buff1 = new String[1][comboBox2.getSelectedIndex()];

                for (int j = 0; j < comboBox1.getSelectedIndex(); j++) {
                    if ((textFields[0][j].getText().equals(""))){
                        JOptionPane.showMessageDialog(null,"Заповніть множину повністю!");
                    }
                    sets.add(0, j, textFields[0][j].getText(), 1);
                    buff0[0][j] = sets.getFirstList()[0][j];
                }

                for (int i = 0; i < comboBox2.getSelectedIndex(); i++) {
                    if ((textFields0[0][i].getText().equals(""))){
                        JOptionPane.showMessageDialog(null,"Заповніть множину повністю!");
                    }
                    sets.add(0, i, textFields0[0][i].getText(), 2);
                    buff1[0][i] = sets.getSecondList()[0][i];

                }
                sets.merge(comboBox1.getSelectedIndex(),comboBox2.getSelectedIndex(),buff0,buff1);

                for (int i = 0; i < comboBox2.getSelectedIndex()+comboBox1.getSelectedIndex(); i++) {
                    textFields1[0][i].setText(sets.getResultList()[0][i]);
                    if (textFields1[0][i].getText()==null){
                        textFields1[0][i].setText("");
                    }
                }
            }
            if (comboBox.getSelectedIndex()==3){

                String[][] buff0 = new String[1][comboBox1.getSelectedIndex()];
                String[][] buff1 = new String[1][comboBox2.getSelectedIndex()];

                for (int j = 0; j < comboBox1.getSelectedIndex(); j++) {
                    if ((textFields[0][j].getText().equals(""))){
                        JOptionPane.showMessageDialog(null,"Заповніть множину повністю!");
                    }
                    sets.add(0, j, textFields[0][j].getText(), 1);
                    buff0[0][j] = sets.getFirstList()[0][j];
                }

                for (int i = 0; i < comboBox2.getSelectedIndex(); i++) {
                    if ((textFields0[0][i].getText().equals(""))){
                        JOptionPane.showMessageDialog(null,"Заповніть множину повністю!");
                    }
                    sets.add(0, i, textFields0[0][i].getText(), 2);
                    buff1[0][i] = sets.getSecondList()[0][i];

                }
                int k=sets.difference(comboBox1.getSelectedIndex(),comboBox2.getSelectedIndex(),buff0,buff1);

                for (int i = 0; i < k; i++) {
                    textFields1[0][i].setText(sets.getResultList()[0][i]);
                    if (textFields1[0][i].getText()==null){
                        textFields1[0][i].setText("");
                    }
                }
            }

            if (comboBox.getSelectedIndex()==4){

                String[][] buff0 = new String[1][comboBox1.getSelectedIndex()];
                String[][] buff1 = new String[1][comboBox2.getSelectedIndex()];

                for (int j = 0; j < comboBox1.getSelectedIndex(); j++) {
                    if ((textFields[0][j].getText().equals(""))){
                        JOptionPane.showMessageDialog(null,"Заповніть множину повністю!");
                    }
                    sets.add(0, j, textFields[0][j].getText(), 1);
                    buff0[0][j] = sets.getFirstList()[0][j];
                }

                for (int i = 0; i < comboBox2.getSelectedIndex(); i++) {
                    if ((textFields0[0][i].getText().equals(""))){
                        JOptionPane.showMessageDialog(null,"Заповніть множину повністю!");
                    }
                    sets.add(0, i, textFields0[0][i].getText(), 2);
                    buff1[0][i] = sets.getSecondList()[0][i];

                }
                int k=sets.differentDifference(comboBox1.getSelectedIndex(),comboBox2.getSelectedIndex(),buff0,buff1);

                for (int i = 0; i < k; i++) {
                    textFields1[0][i].setText(sets.getResultList()[0][i]);
                    if (textFields1[0][i].getText()==null){
                        textFields1[0][i].setText("");
                    }
                }
            }
            if(comboBox.getSelectedIndex()==5){

                String[][] buff0 = new String[1][comboBox1.getSelectedIndex()];
                String[][] buff1 = new String[1][comboBox2.getSelectedIndex()];

                for (int j = 0; j < comboBox1.getSelectedIndex(); j++) {
                    if ((textFields[0][j].getText().equals(""))){
                        JOptionPane.showMessageDialog(null,"Заповніть множину повністю!");
                    }
                    sets.add(0, j, textFields[0][j].getText(), 1);
                    buff0[0][j] = sets.getFirstList()[0][j];
                }

                for (int i = 0; i < comboBox2.getSelectedIndex(); i++) {
                    if ((textFields0[0][i].getText().equals(""))){
                        JOptionPane.showMessageDialog(null,"Заповніть множину повністю!");
                    }
                    sets.add(0, i, textFields0[0][i].getText(), 2);
                    buff1[0][i] = sets.getSecondList()[0][i];

                }
                sets.addition(comboBox1.getSelectedIndex(),comboBox2.getSelectedIndex(),buff0,buff1);

                for (int i = 0; i < comboBox1.getSelectedIndex()+comboBox2.getSelectedIndex(); i++) {
                    textFields1[0][i].setText(sets.getResultList()[0][i]);
                    if (textFields1[0][i].getText()==null){
                        textFields1[0][i].setText("");
                    }
                }
            }

        });
    }
}
