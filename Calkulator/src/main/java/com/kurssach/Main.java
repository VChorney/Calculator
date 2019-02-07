package com.kurssach;

import com.kurssach.description.Sets;
import com.kurssach.forms.Form;

public class Main {
    public static void main(String[] args) {
        try {
            Form form = new Form();
            form.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
